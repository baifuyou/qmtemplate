// Generated from /home/baifuyou/IdeaProjects/QMTemplate/src/main/resources/qmtemplate/QMTemplateLexer.g4 by ANTLR 4.5.1
package com.scratbai.qmtemplate;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QMTemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_BRACE=1, PLANE_TEXT=2, ESC=3, RIGHT_BRACE=4, RIGHT_BRACKET=5, LEFT_BRACKET=6, 
		RIGHT_SQUARE_BRACKET=7, LEFT_SQUARE_BRACKET=8, DOT=9, EQUAL=10, DEQUAL=11, 
		NOT_EQUAL=12, NOT=13, AND=14, DAND=15, OR=16, DOR=17, NEW_LINE=18, EACH=19, 
		END=20, IF=21, ELSE=22, IN=23, GT=24, LT=25, GTE=26, LTE=27, COMMA=28, 
		FLOAT=29, INT=30, STRING=31, BOOLEAN=32, ID=33, WS=34;
	public static final int BLOCK = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "BLOCK"
	};

	public static final String[] ruleNames = {
		"LEFT_BRACE", "PLANE_TEXT", "ESC", "RIGHT_BRACE", "RIGHT_BRACKET", "LEFT_BRACKET", 
		"RIGHT_SQUARE_BRACKET", "LEFT_SQUARE_BRACKET", "DOT", "EQUAL", "DEQUAL", 
		"NOT_EQUAL", "NOT", "AND", "DAND", "OR", "DOR", "NEW_LINE", "EACH", "END", 
		"IF", "ELSE", "IN", "GT", "LT", "GTE", "LTE", "COMMA", "FLOAT", "INT", 
		"STRING", "BOOLEAN", "STRING_ESC", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", null, null, "'}'", "')'", "'('", "']'", "'['", "'.'", "'='", 
		"'=='", "'!='", "'!'", "'&'", "'&&'", "'|'", "'||'", "'\n'", "'each'", 
		"'/end'", "'if'", "'else'", "'in'", "'>'", "'<'", "'>='", "'<='", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFT_BRACE", "PLANE_TEXT", "ESC", "RIGHT_BRACE", "RIGHT_BRACKET", 
		"LEFT_BRACKET", "RIGHT_SQUARE_BRACKET", "LEFT_SQUARE_BRACKET", "DOT", 
		"EQUAL", "DEQUAL", "NOT_EQUAL", "NOT", "AND", "DAND", "OR", "DOR", "NEW_LINE", 
		"EACH", "END", "IF", "ELSE", "IN", "GT", "LT", "GTE", "LTE", "COMMA", 
		"FLOAT", "INT", "STRING", "BOOLEAN", "ID", "WS"
	};
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


	public QMTemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QMTemplateLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00dc\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\6\3Q\n\3\r\3\16\3"+
		"R\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\6\36\u00a6\n\36\r\36\16\36\u00a7\3\36\3\36\6"+
		"\36\u00ac\n\36\r\36\16\36\u00ad\3\37\6\37\u00b1\n\37\r\37\16\37\u00b2"+
		"\3 \3 \3 \7 \u00b8\n \f \16 \u00bb\13 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u00c8\n!\3\"\3\"\3\"\3\"\5\"\u00ce\n\"\3#\3#\6#\u00d2\n#\r#\16#\u00d3"+
		"\3$\6$\u00d7\n$\r$\16$\u00d8\3$\3$\3\u00b9\2%\4\3\6\4\b\5\n\6\f\7\16\b"+
		"\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26"+
		",\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!B\"D\2F#H$\4\2\3\7\5\2"+
		"^^}}\177\177\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u00e8\2"+
		"\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\3\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2"+
		"\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3"+
		"\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2"+
		"\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2"+
		"\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2"+
		"\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3F\3\2\2\2\3H\3\2\2\2\4J\3\2\2\2\6"+
		"P\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22"+
		"i\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30o\3\2\2\2\32r\3\2\2\2\34u\3\2\2\2"+
		"\36w\3\2\2\2 y\3\2\2\2\"|\3\2\2\2$~\3\2\2\2&\u0081\3\2\2\2(\u0083\3\2"+
		"\2\2*\u0088\3\2\2\2,\u008d\3\2\2\2.\u0090\3\2\2\2\60\u0095\3\2\2\2\62"+
		"\u0098\3\2\2\2\64\u009a\3\2\2\2\66\u009c\3\2\2\28\u009f\3\2\2\2:\u00a2"+
		"\3\2\2\2<\u00a5\3\2\2\2>\u00b0\3\2\2\2@\u00b4\3\2\2\2B\u00c7\3\2\2\2D"+
		"\u00cd\3\2\2\2F\u00cf\3\2\2\2H\u00d6\3\2\2\2JK\7}\2\2KL\3\2\2\2LM\b\2"+
		"\2\2M\5\3\2\2\2NQ\n\2\2\2OQ\5\b\4\2PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2S\7\3\2\2\2TU\7^\2\2U^\5\4\2\2VW\7^\2\2W^\5\n\5\2XY\7"+
		"^\2\2Y^\7$\2\2Z[\7^\2\2[^\7^\2\2\\^\7^\2\2]T\3\2\2\2]V\3\2\2\2]X\3\2\2"+
		"\2]Z\3\2\2\2]\\\3\2\2\2^\t\3\2\2\2_`\7\177\2\2`a\3\2\2\2ab\b\5\3\2b\13"+
		"\3\2\2\2cd\7+\2\2d\r\3\2\2\2ef\7*\2\2f\17\3\2\2\2gh\7_\2\2h\21\3\2\2\2"+
		"ij\7]\2\2j\23\3\2\2\2kl\7\60\2\2l\25\3\2\2\2mn\7?\2\2n\27\3\2\2\2op\7"+
		"?\2\2pq\7?\2\2q\31\3\2\2\2rs\7#\2\2st\7?\2\2t\33\3\2\2\2uv\7#\2\2v\35"+
		"\3\2\2\2wx\7(\2\2x\37\3\2\2\2yz\7(\2\2z{\7(\2\2{!\3\2\2\2|}\7~\2\2}#\3"+
		"\2\2\2~\177\7~\2\2\177\u0080\7~\2\2\u0080%\3\2\2\2\u0081\u0082\7\f\2\2"+
		"\u0082\'\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086\7e"+
		"\2\2\u0086\u0087\7j\2\2\u0087)\3\2\2\2\u0088\u0089\7\61\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2\u008c+\3\2\2\2\u008d\u008e"+
		"\7k\2\2\u008e\u008f\7h\2\2\u008f-\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094/\3\2\2\2\u0095\u0096"+
		"\7k\2\2\u0096\u0097\7p\2\2\u0097\61\3\2\2\2\u0098\u0099\7@\2\2\u0099\63"+
		"\3\2\2\2\u009a\u009b\7>\2\2\u009b\65\3\2\2\2\u009c\u009d\7@\2\2\u009d"+
		"\u009e\7?\2\2\u009e\67\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7?\2\2\u00a1"+
		"9\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3;\3\2\2\2\u00a4\u00a6\t\3\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\5\24\n\2\u00aa\u00ac\t\3\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae=\3\2\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3?\3\2\2\2\u00b4"+
		"\u00b9\7$\2\2\u00b5\u00b8\5D\"\2\u00b6\u00b8\13\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7$"+
		"\2\2\u00bdA\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7w\2\2\u00c1\u00c8\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7c\2\2\u00c4"+
		"\u00c5\7n\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c8\7g\2\2\u00c7\u00be\3\2\2"+
		"\2\u00c7\u00c2\3\2\2\2\u00c8C\3\2\2\2\u00c9\u00ca\7^\2\2\u00ca\u00ce\7"+
		"$\2\2\u00cb\u00cc\7^\2\2\u00cc\u00ce\7^\2\2\u00cd\u00c9\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ceE\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0\u00d2\t\5\2\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4G\3\2\2\2\u00d5\u00d7\t\6\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\b$\4\2\u00dbI\3\2\2\2\20\2\3PR]\u00a7\u00ad\u00b2\u00b7"+
		"\u00b9\u00c7\u00cd\u00d3\u00d8\5\7\3\2\6\2\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}