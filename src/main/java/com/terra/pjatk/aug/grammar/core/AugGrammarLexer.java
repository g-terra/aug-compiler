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
public class AugGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, NUM=26, IDENT=27, STRING=28, WS=29;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"NUM", "IDENT", "STRING", "WS"
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


	public AugGrammarLexer(CharStream input) {
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
		"\u0004\u0000\u001d\u00bd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u00a3\b\u0019\u000b"+
		"\u0019\f\u0019\u00a4\u0001\u001a\u0001\u001a\u0005\u001a\u00a9\b\u001a"+
		"\n\u001a\f\u001a\u00ac\t\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u00b0"+
		"\b\u001b\n\u001b\f\u001b\u00b3\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0004\u001c\u00b8\b\u001c\u000b\u001c\f\u001c\u00b9\u0001\u001c\u0001"+
		"\u001c\u0001\u00b1\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		"\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz\u0003\u000009AZaz\u0003"+
		"\u0000\t\n\r\r  \u00c0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;\u0001"+
		"\u0000\u0000\u0000\u0003=\u0001\u0000\u0000\u0000\u0005@\u0001\u0000\u0000"+
		"\u0000\u0007F\u0001\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000\u000b"+
		"J\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fN\u0001\u0000"+
		"\u0000\u0000\u0011P\u0001\u0000\u0000\u0000\u0013R\u0001\u0000\u0000\u0000"+
		"\u0015T\u0001\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019"+
		"c\u0001\u0000\u0000\u0000\u001bl\u0001\u0000\u0000\u0000\u001dn\u0001"+
		"\u0000\u0000\u0000\u001fv\u0001\u0000\u0000\u0000!\u0082\u0001\u0000\u0000"+
		"\u0000#\u008c\u0001\u0000\u0000\u0000%\u008e\u0001\u0000\u0000\u0000\'"+
		"\u0090\u0001\u0000\u0000\u0000)\u0093\u0001\u0000\u0000\u0000+\u0095\u0001"+
		"\u0000\u0000\u0000-\u0098\u0001\u0000\u0000\u0000/\u009b\u0001\u0000\u0000"+
		"\u00001\u009e\u0001\u0000\u0000\u00003\u00a2\u0001\u0000\u0000\u00005"+
		"\u00a6\u0001\u0000\u0000\u00007\u00ad\u0001\u0000\u0000\u00009\u00b7\u0001"+
		"\u0000\u0000\u0000;<\u0005;\u0000\u0000<\u0002\u0001\u0000\u0000\u0000"+
		"=>\u0005:\u0000\u0000>?\u0005=\u0000\u0000?\u0004\u0001\u0000\u0000\u0000"+
		"@A\u0005p\u0000\u0000AB\u0005r\u0000\u0000BC\u0005i\u0000\u0000CD\u0005"+
		"n\u0000\u0000DE\u0005t\u0000\u0000E\u0006\u0001\u0000\u0000\u0000FG\u0005"+
		"(\u0000\u0000G\b\u0001\u0000\u0000\u0000HI\u0005)\u0000\u0000I\n\u0001"+
		"\u0000\u0000\u0000JK\u0005+\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005"+
		"-\u0000\u0000M\u000e\u0001\u0000\u0000\u0000NO\u0005*\u0000\u0000O\u0010"+
		"\u0001\u0000\u0000\u0000PQ\u0005/\u0000\u0000Q\u0012\u0001\u0000\u0000"+
		"\u0000RS\u0005%\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0005r\u0000"+
		"\u0000UV\u0005e\u0000\u0000VW\u0005a\u0000\u0000WX\u0005d\u0000\u0000"+
		"XY\u0005i\u0000\u0000YZ\u0005n\u0000\u0000Z[\u0005t\u0000\u0000[\u0016"+
		"\u0001\u0000\u0000\u0000\\]\u0005l\u0000\u0000]^\u0005e\u0000\u0000^_"+
		"\u0005n\u0000\u0000_`\u0005g\u0000\u0000`a\u0005t\u0000\u0000ab\u0005"+
		"h\u0000\u0000b\u0018\u0001\u0000\u0000\u0000cd\u0005p\u0000\u0000de\u0005"+
		"o\u0000\u0000ef\u0005s\u0000\u0000fg\u0005i\u0000\u0000gh\u0005t\u0000"+
		"\u0000hi\u0005i\u0000\u0000ij\u0005o\u0000\u0000jk\u0005n\u0000\u0000"+
		"k\u001a\u0001\u0000\u0000\u0000lm\u0005,\u0000\u0000m\u001c\u0001\u0000"+
		"\u0000\u0000no\u0005r\u0000\u0000op\u0005e\u0000\u0000pq\u0005a\u0000"+
		"\u0000qr\u0005d\u0000\u0000rs\u0005s\u0000\u0000st\u0005t\u0000\u0000"+
		"tu\u0005r\u0000\u0000u\u001e\u0001\u0000\u0000\u0000vw\u0005c\u0000\u0000"+
		"wx\u0005o\u0000\u0000xy\u0005n\u0000\u0000yz\u0005c\u0000\u0000z{\u0005"+
		"a\u0000\u0000{|\u0005t\u0000\u0000|}\u0005e\u0000\u0000}~\u0005n\u0000"+
		"\u0000~\u007f\u0005a\u0000\u0000\u007f\u0080\u0005t\u0000\u0000\u0080"+
		"\u0081\u0005e\u0000\u0000\u0081 \u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"s\u0000\u0000\u0083\u0084\u0005u\u0000\u0000\u0084\u0085\u0005b\u0000"+
		"\u0000\u0085\u0086\u0005s\u0000\u0000\u0086\u0087\u0005t\u0000\u0000\u0087"+
		"\u0088\u0005r\u0000\u0000\u0088\u0089\u0005i\u0000\u0000\u0089\u008a\u0005"+
		"n\u0000\u0000\u008a\u008b\u0005g\u0000\u0000\u008b\"\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005=\u0000\u0000\u008d$\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005<\u0000\u0000\u008f&\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"<\u0000\u0000\u0091\u0092\u0005=\u0000\u0000\u0092(\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005>\u0000\u0000\u0094*\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005>\u0000\u0000\u0096\u0097\u0005=\u0000\u0000\u0097,\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005<\u0000\u0000\u0099\u009a\u0005>\u0000"+
		"\u0000\u009a.\u0001\u0000\u0000\u0000\u009b\u009c\u0005=\u0000\u0000\u009c"+
		"\u009d\u0005=\u0000\u0000\u009d0\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		"!\u0000\u0000\u009f\u00a0\u0005=\u0000\u0000\u00a02\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a3\u0007\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a54\u0001\u0000\u0000\u0000"+
		"\u00a6\u00aa\u0007\u0001\u0000\u0000\u00a7\u00a9\u0007\u0002\u0000\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab6\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad"+
		"\u00b1\u0005\"\u0000\u0000\u00ae\u00b0\t\u0000\u0000\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\"\u0000\u0000\u00b58\u0001\u0000\u0000\u0000\u00b6\u00b8\u0007"+
		"\u0003\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0006"+
		"\u001c\u0000\u0000\u00bc:\u0001\u0000\u0000\u0000\u0005\u0000\u00a4\u00aa"+
		"\u00b1\u00b9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}