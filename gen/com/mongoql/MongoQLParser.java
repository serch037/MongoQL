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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WS=21, NUMBER=22, BOOLEAN=23, STRING=24, 
		ID=25, CHARACTER=26;
	public static final int
		RULE_query = 0, RULE_selectClause = 1, RULE_projAttrs = 2, RULE_projList = 3, 
		RULE_nestedField = 4, RULE_field = 5, RULE_fromClause = 6, RULE_collection = 7, 
		RULE_whereClause = 8, RULE_orderByClause = 9, RULE_orderByOpt = 10, RULE_exprList = 11, 
		RULE_expr = 12, RULE_logOp = 13, RULE_relOp = 14, RULE_value = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "selectClause", "projAttrs", "projList", "nestedField", "field", 
			"fromClause", "collection", "whereClause", "orderByClause", "orderByOpt", 
			"exprList", "expr", "logOp", "relOp", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'SELECT'", "'*'", "','", "'.'", "'FROM'", "'WHERE'", "'ORDER BY'", 
			"'ASC'", "'DESC'", "'('", "')'", "'AND'", "'OR'", "'='", "'!='", "'<'", 
			"'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "NUMBER", 
			"BOOLEAN", "STRING", "ID", "CHARACTER"
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
			setState(32);
			selectClause();
			setState(33);
			fromClause();
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(34);
				whereClause();
				}
				break;
			}
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				orderByClause();
				}
				break;
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(40);
				match(WS);
				}
			}

			setState(43);
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
		public List<TerminalNode> WS() { return getTokens(MongoQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MongoQLParser.WS, i);
		}
		public ProjAttrsContext projAttrs() {
			return getRuleContext(ProjAttrsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			match(WS);
			setState(47);
			projAttrs();
			setState(48);
			match(WS);
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				projList();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
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
			setState(54);
			nestedField();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(55);
				match(T__3);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(56);
					match(WS);
					}
				}

				setState(59);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				field();
				setState(63);
				match(T__4);
				setState(64);
				nestedField();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
			setState(69);
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
		public TerminalNode WS() { return getToken(MongoQLParser.WS, 0); }
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
			setState(71);
			match(T__5);
			setState(72);
			match(WS);
			setState(73);
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
			setState(75);
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
		public List<TerminalNode> WS() { return getTokens(MongoQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MongoQLParser.WS, i);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(WS);
			setState(78);
			match(T__6);
			setState(79);
			match(WS);
			setState(80);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(MongoQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MongoQLParser.WS, i);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
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
		enterRule(_localctx, 18, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(WS);
			setState(83);
			match(T__7);
			setState(84);
			match(WS);
			setState(85);
			field();
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(86);
				match(WS);
				}
				break;
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(89);
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
		enterRule(_localctx, 20, RULE_orderByOpt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	public static class ExprListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(MongoQLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MongoQLParser.WS, i);
		}
		public LogOpContext logOp() {
			return getRuleContext(LogOpContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
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
		enterRule(_localctx, 22, RULE_exprList);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				expr();
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(95);
					match(WS);
					setState(96);
					logOp();
					setState(97);
					match(WS);
					setState(98);
					exprList();
					}
					break;
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__10);
				setState(103);
				exprList();
				setState(104);
				match(T__11);
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
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			nestedField();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(109);
				match(WS);
				}
			}

			setState(112);
			relOp();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(113);
				match(WS);
				}
			}

			setState(116);
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

	public static class LogOpContext extends ParserRuleContext {
		public LogOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitLogOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogOpContext logOp() throws RecognitionException {
		LogOpContext _localctx = new LogOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoQLVisitor ) return ((MongoQLVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MongoQLParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(MongoQLParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(MongoQLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MongoQLParser.ID, 0); }
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
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOLEAN) | (1L << STRING) | (1L << ID))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\5\2&\n\2\3\2\5\2)\n\2\3\2\5\2,\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\5\4\67\n\4\3\5\3\5\3\5\5\5<\n\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\5\6F\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\5\13Z\n\13\3\13\5\13]\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\rg\n\r\3\r\3\r\3\r\3\r\5\rm\n\r\3\16\3\16\5\16q\n\16\3\16\3\16"+
		"\5\16u\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2\13\f\3\2\17\20\3\2\21\26\3"+
		"\2\30\33\2{\2\"\3\2\2\2\4/\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\nE\3\2\2\2"+
		"\fG\3\2\2\2\16I\3\2\2\2\20M\3\2\2\2\22O\3\2\2\2\24T\3\2\2\2\26^\3\2\2"+
		"\2\30l\3\2\2\2\32n\3\2\2\2\34x\3\2\2\2\36z\3\2\2\2 |\3\2\2\2\"#\5\4\3"+
		"\2#%\5\16\b\2$&\5\22\n\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\5\24\13\2(\'"+
		"\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\7\27\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2"+
		"-.\7\3\2\2.\3\3\2\2\2/\60\7\4\2\2\60\61\7\27\2\2\61\62\5\6\4\2\62\63\7"+
		"\27\2\2\63\5\3\2\2\2\64\67\5\b\5\2\65\67\7\5\2\2\66\64\3\2\2\2\66\65\3"+
		"\2\2\2\67\7\3\2\2\28>\5\n\6\29;\7\6\2\2:<\7\27\2\2;:\3\2\2\2;<\3\2\2\2"+
		"<=\3\2\2\2=?\5\b\5\2>9\3\2\2\2>?\3\2\2\2?\t\3\2\2\2@A\5\f\7\2AB\7\7\2"+
		"\2BC\5\n\6\2CF\3\2\2\2DF\5\f\7\2E@\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GH\7\33"+
		"\2\2H\r\3\2\2\2IJ\7\b\2\2JK\7\27\2\2KL\5\20\t\2L\17\3\2\2\2MN\7\33\2\2"+
		"N\21\3\2\2\2OP\7\27\2\2PQ\7\t\2\2QR\7\27\2\2RS\5\30\r\2S\23\3\2\2\2TU"+
		"\7\27\2\2UV\7\n\2\2VW\7\27\2\2WY\5\f\7\2XZ\7\27\2\2YX\3\2\2\2YZ\3\2\2"+
		"\2Z\\\3\2\2\2[]\5\26\f\2\\[\3\2\2\2\\]\3\2\2\2]\25\3\2\2\2^_\t\2\2\2_"+
		"\27\3\2\2\2`f\5\32\16\2ab\7\27\2\2bc\5\34\17\2cd\7\27\2\2de\5\30\r\2e"+
		"g\3\2\2\2fa\3\2\2\2fg\3\2\2\2gm\3\2\2\2hi\7\r\2\2ij\5\30\r\2jk\7\16\2"+
		"\2km\3\2\2\2l`\3\2\2\2lh\3\2\2\2m\31\3\2\2\2np\5\n\6\2oq\7\27\2\2po\3"+
		"\2\2\2pq\3\2\2\2qr\3\2\2\2rt\5\36\20\2su\7\27\2\2ts\3\2\2\2tu\3\2\2\2"+
		"uv\3\2\2\2vw\5 \21\2w\33\3\2\2\2xy\t\3\2\2y\35\3\2\2\2z{\t\4\2\2{\37\3"+
		"\2\2\2|}\t\5\2\2}!\3\2\2\2\17%(+\66;>EY\\flpt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}