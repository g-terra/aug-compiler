// Generated from com/terra/pjatk/aug/grammar/core/AugGrammar.g4 by ANTLR 4.13.0
package com.terra.pjatk.aug.grammar.core;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AugGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, NUM=34, IDENT=35, STRING=36, WS=37;
	public static final int
		RULE_program = 0, RULE_instr = 1, RULE_simple_instr = 2, RULE_assign_stat = 3, 
		RULE_output_stat = 4, RULE_printable_expr = 5, RULE_printable_undef = 6, 
		RULE_printable_num_expr = 7, RULE_printable_str_expr = 8, RULE_if_stat = 9, 
		RULE_if_then_stat = 10, RULE_if_then_else_stat = 11, RULE_num_expr = 12, 
		RULE_t_num_expr = 13, RULE_f_num_expr = 14, RULE_negate = 15, RULE_sub_num_expr = 16, 
		RULE_read_int = 17, RULE_length = 18, RULE_position = 19, RULE_str_expr = 20, 
		RULE_read_str = 21, RULE_concatenate = 22, RULE_substring = 23, RULE_bool_expr = 24, 
		RULE_t_bool_expr = 25, RULE_f_bool_expr = 26, RULE_true = 27, RULE_false = 28, 
		RULE_sub_bool_expr = 29, RULE_not_expr = 30, RULE_num_rel_expr = 31, RULE_num_rel = 32, 
		RULE_num_eq_rel = 33, RULE_num_lt_rel = 34, RULE_num_le_rel = 35, RULE_num_gt_rel = 36, 
		RULE_num_ge_rel = 37, RULE_num_neq_rel = 38, RULE_str_rel_expr = 39, RULE_str_rel = 40, 
		RULE_str_eq_rel = 41, RULE_str_neq_rel = 42, RULE_ident = 43, RULE_num = 44, 
		RULE_string = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instr", "simple_instr", "assign_stat", "output_stat", "printable_expr", 
			"printable_undef", "printable_num_expr", "printable_str_expr", "if_stat", 
			"if_then_stat", "if_then_else_stat", "num_expr", "t_num_expr", "f_num_expr", 
			"negate", "sub_num_expr", "read_int", "length", "position", "str_expr", 
			"read_str", "concatenate", "substring", "bool_expr", "t_bool_expr", "f_bool_expr", 
			"true", "false", "sub_bool_expr", "not_expr", "num_rel_expr", "num_rel", 
			"num_eq_rel", "num_lt_rel", "num_le_rel", "num_gt_rel", "num_ge_rel", 
			"num_neq_rel", "str_rel_expr", "str_rel", "str_eq_rel", "str_neq_rel", 
			"ident", "num", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'print'", "'('", "')'", "'if'", "'then'", "'else'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'readint'", "'length'", "'position'", 
			"','", "'readstr'", "'concatenate'", "'substring'", "'or'", "'and'", 
			"'true'", "'false'", "'not'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", 
			"'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "NUM", "IDENT", 
			"STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AugGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public AugGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			instr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstrContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public Simple_instrContext simple_instr() {
			return getRuleContext(Simple_instrContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		return instr(0);
	}

	private InstrContext instr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstrContext _localctx = new InstrContext(_ctx, _parentState);
		InstrContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_instr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instr);
					setState(95);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(96);
					simple_instr();
					setState(97);
					match(T__0);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_instrContext extends ParserRuleContext {
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public Output_statContext output_stat() {
			return getRuleContext(Output_statContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public Simple_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_instr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitSimple_instr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_instrContext simple_instr() throws RecognitionException {
		Simple_instrContext _localctx = new Simple_instrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_instr);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				assign_stat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				output_stat();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				if_stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_statContext extends ParserRuleContext {
		public Token IDENT;
		public IdentContext ident;
		public TerminalNode IDENT() { return getToken(AugGrammarParser.IDENT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public Assign_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitAssign_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statContext assign_stat() throws RecognitionException {
		Assign_statContext _localctx = new Assign_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign_stat);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(110);
				match(T__1);
				setState(111);
				((Assign_statContext)_localctx).ident = ident();
				 setType((((Assign_statContext)_localctx).IDENT!=null?((Assign_statContext)_localctx).IDENT.getText():null),  getType((((Assign_statContext)_localctx).ident!=null?_input.getText(((Assign_statContext)_localctx).ident.start,((Assign_statContext)_localctx).ident.stop):null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(115);
				match(T__1);
				setState(116);
				num_expr(0);
				 setType((((Assign_statContext)_localctx).IDENT!=null?((Assign_statContext)_localctx).IDENT.getText():null), "num"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(120);
				match(T__1);
				setState(121);
				str_expr();
				 setType((((Assign_statContext)_localctx).IDENT!=null?((Assign_statContext)_localctx).IDENT.getText():null), "str"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Output_statContext extends ParserRuleContext {
		public Printable_exprContext printable_expr() {
			return getRuleContext(Printable_exprContext.class,0);
		}
		public Output_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitOutput_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_statContext output_stat() throws RecognitionException {
		Output_statContext _localctx = new Output_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__2);
			setState(127);
			match(T__3);
			setState(128);
			printable_expr();
			setState(129);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Printable_exprContext extends ParserRuleContext {
		public Printable_undefContext printable_undef() {
			return getRuleContext(Printable_undefContext.class,0);
		}
		public Printable_num_exprContext printable_num_expr() {
			return getRuleContext(Printable_num_exprContext.class,0);
		}
		public Printable_str_exprContext printable_str_expr() {
			return getRuleContext(Printable_str_exprContext.class,0);
		}
		public Printable_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printable_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitPrintable_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Printable_exprContext printable_expr() throws RecognitionException {
		Printable_exprContext _localctx = new Printable_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printable_expr);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				printable_undef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				printable_num_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				printable_str_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Printable_undefContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AugGrammarParser.IDENT, 0); }
		public Printable_undefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printable_undef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitPrintable_undef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Printable_undefContext printable_undef() throws RecognitionException {
		Printable_undefContext _localctx = new Printable_undefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printable_undef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			if (!( isUndefined(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isUndefined(_input.LT(1).getText()) ");
			setState(137);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Printable_num_exprContext extends ParserRuleContext {
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Printable_num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printable_num_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitPrintable_num_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Printable_num_exprContext printable_num_expr() throws RecognitionException {
		Printable_num_exprContext _localctx = new Printable_num_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printable_num_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			if (!( isNum(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isNum(_input.LT(1).getText()) ");
			setState(140);
			num_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Printable_str_exprContext extends ParserRuleContext {
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public Printable_str_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printable_str_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitPrintable_str_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Printable_str_exprContext printable_str_expr() throws RecognitionException {
		Printable_str_exprContext _localctx = new Printable_str_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printable_str_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			if (!( isStr(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isStr(_input.LT(1).getText()) ");
			setState(143);
			str_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statContext extends ParserRuleContext {
		public If_then_statContext if_then_stat() {
			return getRuleContext(If_then_statContext.class,0);
		}
		public If_then_else_statContext if_then_else_stat() {
			return getRuleContext(If_then_else_statContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stat);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				if_then_stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				if_then_else_stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_then_statContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Simple_instrContext simple_instr() {
			return getRuleContext(Simple_instrContext.class,0);
		}
		public If_then_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitIf_then_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_then_statContext if_then_stat() throws RecognitionException {
		If_then_statContext _localctx = new If_then_statContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_then_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__5);
			setState(150);
			bool_expr(0);
			setState(151);
			match(T__6);
			setState(152);
			simple_instr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_then_else_statContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Simple_instrContext> simple_instr() {
			return getRuleContexts(Simple_instrContext.class);
		}
		public Simple_instrContext simple_instr(int i) {
			return getRuleContext(Simple_instrContext.class,i);
		}
		public If_then_else_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_else_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitIf_then_else_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_then_else_statContext if_then_else_stat() throws RecognitionException {
		If_then_else_statContext _localctx = new If_then_else_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_then_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__5);
			setState(155);
			bool_expr(0);
			setState(156);
			match(T__6);
			setState(157);
			simple_instr();
			setState(158);
			match(T__7);
			setState(159);
			simple_instr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_exprContext extends ParserRuleContext {
		public T_num_exprContext t_num_expr() {
			return getRuleContext(T_num_exprContext.class,0);
		}
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_exprContext num_expr() throws RecognitionException {
		return num_expr(0);
	}

	private Num_exprContext num_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_exprContext _localctx = new Num_exprContext(_ctx, _parentState);
		Num_exprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_num_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			t_num_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
						setState(164);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(165);
						match(T__8);
						setState(166);
						t_num_expr(0);
						}
						break;
					case 2:
						{
						_localctx = new Num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
						setState(167);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(168);
						match(T__9);
						setState(169);
						t_num_expr(0);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class T_num_exprContext extends ParserRuleContext {
		public F_num_exprContext f_num_expr() {
			return getRuleContext(F_num_exprContext.class,0);
		}
		public T_num_exprContext t_num_expr() {
			return getRuleContext(T_num_exprContext.class,0);
		}
		public T_num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_num_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitT_num_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_num_exprContext t_num_expr() throws RecognitionException {
		return t_num_expr(0);
	}

	private T_num_exprContext t_num_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		T_num_exprContext _localctx = new T_num_exprContext(_ctx, _parentState);
		T_num_exprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_t_num_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			f_num_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new T_num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_num_expr);
						setState(178);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(179);
						match(T__10);
						setState(180);
						f_num_expr();
						}
						break;
					case 2:
						{
						_localctx = new T_num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_num_expr);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						match(T__11);
						setState(183);
						f_num_expr();
						}
						break;
					case 3:
						{
						_localctx = new T_num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_num_expr);
						setState(184);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(185);
						match(T__12);
						setState(186);
						f_num_expr();
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class F_num_exprContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Read_intContext read_int() {
			return getRuleContext(Read_intContext.class,0);
		}
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
		}
		public Sub_num_exprContext sub_num_expr() {
			return getRuleContext(Sub_num_exprContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public F_num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_num_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitF_num_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F_num_exprContext f_num_expr() throws RecognitionException {
		F_num_exprContext _localctx = new F_num_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_f_num_expr);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				num();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				ident();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				read_int();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				negate();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				sub_num_expr();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				length();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				position();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends ParserRuleContext {
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public NegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegateContext negate() throws RecognitionException {
		NegateContext _localctx = new NegateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_negate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__9);
			setState(202);
			num_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sub_num_exprContext extends ParserRuleContext {
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Sub_num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_num_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitSub_num_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_num_exprContext sub_num_expr() throws RecognitionException {
		Sub_num_exprContext _localctx = new Sub_num_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sub_num_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__3);
			setState(205);
			num_expr(0);
			setState(206);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Read_intContext extends ParserRuleContext {
		public Read_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitRead_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_intContext read_int() throws RecognitionException {
		Read_intContext _localctx = new Read_intContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_read_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LengthContext extends ParserRuleContext {
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__14);
			setState(211);
			match(T__3);
			setState(212);
			str_expr();
			setState(213);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PositionContext extends ParserRuleContext {
		public List<Str_exprContext> str_expr() {
			return getRuleContexts(Str_exprContext.class);
		}
		public Str_exprContext str_expr(int i) {
			return getRuleContext(Str_exprContext.class,i);
		}
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__15);
			setState(216);
			match(T__3);
			setState(217);
			str_expr();
			setState(218);
			match(T__16);
			setState(219);
			str_expr();
			setState(220);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Str_exprContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Read_strContext read_str() {
			return getRuleContext(Read_strContext.class,0);
		}
		public ConcatenateContext concatenate() {
			return getRuleContext(ConcatenateContext.class,0);
		}
		public SubstringContext substring() {
			return getRuleContext(SubstringContext.class,0);
		}
		public Str_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitStr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_exprContext str_expr() throws RecognitionException {
		Str_exprContext _localctx = new Str_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_str_expr);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				string();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				ident();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				read_str();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				concatenate();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				substring();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Read_strContext extends ParserRuleContext {
		public Read_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitRead_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_strContext read_str() throws RecognitionException {
		Read_strContext _localctx = new Read_strContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_read_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConcatenateContext extends ParserRuleContext {
		public List<Str_exprContext> str_expr() {
			return getRuleContexts(Str_exprContext.class);
		}
		public Str_exprContext str_expr(int i) {
			return getRuleContext(Str_exprContext.class,i);
		}
		public ConcatenateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitConcatenate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenateContext concatenate() throws RecognitionException {
		ConcatenateContext _localctx = new ConcatenateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_concatenate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__18);
			setState(232);
			match(T__3);
			setState(233);
			str_expr();
			setState(234);
			match(T__16);
			setState(235);
			str_expr();
			setState(236);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstringContext extends ParserRuleContext {
		public Str_exprContext str_expr() {
			return getRuleContext(Str_exprContext.class,0);
		}
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public SubstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substring; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstringContext substring() throws RecognitionException {
		SubstringContext _localctx = new SubstringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_substring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__19);
			setState(239);
			match(T__3);
			setState(240);
			str_expr();
			setState(241);
			match(T__16);
			setState(242);
			num_expr(0);
			setState(243);
			match(T__16);
			setState(244);
			num_expr(0);
			setState(245);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ParserRuleContext {
		public T_bool_exprContext t_bool_expr() {
			return getRuleContext(T_bool_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(248);
			t_bool_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(250);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(251);
					match(T__20);
					setState(252);
					t_bool_expr(0);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class T_bool_exprContext extends ParserRuleContext {
		public F_bool_exprContext f_bool_expr() {
			return getRuleContext(F_bool_exprContext.class,0);
		}
		public T_bool_exprContext t_bool_expr() {
			return getRuleContext(T_bool_exprContext.class,0);
		}
		public T_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_bool_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitT_bool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_bool_exprContext t_bool_expr() throws RecognitionException {
		return t_bool_expr(0);
	}

	private T_bool_exprContext t_bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		T_bool_exprContext _localctx = new T_bool_exprContext(_ctx, _parentState);
		T_bool_exprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_t_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(259);
			f_bool_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new T_bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_t_bool_expr);
					setState(261);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(262);
					match(T__21);
					setState(263);
					f_bool_expr();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class F_bool_exprContext extends ParserRuleContext {
		public TrueContext true_() {
			return getRuleContext(TrueContext.class,0);
		}
		public FalseContext false_() {
			return getRuleContext(FalseContext.class,0);
		}
		public Sub_bool_exprContext sub_bool_expr() {
			return getRuleContext(Sub_bool_exprContext.class,0);
		}
		public Not_exprContext not_expr() {
			return getRuleContext(Not_exprContext.class,0);
		}
		public Num_rel_exprContext num_rel_expr() {
			return getRuleContext(Num_rel_exprContext.class,0);
		}
		public Str_rel_exprContext str_rel_expr() {
			return getRuleContext(Str_rel_exprContext.class,0);
		}
		public F_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_bool_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitF_bool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F_bool_exprContext f_bool_expr() throws RecognitionException {
		F_bool_exprContext _localctx = new F_bool_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_f_bool_expr);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				true_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				false_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				sub_bool_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				not_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				num_rel_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				str_rel_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends ParserRuleContext {
		public TrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueContext true_() throws RecognitionException {
		TrueContext _localctx = new TrueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_true);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends ParserRuleContext {
		public FalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FalseContext false_() throws RecognitionException {
		FalseContext _localctx = new FalseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sub_bool_exprContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Sub_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_bool_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitSub_bool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_bool_exprContext sub_bool_expr() throws RecognitionException {
		Sub_bool_exprContext _localctx = new Sub_bool_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sub_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__3);
			setState(282);
			bool_expr(0);
			setState(283);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Not_exprContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Not_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNot_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_exprContext not_expr() throws RecognitionException {
		Not_exprContext _localctx = new Not_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_not_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__24);
			setState(286);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_rel_exprContext extends ParserRuleContext {
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public Num_relContext num_rel() {
			return getRuleContext(Num_relContext.class,0);
		}
		public Num_rel_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_rel_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum_rel_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_rel_exprContext num_rel_expr() throws RecognitionException {
		Num_rel_exprContext _localctx = new Num_rel_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_num_rel_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			num_expr(0);
			setState(289);
			num_rel();
			setState(290);
			num_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_relContext extends ParserRuleContext {
		public Num_eq_relContext num_eq_rel() {
			return getRuleContext(Num_eq_relContext.class,0);
		}
		public Num_lt_relContext num_lt_rel() {
			return getRuleContext(Num_lt_relContext.class,0);
		}
		public Num_le_relContext num_le_rel() {
			return getRuleContext(Num_le_relContext.class,0);
		}
		public Num_gt_relContext num_gt_rel() {
			return getRuleContext(Num_gt_relContext.class,0);
		}
		public Num_ge_relContext num_ge_rel() {
			return getRuleContext(Num_ge_relContext.class,0);
		}
		public Num_neq_relContext num_neq_rel() {
			return getRuleContext(Num_neq_relContext.class,0);
		}
		public Num_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_relContext num_rel() throws RecognitionException {
		Num_relContext _localctx = new Num_relContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_num_rel);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				num_eq_rel();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				num_lt_rel();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				num_le_rel();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				num_gt_rel();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				num_ge_rel();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				num_neq_rel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_eq_relContext extends ParserRuleContext {
		public Num_eq_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_eq_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum_eq_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_eq_relContext num_eq_rel() throws RecognitionException {
		Num_eq_relContext _localctx = new Num_eq_relContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_num_eq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_lt_relContext extends ParserRuleContext {
		public Num_lt_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_lt_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum_lt_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_lt_relContext num_lt_rel() throws RecognitionException {
		Num_lt_relContext _localctx = new Num_lt_relContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_num_lt_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_le_relContext extends ParserRuleContext {
		public Num_le_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_le_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum_le_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_le_relContext num_le_rel() throws RecognitionException {
		Num_le_relContext _localctx = new Num_le_relContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_num_le_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_gt_relContext extends ParserRuleContext {
		public Num_gt_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_gt_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum_gt_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_gt_relContext num_gt_rel() throws RecognitionException {
		Num_gt_relContext _localctx = new Num_gt_relContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_num_gt_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_ge_relContext extends ParserRuleContext {
		public Num_ge_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_ge_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum_ge_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_ge_relContext num_ge_rel() throws RecognitionException {
		Num_ge_relContext _localctx = new Num_ge_relContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_num_ge_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_neq_relContext extends ParserRuleContext {
		public Num_neq_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_neq_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum_neq_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_neq_relContext num_neq_rel() throws RecognitionException {
		Num_neq_relContext _localctx = new Num_neq_relContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_num_neq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Str_rel_exprContext extends ParserRuleContext {
		public List<Str_exprContext> str_expr() {
			return getRuleContexts(Str_exprContext.class);
		}
		public Str_exprContext str_expr(int i) {
			return getRuleContext(Str_exprContext.class,i);
		}
		public Str_relContext str_rel() {
			return getRuleContext(Str_relContext.class,0);
		}
		public Str_rel_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_rel_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitStr_rel_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_rel_exprContext str_rel_expr() throws RecognitionException {
		Str_rel_exprContext _localctx = new Str_rel_exprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_str_rel_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			str_expr();
			setState(313);
			str_rel();
			setState(314);
			str_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Str_relContext extends ParserRuleContext {
		public Str_eq_relContext str_eq_rel() {
			return getRuleContext(Str_eq_relContext.class,0);
		}
		public Str_neq_relContext str_neq_rel() {
			return getRuleContext(Str_neq_relContext.class,0);
		}
		public Str_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitStr_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_relContext str_rel() throws RecognitionException {
		Str_relContext _localctx = new Str_relContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_str_rel);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				str_eq_rel();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				str_neq_rel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Str_eq_relContext extends ParserRuleContext {
		public Str_eq_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_eq_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitStr_eq_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_eq_relContext str_eq_rel() throws RecognitionException {
		Str_eq_relContext _localctx = new Str_eq_relContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_str_eq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Str_neq_relContext extends ParserRuleContext {
		public Str_neq_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_neq_rel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitStr_neq_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_neq_relContext str_neq_rel() throws RecognitionException {
		Str_neq_relContext _localctx = new Str_neq_relContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_str_neq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AugGrammarParser.IDENT, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(AugGrammarParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AugGrammarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return instr_sempred((InstrContext)_localctx, predIndex);
		case 6:
			return printable_undef_sempred((Printable_undefContext)_localctx, predIndex);
		case 7:
			return printable_num_expr_sempred((Printable_num_exprContext)_localctx, predIndex);
		case 8:
			return printable_str_expr_sempred((Printable_str_exprContext)_localctx, predIndex);
		case 12:
			return num_expr_sempred((Num_exprContext)_localctx, predIndex);
		case 13:
			return t_num_expr_sempred((T_num_exprContext)_localctx, predIndex);
		case 24:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 25:
			return t_bool_expr_sempred((T_bool_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instr_sempred(InstrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean printable_undef_sempred(Printable_undefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  isUndefined(_input.LT(1).getText()) ;
		}
		return true;
	}
	private boolean printable_num_expr_sempred(Printable_num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  isNum(_input.LT(1).getText()) ;
		}
		return true;
	}
	private boolean printable_str_expr_sempred(Printable_str_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return  isStr(_input.LT(1).getText()) ;
		}
		return true;
	}
	private boolean num_expr_sempred(Num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_num_expr_sempred(T_num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_bool_expr_sempred(T_bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u014b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001d\b\u0001\n\u0001\f\u0001g\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002l\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003}\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0087\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u0094"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ab"+
		"\b\f\n\f\f\f\u00ae\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00bc\b\r\n\r"+
		"\f\r\u00bf\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00c8\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00e4\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u00fe\b\u0018\n\u0018\f\u0018\u0101"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0109\b\u0019\n\u0019\f\u0019\u010c\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0114\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0003 \u012b\b \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0003(\u013f\b(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0000\u0005\u0002\u0018\u001a"+
		"02.\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0000\u0140\u0000"+
		"\\\u0001\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000\u0004k\u0001"+
		"\u0000\u0000\u0000\u0006|\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000"+
		"\u0000\n\u0086\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000\u0000\u0000"+
		"\u000e\u008b\u0001\u0000\u0000\u0000\u0010\u008e\u0001\u0000\u0000\u0000"+
		"\u0012\u0093\u0001\u0000\u0000\u0000\u0014\u0095\u0001\u0000\u0000\u0000"+
		"\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u00a1\u0001\u0000\u0000\u0000"+
		"\u001a\u00af\u0001\u0000\u0000\u0000\u001c\u00c7\u0001\u0000\u0000\u0000"+
		"\u001e\u00c9\u0001\u0000\u0000\u0000 \u00cc\u0001\u0000\u0000\u0000\""+
		"\u00d0\u0001\u0000\u0000\u0000$\u00d2\u0001\u0000\u0000\u0000&\u00d7\u0001"+
		"\u0000\u0000\u0000(\u00e3\u0001\u0000\u0000\u0000*\u00e5\u0001\u0000\u0000"+
		"\u0000,\u00e7\u0001\u0000\u0000\u0000.\u00ee\u0001\u0000\u0000\u00000"+
		"\u00f7\u0001\u0000\u0000\u00002\u0102\u0001\u0000\u0000\u00004\u0113\u0001"+
		"\u0000\u0000\u00006\u0115\u0001\u0000\u0000\u00008\u0117\u0001\u0000\u0000"+
		"\u0000:\u0119\u0001\u0000\u0000\u0000<\u011d\u0001\u0000\u0000\u0000>"+
		"\u0120\u0001\u0000\u0000\u0000@\u012a\u0001\u0000\u0000\u0000B\u012c\u0001"+
		"\u0000\u0000\u0000D\u012e\u0001\u0000\u0000\u0000F\u0130\u0001\u0000\u0000"+
		"\u0000H\u0132\u0001\u0000\u0000\u0000J\u0134\u0001\u0000\u0000\u0000L"+
		"\u0136\u0001\u0000\u0000\u0000N\u0138\u0001\u0000\u0000\u0000P\u013e\u0001"+
		"\u0000\u0000\u0000R\u0140\u0001\u0000\u0000\u0000T\u0142\u0001\u0000\u0000"+
		"\u0000V\u0144\u0001\u0000\u0000\u0000X\u0146\u0001\u0000\u0000\u0000Z"+
		"\u0148\u0001\u0000\u0000\u0000\\]\u0003\u0002\u0001\u0000]\u0001\u0001"+
		"\u0000\u0000\u0000^e\u0006\u0001\uffff\uffff\u0000_`\n\u0002\u0000\u0000"+
		"`a\u0003\u0004\u0002\u0000ab\u0005\u0001\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000c_\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0003\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000hl\u0003\u0006\u0003\u0000il\u0003\b\u0004\u0000"+
		"jl\u0003\u0012\t\u0000kh\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000l\u0005\u0001\u0000\u0000\u0000mn\u0005#\u0000"+
		"\u0000no\u0005\u0002\u0000\u0000op\u0003V+\u0000pq\u0006\u0003\uffff\uffff"+
		"\u0000q}\u0001\u0000\u0000\u0000rs\u0005#\u0000\u0000st\u0005\u0002\u0000"+
		"\u0000tu\u0003\u0018\f\u0000uv\u0006\u0003\uffff\uffff\u0000v}\u0001\u0000"+
		"\u0000\u0000wx\u0005#\u0000\u0000xy\u0005\u0002\u0000\u0000yz\u0003(\u0014"+
		"\u0000z{\u0006\u0003\uffff\uffff\u0000{}\u0001\u0000\u0000\u0000|m\u0001"+
		"\u0000\u0000\u0000|r\u0001\u0000\u0000\u0000|w\u0001\u0000\u0000\u0000"+
		"}\u0007\u0001\u0000\u0000\u0000~\u007f\u0005\u0003\u0000\u0000\u007f\u0080"+
		"\u0005\u0004\u0000\u0000\u0080\u0081\u0003\n\u0005\u0000\u0081\u0082\u0005"+
		"\u0005\u0000\u0000\u0082\t\u0001\u0000\u0000\u0000\u0083\u0087\u0003\f"+
		"\u0006\u0000\u0084\u0087\u0003\u000e\u0007\u0000\u0085\u0087\u0003\u0010"+
		"\b\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u000b\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0004\u0006\u0001\u0000\u0089\u008a\u0005#\u0000\u0000"+
		"\u008a\r\u0001\u0000\u0000\u0000\u008b\u008c\u0004\u0007\u0002\u0000\u008c"+
		"\u008d\u0003\u0018\f\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0004\b\u0003\u0000\u008f\u0090\u0003(\u0014\u0000\u0090\u0011\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0003\u0014\n\u0000\u0092\u0094\u0003\u0016"+
		"\u000b\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0013\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0006"+
		"\u0000\u0000\u0096\u0097\u00030\u0018\u0000\u0097\u0098\u0005\u0007\u0000"+
		"\u0000\u0098\u0099\u0003\u0004\u0002\u0000\u0099\u0015\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u0006\u0000\u0000\u009b\u009c\u00030\u0018\u0000"+
		"\u009c\u009d\u0005\u0007\u0000\u0000\u009d\u009e\u0003\u0004\u0002\u0000"+
		"\u009e\u009f\u0005\b\u0000\u0000\u009f\u00a0\u0003\u0004\u0002\u0000\u00a0"+
		"\u0017\u0001\u0000\u0000\u0000\u00a1\u00a2\u0006\f\uffff\uffff\u0000\u00a2"+
		"\u00a3\u0003\u001a\r\u0000\u00a3\u00ac\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\n\u0003\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00ab\u0003"+
		"\u001a\r\u0000\u00a7\u00a8\n\u0002\u0000\u0000\u00a8\u00a9\u0005\n\u0000"+
		"\u0000\u00a9\u00ab\u0003\u001a\r\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a7\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u0019\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0006\r\uffff\uffff\u0000\u00b0\u00b1\u0003\u001c\u000e\u0000"+
		"\u00b1\u00bd\u0001\u0000\u0000\u0000\u00b2\u00b3\n\u0004\u0000\u0000\u00b3"+
		"\u00b4\u0005\u000b\u0000\u0000\u00b4\u00bc\u0003\u001c\u000e\u0000\u00b5"+
		"\u00b6\n\u0003\u0000\u0000\u00b6\u00b7\u0005\f\u0000\u0000\u00b7\u00bc"+
		"\u0003\u001c\u000e\u0000\u00b8\u00b9\n\u0002\u0000\u0000\u00b9\u00ba\u0005"+
		"\r\u0000\u0000\u00ba\u00bc\u0003\u001c\u000e\u0000\u00bb\u00b2\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u001b\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c8\u0003X,\u0000"+
		"\u00c1\u00c8\u0003V+\u0000\u00c2\u00c8\u0003\"\u0011\u0000\u00c3\u00c8"+
		"\u0003\u001e\u000f\u0000\u00c4\u00c8\u0003 \u0010\u0000\u00c5\u00c8\u0003"+
		"$\u0012\u0000\u00c6\u00c8\u0003&\u0013\u0000\u00c7\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c7\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\n\u0000\u0000"+
		"\u00ca\u00cb\u0003\u0018\f\u0000\u00cb\u001f\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005\u0004\u0000\u0000\u00cd\u00ce\u0003\u0018\f\u0000\u00ce\u00cf"+
		"\u0005\u0005\u0000\u0000\u00cf!\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u000e\u0000\u0000\u00d1#\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u000f"+
		"\u0000\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4\u00d5\u0003(\u0014"+
		"\u0000\u00d5\u00d6\u0005\u0005\u0000\u0000\u00d6%\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005\u0010\u0000\u0000\u00d8\u00d9\u0005\u0004\u0000\u0000"+
		"\u00d9\u00da\u0003(\u0014\u0000\u00da\u00db\u0005\u0011\u0000\u0000\u00db"+
		"\u00dc\u0003(\u0014\u0000\u00dc\u00dd\u0005\u0005\u0000\u0000\u00dd\'"+
		"\u0001\u0000\u0000\u0000\u00de\u00e4\u0003Z-\u0000\u00df\u00e4\u0003V"+
		"+\u0000\u00e0\u00e4\u0003*\u0015\u0000\u00e1\u00e4\u0003,\u0016\u0000"+
		"\u00e2\u00e4\u0003.\u0017\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3"+
		"\u00df\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		")\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0012\u0000\u0000\u00e6+\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005\u0013\u0000\u0000\u00e8\u00e9\u0005"+
		"\u0004\u0000\u0000\u00e9\u00ea\u0003(\u0014\u0000\u00ea\u00eb\u0005\u0011"+
		"\u0000\u0000\u00eb\u00ec\u0003(\u0014\u0000\u00ec\u00ed\u0005\u0005\u0000"+
		"\u0000\u00ed-\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0014\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0004\u0000\u0000\u00f0\u00f1\u0003(\u0014\u0000\u00f1"+
		"\u00f2\u0005\u0011\u0000\u0000\u00f2\u00f3\u0003\u0018\f\u0000\u00f3\u00f4"+
		"\u0005\u0011\u0000\u0000\u00f4\u00f5\u0003\u0018\f\u0000\u00f5\u00f6\u0005"+
		"\u0005\u0000\u0000\u00f6/\u0001\u0000\u0000\u0000\u00f7\u00f8\u0006\u0018"+
		"\uffff\uffff\u0000\u00f8\u00f9\u00032\u0019\u0000\u00f9\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\n\u0002\u0000\u0000\u00fb\u00fc\u0005\u0015\u0000"+
		"\u0000\u00fc\u00fe\u00032\u0019\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u01001\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0006\u0019\uffff\uffff\u0000"+
		"\u0103\u0104\u00034\u001a\u0000\u0104\u010a\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\n\u0002\u0000\u0000\u0106\u0107\u0005\u0016\u0000\u0000\u0107\u0109"+
		"\u00034\u001a\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0109\u010c\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b3\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u0114\u00036\u001b\u0000\u010e\u0114\u00038\u001c\u0000"+
		"\u010f\u0114\u0003:\u001d\u0000\u0110\u0114\u0003<\u001e\u0000\u0111\u0114"+
		"\u0003>\u001f\u0000\u0112\u0114\u0003N\'\u0000\u0113\u010d\u0001\u0000"+
		"\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000"+
		"\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u01145\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0005\u0017\u0000\u0000\u01167\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0005\u0018\u0000\u0000\u01189\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u0004\u0000\u0000\u011a\u011b\u00030\u0018\u0000\u011b\u011c"+
		"\u0005\u0005\u0000\u0000\u011c;\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\u0019\u0000\u0000\u011e\u011f\u00030\u0018\u0000\u011f=\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0003\u0018\f\u0000\u0121\u0122\u0003@ \u0000\u0122"+
		"\u0123\u0003\u0018\f\u0000\u0123?\u0001\u0000\u0000\u0000\u0124\u012b"+
		"\u0003B!\u0000\u0125\u012b\u0003D\"\u0000\u0126\u012b\u0003F#\u0000\u0127"+
		"\u012b\u0003H$\u0000\u0128\u012b\u0003J%\u0000\u0129\u012b\u0003L&\u0000"+
		"\u012a\u0124\u0001\u0000\u0000\u0000\u012a\u0125\u0001\u0000\u0000\u0000"+
		"\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012bA\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u001a\u0000\u0000\u012d"+
		"C\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u001b\u0000\u0000\u012fE\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0005\u001c\u0000\u0000\u0131G\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0005\u001d\u0000\u0000\u0133I\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0005\u001e\u0000\u0000\u0135K\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005\u001f\u0000\u0000\u0137M\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0003(\u0014\u0000\u0139\u013a\u0003P(\u0000\u013a\u013b\u0003"+
		"(\u0014\u0000\u013bO\u0001\u0000\u0000\u0000\u013c\u013f\u0003R)\u0000"+
		"\u013d\u013f\u0003T*\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013d"+
		"\u0001\u0000\u0000\u0000\u013fQ\u0001\u0000\u0000\u0000\u0140\u0141\u0005"+
		" \u0000\u0000\u0141S\u0001\u0000\u0000\u0000\u0142\u0143\u0005!\u0000"+
		"\u0000\u0143U\u0001\u0000\u0000\u0000\u0144\u0145\u0005#\u0000\u0000\u0145"+
		"W\u0001\u0000\u0000\u0000\u0146\u0147\u0005\"\u0000\u0000\u0147Y\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005$\u0000\u0000\u0149[\u0001\u0000\u0000"+
		"\u0000\u0010ek|\u0086\u0093\u00aa\u00ac\u00bb\u00bd\u00c7\u00e3\u00ff"+
		"\u010a\u0113\u012a\u013e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}