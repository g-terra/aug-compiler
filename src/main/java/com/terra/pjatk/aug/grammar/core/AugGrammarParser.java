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
		T__24=25, NUM=26, IDENT=27, STRING=28, WS=29;
	public static final int
		RULE_program = 0, RULE_instr = 1, RULE_simple_instr = 2, RULE_assign_stat = 3, 
		RULE_output_stat = 4, RULE_printable_expr = 5, RULE_printable_undef = 6, 
		RULE_printable_num_expr = 7, RULE_printable_str_expr = 8, RULE_num_expr = 9, 
		RULE_t_num_expr = 10, RULE_f_num_expr = 11, RULE_negate = 12, RULE_paren = 13, 
		RULE_read_int = 14, RULE_length = 15, RULE_position = 16, RULE_str_expr = 17, 
		RULE_read_str = 18, RULE_concatenate = 19, RULE_substring = 20, RULE_num_rel_expr = 21, 
		RULE_num_rel = 22, RULE_num_eq_rel = 23, RULE_num_lt_rel = 24, RULE_num_le_rel = 25, 
		RULE_num_gt_rel = 26, RULE_num_ge_rel = 27, RULE_num_neq_rel = 28, RULE_str_rel_expr = 29, 
		RULE_str_rel = 30, RULE_str_eq_rel = 31, RULE_str_neq_rel = 32, RULE_ident = 33, 
		RULE_num = 34, RULE_string = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instr", "simple_instr", "assign_stat", "output_stat", "printable_expr", 
			"printable_undef", "printable_num_expr", "printable_str_expr", "num_expr", 
			"t_num_expr", "f_num_expr", "negate", "paren", "read_int", "length", 
			"position", "str_expr", "read_str", "concatenate", "substring", "num_rel_expr", 
			"num_rel", "num_eq_rel", "num_lt_rel", "num_le_rel", "num_gt_rel", "num_ge_rel", 
			"num_neq_rel", "str_rel_expr", "str_rel", "str_eq_rel", "str_neq_rel", 
			"ident", "num", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'print'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'readint'", "'length'", "'position'", "','", "'readstr'", "'concatenate'", 
			"'substring'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NUM", "IDENT", "STRING", "WS"
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
			setState(72);
			instr();
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
		public Simple_instrContext simple_instr() {
			return getRuleContext(Simple_instrContext.class,0);
		}
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
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
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instr);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				simple_instr();
				setState(75);
				match(T__0);
				setState(76);
				instr();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Simple_instrContext extends ParserRuleContext {
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public Output_statContext output_stat() {
			return getRuleContext(Output_statContext.class,0);
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				assign_stat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				output_stat();
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(86);
				match(T__1);
				setState(87);
				((Assign_statContext)_localctx).ident = ident();
				 setType((((Assign_statContext)_localctx).IDENT!=null?((Assign_statContext)_localctx).IDENT.getText():null),  getType((((Assign_statContext)_localctx).ident!=null?_input.getText(((Assign_statContext)_localctx).ident.start,((Assign_statContext)_localctx).ident.stop):null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(91);
				match(T__1);
				setState(92);
				num_expr();
				 setType((((Assign_statContext)_localctx).IDENT!=null?((Assign_statContext)_localctx).IDENT.getText():null), "num"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(96);
				match(T__1);
				setState(97);
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
			setState(102);
			match(T__2);
			setState(103);
			match(T__3);
			setState(104);
			printable_expr();
			setState(105);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				printable_undef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				printable_num_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
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
			setState(112);
			if (!( isUndefined(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isUndefined(_input.LT(1).getText()) ");
			setState(113);
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
			setState(115);
			if (!( isNum(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isNum(_input.LT(1).getText()) ");
			setState(116);
			num_expr();
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
			setState(118);
			if (!( isStr(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isStr(_input.LT(1).getText()) ");
			setState(119);
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
	public static class Num_exprContext extends ParserRuleContext {
		public List<T_num_exprContext> t_num_expr() {
			return getRuleContexts(T_num_exprContext.class);
		}
		public T_num_exprContext t_num_expr(int i) {
			return getRuleContext(T_num_exprContext.class,i);
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
		Num_exprContext _localctx = new Num_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_num_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			t_num_expr();
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(126);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__5:
						{
						setState(122);
						match(T__5);
						setState(123);
						t_num_expr();
						}
						break;
					case T__6:
						{
						setState(124);
						match(T__6);
						setState(125);
						t_num_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
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
	public static class T_num_exprContext extends ParserRuleContext {
		public List<F_num_exprContext> f_num_expr() {
			return getRuleContexts(F_num_exprContext.class);
		}
		public F_num_exprContext f_num_expr(int i) {
			return getRuleContext(F_num_exprContext.class,i);
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
		T_num_exprContext _localctx = new T_num_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_t_num_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			f_num_expr();
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(138);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__7:
						{
						setState(132);
						match(T__7);
						setState(133);
						f_num_expr();
						}
						break;
					case T__8:
						{
						setState(134);
						match(T__8);
						setState(135);
						f_num_expr();
						}
						break;
					case T__9:
						{
						setState(136);
						match(T__9);
						setState(137);
						f_num_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
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
		public ParenContext paren() {
			return getRuleContext(ParenContext.class,0);
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
		enterRule(_localctx, 22, RULE_f_num_expr);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				num();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				ident();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				read_int();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				negate();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				paren();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				length();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
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
		enterRule(_localctx, 24, RULE_negate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__6);
			setState(153);
			num_expr();
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
	public static class ParenContext extends ParserRuleContext {
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public ParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AugGrammarVisitor ) return ((AugGrammarVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenContext paren() throws RecognitionException {
		ParenContext _localctx = new ParenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__3);
			setState(156);
			num_expr();
			setState(157);
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
		enterRule(_localctx, 28, RULE_read_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__10);
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
		enterRule(_localctx, 30, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__11);
			setState(162);
			match(T__3);
			setState(163);
			str_expr();
			setState(164);
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
		enterRule(_localctx, 32, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__12);
			setState(167);
			match(T__3);
			setState(168);
			str_expr();
			setState(169);
			match(T__13);
			setState(170);
			str_expr();
			setState(171);
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
		enterRule(_localctx, 34, RULE_str_expr);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				string();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				ident();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				read_str();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				concatenate();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
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
		enterRule(_localctx, 36, RULE_read_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__14);
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
		enterRule(_localctx, 38, RULE_concatenate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__15);
			setState(183);
			match(T__3);
			setState(184);
			str_expr();
			setState(185);
			match(T__13);
			setState(186);
			str_expr();
			setState(187);
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
		enterRule(_localctx, 40, RULE_substring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__16);
			setState(190);
			match(T__3);
			setState(191);
			str_expr();
			setState(192);
			match(T__13);
			setState(193);
			num_expr();
			setState(194);
			match(T__13);
			setState(195);
			num_expr();
			setState(196);
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
		enterRule(_localctx, 42, RULE_num_rel_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			num_expr();
			setState(199);
			num_rel();
			setState(200);
			num_expr();
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
		enterRule(_localctx, 44, RULE_num_rel);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				num_eq_rel();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				num_lt_rel();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				num_le_rel();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				num_gt_rel();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				num_ge_rel();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
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
		enterRule(_localctx, 46, RULE_num_eq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 48, RULE_num_lt_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__18);
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
		enterRule(_localctx, 50, RULE_num_le_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__19);
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
		enterRule(_localctx, 52, RULE_num_gt_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__20);
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
		enterRule(_localctx, 54, RULE_num_ge_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 56, RULE_num_neq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		enterRule(_localctx, 58, RULE_str_rel_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			str_expr();
			setState(223);
			str_rel();
			setState(224);
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
		enterRule(_localctx, 60, RULE_str_rel);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				str_eq_rel();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
		enterRule(_localctx, 62, RULE_str_eq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 64, RULE_str_neq_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__24);
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
		enterRule(_localctx, 66, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 68, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 70, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		case 6:
			return printable_undef_sempred((Printable_undefContext)_localctx, predIndex);
		case 7:
			return printable_num_expr_sempred((Printable_num_exprContext)_localctx, predIndex);
		case 8:
			return printable_str_expr_sempred((Printable_str_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean printable_undef_sempred(Printable_undefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  isUndefined(_input.LT(1).getText()) ;
		}
		return true;
	}
	private boolean printable_num_expr_sempred(Printable_num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  isNum(_input.LT(1).getText()) ;
		}
		return true;
	}
	private boolean printable_str_expr_sempred(Printable_str_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  isStr(_input.LT(1).getText()) ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001P\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002T\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003e\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u007f"+
		"\b\t\n\t\f\t\u0082\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0005\n\u008b\b\n\n\n\f\n\u008e\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0097"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00b3\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00d1\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u00e5\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0000\u00e7\u0000"+
		"H\u0001\u0000\u0000\u0000\u0002O\u0001\u0000\u0000\u0000\u0004S\u0001"+
		"\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000"+
		"\u0000\nn\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000es\u0001"+
		"\u0000\u0000\u0000\u0010v\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000"+
		"\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0096\u0001\u0000\u0000"+
		"\u0000\u0018\u0098\u0001\u0000\u0000\u0000\u001a\u009b\u0001\u0000\u0000"+
		"\u0000\u001c\u009f\u0001\u0000\u0000\u0000\u001e\u00a1\u0001\u0000\u0000"+
		"\u0000 \u00a6\u0001\u0000\u0000\u0000\"\u00b2\u0001\u0000\u0000\u0000"+
		"$\u00b4\u0001\u0000\u0000\u0000&\u00b6\u0001\u0000\u0000\u0000(\u00bd"+
		"\u0001\u0000\u0000\u0000*\u00c6\u0001\u0000\u0000\u0000,\u00d0\u0001\u0000"+
		"\u0000\u0000.\u00d2\u0001\u0000\u0000\u00000\u00d4\u0001\u0000\u0000\u0000"+
		"2\u00d6\u0001\u0000\u0000\u00004\u00d8\u0001\u0000\u0000\u00006\u00da"+
		"\u0001\u0000\u0000\u00008\u00dc\u0001\u0000\u0000\u0000:\u00de\u0001\u0000"+
		"\u0000\u0000<\u00e4\u0001\u0000\u0000\u0000>\u00e6\u0001\u0000\u0000\u0000"+
		"@\u00e8\u0001\u0000\u0000\u0000B\u00ea\u0001\u0000\u0000\u0000D\u00ec"+
		"\u0001\u0000\u0000\u0000F\u00ee\u0001\u0000\u0000\u0000HI\u0003\u0002"+
		"\u0001\u0000I\u0001\u0001\u0000\u0000\u0000JK\u0003\u0004\u0002\u0000"+
		"KL\u0005\u0001\u0000\u0000LM\u0003\u0002\u0001\u0000MP\u0001\u0000\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000P\u0003\u0001\u0000\u0000\u0000QT\u0003\u0006\u0003\u0000"+
		"RT\u0003\b\u0004\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"T\u0005\u0001\u0000\u0000\u0000UV\u0005\u001b\u0000\u0000VW\u0005\u0002"+
		"\u0000\u0000WX\u0003B!\u0000XY\u0006\u0003\uffff\uffff\u0000Ye\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u001b\u0000\u0000[\\\u0005\u0002\u0000\u0000\\]\u0003"+
		"\u0012\t\u0000]^\u0006\u0003\uffff\uffff\u0000^e\u0001\u0000\u0000\u0000"+
		"_`\u0005\u001b\u0000\u0000`a\u0005\u0002\u0000\u0000ab\u0003\"\u0011\u0000"+
		"bc\u0006\u0003\uffff\uffff\u0000ce\u0001\u0000\u0000\u0000dU\u0001\u0000"+
		"\u0000\u0000dZ\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000e\u0007"+
		"\u0001\u0000\u0000\u0000fg\u0005\u0003\u0000\u0000gh\u0005\u0004\u0000"+
		"\u0000hi\u0003\n\u0005\u0000ij\u0005\u0005\u0000\u0000j\t\u0001\u0000"+
		"\u0000\u0000ko\u0003\f\u0006\u0000lo\u0003\u000e\u0007\u0000mo\u0003\u0010"+
		"\b\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000"+
		"\u0000\u0000o\u000b\u0001\u0000\u0000\u0000pq\u0004\u0006\u0000\u0000"+
		"qr\u0005\u001b\u0000\u0000r\r\u0001\u0000\u0000\u0000st\u0004\u0007\u0001"+
		"\u0000tu\u0003\u0012\t\u0000u\u000f\u0001\u0000\u0000\u0000vw\u0004\b"+
		"\u0002\u0000wx\u0003\"\u0011\u0000x\u0011\u0001\u0000\u0000\u0000y\u0080"+
		"\u0003\u0014\n\u0000z{\u0005\u0006\u0000\u0000{\u007f\u0003\u0014\n\u0000"+
		"|}\u0005\u0007\u0000\u0000}\u007f\u0003\u0014\n\u0000~z\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0013"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u008c"+
		"\u0003\u0016\u000b\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u008b\u0003"+
		"\u0016\u000b\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u008b\u0003\u0016"+
		"\u000b\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089\u008b\u0003\u0016\u000b"+
		"\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u0015\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0097\u0003D\"\u0000\u0090\u0097\u0003B!\u0000\u0091\u0097"+
		"\u0003\u001c\u000e\u0000\u0092\u0097\u0003\u0018\f\u0000\u0093\u0097\u0003"+
		"\u001a\r\u0000\u0094\u0097\u0003\u001e\u000f\u0000\u0095\u0097\u0003 "+
		"\u0010\u0000\u0096\u008f\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000"+
		"\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000"+
		"\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0017\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005\u0007\u0000\u0000\u0099\u009a\u0003\u0012"+
		"\t\u0000\u009a\u0019\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0004\u0000"+
		"\u0000\u009c\u009d\u0003\u0012\t\u0000\u009d\u009e\u0005\u0005\u0000\u0000"+
		"\u009e\u001b\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000b\u0000\u0000"+
		"\u00a0\u001d\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\f\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a4\u0003\"\u0011\u0000\u00a4\u00a5"+
		"\u0005\u0005\u0000\u0000\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\r\u0000\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8\u00a9\u0003"+
		"\"\u0011\u0000\u00a9\u00aa\u0005\u000e\u0000\u0000\u00aa\u00ab\u0003\""+
		"\u0011\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000\u00ac!\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b3\u0003F#\u0000\u00ae\u00b3\u0003B!\u0000\u00af\u00b3"+
		"\u0003$\u0012\u0000\u00b0\u00b3\u0003&\u0013\u0000\u00b1\u00b3\u0003("+
		"\u0014\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3#\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u000f\u0000\u0000\u00b5%\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0010\u0000\u0000\u00b7\u00b8\u0005\u0004\u0000\u0000"+
		"\u00b8\u00b9\u0003\"\u0011\u0000\u00b9\u00ba\u0005\u000e\u0000\u0000\u00ba"+
		"\u00bb\u0003\"\u0011\u0000\u00bb\u00bc\u0005\u0005\u0000\u0000\u00bc\'"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0011\u0000\u0000\u00be\u00bf"+
		"\u0005\u0004\u0000\u0000\u00bf\u00c0\u0003\"\u0011\u0000\u00c0\u00c1\u0005"+
		"\u000e\u0000\u0000\u00c1\u00c2\u0003\u0012\t\u0000\u00c2\u00c3\u0005\u000e"+
		"\u0000\u0000\u00c3\u00c4\u0003\u0012\t\u0000\u00c4\u00c5\u0005\u0005\u0000"+
		"\u0000\u00c5)\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u0012\t\u0000"+
		"\u00c7\u00c8\u0003,\u0016\u0000\u00c8\u00c9\u0003\u0012\t\u0000\u00c9"+
		"+\u0001\u0000\u0000\u0000\u00ca\u00d1\u0003.\u0017\u0000\u00cb\u00d1\u0003"+
		"0\u0018\u0000\u00cc\u00d1\u00032\u0019\u0000\u00cd\u00d1\u00034\u001a"+
		"\u0000\u00ce\u00d1\u00036\u001b\u0000\u00cf\u00d1\u00038\u001c\u0000\u00d0"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0"+
		"\u00cc\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"-\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0012\u0000\u0000\u00d3/\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\u0013\u0000\u0000\u00d51\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005\u0014\u0000\u0000\u00d73\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0015\u0000\u0000\u00d95\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005\u0016\u0000\u0000\u00db7\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\u0017\u0000\u0000\u00dd9\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0003\"\u0011\u0000\u00df\u00e0\u0003<\u001e\u0000\u00e0\u00e1\u0003"+
		"\"\u0011\u0000\u00e1;\u0001\u0000\u0000\u0000\u00e2\u00e5\u0003>\u001f"+
		"\u0000\u00e3\u00e5\u0003@ \u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5=\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005\u0018\u0000\u0000\u00e7?\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"\u0019\u0000\u0000\u00e9A\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u001b"+
		"\u0000\u0000\u00ebC\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u001a\u0000"+
		"\u0000\u00edE\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u001c\u0000\u0000"+
		"\u00efG\u0001\u0000\u0000\u0000\fOSdn~\u0080\u008a\u008c\u0096\u00b2\u00d0"+
		"\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}