// Generated from com/terra/pjatk/aug/grammar/core/AugGrammar.g4 by ANTLR 4.13.0
package com.terra.pjatk.aug.grammar.core;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AugGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NUM=18, IDENT=19, STRING=20, WS=21;
	public static final int
		RULE_program = 0, RULE_instr = 1, RULE_simple_instr = 2, RULE_assign_stat = 3, 
		RULE_output_stat = 4, RULE_printable_expr = 5, RULE_printable_undef = 6, 
		RULE_printable_num_expr = 7, RULE_printable_str_expr = 8, RULE_num_expr = 9, 
		RULE_t_num_expr = 10, RULE_f_num_expr = 11, RULE_negate = 12, RULE_paren = 13, 
		RULE_read_int = 14, RULE_length = 15, RULE_position = 16, RULE_str_expr = 17, 
		RULE_read_str = 18, RULE_concatenate = 19, RULE_substring = 20, RULE_ident = 21, 
		RULE_num = 22, RULE_string = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instr", "simple_instr", "assign_stat", "output_stat", "printable_expr", 
			"printable_undef", "printable_num_expr", "printable_str_expr", "num_expr", 
			"t_num_expr", "f_num_expr", "negate", "paren", "read_int", "length", 
			"position", "str_expr", "read_str", "concatenate", "substring", "ident", 
			"num", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'print'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'readint'", "'length'", "'position'", "','", "'readstr'", "'concatenate'", 
			"'substring'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
			setState(48);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				simple_instr();
				setState(51);
				match(T__0);
				setState(52);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				assign_stat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(62);
				match(T__1);
				setState(63);
				((Assign_statContext)_localctx).ident = ident();
				 setType((((Assign_statContext)_localctx).IDENT!=null?((Assign_statContext)_localctx).IDENT.getText():null),  getType((((Assign_statContext)_localctx).ident!=null?_input.getText(((Assign_statContext)_localctx).ident.start,((Assign_statContext)_localctx).ident.stop):null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(67);
				match(T__1);
				setState(68);
				num_expr();
				 setType((((Assign_statContext)_localctx).IDENT!=null?((Assign_statContext)_localctx).IDENT.getText():null), "num"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				((Assign_statContext)_localctx).IDENT = match(IDENT);
				setState(72);
				match(T__1);
				setState(73);
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
			setState(78);
			match(T__2);
			setState(79);
			match(T__3);
			setState(80);
			printable_expr();
			setState(81);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				printable_undef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				printable_num_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
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
			setState(88);
			if (!( isUndefined(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isUndefined(_input.LT(1).getText()) ");
			setState(89);
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
			setState(91);
			if (!( isNum(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isNum(_input.LT(1).getText()) ");
			setState(92);
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
			setState(94);
			if (!( isStr(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " isStr(_input.LT(1).getText()) ");
			setState(95);
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
			setState(97);
			t_num_expr();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(102);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__5:
						{
						setState(98);
						match(T__5);
						setState(99);
						t_num_expr();
						}
						break;
					case T__6:
						{
						setState(100);
						match(T__6);
						setState(101);
						t_num_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(106);
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
			setState(107);
			f_num_expr();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(114);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__7:
						{
						setState(108);
						match(T__7);
						setState(109);
						f_num_expr();
						}
						break;
					case T__8:
						{
						setState(110);
						match(T__8);
						setState(111);
						f_num_expr();
						}
						break;
					case T__9:
						{
						setState(112);
						match(T__9);
						setState(113);
						f_num_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(118);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				num();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				ident();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				read_int();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				negate();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				paren();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				length();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
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
			setState(128);
			match(T__6);
			setState(129);
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
			setState(131);
			match(T__3);
			setState(132);
			num_expr();
			setState(133);
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
			setState(135);
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
			setState(137);
			match(T__11);
			setState(138);
			match(T__3);
			setState(139);
			str_expr();
			setState(140);
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
			setState(142);
			match(T__12);
			setState(143);
			match(T__3);
			setState(144);
			str_expr();
			setState(145);
			match(T__13);
			setState(146);
			str_expr();
			setState(147);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				string();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				ident();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				read_str();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				concatenate();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
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
			setState(156);
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
			setState(158);
			match(T__15);
			setState(159);
			match(T__3);
			setState(160);
			str_expr();
			setState(161);
			match(T__13);
			setState(162);
			str_expr();
			setState(163);
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
			setState(165);
			match(T__16);
			setState(166);
			match(T__3);
			setState(167);
			str_expr();
			setState(168);
			match(T__13);
			setState(169);
			num_expr();
			setState(170);
			match(T__13);
			setState(171);
			num_expr();
			setState(172);
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
		enterRule(_localctx, 42, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		enterRule(_localctx, 44, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 46, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		"\u0004\u0001\u0015\u00b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00018\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005W\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\tg\b\t\n\t\f\tj\t\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\ns\b\n\n\n\f\nv\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u007f\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u009b\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.\u0000\u0000\u00b1\u00000\u0001\u0000\u0000\u0000\u0002"+
		"7\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006L\u0001"+
		"\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000"+
		"\fX\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010^\u0001"+
		"\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000\u0014k\u0001\u0000\u0000"+
		"\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u0080\u0001\u0000\u0000\u0000"+
		"\u001a\u0083\u0001\u0000\u0000\u0000\u001c\u0087\u0001\u0000\u0000\u0000"+
		"\u001e\u0089\u0001\u0000\u0000\u0000 \u008e\u0001\u0000\u0000\u0000\""+
		"\u009a\u0001\u0000\u0000\u0000$\u009c\u0001\u0000\u0000\u0000&\u009e\u0001"+
		"\u0000\u0000\u0000(\u00a5\u0001\u0000\u0000\u0000*\u00ae\u0001\u0000\u0000"+
		"\u0000,\u00b0\u0001\u0000\u0000\u0000.\u00b2\u0001\u0000\u0000\u00000"+
		"1\u0003\u0002\u0001\u00001\u0001\u0001\u0000\u0000\u000023\u0003\u0004"+
		"\u0002\u000034\u0005\u0001\u0000\u000045\u0003\u0002\u0001\u000058\u0001"+
		"\u0000\u0000\u000068\u0001\u0000\u0000\u000072\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009<\u0003\u0006"+
		"\u0003\u0000:<\u0003\b\u0004\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005\u0013\u0000\u0000"+
		">?\u0005\u0002\u0000\u0000?@\u0003*\u0015\u0000@A\u0006\u0003\uffff\uffff"+
		"\u0000AM\u0001\u0000\u0000\u0000BC\u0005\u0013\u0000\u0000CD\u0005\u0002"+
		"\u0000\u0000DE\u0003\u0012\t\u0000EF\u0006\u0003\uffff\uffff\u0000FM\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0013\u0000\u0000HI\u0005\u0002\u0000\u0000"+
		"IJ\u0003\"\u0011\u0000JK\u0006\u0003\uffff\uffff\u0000KM\u0001\u0000\u0000"+
		"\u0000L=\u0001\u0000\u0000\u0000LB\u0001\u0000\u0000\u0000LG\u0001\u0000"+
		"\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0005\u0003\u0000\u0000"+
		"OP\u0005\u0004\u0000\u0000PQ\u0003\n\u0005\u0000QR\u0005\u0005\u0000\u0000"+
		"R\t\u0001\u0000\u0000\u0000SW\u0003\f\u0006\u0000TW\u0003\u000e\u0007"+
		"\u0000UW\u0003\u0010\b\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0004"+
		"\u0006\u0000\u0000YZ\u0005\u0013\u0000\u0000Z\r\u0001\u0000\u0000\u0000"+
		"[\\\u0004\u0007\u0001\u0000\\]\u0003\u0012\t\u0000]\u000f\u0001\u0000"+
		"\u0000\u0000^_\u0004\b\u0002\u0000_`\u0003\"\u0011\u0000`\u0011\u0001"+
		"\u0000\u0000\u0000ah\u0003\u0014\n\u0000bc\u0005\u0006\u0000\u0000cg\u0003"+
		"\u0014\n\u0000de\u0005\u0007\u0000\u0000eg\u0003\u0014\n\u0000fb\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0013\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000kt\u0003\u0016\u000b\u0000lm\u0005"+
		"\b\u0000\u0000ms\u0003\u0016\u000b\u0000no\u0005\t\u0000\u0000os\u0003"+
		"\u0016\u000b\u0000pq\u0005\n\u0000\u0000qs\u0003\u0016\u000b\u0000rl\u0001"+
		"\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000u\u0015\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w\u007f"+
		"\u0003,\u0016\u0000x\u007f\u0003*\u0015\u0000y\u007f\u0003\u001c\u000e"+
		"\u0000z\u007f\u0003\u0018\f\u0000{\u007f\u0003\u001a\r\u0000|\u007f\u0003"+
		"\u001e\u000f\u0000}\u007f\u0003 \u0010\u0000~w\u0001\u0000\u0000\u0000"+
		"~x\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000"+
		"\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0007"+
		"\u0000\u0000\u0081\u0082\u0003\u0012\t\u0000\u0082\u0019\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0003\u0012\t\u0000"+
		"\u0085\u0086\u0005\u0005\u0000\u0000\u0086\u001b\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u000b\u0000\u0000\u0088\u001d\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005\f\u0000\u0000\u008a\u008b\u0005\u0004\u0000\u0000\u008b"+
		"\u008c\u0003\"\u0011\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u001f"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005\r\u0000\u0000\u008f\u0090\u0005"+
		"\u0004\u0000\u0000\u0090\u0091\u0003\"\u0011\u0000\u0091\u0092\u0005\u000e"+
		"\u0000\u0000\u0092\u0093\u0003\"\u0011\u0000\u0093\u0094\u0005\u0005\u0000"+
		"\u0000\u0094!\u0001\u0000\u0000\u0000\u0095\u009b\u0003.\u0017\u0000\u0096"+
		"\u009b\u0003*\u0015\u0000\u0097\u009b\u0003$\u0012\u0000\u0098\u009b\u0003"+
		"&\u0013\u0000\u0099\u009b\u0003(\u0014\u0000\u009a\u0095\u0001\u0000\u0000"+
		"\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b#\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u000f\u0000\u0000"+
		"\u009d%\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0010\u0000\u0000\u009f"+
		"\u00a0\u0005\u0004\u0000\u0000\u00a0\u00a1\u0003\"\u0011\u0000\u00a1\u00a2"+
		"\u0005\u000e\u0000\u0000\u00a2\u00a3\u0003\"\u0011\u0000\u00a3\u00a4\u0005"+
		"\u0005\u0000\u0000\u00a4\'\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0011"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0004\u0000\u0000\u00a7\u00a8\u0003\"\u0011"+
		"\u0000\u00a8\u00a9\u0005\u000e\u0000\u0000\u00a9\u00aa\u0003\u0012\t\u0000"+
		"\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab\u00ac\u0003\u0012\t\u0000\u00ac"+
		"\u00ad\u0005\u0005\u0000\u0000\u00ad)\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0013\u0000\u0000\u00af+\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0012\u0000\u0000\u00b1-\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0014"+
		"\u0000\u0000\u00b3/\u0001\u0000\u0000\u0000\n7;LVfhrt~\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}