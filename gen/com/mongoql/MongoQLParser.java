// Generated from /home/sergio/Documents/Projects/Learning/Antlr/MongoQL/src/com/mongoql/MongoQL.g4 by ANTLR 4.7.2
package com.mongoql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MongoQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, LOGOP=14, RELOP=15, NUMBER=16, BOOLEAN=17, 
		STRING=18, ID=19, CHARACTER=20;
	public static final int
		RULE_query = 0, RULE_selectClause = 1, RULE_projAttrs = 2, RULE_projList = 3, 
		RULE_nestedField = 4, RULE_field = 5, RULE_fromClause = 6, RULE_collection = 7, 
		RULE_whereClause = 8, RULE_exprList = 9, RULE_expr = 10, RULE_value = 11, 
		RULE_orderByClause = 12, RULE_orderByOpt = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectClause", "projAttrs", "projList", "nestedField", "field", 
			"fromClause", "collection", "whereClause", "exprList", "expr", "value", 
			"orderByClause", "orderByOpt"
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

	@Override
	public String getGrammarFileName() { return "MongoQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MongoQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public TerminalNode WS() { return getToken(MongoQLParser.WS, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			selectClause();
			setState(29);
			fromClause();
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(30);
				whereClause();
				}
				break;
			}
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(33);
				orderByClause();
				}
				break;
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(36);
				match(WS);
				}
			}

			setState(39);
			match(T__0);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public ProjAttrsContext projAttrs() {
			return getRuleContext(ProjAttrsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MongoQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MongoQLParser.WS, i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__1);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(42);
				match(WS);
				}
			}

			setState(45);
			projAttrs();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(46);
				match(WS);
				}
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

	public static class ProjAttrsContext extends ParserRuleContext {
		public ProjListContext projList() {
			return getRuleContext(ProjListContext.class,0);
		}
		public ProjAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projAttrs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitProjAttrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjAttrsContext projAttrs() throws RecognitionException {
		ProjAttrsContext _localctx = new ProjAttrsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_projAttrs);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				projList();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__2);
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

	public static class ProjListContext extends ParserRuleContext {
		public NestedFieldContext nestedField() {
			return getRuleContext(NestedFieldContext.class,0);
		}
		public ProjListContext projList() {
			return getRuleContext(ProjListContext.class,0);
		}
		public TerminalNode WS() { return getToken(MongoQLParser.WS, 0); }
		public ProjListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitProjList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjListContext projList() throws RecognitionException {
		ProjListContext _localctx = new ProjListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_projList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			nestedField();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(54);
				match(T__3);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(55);
					match(WS);
					}
				}

				setState(58);
				projList();
				}
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

	public static class NestedFieldContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public NestedFieldContext nestedField() {
			return getRuleContext(NestedFieldContext.class,0);
		}
		public NestedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitNestedField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedFieldContext nestedField() throws RecognitionException {
		NestedFieldContext _localctx = new NestedFieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nestedField);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				field();
				setState(62);
				match(T__4);
				setState(63);
				nestedField();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				field();
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MongoQLParser.ID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
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

	public static class FromClauseContext extends ParserRuleContext {
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public TerminalNode WS() { return getToken(MongoQLParser.WS, 0); }
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__5);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(71);
				match(WS);
				}
			}

			setState(74);
			collection();
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

	public static class CollectionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MongoQLParser.ID, 0); }
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_collection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MongoQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MongoQLParser.WS, i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(78);
				match(WS);
				}
			}

			setState(81);
			match(T__6);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(82);
				match(WS);
				}
			}

			setState(85);
			exprList();
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprListContext> exprList() {
			return getRuleContexts(ExprListContext.class);
		}
		public ExprListContext exprList(int i) {
			return getRuleContext(ExprListContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(MongoQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MongoQLParser.WS, i);
		}
		public TerminalNode LOGOP() { return getToken(MongoQLParser.LOGOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__7);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(88);
					match(WS);
					}
				}

				setState(91);
				exprList();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(92);
					match(WS);
					}
				}

				setState(95);
				match(T__8);
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(96);
						match(WS);
						}
					}

					setState(99);
					match(LOGOP);
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(100);
						match(WS);
						}
					}

					setState(103);
					exprList();
					}
					break;
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				expr();
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(107);
						match(WS);
						}
					}

					setState(110);
					match(LOGOP);
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(111);
						match(WS);
						}
					}

					setState(114);
					exprList();
					}
					break;
				}
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

	public static class ExprContext extends ParserRuleContext {
		public NestedFieldContext nestedField() {
			return getRuleContext(NestedFieldContext.class,0);
		}
		public TerminalNode RELOP() { return getToken(MongoQLParser.RELOP, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MongoQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MongoQLParser.WS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			nestedField();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(120);
				match(WS);
				}
			}

			setState(123);
			match(RELOP);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(124);
				match(WS);
				}
			}

			setState(127);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MongoQLParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(MongoQLParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(MongoQLParser.STRING, 0); }
		public NestedFieldContext nestedField() {
			return getRuleContext(NestedFieldContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(BOOLEAN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				nestedField();
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MongoQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MongoQLParser.WS, i);
		}
		public OrderByOptContext orderByOpt() {
			return getRuleContext(OrderByOptContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(135);
				match(WS);
				}
			}

			setState(138);
			match(T__9);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(139);
				match(WS);
				}
			}

			setState(142);
			field();
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(143);
				match(WS);
				}
				break;
			}
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(146);
				orderByOpt();
				}
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

	public static class OrderByOptContext extends ParserRuleContext {
		public OrderByOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByOpt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitOrderByOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByOptContext orderByOpt() throws RecognitionException {
		OrderByOptContext _localctx = new OrderByOptContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderByOpt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\5\2\"\n\2\3\2\5"+
		"\2%\n\2\3\2\5\2(\n\2\3\2\3\2\3\3\3\3\5\3.\n\3\3\3\3\3\5\3\62\n\3\3\4\3"+
		"\4\5\4\66\n\4\3\5\3\5\3\5\5\5;\n\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6E\n\6\3\7\3\7\3\b\3\b\5\bK\n\b\3\b\3\b\3\t\3\t\3\n\5\nR\n\n\3\n\3\n"+
		"\5\nV\n\n\3\n\3\n\3\13\3\13\5\13\\\n\13\3\13\3\13\5\13`\n\13\3\13\3\13"+
		"\5\13d\n\13\3\13\3\13\5\13h\n\13\3\13\5\13k\n\13\3\13\3\13\5\13o\n\13"+
		"\3\13\3\13\5\13s\n\13\3\13\5\13v\n\13\5\13x\n\13\3\f\3\f\5\f|\n\f\3\f"+
		"\3\f\5\f\u0080\n\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\16\5\16\u008b"+
		"\n\16\3\16\3\16\5\16\u008f\n\16\3\16\3\16\5\16\u0093\n\16\3\16\5\16\u0096"+
		"\n\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3"+
		"\2\r\16\2\u00a9\2\36\3\2\2\2\4+\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\nD\3"+
		"\2\2\2\fF\3\2\2\2\16H\3\2\2\2\20N\3\2\2\2\22Q\3\2\2\2\24w\3\2\2\2\26y"+
		"\3\2\2\2\30\u0087\3\2\2\2\32\u008a\3\2\2\2\34\u0097\3\2\2\2\36\37\5\4"+
		"\3\2\37!\5\16\b\2 \"\5\22\n\2! \3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#%\5\32\16"+
		"\2$#\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&(\7\17\2\2\'&\3\2\2\2\'(\3\2\2\2()\3"+
		"\2\2\2)*\7\3\2\2*\3\3\2\2\2+-\7\4\2\2,.\7\17\2\2-,\3\2\2\2-.\3\2\2\2."+
		"/\3\2\2\2/\61\5\6\4\2\60\62\7\17\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\5"+
		"\3\2\2\2\63\66\5\b\5\2\64\66\7\5\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\7"+
		"\3\2\2\2\67=\5\n\6\28:\7\6\2\29;\7\17\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2"+
		"\2<>\5\b\5\2=8\3\2\2\2=>\3\2\2\2>\t\3\2\2\2?@\5\f\7\2@A\7\7\2\2AB\5\n"+
		"\6\2BE\3\2\2\2CE\5\f\7\2D?\3\2\2\2DC\3\2\2\2E\13\3\2\2\2FG\7\25\2\2G\r"+
		"\3\2\2\2HJ\7\b\2\2IK\7\17\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\5\20\t\2"+
		"M\17\3\2\2\2NO\7\25\2\2O\21\3\2\2\2PR\7\17\2\2QP\3\2\2\2QR\3\2\2\2RS\3"+
		"\2\2\2SU\7\t\2\2TV\7\17\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\24\13\2"+
		"X\23\3\2\2\2Y[\7\n\2\2Z\\\7\17\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\5"+
		"\24\13\2^`\7\17\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2aj\7\13\2\2bd\7\17\2"+
		"\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\7\20\2\2fh\7\17\2\2gf\3\2\2\2gh\3\2"+
		"\2\2hi\3\2\2\2ik\5\24\13\2jc\3\2\2\2jk\3\2\2\2kx\3\2\2\2lu\5\26\f\2mo"+
		"\7\17\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\20\2\2qs\7\17\2\2rq\3\2\2"+
		"\2rs\3\2\2\2st\3\2\2\2tv\5\24\13\2un\3\2\2\2uv\3\2\2\2vx\3\2\2\2wY\3\2"+
		"\2\2wl\3\2\2\2x\25\3\2\2\2y{\5\n\6\2z|\7\17\2\2{z\3\2\2\2{|\3\2\2\2|}"+
		"\3\2\2\2}\177\7\21\2\2~\u0080\7\17\2\2\177~\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\5\30\r\2\u0082\27\3\2\2\2\u0083\u0088"+
		"\7\22\2\2\u0084\u0088\7\23\2\2\u0085\u0088\7\24\2\2\u0086\u0088\5\n\6"+
		"\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\31\3\2\2\2\u0089\u008b\7\17\2\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\7\f\2\2\u008d\u008f\7\17"+
		"\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\5\f\7\2\u0091\u0093\7\17\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\5\34\17\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\33\3\2\2\2\u0097\u0098\t\2\2\2\u0098\35\3\2\2\2\36"+
		"!$\'-\61\65:=DJQU[_cgjnruw{\177\u0087\u008a\u008e\u0092\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}