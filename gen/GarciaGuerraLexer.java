// Generated from C:/Users/Alberto/OneDrive - Universidad Rey Juan Carlos/Documentos/Universidad - Sexto Curso/Segundo semestre/Procesadores de Lenguajes/P1 Complementaria 2026/GarciaGuerra/src/GarciaGuerra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GarciaGuerraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENCABEZADO6=1, ENCABEZADO5=2, ENCABEZADO4=3, ENCABEZADO3=4, ENCABEZADO2=5, 
		ENCABEZADO1=6, CITA=7, HR=8, CODE=9, LINK=10, LIST_ITEM=11, NEGRITA=12, 
		NEGRITA2=13, CURSIVA=14, CURSIVA2=15, UNMATCHED_ASTERISK=16, UNMATCHED_UNDERSCORE=17, 
		PLAIN=18, NEWLINE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENCABEZADO6", "ENCABEZADO5", "ENCABEZADO4", "ENCABEZADO3", "ENCABEZADO2", 
			"ENCABEZADO1", "CITA", "HR", "CODE", "LINK", "LIST_ITEM", "NEGRITA", 
			"NEGRITA2", "CURSIVA", "CURSIVA2", "UNMATCHED_ASTERISK", "UNMATCHED_UNDERSCORE", 
			"PLAIN", "NEWLINE", "WS"
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
			"ENCABEZADO1", "CITA", "HR", "CODE", "LINK", "LIST_ITEM", "NEGRITA", 
			"NEGRITA2", "CURSIVA", "CURSIVA2", "UNMATCHED_ASTERISK", "UNMATCHED_UNDERSCORE", 
			"PLAIN", "NEWLINE", "WS"
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


	    private boolean inList = false;
	    private void closeList() {
	        if (inList) {
	            System.out.print("</ul>\n");
	            inList = false;
	        }
	    }


	public GarciaGuerraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GarciaGuerra.g4"; }

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
		case 0:
			ENCABEZADO6_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			ENCABEZADO5_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			ENCABEZADO4_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			ENCABEZADO3_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			ENCABEZADO2_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			ENCABEZADO1_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			CITA_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			HR_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			CODE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			LINK_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			LIST_ITEM_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			NEGRITA_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			NEGRITA2_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			CURSIVA_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			CURSIVA2_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			UNMATCHED_ASTERISK_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			UNMATCHED_UNDERSCORE_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			PLAIN_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ENCABEZADO6_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 closeList(); System.out.print("<h6>" + getText().substring(7).trim() + "</h6>"); 
			break;
		}
	}
	private void ENCABEZADO5_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 closeList(); System.out.print("<h5>" + getText().substring(6).trim() + "</h5>"); 
			break;
		}
	}
	private void ENCABEZADO4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 closeList(); System.out.print("<h4>" + getText().substring(5).trim() + "</h4>"); 
			break;
		}
	}
	private void ENCABEZADO3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 closeList(); System.out.print("<h3>" + getText().substring(4).trim() + "</h3>"); 
			break;
		}
	}
	private void ENCABEZADO2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 closeList(); System.out.print("<h2>" + getText().substring(3).trim() + "</h2>"); 
			break;
		}
	}
	private void ENCABEZADO1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 closeList(); System.out.print("<h1>" + getText().substring(2).trim() + "</h1>"); 
			break;
		}
	}
	private void CITA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 closeList(); System.out.print("<blockquote>" + getText().substring(1).trim() + "</blockquote>"); 
			break;
		}
	}
	private void HR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 closeList(); System.out.print("<hr/>"); 
			break;
		}
	}
	private void CODE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			 closeList(); String s = getText().substring(3, getText().length() - 3); System.out.print("<code><pre>" + s.trim() + "</pre></code>\n"); 
			break;
		}
	}
	private void LINK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:

			    closeList();
			    String s = getText();
			    int rb = s.indexOf(']');
			    int lp = s.indexOf('(', rb);
			    int rp = s.lastIndexOf(')');
			    String txt = s.substring(1, rb);
			    String url = s.substring(lp + 1, rp);
			    boolean ok = url.matches("(?i)https?://[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+.*");
			    if (!ok) {
			        txt = txt + " (URL enlace aparentemente incorrecta)";
			    }
			    System.out.print("<a href=\"" + url + "\">" + txt + "</a>");

			break;
		}
	}
	private void LIST_ITEM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:

			    if (!inList) { System.out.print("<ul>\n"); inList = true; }
			    String s = getText().substring(2).trim();
			    System.out.print("<li>" + s + "</li>\n");

			break;
		}
	}
	private void NEGRITA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			 closeList(); System.out.print("<span class='bold'>" + getText().substring(2, getText().length() - 2) + "</span>"); 
			break;
		}
	}
	private void NEGRITA2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			 closeList(); System.out.print("<span class='bold'>" + getText().substring(2, getText().length() - 2) + "</span>"); 
			break;
		}
	}
	private void CURSIVA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			 closeList(); System.out.print("<span class='ital'>" + getText().substring(1, getText().length() - 1) + "</span>"); 
			break;
		}
	}
	private void CURSIVA2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			 closeList(); System.out.print("<span class='ital'>" + getText().substring(1, getText().length() - 1) + "</span>"); 
			break;
		}
	}
	private void UNMATCHED_ASTERISK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			 closeList(); System.out.print(getText()); 
			break;
		}
	}
	private void UNMATCHED_UNDERSCORE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			 closeList(); System.out.print(getText()); 
			break;
		}
	}
	private void PLAIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			 closeList(); System.out.print(getText()); 
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			 if (inList) { int la = _input.LA(1); if (la== '\r' || la=='\n' || la==org.antlr.v4.runtime.IntStream.EOF) closeList(); } System.out.print("\n"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u0106\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u00003\b\u0000\u000b\u0000\f\u00004\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001A\b\u0001\u000b\u0001\f\u0001"+
		"B\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002N\b\u0002\u000b\u0002"+
		"\f\u0002O\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003Z\b\u0003\u000b\u0003"+
		"\f\u0003[\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004e\b\u0004\u000b\u0004\f\u0004f\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005o\b\u0005\u000b\u0005\f\u0005p\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006y\b\u0006\u000b\u0006"+
		"\f\u0006z\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0088\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0092\b\b\n\b\f\b\u0095\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t\u009f"+
		"\b\t\u000b\t\f\t\u00a0\u0001\t\u0001\t\u0001\t\u0004\t\u00a6\b\t\u000b"+
		"\t\f\t\u00a7\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0004"+
		"\n\u00b1\b\n\u000b\n\f\n\u00b2\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u00bb\b\u000b\u000b\u000b\f\u000b"+
		"\u00bc\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0004\f\u00c8\b\f\u000b\f\f\f\u00c9\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u00d3\b\r\u000b"+
		"\r\f\r\u00d4\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u00dc\b\u000e\u000b\u000e\f\u000e\u00dd\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0004\u000f\u00e5\b\u000f\u000b\u000f\f"+
		"\u000f\u00e6\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u00ed\b\u0010\u000b\u0010\f\u0010\u00ee\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0004\u0011\u00f4\b\u0011\u000b\u0011\f\u0011\u00f5\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0003\u0012\u00fb\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0004\u0013\u0101\b\u0013\u000b\u0013\f\u0013"+
		"\u0102\u0001\u0013\u0001\u0013\u0001\u0093\u0000\u0014\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0007\u0002\u0000\n\n\r\r\u0003"+
		"\u0000\n\n\r\r]]\u0003\u0000\n\n\r\r))\u0003\u0000\n\n\r\r**\u0003\u0000"+
		"\n\n\r\r__\u0007\u0000\n\n\r\r**>>[[_`~~\u0002\u0000\t\t  \u011c\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000"+
		"\u00038\u0001\u0000\u0000\u0000\u0005F\u0001\u0000\u0000\u0000\u0007S"+
		"\u0001\u0000\u0000\u0000\t_\u0001\u0000\u0000\u0000\u000bj\u0001\u0000"+
		"\u0000\u0000\rt\u0001\u0000\u0000\u0000\u000f\u0087\u0001\u0000\u0000"+
		"\u0000\u0011\u008b\u0001\u0000\u0000\u0000\u0013\u009c\u0001\u0000\u0000"+
		"\u0000\u0015\u00ac\u0001\u0000\u0000\u0000\u0017\u00b6\u0001\u0000\u0000"+
		"\u0000\u0019\u00c3\u0001\u0000\u0000\u0000\u001b\u00d0\u0001\u0000\u0000"+
		"\u0000\u001d\u00d9\u0001\u0000\u0000\u0000\u001f\u00e2\u0001\u0000\u0000"+
		"\u0000!\u00ea\u0001\u0000\u0000\u0000#\u00f3\u0001\u0000\u0000\u0000%"+
		"\u00fa\u0001\u0000\u0000\u0000\'\u0100\u0001\u0000\u0000\u0000)*\u0005"+
		"#\u0000\u0000*+\u0005#\u0000\u0000+,\u0005#\u0000\u0000,-\u0005#\u0000"+
		"\u0000-.\u0005#\u0000\u0000./\u0005#\u0000\u0000/0\u0005 \u0000\u0000"+
		"02\u0001\u0000\u0000\u000013\b\u0000\u0000\u000021\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000067\u0006\u0000\u0000\u00007\u0002\u0001"+
		"\u0000\u0000\u000089\u0005#\u0000\u00009:\u0005#\u0000\u0000:;\u0005#"+
		"\u0000\u0000;<\u0005#\u0000\u0000<=\u0005#\u0000\u0000=>\u0005 \u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?A\b\u0000\u0000\u0000@?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0006\u0001\u0001\u0000E\u0004"+
		"\u0001\u0000\u0000\u0000FG\u0005#\u0000\u0000GH\u0005#\u0000\u0000HI\u0005"+
		"#\u0000\u0000IJ\u0005#\u0000\u0000JK\u0005 \u0000\u0000KM\u0001\u0000"+
		"\u0000\u0000LN\b\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0006\u0002\u0002\u0000R\u0006\u0001\u0000\u0000"+
		"\u0000ST\u0005#\u0000\u0000TU\u0005#\u0000\u0000UV\u0005#\u0000\u0000"+
		"VW\u0005 \u0000\u0000WY\u0001\u0000\u0000\u0000XZ\b\u0000\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0006\u0003"+
		"\u0003\u0000^\b\u0001\u0000\u0000\u0000_`\u0005#\u0000\u0000`a\u0005#"+
		"\u0000\u0000ab\u0005 \u0000\u0000bd\u0001\u0000\u0000\u0000ce\b\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hi\u0006\u0004\u0004\u0000i\n\u0001\u0000\u0000\u0000jk\u0005#\u0000\u0000"+
		"kl\u0005 \u0000\u0000ln\u0001\u0000\u0000\u0000mo\b\u0000\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u0005"+
		"\u0005\u0000s\f\u0001\u0000\u0000\u0000tu\u0005>\u0000\u0000uv\u0005 "+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wy\b\u0000\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0006\u0006\u0006\u0000"+
		"}\u000e\u0001\u0000\u0000\u0000~\u007f\u0005-\u0000\u0000\u007f\u0080"+
		"\u0005-\u0000\u0000\u0080\u0088\u0005-\u0000\u0000\u0081\u0082\u0005_"+
		"\u0000\u0000\u0082\u0083\u0005_\u0000\u0000\u0083\u0088\u0005_\u0000\u0000"+
		"\u0084\u0085\u0005*\u0000\u0000\u0085\u0086\u0005*\u0000\u0000\u0086\u0088"+
		"\u0005*\u0000\u0000\u0087~\u0001\u0000\u0000\u0000\u0087\u0081\u0001\u0000"+
		"\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0006\u0007\u0007\u0000\u008a\u0010\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005~\u0000\u0000\u008c\u008d\u0005~\u0000\u0000"+
		"\u008d\u008e\u0005~\u0000\u0000\u008e\u0093\u0001\u0000\u0000\u0000\u008f"+
		"\u0092\t\u0000\u0000\u0000\u0090\u0092\u0007\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005~\u0000\u0000\u0097\u0098\u0005"+
		"~\u0000\u0000\u0098\u0099\u0005~\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0006\b\b\u0000\u009b\u0012\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0005[\u0000\u0000\u009d\u009f\b\u0001\u0000\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005]\u0000\u0000\u00a3\u00a5"+
		"\u0005(\u0000\u0000\u00a4\u00a6\b\u0002\u0000\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005)\u0000\u0000\u00aa\u00ab\u0006\t"+
		"\t\u0000\u00ab\u0014\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005-\u0000"+
		"\u0000\u00ad\u00ae\u0005 \u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000"+
		"\u00af\u00b1\b\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0006\n\n\u0000\u00b5\u0016\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005*\u0000\u0000\u00b7\u00b8\u0005*\u0000\u0000\u00b8\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\b\u0003\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005*\u0000\u0000\u00bf\u00c0\u0005*\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\u000b\u000b\u0000\u00c2"+
		"\u0018\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005_\u0000\u0000\u00c4\u00c5"+
		"\u0005_\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c8\b"+
		"\u0004\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"_\u0000\u0000\u00cc\u00cd\u0005_\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0006\f\f\u0000\u00cf\u001a\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d2\u0005*\u0000\u0000\u00d1\u00d3\b\u0003\u0000\u0000\u00d2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005*\u0000\u0000\u00d7\u00d8"+
		"\u0006\r\r\u0000\u00d8\u001c\u0001\u0000\u0000\u0000\u00d9\u00db\u0005"+
		"_\u0000\u0000\u00da\u00dc\b\u0004\u0000\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0005_\u0000\u0000\u00e0\u00e1\u0006\u000e\u000e"+
		"\u0000\u00e1\u001e\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005*\u0000\u0000"+
		"\u00e3\u00e5\b\u0003\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0006\u000f\u000f\u0000\u00e9 \u0001\u0000\u0000\u0000\u00ea\u00ec"+
		"\u0005_\u0000\u0000\u00eb\u00ed\b\u0004\u0000\u0000\u00ec\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0006\u0010\u0010\u0000\u00f1\"\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f4\b\u0005\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0006\u0011\u0011\u0000\u00f8$\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fb\u0005\r\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005\n\u0000\u0000\u00fd\u00fe\u0006\u0012\u0012\u0000\u00fe&"+
		"\u0001\u0000\u0000\u0000\u00ff\u0101\u0007\u0006\u0000\u0000\u0100\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0006\u0013\u0013\u0000\u0105(\u0001"+
		"\u0000\u0000\u0000\u0017\u00004BO[fpz\u0087\u0091\u0093\u00a0\u00a7\u00b2"+
		"\u00bc\u00c9\u00d4\u00dd\u00e6\u00ee\u00f5\u00fa\u0102\u0014\u0001\u0000"+
		"\u0000\u0001\u0001\u0001\u0001\u0002\u0002\u0001\u0003\u0003\u0001\u0004"+
		"\u0004\u0001\u0005\u0005\u0001\u0006\u0006\u0001\u0007\u0007\u0001\b\b"+
		"\u0001\t\t\u0001\n\n\u0001\u000b\u000b\u0001\f\f\u0001\r\r\u0001\u000e"+
		"\u000e\u0001\u000f\u000f\u0001\u0010\u0010\u0001\u0011\u0011\u0001\u0012"+
		"\u0012\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}