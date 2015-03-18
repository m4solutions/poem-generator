// Generated from /Users/msanchez1/Documents/sanchez.marcus/m4solutions/src/poem-generator/src/main/resources/Poem.g4 by ANTLR 4.1
package co.m4solutions.grammars.antl4.test;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PoemParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__74=1, T__73=2, T__72=3, T__71=4, T__70=5, T__69=6, T__68=7, T__67=8, 
		T__66=9, T__65=10, T__64=11, T__63=12, T__62=13, T__61=14, T__60=15, T__59=16, 
		T__58=17, T__57=18, T__56=19, T__55=20, T__54=21, T__53=22, T__52=23, 
		T__51=24, T__50=25, T__49=26, T__48=27, T__47=28, T__46=29, T__45=30, 
		T__44=31, T__43=32, T__42=33, T__41=34, T__40=35, T__39=36, T__38=37, 
		T__37=38, T__36=39, T__35=40, T__34=41, T__33=42, T__32=43, T__31=44, 
		T__30=45, T__29=46, T__28=47, T__27=48, T__26=49, T__25=50, T__24=51, 
		T__23=52, T__22=53, T__21=54, T__20=55, T__19=56, T__18=57, T__17=58, 
		T__16=59, T__15=60, T__14=61, T__13=62, T__12=63, T__11=64, T__10=65, 
		T__9=66, T__8=67, T__7=68, T__6=69, T__5=70, T__4=71, T__3=72, T__2=73, 
		T__1=74, T__0=75;
	public static final String[] tokenNames = {
		"<INVALID>", "'your'", "'behind'", "'mother'", "'heart'", "'without'", 
		"'harvest'", "'his'", "'murky'", "'beyond'", "'upon'", "'before'", "'around'", 
		"'dark'", "'thunder'", "'bright'", "'fire'", "'wind'", "'under'", "'flower'", 
		"'moon'", "'\r\n'", "'between'", "'among'", "'sinks'", "'descends'", "'during'", 
		"'climbs'", "'beneath'", "'muddy'", "'sun'", "'crawls'", "'\t'", "'transcends'", 
		"'runs'", "'along'", "'sea'", "'willow'", "'flows'", "'inside'", "'\n'", 
		"'sister'", "'\r'", "'black'", "'\n\r'", "'my'", "'against'", "'underneath'", 
		"'ascends'", "'brother'", "' '", "'across'", "'outside'", "'water'", "'through'", 
		"'father'", "'meadow'", "'stands'", "'pasture'", "'white'", "'clear'", 
		"'flavor'", "'rain'", "'onto'", "'flies'", "'field'", "'wave'", "'above'", 
		"'with'", "'walks'", "'river'", "'her'", "'time'", "'tree'", "'light'", 
		"'beside'"
	};
	public static final int
		RULE_poem = 0, RULE_line = 1, RULE_adjective = 2, RULE_noun = 3, RULE_pronoun = 4, 
		RULE_verb = 5, RULE_preposition = 6, RULE_linebreak = 7;
	public static final String[] ruleNames = {
		"poem", "line", "adjective", "noun", "pronoun", "verb", "preposition", 
		"linebreak"
	};

	@Override
	public String getGrammarFileName() { return "Poem.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PoemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PoemContext extends ParserRuleContext {
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public PoemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).enterPoem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).exitPoem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoemVisitor ) return ((PoemVisitor<? extends T>)visitor).visitPoem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoemContext poem() throws RecognitionException {
		PoemContext _localctx = new PoemContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_poem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); line();
			setState(17); line();
			setState(18); line();
			setState(19); line();
			setState(20); line();
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PoemParser.EOF, 0); }
		public PrepositionContext preposition() {
			return getRuleContext(PrepositionContext.class,0);
		}
		public PronounContext pronoun() {
			return getRuleContext(PronounContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public LinebreakContext linebreak() {
			return getRuleContext(LinebreakContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoemVisitor ) return ((PoemVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(23);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(22); match(50);
					}
				}

				setState(25); noun();
				}
				break;

			case 2:
				{
				setState(27);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(26); match(50);
					}
				}

				setState(29); preposition();
				}
				break;

			case 3:
				{
				setState(31);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(30); match(50);
					}
				}

				setState(33); pronoun();
				}
				break;
			}
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(36); linebreak();
				}
				break;

			case 2:
				{
				setState(37); match(EOF);
				}
				break;

			case 3:
				{
				setState(39);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(38); match(50);
					}
					break;
				}
				}
				break;
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

	public static class AdjectiveContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PoemParser.EOF, 0); }
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public LinebreakContext linebreak() {
			return getRuleContext(LinebreakContext.class,0);
		}
		public AdjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).enterAdjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).exitAdjective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoemVisitor ) return ((PoemVisitor<? extends T>)visitor).visitAdjective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_adjective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 13) | (1L << 15) | (1L << 29) | (1L << 43) | (1L << 59) | (1L << 60))) != 0) || _la==74) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			{
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(45);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(44); match(50);
					}
				}

				setState(47); noun();
				}
				break;

			case 2:
				{
				setState(49);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(48); match(50);
					}
				}

				setState(51); adjective();
				}
				break;

			case 3:
				{
				setState(52); linebreak();
				}
				break;

			case 4:
				{
				setState(53); match(EOF);
				}
				break;

			case 5:
				{
				setState(55);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(54); match(50);
					}
					break;
				}
				}
				break;
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

	public static class NounContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PoemParser.EOF, 0); }
		public PrepositionContext preposition() {
			return getRuleContext(PrepositionContext.class,0);
		}
		public LinebreakContext linebreak() {
			return getRuleContext(LinebreakContext.class,0);
		}
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).exitNoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoemVisitor ) return ((PoemVisitor<? extends T>)visitor).visitNoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 6) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 19) | (1L << 20) | (1L << 30) | (1L << 36) | (1L << 37) | (1L << 41) | (1L << 49) | (1L << 53) | (1L << 55) | (1L << 56) | (1L << 58) | (1L << 61) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (70 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(60); match(50);
				}
				break;
			}
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(63); verb();
				}
				break;

			case 2:
				{
				setState(64); preposition();
				}
				break;

			case 3:
				{
				setState(65); linebreak();
				}
				break;

			case 4:
				{
				setState(66); match(EOF);
				}
				break;

			case 5:
				{
				setState(68);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(67); match(50);
					}
					break;
				}
				}
				break;
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

	public static class PronounContext extends ParserRuleContext {
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public PronounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pronoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).enterPronoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).exitPronoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoemVisitor ) return ((PoemVisitor<? extends T>)visitor).visitPronoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PronounContext pronoun() throws RecognitionException {
		PronounContext _localctx = new PronounContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pronoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 7) | (1L << 45))) != 0) || _la==71) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(74);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(73); match(50);
					}
				}

				setState(76); noun();
				}
				break;

			case 2:
				{
				setState(78);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(77); match(50);
					}
				}

				setState(80); adjective();
				}
				break;
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

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PoemParser.EOF, 0); }
		public PrepositionContext preposition() {
			return getRuleContext(PrepositionContext.class,0);
		}
		public PronounContext pronoun() {
			return getRuleContext(PronounContext.class,0);
		}
		public LinebreakContext linebreak() {
			return getRuleContext(LinebreakContext.class,0);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoemVisitor ) return ((PoemVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (24 - 24)) | (1L << (25 - 24)) | (1L << (27 - 24)) | (1L << (31 - 24)) | (1L << (33 - 24)) | (1L << (34 - 24)) | (1L << (38 - 24)) | (1L << (48 - 24)) | (1L << (57 - 24)) | (1L << (64 - 24)) | (1L << (69 - 24)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(85);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(84); match(50);
					}
				}

				setState(87); preposition();
				}
				break;

			case 2:
				{
				setState(89);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(88); match(50);
					}
				}

				setState(91); pronoun();
				}
				break;

			case 3:
				{
				setState(92); linebreak();
				}
				break;

			case 4:
				{
				setState(93); match(EOF);
				}
				break;

			case 5:
				{
				setState(95);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(94); match(50);
					}
					break;
				}
				}
				break;
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

	public static class PrepositionContext extends ParserRuleContext {
		public PronounContext pronoun() {
			return getRuleContext(PronounContext.class,0);
		}
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public PrepositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).enterPreposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).exitPreposition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoemVisitor ) return ((PoemVisitor<? extends T>)visitor).visitPreposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepositionContext preposition() throws RecognitionException {
		PrepositionContext _localctx = new PrepositionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_preposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 18) | (1L << 22) | (1L << 23) | (1L << 26) | (1L << 28) | (1L << 35) | (1L << 39) | (1L << 46) | (1L << 47) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (68 - 67)) | (1L << (75 - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(101);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(100); match(50);
					}
				}

				setState(103); noun();
				}
				break;

			case 2:
				{
				setState(105);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(104); match(50);
					}
				}

				setState(107); pronoun();
				}
				break;

			case 3:
				{
				setState(109);
				_la = _input.LA(1);
				if (_la==50) {
					{
					setState(108); match(50);
					}
				}

				setState(111); adjective();
				}
				break;
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

	public static class LinebreakContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PoemParser.EOF, 0); }
		public LinebreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linebreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).enterLinebreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoemListener ) ((PoemListener)listener).exitLinebreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoemVisitor ) return ((PoemVisitor<? extends T>)visitor).visitLinebreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinebreakContext linebreak() throws RecognitionException {
		LinebreakContext _localctx = new LinebreakContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_linebreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(114); match(40);
				}
				break;

			case 2:
				{
				setState(115); match(42);
				}
				break;

			case 3:
				{
				setState(116); match(EOF);
				}
				break;

			case 4:
				{
				setState(117); match(44);
				}
				break;

			case 5:
				{
				setState(118); match(21);
				}
				break;

			case 6:
				{
				setState(119); match(32);
				}
				break;

			case 7:
				{
				setState(121);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(120); match(50);
					}
					break;
				}
				}
				break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3M\u0080\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\5\3\32\n\3\3\3\3\3\5\3\36\n\3\3\3\3\3\5\3\"\n\3\3\3\5\3%"+
		"\n\3\3\3\3\3\3\3\5\3*\n\3\5\3,\n\3\3\4\3\4\5\4\60\n\4\3\4\3\4\5\4\64\n"+
		"\4\3\4\3\4\3\4\3\4\5\4:\n\4\5\4<\n\4\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5G\n\5\5\5I\n\5\3\6\3\6\5\6M\n\6\3\6\3\6\5\6Q\n\6\3\6\5\6T\n\6"+
		"\3\7\3\7\5\7X\n\7\3\7\3\7\5\7\\\n\7\3\7\3\7\3\7\3\7\5\7b\n\7\5\7d\n\7"+
		"\3\b\3\b\5\bh\n\b\3\b\3\b\5\bl\n\b\3\b\3\b\5\bp\n\b\3\b\5\bs\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t|\n\t\5\t~\n\t\3\t\2\n\2\4\6\b\n\f\16\20\2\7"+
		"\t\2\n\n\17\17\21\21\37\37--=>LL\22\2\5\6\b\b\20\20\22\23\25\26  &\'+"+
		"+\63\63\67\679:<<?@CDHHJK\6\2\3\3\t\t//II\13\2\32\33\35\35!!#$((\62\62"+
		";;BBGG\21\2\4\4\7\7\13\16\24\24\30\31\34\34\36\36%%))\60\61\65\6688AA"+
		"EFMM\u00a2\2\22\3\2\2\2\4$\3\2\2\2\6-\3\2\2\2\b=\3\2\2\2\nJ\3\2\2\2\f"+
		"U\3\2\2\2\16e\3\2\2\2\20}\3\2\2\2\22\23\5\4\3\2\23\24\5\4\3\2\24\25\5"+
		"\4\3\2\25\26\5\4\3\2\26\27\5\4\3\2\27\3\3\2\2\2\30\32\7\64\2\2\31\30\3"+
		"\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33%\5\b\5\2\34\36\7\64\2\2\35\34\3"+
		"\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37%\5\16\b\2 \"\7\64\2\2! \3\2\2\2"+
		"!\"\3\2\2\2\"#\3\2\2\2#%\5\n\6\2$\31\3\2\2\2$\35\3\2\2\2$!\3\2\2\2%+\3"+
		"\2\2\2&,\5\20\t\2\',\7\2\2\3(*\7\64\2\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2"+
		"+&\3\2\2\2+\'\3\2\2\2+)\3\2\2\2,\5\3\2\2\2-;\t\2\2\2.\60\7\64\2\2/.\3"+
		"\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61<\5\b\5\2\62\64\7\64\2\2\63\62\3\2"+
		"\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65<\5\6\4\2\66<\5\20\t\2\67<\7\2\2\3"+
		"8:\7\64\2\298\3\2\2\29:\3\2\2\2:<\3\2\2\2;/\3\2\2\2;\63\3\2\2\2;\66\3"+
		"\2\2\2;\67\3\2\2\2;9\3\2\2\2<\7\3\2\2\2=?\t\3\2\2>@\7\64\2\2?>\3\2\2\2"+
		"?@\3\2\2\2@H\3\2\2\2AI\5\f\7\2BI\5\16\b\2CI\5\20\t\2DI\7\2\2\3EG\7\64"+
		"\2\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2HA\3\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2"+
		"\2\2HF\3\2\2\2I\t\3\2\2\2JS\t\4\2\2KM\7\64\2\2LK\3\2\2\2LM\3\2\2\2MN\3"+
		"\2\2\2NT\5\b\5\2OQ\7\64\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\5\6\4\2SL"+
		"\3\2\2\2SP\3\2\2\2T\13\3\2\2\2Uc\t\5\2\2VX\7\64\2\2WV\3\2\2\2WX\3\2\2"+
		"\2XY\3\2\2\2Yd\5\16\b\2Z\\\7\64\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]d"+
		"\5\n\6\2^d\5\20\t\2_d\7\2\2\3`b\7\64\2\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2"+
		"cW\3\2\2\2c[\3\2\2\2c^\3\2\2\2c_\3\2\2\2ca\3\2\2\2d\r\3\2\2\2er\t\6\2"+
		"\2fh\7\64\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2is\5\b\5\2jl\7\64\2\2kj\3\2"+
		"\2\2kl\3\2\2\2lm\3\2\2\2ms\5\n\6\2np\7\64\2\2on\3\2\2\2op\3\2\2\2pq\3"+
		"\2\2\2qs\5\6\4\2rg\3\2\2\2rk\3\2\2\2ro\3\2\2\2s\17\3\2\2\2t~\7*\2\2u~"+
		"\7,\2\2v~\7\2\2\3w~\7.\2\2x~\7\27\2\2y~\7\"\2\2z|\7\64\2\2{z\3\2\2\2{"+
		"|\3\2\2\2|~\3\2\2\2}t\3\2\2\2}u\3\2\2\2}v\3\2\2\2}w\3\2\2\2}x\3\2\2\2"+
		"}y\3\2\2\2}{\3\2\2\2~\21\3\2\2\2\34\31\35!$)+/\639;?FHLPSW[acgkor{}";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}