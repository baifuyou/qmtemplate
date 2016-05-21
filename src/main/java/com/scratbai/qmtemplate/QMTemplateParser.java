// Generated from /home/baifuyou/IdeaProjects/QMTemplate/src/main/resources/qmtemplate/QMTemplateParser.g4 by ANTLR 4.5.1
package com.scratbai.qmtemplate;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QMTemplateParser extends Parser {
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
	public static final int
		RULE_template = 0, RULE_originText = 1, RULE_renderExpr = 2, RULE_blockEnd = 3, 
		RULE_evlExpr = 4, RULE_methodInvoke = 5, RULE_value = 6, RULE_intLiteral = 7, 
		RULE_floatLiteral = 8, RULE_stringLiteral = 9, RULE_ifExpr = 10, RULE_elseIfExpr = 11, 
		RULE_elseExpr = 12, RULE_ifKey = 13, RULE_elseIf = 14, RULE_elseKey = 15, 
		RULE_booleanLiteral = 16, RULE_eachExpr = 17, RULE_each = 18, RULE_id = 19, 
		RULE_in = 20, RULE_eachIndexExpr = 21;
	public static final String[] ruleNames = {
		"template", "originText", "renderExpr", "blockEnd", "evlExpr", "methodInvoke", 
		"value", "intLiteral", "floatLiteral", "stringLiteral", "ifExpr", "elseIfExpr", 
		"elseExpr", "ifKey", "elseIf", "elseKey", "booleanLiteral", "eachExpr", 
		"each", "id", "in", "eachIndexExpr"
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

	@Override
	public String getGrammarFileName() { return "QMTemplateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QMTemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TemplateContext extends ParserRuleContext {
		public List<OriginTextContext> originText() {
			return getRuleContexts(OriginTextContext.class);
		}
		public OriginTextContext originText(int i) {
			return getRuleContext(OriginTextContext.class,i);
		}
		public List<RenderExprContext> renderExpr() {
			return getRuleContexts(RenderExprContext.class);
		}
		public RenderExprContext renderExpr(int i) {
			return getRuleContext(RenderExprContext.class,i);
		}
		public List<IfExprContext> ifExpr() {
			return getRuleContexts(IfExprContext.class);
		}
		public IfExprContext ifExpr(int i) {
			return getRuleContext(IfExprContext.class,i);
		}
		public List<EachExprContext> eachExpr() {
			return getRuleContexts(EachExprContext.class);
		}
		public EachExprContext eachExpr(int i) {
			return getRuleContext(EachExprContext.class,i);
		}
		public List<EachIndexExprContext> eachIndexExpr() {
			return getRuleContexts(EachIndexExprContext.class);
		}
		public EachIndexExprContext eachIndexExpr(int i) {
			return getRuleContext(EachIndexExprContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitTemplate(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(49);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(44);
						originText();
						}
						break;
					case 2:
						{
						setState(45);
						renderExpr();
						}
						break;
					case 3:
						{
						setState(46);
						ifExpr();
						}
						break;
					case 4:
						{
						setState(47);
						eachExpr();
						}
						break;
					case 5:
						{
						setState(48);
						eachIndexExpr();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(51); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class OriginTextContext extends ParserRuleContext {
		public TerminalNode PLANE_TEXT() { return getToken(QMTemplateParser.PLANE_TEXT, 0); }
		public OriginTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterOriginText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitOriginText(this);
		}
	}

	public final OriginTextContext originText() throws RecognitionException {
		OriginTextContext _localctx = new OriginTextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_originText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(PLANE_TEXT);
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

	public static class RenderExprContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(QMTemplateParser.LEFT_BRACE, 0); }
		public EvlExprContext evlExpr() {
			return getRuleContext(EvlExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(QMTemplateParser.RIGHT_BRACE, 0); }
		public RenderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renderExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterRenderExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitRenderExpr(this);
		}
	}

	public final RenderExprContext renderExpr() throws RecognitionException {
		RenderExprContext _localctx = new RenderExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_renderExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LEFT_BRACE);
			setState(56);
			evlExpr(0);
			setState(57);
			match(RIGHT_BRACE);
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

	public static class BlockEndContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(QMTemplateParser.LEFT_BRACE, 0); }
		public TerminalNode END() { return getToken(QMTemplateParser.END, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(QMTemplateParser.RIGHT_BRACE, 0); }
		public BlockEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterBlockEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitBlockEnd(this);
		}
	}

	public final BlockEndContext blockEnd() throws RecognitionException {
		BlockEndContext _localctx = new BlockEndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LEFT_BRACE);
			setState(60);
			match(END);
			setState(61);
			match(RIGHT_BRACE);
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

	public static class EvlExprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(QMTemplateParser.NOT, 0); }
		public List<EvlExprContext> evlExpr() {
			return getRuleContexts(EvlExprContext.class);
		}
		public EvlExprContext evlExpr(int i) {
			return getRuleContext(EvlExprContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(QMTemplateParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(QMTemplateParser.RIGHT_BRACKET, 0); }
		public TerminalNode DOT() { return getToken(QMTemplateParser.DOT, 0); }
		public TerminalNode DEQUAL() { return getToken(QMTemplateParser.DEQUAL, 0); }
		public TerminalNode DAND() { return getToken(QMTemplateParser.DAND, 0); }
		public TerminalNode DOR() { return getToken(QMTemplateParser.DOR, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(QMTemplateParser.NOT_EQUAL, 0); }
		public TerminalNode GT() { return getToken(QMTemplateParser.GT, 0); }
		public TerminalNode LT() { return getToken(QMTemplateParser.LT, 0); }
		public TerminalNode GTE() { return getToken(QMTemplateParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(QMTemplateParser.LTE, 0); }
		public MethodInvokeContext methodInvoke() {
			return getRuleContext(MethodInvokeContext.class,0);
		}
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(QMTemplateParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(QMTemplateParser.RIGHT_SQUARE_BRACKET, 0); }
		public EvlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterEvlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitEvlExpr(this);
		}
	}

	public final EvlExprContext evlExpr() throws RecognitionException {
		return evlExpr(0);
	}

	private EvlExprContext evlExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EvlExprContext _localctx = new EvlExprContext(_ctx, _parentState);
		EvlExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_evlExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(64);
				match(NOT);
				setState(65);
				evlExpr(6);
				}
				break;
			case ID:
				{
				setState(66);
				id();
				}
				break;
			case FLOAT:
			case INT:
			case STRING:
			case BOOLEAN:
				{
				setState(67);
				value();
				}
				break;
			case LEFT_BRACKET:
				{
				setState(68);
				match(LEFT_BRACKET);
				setState(69);
				evlExpr(0);
				setState(70);
				match(RIGHT_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(74);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(75);
						match(DOT);
						setState(76);
						evlExpr(13);
						}
						break;
					case 2:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(77);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(78);
						match(DEQUAL);
						setState(79);
						evlExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(80);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(81);
						match(DAND);
						setState(82);
						evlExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(83);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(84);
						match(DOR);
						setState(85);
						evlExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(86);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(87);
						match(NOT_EQUAL);
						setState(88);
						evlExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						match(GT);
						setState(91);
						evlExpr(6);
						}
						break;
					case 7:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						match(LT);
						setState(94);
						evlExpr(5);
						}
						break;
					case 8:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						match(GTE);
						setState(97);
						evlExpr(4);
						}
						break;
					case 9:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						match(LTE);
						setState(100);
						evlExpr(3);
						}
						break;
					case 10:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(101);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(102);
						match(DOT);
						setState(103);
						methodInvoke();
						}
						break;
					case 11:
						{
						_localctx = new EvlExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_evlExpr);
						setState(104);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(105);
						match(LEFT_SQUARE_BRACKET);
						setState(106);
						evlExpr(0);
						setState(107);
						match(RIGHT_SQUARE_BRACKET);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class MethodInvokeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QMTemplateParser.ID, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(QMTemplateParser.LEFT_BRACKET, 0); }
		public List<EvlExprContext> evlExpr() {
			return getRuleContexts(EvlExprContext.class);
		}
		public EvlExprContext evlExpr(int i) {
			return getRuleContext(EvlExprContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(QMTemplateParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(QMTemplateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QMTemplateParser.COMMA, i);
		}
		public MethodInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterMethodInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitMethodInvoke(this);
		}
	}

	public final MethodInvokeContext methodInvoke() throws RecognitionException {
		MethodInvokeContext _localctx = new MethodInvokeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodInvoke);
		int _la;
		try {
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(114);
				match(ID);
				setState(115);
				match(LEFT_BRACKET);
				setState(116);
				evlExpr(0);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_BRACKET) | (1L << NOT) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					{
					setState(117);
					evlExpr(0);
					setState(118);
					match(COMMA);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(RIGHT_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ID);
				setState(128);
				match(LEFT_BRACKET);
				setState(129);
				match(RIGHT_BRACKET);
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

	public static class ValueContext extends ParserRuleContext {
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				intLiteral();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				floatLiteral();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				stringLiteral();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				booleanLiteral();
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

	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(QMTemplateParser.INT, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitIntLiteral(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_intLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(INT);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(QMTemplateParser.FLOAT, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(FLOAT);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QMTemplateParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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

	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(QMTemplateParser.LEFT_BRACE, 0); }
		public IfKeyContext ifKey() {
			return getRuleContext(IfKeyContext.class,0);
		}
		public EvlExprContext evlExpr() {
			return getRuleContext(EvlExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(QMTemplateParser.RIGHT_BRACE, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public List<ElseIfExprContext> elseIfExpr() {
			return getRuleContexts(ElseIfExprContext.class);
		}
		public ElseIfExprContext elseIfExpr(int i) {
			return getRuleContext(ElseIfExprContext.class,i);
		}
		public ElseExprContext elseExpr() {
			return getRuleContext(ElseExprContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LEFT_BRACE);
			setState(145);
			ifKey();
			setState(146);
			evlExpr(0);
			setState(147);
			match(RIGHT_BRACE);
			setState(148);
			template();
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					elseIfExpr();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(155);
				elseExpr();
				}
				break;
			}
			setState(158);
			blockEnd();
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

	public static class ElseIfExprContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(QMTemplateParser.LEFT_BRACE, 0); }
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
		}
		public EvlExprContext evlExpr() {
			return getRuleContext(EvlExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(QMTemplateParser.RIGHT_BRACE, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public ElseIfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterElseIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitElseIfExpr(this);
		}
	}

	public final ElseIfExprContext elseIfExpr() throws RecognitionException {
		ElseIfExprContext _localctx = new ElseIfExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseIfExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LEFT_BRACE);
			setState(161);
			elseIf();
			setState(162);
			evlExpr(0);
			setState(163);
			match(RIGHT_BRACE);
			setState(164);
			template();
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

	public static class ElseExprContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(QMTemplateParser.LEFT_BRACE, 0); }
		public ElseKeyContext elseKey() {
			return getRuleContext(ElseKeyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(QMTemplateParser.RIGHT_BRACE, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public ElseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterElseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitElseExpr(this);
		}
	}

	public final ElseExprContext elseExpr() throws RecognitionException {
		ElseExprContext _localctx = new ElseExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LEFT_BRACE);
			setState(167);
			elseKey();
			setState(168);
			match(RIGHT_BRACE);
			setState(169);
			template();
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

	public static class IfKeyContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(QMTemplateParser.IF, 0); }
		public IfKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterIfKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitIfKey(this);
		}
	}

	public final IfKeyContext ifKey() throws RecognitionException {
		IfKeyContext _localctx = new IfKeyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IF);
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

	public static class ElseIfContext extends ParserRuleContext {
		public ElseKeyContext elseKey() {
			return getRuleContext(ElseKeyContext.class,0);
		}
		public TerminalNode IF() { return getToken(QMTemplateParser.IF, 0); }
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitElseIf(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			elseKey();
			setState(174);
			match(IF);
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

	public static class ElseKeyContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(QMTemplateParser.ELSE, 0); }
		public ElseKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterElseKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitElseKey(this);
		}
	}

	public final ElseKeyContext elseKey() throws RecognitionException {
		ElseKeyContext _localctx = new ElseKeyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ELSE);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(QMTemplateParser.BOOLEAN, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(BOOLEAN);
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

	public static class EachExprContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(QMTemplateParser.LEFT_BRACE, 0); }
		public EachContext each() {
			return getRuleContext(EachContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public EvlExprContext evlExpr() {
			return getRuleContext(EvlExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(QMTemplateParser.RIGHT_BRACE, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public EachExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eachExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterEachExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitEachExpr(this);
		}
	}

	public final EachExprContext eachExpr() throws RecognitionException {
		EachExprContext _localctx = new EachExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eachExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(LEFT_BRACE);
			setState(181);
			each();
			setState(182);
			id();
			setState(183);
			in();
			setState(184);
			evlExpr(0);
			setState(185);
			match(RIGHT_BRACE);
			setState(186);
			template();
			setState(187);
			blockEnd();
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

	public static class EachContext extends ParserRuleContext {
		public TerminalNode EACH() { return getToken(QMTemplateParser.EACH, 0); }
		public EachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitEach(this);
		}
	}

	public final EachContext each() throws RecognitionException {
		EachContext _localctx = new EachContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(EACH);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QMTemplateParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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

	public static class InContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(QMTemplateParser.IN, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitIn(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IN);
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

	public static class EachIndexExprContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(QMTemplateParser.LEFT_BRACE, 0); }
		public EachContext each() {
			return getRuleContext(EachContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(QMTemplateParser.COMMA, 0); }
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public EvlExprContext evlExpr() {
			return getRuleContext(EvlExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(QMTemplateParser.RIGHT_BRACE, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public EachIndexExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eachIndexExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).enterEachIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QMTemplateParserListener ) ((QMTemplateParserListener)listener).exitEachIndexExpr(this);
		}
	}

	public final EachIndexExprContext eachIndexExpr() throws RecognitionException {
		EachIndexExprContext _localctx = new EachIndexExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_eachIndexExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(LEFT_BRACE);
			setState(196);
			each();
			setState(197);
			id();
			setState(198);
			match(COMMA);
			setState(199);
			id();
			setState(200);
			in();
			setState(201);
			evlExpr(0);
			setState(202);
			match(RIGHT_BRACE);
			setState(203);
			template();
			setState(204);
			blockEnd();
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
		case 4:
			return evlExpr_sempred((EvlExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean evlExpr_sempred(EvlExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\6\2\64\n\2\r\2\16\2\65\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s\13\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\3\7\3\7\3\7\5\7\u0085"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f\3\f\5\f\u009f\n\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\2\3\n\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,\2\2\u00d4\2\63\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\b=\3\2\2\2\nJ"+
		"\3\2\2\2\f\u0084\3\2\2\2\16\u008a\3\2\2\2\20\u008c\3\2\2\2\22\u008e\3"+
		"\2\2\2\24\u0090\3\2\2\2\26\u0092\3\2\2\2\30\u00a2\3\2\2\2\32\u00a8\3\2"+
		"\2\2\34\u00ad\3\2\2\2\36\u00af\3\2\2\2 \u00b2\3\2\2\2\"\u00b4\3\2\2\2"+
		"$\u00b6\3\2\2\2&\u00bf\3\2\2\2(\u00c1\3\2\2\2*\u00c3\3\2\2\2,\u00c5\3"+
		"\2\2\2.\64\5\4\3\2/\64\5\6\4\2\60\64\5\26\f\2\61\64\5$\23\2\62\64\5,\27"+
		"\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\678\7\4\2\28\5\3"+
		"\2\2\29:\7\3\2\2:;\5\n\6\2;<\7\6\2\2<\7\3\2\2\2=>\7\3\2\2>?\7\26\2\2?"+
		"@\7\6\2\2@\t\3\2\2\2AB\b\6\1\2BC\7\17\2\2CK\5\n\6\bDK\5(\25\2EK\5\16\b"+
		"\2FG\7\b\2\2GH\5\n\6\2HI\7\7\2\2IK\3\2\2\2JA\3\2\2\2JD\3\2\2\2JE\3\2\2"+
		"\2JF\3\2\2\2Kq\3\2\2\2LM\f\16\2\2MN\7\13\2\2Np\5\n\6\17OP\f\f\2\2PQ\7"+
		"\r\2\2Qp\5\n\6\rRS\f\13\2\2ST\7\21\2\2Tp\5\n\6\fUV\f\n\2\2VW\7\23\2\2"+
		"Wp\5\n\6\13XY\f\t\2\2YZ\7\16\2\2Zp\5\n\6\n[\\\f\7\2\2\\]\7\32\2\2]p\5"+
		"\n\6\b^_\f\6\2\2_`\7\33\2\2`p\5\n\6\7ab\f\5\2\2bc\7\34\2\2cp\5\n\6\6d"+
		"e\f\4\2\2ef\7\35\2\2fp\5\n\6\5gh\f\20\2\2hi\7\13\2\2ip\5\f\7\2jk\f\17"+
		"\2\2kl\7\n\2\2lm\5\n\6\2mn\7\t\2\2np\3\2\2\2oL\3\2\2\2oO\3\2\2\2oR\3\2"+
		"\2\2oU\3\2\2\2oX\3\2\2\2o[\3\2\2\2o^\3\2\2\2oa\3\2\2\2od\3\2\2\2og\3\2"+
		"\2\2oj\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\13\3\2\2\2sq\3\2\2\2tu\7"+
		"#\2\2uv\7\b\2\2v|\5\n\6\2wx\5\n\6\2xy\7\36\2\2y{\3\2\2\2zw\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\7\2\2\u0080"+
		"\u0085\3\2\2\2\u0081\u0082\7#\2\2\u0082\u0083\7\b\2\2\u0083\u0085\7\7"+
		"\2\2\u0084t\3\2\2\2\u0084\u0081\3\2\2\2\u0085\r\3\2\2\2\u0086\u008b\5"+
		"\20\t\2\u0087\u008b\5\22\n\2\u0088\u008b\5\24\13\2\u0089\u008b\5\"\22"+
		"\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\17\3\2\2\2\u008c\u008d\7 \2\2\u008d\21\3\2\2\2\u008e\u008f"+
		"\7\37\2\2\u008f\23\3\2\2\2\u0090\u0091\7!\2\2\u0091\25\3\2\2\2\u0092\u0093"+
		"\7\3\2\2\u0093\u0094\5\34\17\2\u0094\u0095\5\n\6\2\u0095\u0096\7\6\2\2"+
		"\u0096\u009a\5\2\2\2\u0097\u0099\5\30\r\2\u0098\u0097\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009f\5\32\16\2\u009e\u009d\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5\b\5\2\u00a1\27\3\2\2\2\u00a2"+
		"\u00a3\7\3\2\2\u00a3\u00a4\5\36\20\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6\7"+
		"\6\2\2\u00a6\u00a7\5\2\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\7\3\2\2\u00a9"+
		"\u00aa\5 \21\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\5\2\2\2\u00ac\33\3\2\2"+
		"\2\u00ad\u00ae\7\27\2\2\u00ae\35\3\2\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1"+
		"\7\27\2\2\u00b1\37\3\2\2\2\u00b2\u00b3\7\30\2\2\u00b3!\3\2\2\2\u00b4\u00b5"+
		"\7\"\2\2\u00b5#\3\2\2\2\u00b6\u00b7\7\3\2\2\u00b7\u00b8\5&\24\2\u00b8"+
		"\u00b9\5(\25\2\u00b9\u00ba\5*\26\2\u00ba\u00bb\5\n\6\2\u00bb\u00bc\7\6"+
		"\2\2\u00bc\u00bd\5\2\2\2\u00bd\u00be\5\b\5\2\u00be%\3\2\2\2\u00bf\u00c0"+
		"\7\25\2\2\u00c0\'\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2)\3\2\2\2\u00c3\u00c4"+
		"\7\31\2\2\u00c4+\3\2\2\2\u00c5\u00c6\7\3\2\2\u00c6\u00c7\5&\24\2\u00c7"+
		"\u00c8\5(\25\2\u00c8\u00c9\7\36\2\2\u00c9\u00ca\5(\25\2\u00ca\u00cb\5"+
		"*\26\2\u00cb\u00cc\5\n\6\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\5\2\2\2\u00ce"+
		"\u00cf\5\b\5\2\u00cf-\3\2\2\2\f\63\65Joq|\u0084\u008a\u009a\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}