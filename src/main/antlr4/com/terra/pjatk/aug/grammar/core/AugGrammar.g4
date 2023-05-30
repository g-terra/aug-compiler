grammar AugGrammar;

@members {
    java.util.Map<String, String> typeMap = new java.util.HashMap<>();

    public void setType(String identifier, String type) {
        if (typeMap.containsKey(identifier) && !typeMap.get(identifier).equals(type)) {
            System.err.println("Type error: " + identifier + " is already defined as " + typeMap.get(identifier));
            System.exit(1);
        }
        typeMap.put(identifier, type);
    }
    public String getType(String identifier) {
        return typeMap.get(identifier);
    }

    public boolean isNum(String identifier) {
        return typeMap.containsKey(identifier) ? typeMap.get(identifier).equals("num") : true;
    }

    public boolean isStr(String identifier) {
        return typeMap.containsKey(identifier) ? typeMap.get(identifier).equals("str") : true;
    }

    public boolean isUndefined(String identifier) {
        return !typeMap.containsKey(identifier);
    }
}

program : instr ;

instr :  simple_instr ';' instr
      |  /* empty */ ;

simple_instr : assign_stat
    | output_stat;


assign_stat
    : IDENT ':=' ident    { setType($IDENT.text,  getType($ident.text)); }
    | IDENT ':=' num_expr    { setType($IDENT.text, "num"); }
    | IDENT ':=' str_expr    { setType($IDENT.text, "str"); } ;


output_stat : 'print' '(' printable_expr ')' ;
printable_expr :   printable_undef | printable_num_expr | printable_str_expr ;
printable_num_expr : { isNum(_input.LT(1).getText()) }? num_expr ;
printable_str_expr : { isStr(_input.LT(1).getText()) }? str_expr ;
printable_undef : { isUndefined(_input.LT(1).getText()) }? IDENT ;

num_expr : t_num_expr ( '+' t_num_expr | '-' t_num_expr)* ;
t_num_expr : f_num_expr ( '*' f_num_expr | '/' f_num_expr | '%' f_num_expr)* ;
f_num_expr : num
    | ident
    | read_int
    | negate
    | paren
    | length
    | position ;

negate : '-' num_expr ;
paren : '(' num_expr ')' ;
read_int : 'readint' ;
length : 'length' '(' str_expr ')' ;
position : 'position' '(' str_expr ',' str_expr ')' ;

str_expr : string
         | ident
         | read_str
         | concatenate
         | substring ;

read_str : 'readstr' ;
concatenate : 'concatenate' '(' str_expr ',' str_expr ')' ;
substring : 'substring' '(' str_expr ',' num_expr ',' num_expr ')' ;

ident : IDENT ;
num : NUM ;
string : STRING ;

// lexer rules
NUM : [0-9]+ ;
IDENT : [a-zA-Z][a-zA-Z0-9]* ;
STRING : '"' .*? '"' ;
WS : [ \t\r\n]+ -> skip ;