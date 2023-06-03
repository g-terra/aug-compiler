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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, NUM=42, IDENT=43, STRING=44, WS=45;
	public static final int
		RULE_program = 0, RULE_instr = 1, RULE_simple_instr = 2, RULE_break_stat = 3, 
		RULE_continue_stat = 4, RULE_exit_stat = 5, RULE_assign_stat = 6, RULE_output_stat = 7, 
		RULE_printable_expr = 8, RULE_printable_undef = 9, RULE_printable_num_expr = 10, 
		RULE_printable_str_expr = 11, RULE_if_stat = 12, RULE_if_then_stat = 13, 
		RULE_if_then_else_stat = 14, RULE_instr_block = 15, RULE_for_stat = 16, 
		RULE_num_expr = 17, RULE_t_num_expr = 18, RULE_f_num_expr = 19, RULE_negate = 20, 
		RULE_sub_num_expr = 21, RULE_read_int = 22, RULE_length = 23, RULE_position = 24, 
		RULE_str_expr = 25, RULE_read_str = 26, RULE_concatenate = 27, RULE_substring = 28, 
		RULE_bool_expr = 29, RULE_t_bool_expr = 30, RULE_f_bool_expr = 31, RULE_true = 32, 
		RULE_false = 33, RULE_sub_bool_expr = 34, RULE_not_expr = 35, RULE_num_rel_expr = 36, 
		RULE_num_rel = 37, RULE_num_eq_rel = 38, RULE_num_lt_rel = 39, RULE_num_le_rel = 40, 
		RULE_num_gt_rel = 41, RULE_num_ge_rel = 42, RULE_num_neq_rel = 43, RULE_str_rel_expr = 44, 
		RULE_str_rel = 45, RULE_str_eq_rel = 46, RULE_str_neq_rel = 47, RULE_ident = 48, 
		RULE_num = 49, RULE_string = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instr", "simple_instr", "break_stat", "continue_stat", "exit_stat", 
			"assign_stat", "output_stat", "printable_expr", "printable_undef", "printable_num_expr", 
			"printable_str_expr", "if_stat", "if_then_stat", "if_then_else_stat", 
			"instr_block", "for_stat", "num_expr", "t_num_expr", "f_num_expr", "negate", 
			"sub_num_expr", "read_int", "length", "position", "str_expr", "read_str", 
			"concatenate", "substring", "bool_expr", "t_bool_expr", "f_bool_expr", 
			"true", "false", "sub_bool_expr", "not_expr", "num_rel_expr", "num_rel", 
			"num_eq_rel", "num_lt_rel", "num_le_rel", "num_gt_rel", "num_ge_rel", 
			"num_neq_rel", "str_rel_expr", "str_rel", "str_eq_rel", "str_neq_rel", 
			"ident", "num", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'break'", "'continue'", "'exit'", "':='", "'print'", "'('", 
			"')'", "'if'", "'then'", "'else'", "'begin'", "'end'", "'for'", "'to'", 
			"'do'", "'+'", "'-'", "'*'", "'/'", "'%'", "'readint'", "'length'", "'position'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NUM", "IDENT", "STRING", "WS"
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
			setState(102);
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
			setState(111);
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
					setState(105);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(106);
					simple_instr();
					setState(107);
					match(T__0);
					}
					} 
				}
				setState(113);
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
		public Instr_blockContext instr_block() {
			return getRuleContext(Instr_blockContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Break_statContext break_stat() {
			return getRuleContext(Break_statContext.class,0);
		}
		public Continue_statContext continue_stat() {
			return getRuleContext(Continue_statContext.class,0);
		}
		public Exit_statContext exit_stat() {
			return getRuleContext(Exit_statContext.class,0);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				assign_stat();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				output_stat();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				if_stat();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				instr_block();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				for_stat();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				break_stat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				continue_stat();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				exit_stat();
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
	public static class Break_statContext extends ParserRuleContext {
		public Break_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitBreak_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statContext break_stat() throws RecognitionException {
		Break_statContext _localctx = new Break_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_break_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__1);
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
	public static class Continue_statContext extends ParserRuleContext {
		public Continue_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitContinue_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statContext continue_stat() throws RecognitionException {
		Continue_statContext _localctx = new Continue_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_continue_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__2);
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
	public static class Exit_statContext extends ParserRuleContext {
		public Exit_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitExit_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_statContext exit_stat() throws RecognitionException {
		Exit_statContext _localctx = new Exit_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exit_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__3);
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
		enterRule(_localctx, 12, RULE_assign_stat);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(131);
				match(T__4);
				setState(132);
				((Assign_statContext)_localctx).ident = ident();
				 setType((((Assign_statContext)_localctx).IDENT!=null?((Assign_statContext)_localctx).IDENT.getText():null),  getType((((Assign_statContext)_localctx).ident!=null?_input.getText(((Assign_statContext)_localctx).ident.start,((Assign_statContext)_localctx).ident.stop):null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(136);
				match(T__4);
				setState(137);
				num_expr(0);
				 setType((((Assign_statContext)_localctx).IDENT!=null?((Assign_statContext)_localctx).IDENT.getText():null), "num"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(141);
				match(T__4);
				setState(142);
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
		enterRule(_localctx, 14, RULE_output_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__5);
			setState(148);
			match(T__6);
			setState(149);
			printable_expr();
			setState(150);
			match(T__7);
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
		enterRule(_localctx, 16, RULE_printable_expr);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				printable_undef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				printable_num_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
		enterRule(_localctx, 18, RULE_printable_undef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			if (!( isUndefined(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isUndefined(_input.LT(1).getText()) ");
			setState(158);
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
		enterRule(_localctx, 20, RULE_printable_num_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			if (!( isNum(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isNum(_input.LT(1).getText()) ");
			setState(161);
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
		enterRule(_localctx, 22, RULE_printable_str_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			if (!( isStr(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isStr(_input.LT(1).getText()) ");
			setState(164);
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
		enterRule(_localctx, 24, RULE_if_stat);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				if_then_stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
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
		enterRule(_localctx, 26, RULE_if_then_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__8);
			setState(171);
			bool_expr(0);
			setState(172);
			match(T__9);
			setState(173);
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
		enterRule(_localctx, 28, RULE_if_then_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__8);
			setState(176);
			bool_expr(0);
			setState(177);
			match(T__9);
			setState(178);
			simple_instr();
			setState(179);
			match(T__10);
			setState(180);
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
	public static class Instr_blockContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public Instr_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitInstr_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_blockContext instr_block() throws RecognitionException {
		Instr_blockContext _localctx = new Instr_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instr_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__11);
			setState(183);
			instr(0);
			setState(184);
			match(T__12);
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
	public static class For_statContext extends ParserRuleContext {
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Simple_instrContext simple_instr() {
			return getRuleContext(Simple_instrContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__13);
			setState(187);
			assign_stat();
			setState(188);
			match(T__14);
			setState(189);
			num_expr(0);
			setState(190);
			match(T__15);
			setState(191);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_num_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			t_num_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
						setState(196);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(197);
						match(T__16);
						setState(198);
						t_num_expr(0);
						}
						break;
					case 2:
						{
						_localctx = new Num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
						setState(199);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(200);
						match(T__17);
						setState(201);
						t_num_expr(0);
						}
						break;
					}
					} 
				}
				setState(206);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_t_num_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			f_num_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new T_num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_num_expr);
						setState(210);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(211);
						match(T__18);
						setState(212);
						f_num_expr();
						}
						break;
					case 2:
						{
						_localctx = new T_num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_num_expr);
						setState(213);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(214);
						match(T__19);
						setState(215);
						f_num_expr();
						}
						break;
					case 3:
						{
						_localctx = new T_num_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_num_expr);
						setState(216);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(217);
						match(T__20);
						setState(218);
						f_num_expr();
						}
						break;
					}
					} 
				}
				setState(223);
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
		enterRule(_localctx, 38, RULE_f_num_expr);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				num();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				ident();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				read_int();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				negate();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				sub_num_expr();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				length();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
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
		enterRule(_localctx, 40, RULE_negate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__17);
			setState(234);
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
		enterRule(_localctx, 42, RULE_sub_num_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__6);
			setState(237);
			num_expr(0);
			setState(238);
			match(T__7);
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
		enterRule(_localctx, 44, RULE_read_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__21);
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
		enterRule(_localctx, 46, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__22);
			setState(243);
			match(T__6);
			setState(244);
			str_expr();
			setState(245);
			match(T__7);
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
		enterRule(_localctx, 48, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__23);
			setState(248);
			match(T__6);
			setState(249);
			str_expr();
			setState(250);
			match(T__24);
			setState(251);
			str_expr();
			setState(252);
			match(T__7);
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
		enterRule(_localctx, 50, RULE_str_expr);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				string();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				ident();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				read_str();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				concatenate();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
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
		enterRule(_localctx, 52, RULE_read_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 54, RULE_concatenate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__26);
			setState(264);
			match(T__6);
			setState(265);
			str_expr();
			setState(266);
			match(T__24);
			setState(267);
			str_expr();
			setState(268);
			match(T__7);
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
		enterRule(_localctx, 56, RULE_substring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__27);
			setState(271);
			match(T__6);
			setState(272);
			str_expr();
			setState(273);
			match(T__24);
			setState(274);
			num_expr(0);
			setState(275);
			match(T__24);
			setState(276);
			num_expr(0);
			setState(277);
			match(T__7);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(280);
			t_bool_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
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
					setState(282);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(283);
					match(T__28);
					setState(284);
					t_bool_expr(0);
					}
					} 
				}
				setState(289);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_t_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			f_bool_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
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
					setState(293);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(294);
					match(T__29);
					setState(295);
					f_bool_expr();
					}
					} 
				}
				setState(300);
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
		enterRule(_localctx, 62, RULE_f_bool_expr);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				true_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				false_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				sub_bool_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				not_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				num_rel_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(306);
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
		enterRule(_localctx, 64, RULE_true);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 66, RULE_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 68, RULE_sub_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__6);
			setState(314);
			bool_expr(0);
			setState(315);
			match(T__7);
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
		enterRule(_localctx, 70, RULE_not_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__32);
			setState(318);
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
		enterRule(_localctx, 72, RULE_num_rel_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			num_expr(0);
			setState(321);
			num_rel();
			setState(322);
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
		enterRule(_localctx, 74, RULE_num_rel);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				num_eq_rel();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				num_lt_rel();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				num_le_rel();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				num_gt_rel();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				num_ge_rel();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
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
		enterRule(_localctx, 76, RULE_num_eq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__33);
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
		enterRule(_localctx, 78, RULE_num_lt_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__34);
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
		enterRule(_localctx, 80, RULE_num_le_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__35);
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
		enterRule(_localctx, 82, RULE_num_gt_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__36);
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
		enterRule(_localctx, 84, RULE_num_ge_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__37);
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
		enterRule(_localctx, 86, RULE_num_neq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__38);
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
		enterRule(_localctx, 88, RULE_str_rel_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			str_expr();
			setState(345);
			str_rel();
			setState(346);
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
		enterRule(_localctx, 90, RULE_str_rel);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				str_eq_rel();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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
		enterRule(_localctx, 92, RULE_str_eq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__39);
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
		enterRule(_localctx, 94, RULE_str_neq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__40);
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
		enterRule(_localctx, 96, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		enterRule(_localctx, 98, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		enterRule(_localctx, 100, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		case 9:
			return printable_undef_sempred((Printable_undefContext)_localctx, predIndex);
		case 10:
			return printable_num_expr_sempred((Printable_num_exprContext)_localctx, predIndex);
		case 11:
			return printable_str_expr_sempred((Printable_str_exprContext)_localctx, predIndex);
		case 17:
			return num_expr_sempred((Num_exprContext)_localctx, predIndex);
		case 18:
			return t_num_expr_sempred((T_num_exprContext)_localctx, predIndex);
		case 29:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 30:
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
		"\u0004\u0001-\u016b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001n\b\u0001\n\u0001\f\u0001q\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002{\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0092\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0003\f\u00a9\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00cb\b\u0011\n\u0011"+
		"\f\u0011\u00ce\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00dc\b\u0012\n\u0012\f\u0012\u00df"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00e8\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0104\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u011e\b\u001d\n\u001d\f\u001d\u0121\t\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u0129\b\u001e\n\u001e\f\u001e\u012c\t\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0134"+
		"\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u014b\b%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0003-\u015f\b-\u0001.\u0001.\u0001/\u0001/\u00010\u0001"+
		"0\u00011\u00011\u00012\u00012\u00012\u0000\u0005\u0002\"$:<3\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0000\u0160\u0000f\u0001\u0000"+
		"\u0000\u0000\u0002h\u0001\u0000\u0000\u0000\u0004z\u0001\u0000\u0000\u0000"+
		"\u0006|\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000\u0000\n\u0080\u0001"+
		"\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000\u000e\u0093\u0001\u0000"+
		"\u0000\u0000\u0010\u009b\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000"+
		"\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00a3\u0001\u0000"+
		"\u0000\u0000\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00aa\u0001\u0000"+
		"\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e\u00b6\u0001\u0000"+
		"\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00c1\u0001\u0000\u0000"+
		"\u0000$\u00cf\u0001\u0000\u0000\u0000&\u00e7\u0001\u0000\u0000\u0000("+
		"\u00e9\u0001\u0000\u0000\u0000*\u00ec\u0001\u0000\u0000\u0000,\u00f0\u0001"+
		"\u0000\u0000\u0000.\u00f2\u0001\u0000\u0000\u00000\u00f7\u0001\u0000\u0000"+
		"\u00002\u0103\u0001\u0000\u0000\u00004\u0105\u0001\u0000\u0000\u00006"+
		"\u0107\u0001\u0000\u0000\u00008\u010e\u0001\u0000\u0000\u0000:\u0117\u0001"+
		"\u0000\u0000\u0000<\u0122\u0001\u0000\u0000\u0000>\u0133\u0001\u0000\u0000"+
		"\u0000@\u0135\u0001\u0000\u0000\u0000B\u0137\u0001\u0000\u0000\u0000D"+
		"\u0139\u0001\u0000\u0000\u0000F\u013d\u0001\u0000\u0000\u0000H\u0140\u0001"+
		"\u0000\u0000\u0000J\u014a\u0001\u0000\u0000\u0000L\u014c\u0001\u0000\u0000"+
		"\u0000N\u014e\u0001\u0000\u0000\u0000P\u0150\u0001\u0000\u0000\u0000R"+
		"\u0152\u0001\u0000\u0000\u0000T\u0154\u0001\u0000\u0000\u0000V\u0156\u0001"+
		"\u0000\u0000\u0000X\u0158\u0001\u0000\u0000\u0000Z\u015e\u0001\u0000\u0000"+
		"\u0000\\\u0160\u0001\u0000\u0000\u0000^\u0162\u0001\u0000\u0000\u0000"+
		"`\u0164\u0001\u0000\u0000\u0000b\u0166\u0001\u0000\u0000\u0000d\u0168"+
		"\u0001\u0000\u0000\u0000fg\u0003\u0002\u0001\u0000g\u0001\u0001\u0000"+
		"\u0000\u0000ho\u0006\u0001\uffff\uffff\u0000ij\n\u0002\u0000\u0000jk\u0003"+
		"\u0004\u0002\u0000kl\u0005\u0001\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mi\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\u0003\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000r{\u0003\f\u0006\u0000s{\u0003\u000e\u0007\u0000t{\u0003"+
		"\u0018\f\u0000u{\u0003\u001e\u000f\u0000v{\u0003 \u0010\u0000w{\u0003"+
		"\u0006\u0003\u0000x{\u0003\b\u0004\u0000y{\u0003\n\u0005\u0000zr\u0001"+
		"\u0000\u0000\u0000zs\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000"+
		"zu\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u0005\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0002\u0000\u0000}\u0007\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u0003\u0000\u0000\u007f\t\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u000b\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005+\u0000\u0000\u0083\u0084\u0005\u0005\u0000\u0000\u0084"+
		"\u0085\u0003`0\u0000\u0085\u0086\u0006\u0006\uffff\uffff\u0000\u0086\u0092"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005+\u0000\u0000\u0088\u0089\u0005"+
		"\u0005\u0000\u0000\u0089\u008a\u0003\"\u0011\u0000\u008a\u008b\u0006\u0006"+
		"\uffff\uffff\u0000\u008b\u0092\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"+\u0000\u0000\u008d\u008e\u0005\u0005\u0000\u0000\u008e\u008f\u00032\u0019"+
		"\u0000\u008f\u0090\u0006\u0006\uffff\uffff\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u0082\u0001\u0000\u0000\u0000\u0091\u0087\u0001\u0000"+
		"\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0092\r\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u0006\u0000\u0000\u0094\u0095\u0005\u0007\u0000"+
		"\u0000\u0095\u0096\u0003\u0010\b\u0000\u0096\u0097\u0005\b\u0000\u0000"+
		"\u0097\u000f\u0001\u0000\u0000\u0000\u0098\u009c\u0003\u0012\t\u0000\u0099"+
		"\u009c\u0003\u0014\n\u0000\u009a\u009c\u0003\u0016\u000b\u0000\u009b\u0098"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0004\t\u0001\u0000\u009e\u009f\u0005+\u0000\u0000\u009f\u0013\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0004\n\u0002\u0000\u00a1\u00a2\u0003\""+
		"\u0011\u0000\u00a2\u0015\u0001\u0000\u0000\u0000\u00a3\u00a4\u0004\u000b"+
		"\u0003\u0000\u00a4\u00a5\u00032\u0019\u0000\u00a5\u0017\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a9\u0003\u001a\r\u0000\u00a7\u00a9\u0003\u001c\u000e\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u0019\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\t\u0000\u0000\u00ab"+
		"\u00ac\u0003:\u001d\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae"+
		"\u0003\u0004\u0002\u0000\u00ae\u001b\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\t\u0000\u0000\u00b0\u00b1\u0003:\u001d\u0000\u00b1\u00b2\u0005"+
		"\n\u0000\u0000\u00b2\u00b3\u0003\u0004\u0002\u0000\u00b3\u00b4\u0005\u000b"+
		"\u0000\u0000\u00b4\u00b5\u0003\u0004\u0002\u0000\u00b5\u001d\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\f\u0000\u0000\u00b7\u00b8\u0003\u0002\u0001"+
		"\u0000\u00b8\u00b9\u0005\r\u0000\u0000\u00b9\u001f\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\u000e\u0000\u0000\u00bb\u00bc\u0003\f\u0006\u0000\u00bc"+
		"\u00bd\u0005\u000f\u0000\u0000\u00bd\u00be\u0003\"\u0011\u0000\u00be\u00bf"+
		"\u0005\u0010\u0000\u0000\u00bf\u00c0\u0003\u0004\u0002\u0000\u00c0!\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0006\u0011\uffff\uffff\u0000\u00c2\u00c3"+
		"\u0003$\u0012\u0000\u00c3\u00cc\u0001\u0000\u0000\u0000\u00c4\u00c5\n"+
		"\u0003\u0000\u0000\u00c5\u00c6\u0005\u0011\u0000\u0000\u00c6\u00cb\u0003"+
		"$\u0012\u0000\u00c7\u00c8\n\u0002\u0000\u0000\u00c8\u00c9\u0005\u0012"+
		"\u0000\u0000\u00c9\u00cb\u0003$\u0012\u0000\u00ca\u00c4\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd#\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0006\u0012\uffff\uffff\u0000\u00d0\u00d1\u0003&\u0013\u0000"+
		"\u00d1\u00dd\u0001\u0000\u0000\u0000\u00d2\u00d3\n\u0004\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0013\u0000\u0000\u00d4\u00dc\u0003&\u0013\u0000\u00d5\u00d6"+
		"\n\u0003\u0000\u0000\u00d6\u00d7\u0005\u0014\u0000\u0000\u00d7\u00dc\u0003"+
		"&\u0013\u0000\u00d8\u00d9\n\u0002\u0000\u0000\u00d9\u00da\u0005\u0015"+
		"\u0000\u0000\u00da\u00dc\u0003&\u0013\u0000\u00db\u00d2\u0001\u0000\u0000"+
		"\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000"+
		"\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de%\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e8\u0003b1\u0000\u00e1\u00e8"+
		"\u0003`0\u0000\u00e2\u00e8\u0003,\u0016\u0000\u00e3\u00e8\u0003(\u0014"+
		"\u0000\u00e4\u00e8\u0003*\u0015\u0000\u00e5\u00e8\u0003.\u0017\u0000\u00e6"+
		"\u00e8\u00030\u0018\u0000\u00e7\u00e0\u0001\u0000\u0000\u0000\u00e7\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\'\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005\u0012\u0000\u0000\u00ea\u00eb\u0003"+
		"\"\u0011\u0000\u00eb)\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0007"+
		"\u0000\u0000\u00ed\u00ee\u0003\"\u0011\u0000\u00ee\u00ef\u0005\b\u0000"+
		"\u0000\u00ef+\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0016\u0000\u0000"+
		"\u00f1-\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0017\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0007\u0000\u0000\u00f4\u00f5\u00032\u0019\u0000\u00f5\u00f6"+
		"\u0005\b\u0000\u0000\u00f6/\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"\u0018\u0000\u0000\u00f8\u00f9\u0005\u0007\u0000\u0000\u00f9\u00fa\u0003"+
		"2\u0019\u0000\u00fa\u00fb\u0005\u0019\u0000\u0000\u00fb\u00fc\u00032\u0019"+
		"\u0000\u00fc\u00fd\u0005\b\u0000\u0000\u00fd1\u0001\u0000\u0000\u0000"+
		"\u00fe\u0104\u0003d2\u0000\u00ff\u0104\u0003`0\u0000\u0100\u0104\u0003"+
		"4\u001a\u0000\u0101\u0104\u00036\u001b\u0000\u0102\u0104\u00038\u001c"+
		"\u0000\u0103\u00fe\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000"+
		"\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u01043\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0005\u001a\u0000\u0000\u01065\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0005\u001b\u0000\u0000\u0108\u0109\u0005\u0007\u0000\u0000\u0109"+
		"\u010a\u00032\u0019\u0000\u010a\u010b\u0005\u0019\u0000\u0000\u010b\u010c"+
		"\u00032\u0019\u0000\u010c\u010d\u0005\b\u0000\u0000\u010d7\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\u001c\u0000\u0000\u010f\u0110\u0005\u0007"+
		"\u0000\u0000\u0110\u0111\u00032\u0019\u0000\u0111\u0112\u0005\u0019\u0000"+
		"\u0000\u0112\u0113\u0003\"\u0011\u0000\u0113\u0114\u0005\u0019\u0000\u0000"+
		"\u0114\u0115\u0003\"\u0011\u0000\u0115\u0116\u0005\b\u0000\u0000\u0116"+
		"9\u0001\u0000\u0000\u0000\u0117\u0118\u0006\u001d\uffff\uffff\u0000\u0118"+
		"\u0119\u0003<\u001e\u0000\u0119\u011f\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\n\u0002\u0000\u0000\u011b\u011c\u0005\u001d\u0000\u0000\u011c\u011e\u0003"+
		"<\u001e\u0000\u011d\u011a\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120;\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0006\u001e\uffff\uffff\u0000\u0123\u0124\u0003>\u001f"+
		"\u0000\u0124\u012a\u0001\u0000\u0000\u0000\u0125\u0126\n\u0002\u0000\u0000"+
		"\u0126\u0127\u0005\u001e\u0000\u0000\u0127\u0129\u0003>\u001f\u0000\u0128"+
		"\u0125\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b"+
		"=\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0134"+
		"\u0003@ \u0000\u012e\u0134\u0003B!\u0000\u012f\u0134\u0003D\"\u0000\u0130"+
		"\u0134\u0003F#\u0000\u0131\u0134\u0003H$\u0000\u0132\u0134\u0003X,\u0000"+
		"\u0133\u012d\u0001\u0000\u0000\u0000\u0133\u012e\u0001\u0000\u0000\u0000"+
		"\u0133\u012f\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0134?\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u001f\u0000\u0000\u0136"+
		"A\u0001\u0000\u0000\u0000\u0137\u0138\u0005 \u0000\u0000\u0138C\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0005\u0007\u0000\u0000\u013a\u013b\u0003"+
		":\u001d\u0000\u013b\u013c\u0005\b\u0000\u0000\u013cE\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0005!\u0000\u0000\u013e\u013f\u0003:\u001d\u0000\u013f"+
		"G\u0001\u0000\u0000\u0000\u0140\u0141\u0003\"\u0011\u0000\u0141\u0142"+
		"\u0003J%\u0000\u0142\u0143\u0003\"\u0011\u0000\u0143I\u0001\u0000\u0000"+
		"\u0000\u0144\u014b\u0003L&\u0000\u0145\u014b\u0003N\'\u0000\u0146\u014b"+
		"\u0003P(\u0000\u0147\u014b\u0003R)\u0000\u0148\u014b\u0003T*\u0000\u0149"+
		"\u014b\u0003V+\u0000\u014a\u0144\u0001\u0000\u0000\u0000\u014a\u0145\u0001"+
		"\u0000\u0000\u0000\u014a\u0146\u0001\u0000\u0000\u0000\u014a\u0147\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u0149\u0001"+
		"\u0000\u0000\u0000\u014bK\u0001\u0000\u0000\u0000\u014c\u014d\u0005\""+
		"\u0000\u0000\u014dM\u0001\u0000\u0000\u0000\u014e\u014f\u0005#\u0000\u0000"+
		"\u014fO\u0001\u0000\u0000\u0000\u0150\u0151\u0005$\u0000\u0000\u0151Q"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0005%\u0000\u0000\u0153S\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0005&\u0000\u0000\u0155U\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0005\'\u0000\u0000\u0157W\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u00032\u0019\u0000\u0159\u015a\u0003Z-\u0000\u015a\u015b\u0003"+
		"2\u0019\u0000\u015bY\u0001\u0000\u0000\u0000\u015c\u015f\u0003\\.\u0000"+
		"\u015d\u015f\u0003^/\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015f[\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"(\u0000\u0000\u0161]\u0001\u0000\u0000\u0000\u0162\u0163\u0005)\u0000"+
		"\u0000\u0163_\u0001\u0000\u0000\u0000\u0164\u0165\u0005+\u0000\u0000\u0165"+
		"a\u0001\u0000\u0000\u0000\u0166\u0167\u0005*\u0000\u0000\u0167c\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0005,\u0000\u0000\u0169e\u0001\u0000\u0000"+
		"\u0000\u0010oz\u0091\u009b\u00a8\u00ca\u00cc\u00db\u00dd\u00e7\u0103\u011f"+
		"\u012a\u0133\u014a\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}