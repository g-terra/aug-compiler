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

instr :  instr simple_instr ';' |  /* empty */ ;

simple_instr : assign_stat
    | output_stat
    | if_stat ;


assign_stat
    : IDENT ':=' ident    { setType($IDENT.text,  getType($ident.text)); }
    | IDENT ':=' num_expr    { setType($IDENT.text, "num"); }
    | IDENT ':=' str_expr    { setType($IDENT.text, "str"); } ;


output_stat : 'print' '(' printable_expr ')' ;
printable_expr :   printable_undef | printable_num_expr | printable_str_expr ;
printable_undef : { isUndefined(_input.LT(1).getText()) }? IDENT ;
printable_num_expr : { isNum(_input.LT(1).getText()) }? num_expr ;
printable_str_expr : { isStr(_input.LT(1).getText()) }? str_expr ;

if_stat :  if_then_stat | if_then_else_stat ;
if_then_stat : 'if' bool_expr 'then' simple_instr ;
if_then_else_stat : 'if' bool_expr 'then' simple_instr 'else' simple_instr ;


num_expr : num_expr '+' t_num_expr
    | num_expr '-' t_num_expr
    | t_num_expr ;

t_num_expr:  t_num_expr '*' f_num_expr
    | t_num_expr '/' f_num_expr
    | t_num_expr '%' f_num_expr
    | f_num_expr ;

f_num_expr : num
    | ident
    | read_int
    | negate
    | sub_num_expr
    | length
    | position ;

negate : '-' num_expr ;
sub_num_expr : '(' num_expr ')' ;
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

bool_expr : bool_expr 'or' t_bool_expr | t_bool_expr ;
t_bool_expr : t_bool_expr 'and' f_bool_expr | f_bool_expr;
f_bool_expr : true
    | false
    | sub_bool_expr
    | not_expr
    | num_rel_expr
    | str_rel_expr ;

true : 'true' ;
false : 'false' ;
sub_bool_expr : '(' bool_expr ')' ;
not_expr : 'not' bool_expr ;

num_rel_expr : num_expr num_rel num_expr ;
num_rel: num_eq_rel | num_lt_rel | num_le_rel | num_gt_rel | num_ge_rel | num_neq_rel ;
num_eq_rel : '=';
num_lt_rel : '<';
num_le_rel : '<=';
num_gt_rel : '>';
num_ge_rel : '>=';
num_neq_rel : '<>';

str_rel_expr : str_expr str_rel str_expr ;
str_rel: str_eq_rel | str_neq_rel ;
str_eq_rel : '==';
str_neq_rel : '!=';


ident : IDENT ;
num : NUM ;
string : STRING ;

// lexer rules
NUM : [0-9]+ ;
IDENT : [a-zA-Z][a-zA-Z0-9]* ;
STRING : '"' .*? '"' ;
WS : [ \t\r\n]+ -> skip ;
