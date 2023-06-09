// Generated from com/terra/pjatk/aug/grammar/core/AugGrammar.g4 by ANTLR 4.13.0
package com.terra.pjatk.aug.grammar.core;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class StringExpressionGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NUM=18, IDENT=19, STRING=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"NUM", "IDENT", "STRING", "WS"
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


	    java.util.Map<String, String> typeMap = new java.util.HashMap<>();

	    public void setType(String identifier, String type) {
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


	public StringExpressionGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AugGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u0098\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0004\u0011~\b\u0011\u000b\u0011\f\u0011"+
		"\u007f\u0001\u0012\u0001\u0012\u0005\u0012\u0084\b\u0012\n\u0012\f\u0012"+
		"\u0087\t\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u008b\b\u0013\n\u0013"+
		"\f\u0013\u008e\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014"+
		"\u0093\b\u0014\u000b\u0014\f\u0014\u0094\u0001\u0014\u0001\u0014\u0001"+
		"\u008c\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz\u0003\u000009AZaz\u0003"+
		"\u0000\t\n\r\r  \u009b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001"+
		"\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000"+
		"\u0000\t8\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r<\u0001"+
		"\u0000\u0000\u0000\u000f>\u0001\u0000\u0000\u0000\u0011@\u0001\u0000\u0000"+
		"\u0000\u0013B\u0001\u0000\u0000\u0000\u0015D\u0001\u0000\u0000\u0000\u0017"+
		"L\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001b\\\u0001"+
		"\u0000\u0000\u0000\u001d^\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000"+
		"\u0000!r\u0001\u0000\u0000\u0000#}\u0001\u0000\u0000\u0000%\u0081\u0001"+
		"\u0000\u0000\u0000\'\u0088\u0001\u0000\u0000\u0000)\u0092\u0001\u0000"+
		"\u0000\u0000+,\u0005;\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005"+
		":\u0000\u0000./\u0005=\u0000\u0000/\u0004\u0001\u0000\u0000\u000001\u0005"+
		"p\u0000\u000012\u0005r\u0000\u000023\u0005i\u0000\u000034\u0005n\u0000"+
		"\u000045\u0005t\u0000\u00005\u0006\u0001\u0000\u0000\u000067\u0005(\u0000"+
		"\u00007\b\u0001\u0000\u0000\u000089\u0005)\u0000\u00009\n\u0001\u0000"+
		"\u0000\u0000:;\u0005+\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005-"+
		"\u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005*\u0000\u0000?\u0010"+
		"\u0001\u0000\u0000\u0000@A\u0005/\u0000\u0000A\u0012\u0001\u0000\u0000"+
		"\u0000BC\u0005%\u0000\u0000C\u0014\u0001\u0000\u0000\u0000DE\u0005r\u0000"+
		"\u0000EF\u0005e\u0000\u0000FG\u0005a\u0000\u0000GH\u0005d\u0000\u0000"+
		"HI\u0005i\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005t\u0000\u0000K\u0016"+
		"\u0001\u0000\u0000\u0000LM\u0005l\u0000\u0000MN\u0005e\u0000\u0000NO\u0005"+
		"n\u0000\u0000OP\u0005g\u0000\u0000PQ\u0005t\u0000\u0000QR\u0005h\u0000"+
		"\u0000R\u0018\u0001\u0000\u0000\u0000ST\u0005p\u0000\u0000TU\u0005o\u0000"+
		"\u0000UV\u0005s\u0000\u0000VW\u0005i\u0000\u0000WX\u0005t\u0000\u0000"+
		"XY\u0005i\u0000\u0000YZ\u0005o\u0000\u0000Z[\u0005n\u0000\u0000[\u001a"+
		"\u0001\u0000\u0000\u0000\\]\u0005,\u0000\u0000]\u001c\u0001\u0000\u0000"+
		"\u0000^_\u0005r\u0000\u0000_`\u0005e\u0000\u0000`a\u0005a\u0000\u0000"+
		"ab\u0005d\u0000\u0000bc\u0005s\u0000\u0000cd\u0005t\u0000\u0000de\u0005"+
		"r\u0000\u0000e\u001e\u0001\u0000\u0000\u0000fg\u0005c\u0000\u0000gh\u0005"+
		"o\u0000\u0000hi\u0005n\u0000\u0000ij\u0005c\u0000\u0000jk\u0005a\u0000"+
		"\u0000kl\u0005t\u0000\u0000lm\u0005e\u0000\u0000mn\u0005n\u0000\u0000"+
		"no\u0005a\u0000\u0000op\u0005t\u0000\u0000pq\u0005e\u0000\u0000q \u0001"+
		"\u0000\u0000\u0000rs\u0005s\u0000\u0000st\u0005u\u0000\u0000tu\u0005b"+
		"\u0000\u0000uv\u0005s\u0000\u0000vw\u0005t\u0000\u0000wx\u0005r\u0000"+
		"\u0000xy\u0005i\u0000\u0000yz\u0005n\u0000\u0000z{\u0005g\u0000\u0000"+
		"{\"\u0001\u0000\u0000\u0000|~\u0007\u0000\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080$\u0001\u0000\u0000\u0000\u0081\u0085"+
		"\u0007\u0001\u0000\u0000\u0082\u0084\u0007\u0002\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086&\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008c\u0005"+
		"\"\u0000\u0000\u0089\u008b\t\u0000\u0000\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005\"\u0000"+
		"\u0000\u0090(\u0001\u0000\u0000\u0000\u0091\u0093\u0007\u0003\u0000\u0000"+
		"\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0006\u0014\u0000\u0000"+
		"\u0097*\u0001\u0000\u0000\u0000\u0005\u0000\u007f\u0085\u008c\u0094\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}