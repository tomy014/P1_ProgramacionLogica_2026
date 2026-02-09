// Generated from C:/Users/Alberto/OneDrive - Universidad Rey Juan Carlos/Documentos/Universidad - Sexto Curso/Segundo semestre/Procesadores de Lenguajes/P1 Complementaria 2026/GarciaGuerra/src/GarciaGuerra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GarciaGuerraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENCABEZADO6=1, ENCABEZADO5=2, ENCABEZADO4=3, ENCABEZADO3=4, ENCABEZADO2=5, 
		ENCABEZADO1=6, CITA=7, HR=8, CODE=9, LINK=10, NEGRITA=11, NEGRITA2=12, 
		CURSIVA=13, CURSIVA2=14, UNMATCHED_ASTERISK=15, UNMATCHED_UNDERSCORE=16, 
		PLAIN=17, NEWLINE=18, WS=19;
	public static final int
		RULE_texto = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"texto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENCABEZADO6", "ENCABEZADO5", "ENCABEZADO4", "ENCABEZADO3", "ENCABEZADO2", 
			"ENCABEZADO1", "CITA", "HR", "CODE", "LINK", "NEGRITA", "NEGRITA2", "CURSIVA", 
			"CURSIVA2", "UNMATCHED_ASTERISK", "UNMATCHED_UNDERSCORE", "PLAIN", "NEWLINE", 
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
	public String getGrammarFileName() { return "GarciaGuerra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GarciaGuerraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextoContext extends ParserRuleContext {
		public List<TerminalNode> ENCABEZADO6() { return getTokens(GarciaGuerraParser.ENCABEZADO6); }
		public TerminalNode ENCABEZADO6(int i) {
			return getToken(GarciaGuerraParser.ENCABEZADO6, i);
		}
		public List<TerminalNode> ENCABEZADO5() { return getTokens(GarciaGuerraParser.ENCABEZADO5); }
		public TerminalNode ENCABEZADO5(int i) {
			return getToken(GarciaGuerraParser.ENCABEZADO5, i);
		}
		public List<TerminalNode> ENCABEZADO4() { return getTokens(GarciaGuerraParser.ENCABEZADO4); }
		public TerminalNode ENCABEZADO4(int i) {
			return getToken(GarciaGuerraParser.ENCABEZADO4, i);
		}
		public List<TerminalNode> ENCABEZADO3() { return getTokens(GarciaGuerraParser.ENCABEZADO3); }
		public TerminalNode ENCABEZADO3(int i) {
			return getToken(GarciaGuerraParser.ENCABEZADO3, i);
		}
		public List<TerminalNode> ENCABEZADO2() { return getTokens(GarciaGuerraParser.ENCABEZADO2); }
		public TerminalNode ENCABEZADO2(int i) {
			return getToken(GarciaGuerraParser.ENCABEZADO2, i);
		}
		public List<TerminalNode> ENCABEZADO1() { return getTokens(GarciaGuerraParser.ENCABEZADO1); }
		public TerminalNode ENCABEZADO1(int i) {
			return getToken(GarciaGuerraParser.ENCABEZADO1, i);
		}
		public List<TerminalNode> CITA() { return getTokens(GarciaGuerraParser.CITA); }
		public TerminalNode CITA(int i) {
			return getToken(GarciaGuerraParser.CITA, i);
		}
		public List<TerminalNode> HR() { return getTokens(GarciaGuerraParser.HR); }
		public TerminalNode HR(int i) {
			return getToken(GarciaGuerraParser.HR, i);
		}
		public List<TerminalNode> CODE() { return getTokens(GarciaGuerraParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(GarciaGuerraParser.CODE, i);
		}
		public List<TerminalNode> LINK() { return getTokens(GarciaGuerraParser.LINK); }
		public TerminalNode LINK(int i) {
			return getToken(GarciaGuerraParser.LINK, i);
		}
		public List<TerminalNode> NEGRITA() { return getTokens(GarciaGuerraParser.NEGRITA); }
		public TerminalNode NEGRITA(int i) {
			return getToken(GarciaGuerraParser.NEGRITA, i);
		}
		public List<TerminalNode> NEGRITA2() { return getTokens(GarciaGuerraParser.NEGRITA2); }
		public TerminalNode NEGRITA2(int i) {
			return getToken(GarciaGuerraParser.NEGRITA2, i);
		}
		public List<TerminalNode> CURSIVA() { return getTokens(GarciaGuerraParser.CURSIVA); }
		public TerminalNode CURSIVA(int i) {
			return getToken(GarciaGuerraParser.CURSIVA, i);
		}
		public List<TerminalNode> CURSIVA2() { return getTokens(GarciaGuerraParser.CURSIVA2); }
		public TerminalNode CURSIVA2(int i) {
			return getToken(GarciaGuerraParser.CURSIVA2, i);
		}
		public List<TerminalNode> UNMATCHED_ASTERISK() { return getTokens(GarciaGuerraParser.UNMATCHED_ASTERISK); }
		public TerminalNode UNMATCHED_ASTERISK(int i) {
			return getToken(GarciaGuerraParser.UNMATCHED_ASTERISK, i);
		}
		public List<TerminalNode> UNMATCHED_UNDERSCORE() { return getTokens(GarciaGuerraParser.UNMATCHED_UNDERSCORE); }
		public TerminalNode UNMATCHED_UNDERSCORE(int i) {
			return getToken(GarciaGuerraParser.UNMATCHED_UNDERSCORE, i);
		}
		public List<TerminalNode> PLAIN() { return getTokens(GarciaGuerraParser.PLAIN); }
		public TerminalNode PLAIN(int i) {
			return getToken(GarciaGuerraParser.PLAIN, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GarciaGuerraParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GarciaGuerraParser.NEWLINE, i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GarciaGuerraListener ) ((GarciaGuerraListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GarciaGuerraListener ) ((GarciaGuerraListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GarciaGuerraVisitor ) return ((GarciaGuerraVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0) );
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
		"\u0004\u0001\u0013\b\u0002\u0000\u0007\u0000\u0001\u0000\u0004\u0000\u0004"+
		"\b\u0000\u000b\u0000\f\u0000\u0005\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0001\u0000\u0001\u0012\u0007\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001\u0000\u0000"+
		"\u0000\u0004\u0005\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000\u0000"+
		"\u0000\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000\u0000"+
		"\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}