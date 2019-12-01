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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, RELOP=15, NUMBER=16, 
		BOOLEAN=17, STRING=18, ID=19, CHARACTER=20, WS=21;
	public static final int
		RULE_query = 0, RULE_selectClause = 1, RULE_projAttrs = 2, RULE_projList = 3, 
		RULE_nestedField = 4, RULE_field = 5, RULE_fromClause = 6, RULE_collection = 7, 
		RULE_whereClause = 8, RULE_exprList = 9, RULE_expr = 10, RULE_value = 11, 
		RULE_orderByClause = 12, RULE_orderByFields = 13, RULE_orderByOpt = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectClause", "projAttrs", "projList", "nestedField", "field", 
			"fromClause", "collection", "whereClause", "exprList", "expr", "value", 
			"orderByClause", "orderByFields", "orderByOpt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'SELECT'", "'*'", "','", "'.'", "'FROM'", "'WHERE'", "'('", 
			"')'", "'AND'", "'OR'", "'ORDER BY'", "'ASC'", "'DESC'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "RELOP", "NUMBER", "BOOLEAN", "STRING", "ID", "CHARACTER", 
			"WS"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			selectClause();
			setState(31);
			fromClause();
			setState(32);
			whereClause();
			setState(33);
			orderByClause();
			setState(34);
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
			setState(36);
			match(T__1);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(37);
				match(WS);
				}
			}

			setState(40);
			projAttrs();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(41);
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				projList();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
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
			setState(48);
			nestedField();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(49);
				match(T__3);
				setState(50);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				field();
				setState(54);
				match(T__4);
				setState(55);
				nestedField();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
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
			setState(60);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__5);
			setState(63);
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
			setState(65);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(67);
				match(T__6);
				setState(68);
				exprList(0);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprListContext> exprList() {
			return getRuleContexts(ExprListContext.class);
		}
		public ExprListContext exprList(int i) {
			return getRuleContext(ExprListContext.class,i);
		}
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
		return exprList(0);
	}

	private ExprListContext exprList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprListContext _localctx = new ExprListContext(_ctx, _parentState);
		ExprListContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exprList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(72);
				match(T__7);
				setState(73);
				exprList(0);
				setState(74);
				match(T__8);
				}
				break;
			case ID:
				{
				setState(76);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprList);
						setState(79);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(80);
						match(T__9);
						setState(81);
						exprList(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprList);
						setState(82);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(83);
						match(T__10);
						setState(84);
						exprList(3);
						}
						break;
					}
					} 
				}
				setState(89);
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

	public static class ExprContext extends ParserRuleContext {
		public NestedFieldContext nestedField() {
			return getRuleContext(NestedFieldContext.class,0);
		}
		public TerminalNode RELOP() { return getToken(MongoQLParser.RELOP, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			nestedField();
			setState(91);
			match(RELOP);
			setState(92);
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
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(BOOLEAN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
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
		public OrderByFieldsContext orderByFields() {
			return getRuleContext(OrderByFieldsContext.class,0);
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
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(100);
				match(T__11);
				setState(101);
				orderByFields();
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

	public static class OrderByFieldsContext extends ParserRuleContext {
		public NestedFieldContext nestedField() {
			return getRuleContext(NestedFieldContext.class,0);
		}
		public OrderByFieldsContext orderByFields() {
			return getRuleContext(OrderByFieldsContext.class,0);
		}
		public OrderByOptContext orderByOpt() {
			return getRuleContext(OrderByOptContext.class,0);
		}
		public OrderByFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByFields; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitOrderByFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByFieldsContext orderByFields() throws RecognitionException {
		OrderByFieldsContext _localctx = new OrderByFieldsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderByFields);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				nestedField();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__13) {
					{
					setState(105);
					orderByOpt();
					}
				}

				setState(108);
				match(T__3);
				setState(109);
				orderByFields();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				nestedField();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__13) {
					{
					setState(112);
					orderByOpt();
					}
				}

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
		enterRule(_localctx, 28, RULE_orderByOpt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return exprList_sempred((ExprListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprList_sempred(ExprListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\5\3)\n\3\3\3\3\3\5\3-\n\3\3\4\3\4\5\4\61\n\4\3\5\3\5\3\5\5\5\66"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\5\nH\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13P\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13X\n\13\f\13\16\13[\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\5\re\n\r\3\16\3\16\5\16i\n\16\3\17\3\17\5\17m\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17t\n\17\5\17v\n\17\3\20\3\20\3\20\2\3\24\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\3\3\2\17\20\2z\2 \3\2\2\2\4&\3\2\2\2\6\60\3"+
		"\2\2\2\b\62\3\2\2\2\n<\3\2\2\2\f>\3\2\2\2\16@\3\2\2\2\20C\3\2\2\2\22G"+
		"\3\2\2\2\24O\3\2\2\2\26\\\3\2\2\2\30d\3\2\2\2\32h\3\2\2\2\34u\3\2\2\2"+
		"\36w\3\2\2\2 !\5\4\3\2!\"\5\16\b\2\"#\5\22\n\2#$\5\32\16\2$%\7\3\2\2%"+
		"\3\3\2\2\2&(\7\4\2\2\')\7\27\2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*,\5\6"+
		"\4\2+-\7\27\2\2,+\3\2\2\2,-\3\2\2\2-\5\3\2\2\2.\61\5\b\5\2/\61\7\5\2\2"+
		"\60.\3\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\65\5\n\6\2\63\64\7\6\2\2\64\66"+
		"\5\b\5\2\65\63\3\2\2\2\65\66\3\2\2\2\66\t\3\2\2\2\678\5\f\7\289\7\7\2"+
		"\29:\5\n\6\2:=\3\2\2\2;=\5\f\7\2<\67\3\2\2\2<;\3\2\2\2=\13\3\2\2\2>?\7"+
		"\25\2\2?\r\3\2\2\2@A\7\b\2\2AB\5\20\t\2B\17\3\2\2\2CD\7\25\2\2D\21\3\2"+
		"\2\2EF\7\t\2\2FH\5\24\13\2GE\3\2\2\2GH\3\2\2\2H\23\3\2\2\2IJ\b\13\1\2"+
		"JK\7\n\2\2KL\5\24\13\2LM\7\13\2\2MP\3\2\2\2NP\5\26\f\2OI\3\2\2\2ON\3\2"+
		"\2\2PY\3\2\2\2QR\f\5\2\2RS\7\f\2\2SX\5\24\13\6TU\f\4\2\2UV\7\r\2\2VX\5"+
		"\24\13\5WQ\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\25\3\2\2\2"+
		"[Y\3\2\2\2\\]\5\n\6\2]^\7\21\2\2^_\5\30\r\2_\27\3\2\2\2`e\7\22\2\2ae\7"+
		"\23\2\2be\7\24\2\2ce\5\n\6\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e"+
		"\31\3\2\2\2fg\7\16\2\2gi\5\34\17\2hf\3\2\2\2hi\3\2\2\2i\33\3\2\2\2jl\5"+
		"\n\6\2km\5\36\20\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\6\2\2op\5\34\17\2"+
		"pv\3\2\2\2qs\5\n\6\2rt\5\36\20\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uj\3\2\2"+
		"\2uq\3\2\2\2v\35\3\2\2\2wx\t\2\2\2x\37\3\2\2\2\20(,\60\65<GOWYdhlsu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}