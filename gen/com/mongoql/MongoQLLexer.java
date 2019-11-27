// Generated from /home/sergio/Documents/Projects/Learning/Antlr/MongoQL/src/com/mongoql/MongoQL.g4 by ANTLR 4.7.2
package com.mongoql;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MongoQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, LOGOP=14, RELOP=15, NUMBER=16, BOOLEAN=17, 
		STRING=18, ID=19, CHARACTER=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "WS", "LOGOP", "RELOP", "NUMBER", "BOOLEAN", 
			"STRING", "ID", "CHARACTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'SELECT'", "'*'", "','", "'.'", "'FROM'", "'WHERE'", "'('", 
			"')'", "'ORDER BY'", "'ASC'", "'DESC'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "LOGOP", "RELOP", "NUMBER", "BOOLEAN", "STRING", "ID", "CHARACTER"
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


	public MongoQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MongoQL.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5"+
		"\17d\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20o\n\20\3\21"+
		"\6\21r\n\21\r\21\16\21s\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\177\n\22\3\23\3\23\6\23\u0083\n\23\r\23\16\23\u0084\3\23\3\23\3\23"+
		"\6\23\u008a\n\23\r\23\16\23\u008b\3\23\5\23\u008f\n\23\3\24\3\24\7\24"+
		"\u0093\n\24\f\24\16\24\u0096\13\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\6\5\2\13\f\17\17\"\"\3\2\62;\6\2\62;C\\aac|\4\2C\\c|\2\u00a4"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7\64\3\2"+
		"\2\2\t\66\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17?\3\2\2\2\21E\3\2\2\2\23G\3"+
		"\2\2\2\25I\3\2\2\2\27R\3\2\2\2\31V\3\2\2\2\33[\3\2\2\2\35c\3\2\2\2\37"+
		"n\3\2\2\2!q\3\2\2\2#~\3\2\2\2%\u008e\3\2\2\2\'\u0090\3\2\2\2)\u0097\3"+
		"\2\2\2+,\7=\2\2,\4\3\2\2\2-.\7U\2\2./\7G\2\2/\60\7N\2\2\60\61\7G\2\2\61"+
		"\62\7E\2\2\62\63\7V\2\2\63\6\3\2\2\2\64\65\7,\2\2\65\b\3\2\2\2\66\67\7"+
		".\2\2\67\n\3\2\2\289\7\60\2\29\f\3\2\2\2:;\7H\2\2;<\7T\2\2<=\7Q\2\2=>"+
		"\7O\2\2>\16\3\2\2\2?@\7Y\2\2@A\7J\2\2AB\7G\2\2BC\7T\2\2CD\7G\2\2D\20\3"+
		"\2\2\2EF\7*\2\2F\22\3\2\2\2GH\7+\2\2H\24\3\2\2\2IJ\7Q\2\2JK\7T\2\2KL\7"+
		"F\2\2LM\7G\2\2MN\7T\2\2NO\7\"\2\2OP\7D\2\2PQ\7[\2\2Q\26\3\2\2\2RS\7C\2"+
		"\2ST\7U\2\2TU\7E\2\2U\30\3\2\2\2VW\7F\2\2WX\7G\2\2XY\7U\2\2YZ\7E\2\2Z"+
		"\32\3\2\2\2[\\\t\2\2\2\\]\b\16\2\2]\34\3\2\2\2^_\7C\2\2_`\7P\2\2`d\7F"+
		"\2\2ab\7Q\2\2bd\7T\2\2c^\3\2\2\2ca\3\2\2\2d\36\3\2\2\2eo\7?\2\2fg\7#\2"+
		"\2go\7?\2\2ho\7>\2\2ij\7>\2\2jo\7?\2\2ko\7@\2\2lm\7@\2\2mo\7?\2\2ne\3"+
		"\2\2\2nf\3\2\2\2nh\3\2\2\2ni\3\2\2\2nk\3\2\2\2nl\3\2\2\2o \3\2\2\2pr\t"+
		"\3\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\"\3\2\2\2uv\7V\2\2vw\7"+
		"T\2\2wx\7W\2\2x\177\7G\2\2yz\7H\2\2z{\7C\2\2{|\7N\2\2|}\7U\2\2}\177\7"+
		"G\2\2~u\3\2\2\2~y\3\2\2\2\177$\3\2\2\2\u0080\u0082\7$\2\2\u0081\u0083"+
		"\t\4\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008f\7$\2\2\u0087\u0089\7)\2"+
		"\2\u0088\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7)\2\2\u008e"+
		"\u0080\3\2\2\2\u008e\u0087\3\2\2\2\u008f&\3\2\2\2\u0090\u0094\t\5\2\2"+
		"\u0091\u0093\t\4\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095(\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\t\4\2\2\u0098*\3\2\2\2\13\2cns~\u0084\u008b\u008e\u0094\3\3\16"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}