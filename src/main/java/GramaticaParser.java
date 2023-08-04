// Generated from C:/Users/Acer/Documents/Proyectos Java/CompiladoresANTLR/src/main/java\Gramatica.g4 by ANTLR 4.10.1

    import java.lang.Math;
    import java.util.Map;
    import java.util.HashMap;
    import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINCIPAL=1, SI=2, SINO=3, MIENTRAS=4, IMPRIMIR=5, VAR=6, MAS=7, MENOS=8, 
		MULT=9, POT=10, DIV=11, MOD=12, Y=13, O=14, NO=15, MAY=16, MAYIG=17, MEN=18, 
		MENIG=19, IG=20, NOIG=21, ASIG=22, LLAVE_ABI=23, LLAVE_CER=24, PAREN_ABI=25, 
		PAREN_CER=26, CORCH_ABI=27, CORCH_CER=28, PUNTOYCOM=29, BOOLEANO=30, NUMERO=31, 
		CADENA=32, ID=33, EB=34;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_dec_var = 2, RULE_asig_var = 3, 
		RULE_imprimir = 4, RULE_condicional = 5, RULE_mientras = 6, RULE_expresion = 7, 
		RULE_fact = 8, RULE_term = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "dec_var", "asig_var", "imprimir", "condicional", 
			"mientras", "expresion", "fact", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PRINCIPAL'", "'SI'", "'SINO'", "'MIENTRAS'", "'Imprimir'", "'var'", 
			"'+'", "'-'", "'*'", null, "'/'", "'%'", null, null, null, "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", null, "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINCIPAL", "SI", "SINO", "MIENTRAS", "IMPRIMIR", "VAR", "MAS", 
			"MENOS", "MULT", "POT", "DIV", "MOD", "Y", "O", "NO", "MAY", "MAYIG", 
			"MEN", "MENIG", "IG", "NOIG", "ASIG", "LLAVE_ABI", "LLAVE_CER", "PAREN_ABI", 
			"PAREN_CER", "CORCH_ABI", "CORCH_CER", "PUNTOYCOM", "BOOLEANO", "NUMERO", 
			"CADENA", "ID", "EB"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String,Object> TablaDeSimbolos = new HashMap<String,Object>();

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public SentenciaContext sentencia;
		public TerminalNode PRINCIPAL() { return getToken(GramaticaParser.PRINCIPAL, 0); }
		public TerminalNode LLAVE_ABI() { return getToken(GramaticaParser.LLAVE_ABI, 0); }
		public TerminalNode LLAVE_CER() { return getToken(GramaticaParser.LLAVE_CER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(PRINCIPAL);
			setState(21);
			match(LLAVE_ABI);
			List<ASTnodo> cuerpoPrincipal = new ArrayList<ASTnodo>();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SI) | (1L << MIENTRAS) | (1L << IMPRIMIR) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(23);
				((ProgramaContext)_localctx).sentencia = sentencia();
				cuerpoPrincipal.add(((ProgramaContext)_localctx).sentencia.nodo);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(LLAVE_CER);
			cuerpoPrincipal.forEach(nodo -> nodo.ejecutar(TablaDeSimbolos));
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

	public static class SentenciaContext extends ParserRuleContext {
		public ASTnodo nodo;
		public ImprimirContext imprimir;
		public CondicionalContext condicional;
		public MientrasContext mientras;
		public Dec_varContext dec_var;
		public Asig_varContext asig_var;
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
		public Asig_varContext asig_var() {
			return getRuleContext(Asig_varContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((SentenciaContext)_localctx).imprimir = imprimir();
				((SentenciaContext)_localctx).nodo =  ((SentenciaContext)_localctx).imprimir.nodo;
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				((SentenciaContext)_localctx).condicional = condicional();
				((SentenciaContext)_localctx).nodo =  ((SentenciaContext)_localctx).condicional.nodo;
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				((SentenciaContext)_localctx).mientras = mientras();
				((SentenciaContext)_localctx).nodo =  ((SentenciaContext)_localctx).mientras.nodo;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				((SentenciaContext)_localctx).dec_var = dec_var();
				((SentenciaContext)_localctx).nodo =  ((SentenciaContext)_localctx).dec_var.nodo;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				((SentenciaContext)_localctx).asig_var = asig_var();
				((SentenciaContext)_localctx).nodo =  ((SentenciaContext)_localctx).asig_var.nodo;
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

	public static class Dec_varContext extends ParserRuleContext {
		public ASTnodo nodo;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public TerminalNode PUNTOYCOM() { return getToken(GramaticaParser.PUNTOYCOM, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(GramaticaParser.ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Dec_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDec_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDec_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDec_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_varContext dec_var() throws RecognitionException {
		Dec_varContext _localctx = new Dec_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(VAR);
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(52);
				((Dec_varContext)_localctx).ID = match(ID);
				((Dec_varContext)_localctx).nodo =  new DeclararVariable((((Dec_varContext)_localctx).ID!=null?((Dec_varContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				{
				setState(54);
				((Dec_varContext)_localctx).ID = match(ID);
				setState(55);
				match(ASIG);
				setState(56);
				((Dec_varContext)_localctx).expresion = expresion();
				((Dec_varContext)_localctx).nodo =  new AsignarVariable((((Dec_varContext)_localctx).ID!=null?((Dec_varContext)_localctx).ID.getText():null),((Dec_varContext)_localctx).expresion.nodo);
				}
				break;
			}
			setState(61);
			match(PUNTOYCOM);
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

	public static class Asig_varContext extends ParserRuleContext {
		public ASTnodo nodo;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(GramaticaParser.ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTOYCOM() { return getToken(GramaticaParser.PUNTOYCOM, 0); }
		public Asig_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAsig_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAsig_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAsig_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asig_varContext asig_var() throws RecognitionException {
		Asig_varContext _localctx = new Asig_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asig_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((Asig_varContext)_localctx).ID = match(ID);
			setState(64);
			match(ASIG);
			setState(65);
			((Asig_varContext)_localctx).expresion = expresion();
			setState(66);
			match(PUNTOYCOM);
			((Asig_varContext)_localctx).nodo =  new AsignarVariable((((Asig_varContext)_localctx).ID!=null?((Asig_varContext)_localctx).ID.getText():null),((Asig_varContext)_localctx).expresion.nodo);
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

	public static class ImprimirContext extends ParserRuleContext {
		public ASTnodo nodo;
		public ExpresionContext expresion;
		public TerminalNode IMPRIMIR() { return getToken(GramaticaParser.IMPRIMIR, 0); }
		public TerminalNode PAREN_ABI() { return getToken(GramaticaParser.PAREN_ABI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CER() { return getToken(GramaticaParser.PAREN_CER, 0); }
		public TerminalNode PUNTOYCOM() { return getToken(GramaticaParser.PUNTOYCOM, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IMPRIMIR);
			setState(70);
			match(PAREN_ABI);
			setState(71);
			((ImprimirContext)_localctx).expresion = expresion();
			setState(72);
			match(PAREN_CER);
			setState(73);
			match(PUNTOYCOM);
			((ImprimirContext)_localctx).nodo =  new Imprimir(((ImprimirContext)_localctx).expresion.nodo); 
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

	public static class CondicionalContext extends ParserRuleContext {
		public ASTnodo nodo;
		public ExpresionContext expresion;
		public SentenciaContext sent;
		public SentenciaContext sent2;
		public TerminalNode SI() { return getToken(GramaticaParser.SI, 0); }
		public TerminalNode PAREN_ABI() { return getToken(GramaticaParser.PAREN_ABI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CER() { return getToken(GramaticaParser.PAREN_CER, 0); }
		public List<TerminalNode> LLAVE_ABI() { return getTokens(GramaticaParser.LLAVE_ABI); }
		public TerminalNode LLAVE_ABI(int i) {
			return getToken(GramaticaParser.LLAVE_ABI, i);
		}
		public List<TerminalNode> LLAVE_CER() { return getTokens(GramaticaParser.LLAVE_CER); }
		public TerminalNode LLAVE_CER(int i) {
			return getToken(GramaticaParser.LLAVE_CER, i);
		}
		public TerminalNode SINO() { return getToken(GramaticaParser.SINO, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(SI);
			setState(77);
			match(PAREN_ABI);
			setState(78);
			((CondicionalContext)_localctx).expresion = expresion();
			setState(79);
			match(PAREN_CER);
			List<ASTnodo> cuerpoSi = new ArrayList<ASTnodo>();
			             List<ASTnodo> cuerpoSino = new ArrayList<ASTnodo>();
			setState(81);
			match(LLAVE_ABI);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SI) | (1L << MIENTRAS) | (1L << IMPRIMIR) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(82);
				((CondicionalContext)_localctx).sent = sentencia();
				cuerpoSi.add(((CondicionalContext)_localctx).sent.nodo);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(LLAVE_CER);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(91);
				match(SINO);
				setState(92);
				match(LLAVE_ABI);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SI) | (1L << MIENTRAS) | (1L << IMPRIMIR) | (1L << VAR) | (1L << ID))) != 0)) {
					{
					{
					setState(93);
					((CondicionalContext)_localctx).sent2 = sentencia();
					cuerpoSino.add(((CondicionalContext)_localctx).sent2.nodo);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(LLAVE_CER);
				}
			}

			((CondicionalContext)_localctx).nodo =  new Si(((CondicionalContext)_localctx).expresion.nodo,cuerpoSi,cuerpoSino);
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

	public static class MientrasContext extends ParserRuleContext {
		public ASTnodo nodo;
		public ExpresionContext expresion;
		public SentenciaContext sentM;
		public TerminalNode MIENTRAS() { return getToken(GramaticaParser.MIENTRAS, 0); }
		public TerminalNode PAREN_ABI() { return getToken(GramaticaParser.PAREN_ABI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CER() { return getToken(GramaticaParser.PAREN_CER, 0); }
		public TerminalNode LLAVE_ABI() { return getToken(GramaticaParser.LLAVE_ABI, 0); }
		public TerminalNode LLAVE_CER() { return getToken(GramaticaParser.LLAVE_CER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(MIENTRAS);
			setState(107);
			match(PAREN_ABI);
			setState(108);
			((MientrasContext)_localctx).expresion = expresion();
			setState(109);
			match(PAREN_CER);
			List<ASTnodo> cuerpo = new ArrayList<ASTnodo>();
			setState(111);
			match(LLAVE_ABI);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SI) | (1L << MIENTRAS) | (1L << IMPRIMIR) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				{
				setState(112);
				((MientrasContext)_localctx).sentM = sentencia();
				cuerpo.add(((MientrasContext)_localctx).sentM.nodo);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(LLAVE_CER);
			((MientrasContext)_localctx).nodo =  new Mientras(((MientrasContext)_localctx).expresion.nodo,cuerpo);
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

	public static class ExpresionContext extends ParserRuleContext {
		public ASTnodo nodo;
		public FactContext t1;
		public FactContext t2;
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public List<TerminalNode> MAS() { return getTokens(GramaticaParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(GramaticaParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(GramaticaParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(GramaticaParser.MENOS, i);
		}
		public List<TerminalNode> Y() { return getTokens(GramaticaParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(GramaticaParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(GramaticaParser.O); }
		public TerminalNode O(int i) {
			return getToken(GramaticaParser.O, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((ExpresionContext)_localctx).t1 = fact();
			((ExpresionContext)_localctx).nodo =  ((ExpresionContext)_localctx).t1.nodo;
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(141);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MAS:
						{
						setState(125);
						match(MAS);
						setState(126);
						((ExpresionContext)_localctx).t2 = fact();
						((ExpresionContext)_localctx).nodo =  new Adicion(_localctx.nodo,((ExpresionContext)_localctx).t2.nodo);
						}
						break;
					case MENOS:
						{
						setState(129);
						match(MENOS);
						setState(130);
						((ExpresionContext)_localctx).t2 = fact();
						((ExpresionContext)_localctx).nodo =  new Substraccion(_localctx.nodo,((ExpresionContext)_localctx).t2.nodo);
						}
						break;
					case Y:
						{
						setState(133);
						match(Y);
						setState(134);
						((ExpresionContext)_localctx).t2 = fact();
						((ExpresionContext)_localctx).nodo =  new Conjuncion(_localctx.nodo,((ExpresionContext)_localctx).t2.nodo);
						}
						break;
					case O:
						{
						setState(137);
						match(O);
						setState(138);
						((ExpresionContext)_localctx).t2 = fact();
						((ExpresionContext)_localctx).nodo =  new Disyuncion(_localctx.nodo,((ExpresionContext)_localctx).t2.nodo);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(145);
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
			exitRule();
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public ASTnodo nodo;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(GramaticaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(GramaticaParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(GramaticaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(GramaticaParser.DIV, i);
		}
		public List<TerminalNode> POT() { return getTokens(GramaticaParser.POT); }
		public TerminalNode POT(int i) {
			return getToken(GramaticaParser.POT, i);
		}
		public List<TerminalNode> MAY() { return getTokens(GramaticaParser.MAY); }
		public TerminalNode MAY(int i) {
			return getToken(GramaticaParser.MAY, i);
		}
		public List<TerminalNode> MEN() { return getTokens(GramaticaParser.MEN); }
		public TerminalNode MEN(int i) {
			return getToken(GramaticaParser.MEN, i);
		}
		public List<TerminalNode> IG() { return getTokens(GramaticaParser.IG); }
		public TerminalNode IG(int i) {
			return getToken(GramaticaParser.IG, i);
		}
		public List<TerminalNode> MENIG() { return getTokens(GramaticaParser.MENIG); }
		public TerminalNode MENIG(int i) {
			return getToken(GramaticaParser.MENIG, i);
		}
		public List<TerminalNode> MAYIG() { return getTokens(GramaticaParser.MAYIG); }
		public TerminalNode MAYIG(int i) {
			return getToken(GramaticaParser.MAYIG, i);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fact);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((FactContext)_localctx).t1 = term();
			((FactContext)_localctx).nodo =  ((FactContext)_localctx).t1.nodo;
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(180);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						setState(148);
						match(MULT);
						setState(149);
						((FactContext)_localctx).t2 = term();
						((FactContext)_localctx).nodo =  new Multiplicacion(_localctx.nodo,((FactContext)_localctx).t2.nodo);
						}
						break;
					case DIV:
						{
						setState(152);
						match(DIV);
						setState(153);
						((FactContext)_localctx).t2 = term();
						((FactContext)_localctx).nodo =  new Division(_localctx.nodo,((FactContext)_localctx).t2.nodo);
						}
						break;
					case POT:
						{
						setState(156);
						match(POT);
						setState(157);
						((FactContext)_localctx).t2 = term();
						((FactContext)_localctx).nodo =  new Potenciacion(_localctx.nodo,((FactContext)_localctx).t2.nodo);
						}
						break;
					case MAY:
						{
						setState(160);
						match(MAY);
						setState(161);
						((FactContext)_localctx).t2 = term();
						((FactContext)_localctx).nodo =  new MayorMenor(_localctx.nodo,((FactContext)_localctx).t2.nodo);
						}
						break;
					case MEN:
						{
						setState(164);
						match(MEN);
						setState(165);
						((FactContext)_localctx).t2 = term();
						((FactContext)_localctx).nodo =  new MayorMenor(((FactContext)_localctx).t2.nodo,_localctx.nodo);
						}
						break;
					case IG:
						{
						setState(168);
						match(IG);
						setState(169);
						((FactContext)_localctx).t2 = term();
						((FactContext)_localctx).nodo =  new Igual(_localctx.nodo,((FactContext)_localctx).t2.nodo);
						}
						break;
					case MENIG:
						{
						setState(172);
						match(MENIG);
						setState(173);
						((FactContext)_localctx).t2 = term();
						((FactContext)_localctx).nodo =  new Disyuncion(new Igual(_localctx.nodo,((FactContext)_localctx).t2.nodo),new MayorMenor(((FactContext)_localctx).t2.nodo,_localctx.nodo));
						}
						break;
					case MAYIG:
						{
						setState(176);
						match(MAYIG);
						setState(177);
						((FactContext)_localctx).t2 = term();
						((FactContext)_localctx).nodo =  new Disyuncion(new Igual(_localctx.nodo,((FactContext)_localctx).t2.nodo),new MayorMenor(_localctx.nodo,((FactContext)_localctx).t2.nodo));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public ASTnodo nodo;
		public Token NUMERO;
		public Token BOOLEANO;
		public Token CADENA;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode NUMERO() { return getToken(GramaticaParser.NUMERO, 0); }
		public TerminalNode BOOLEANO() { return getToken(GramaticaParser.BOOLEANO, 0); }
		public TerminalNode CADENA() { return getToken(GramaticaParser.CADENA, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PAREN_ABI() { return getToken(GramaticaParser.PAREN_ABI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CER() { return getToken(GramaticaParser.PAREN_CER, 0); }
		public TerminalNode CORCH_ABI() { return getToken(GramaticaParser.CORCH_ABI, 0); }
		public TerminalNode CORCH_CER() { return getToken(GramaticaParser.CORCH_CER, 0); }
		public TerminalNode NO() { return getToken(GramaticaParser.NO, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				((TermContext)_localctx).NUMERO = match(NUMERO);
				((TermContext)_localctx).nodo =  new Constante(Float.parseFloat((((TermContext)_localctx).NUMERO!=null?((TermContext)_localctx).NUMERO.getText():null)));
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((TermContext)_localctx).BOOLEANO = match(BOOLEANO);
				((TermContext)_localctx).nodo =  new Constante(Boolean.parseBoolean((((TermContext)_localctx).BOOLEANO!=null?((TermContext)_localctx).BOOLEANO.getText():null)));
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				((TermContext)_localctx).CADENA = match(CADENA);
				((TermContext)_localctx).nodo =  new Constante((((TermContext)_localctx).CADENA!=null?((TermContext)_localctx).CADENA.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).nodo =  new ReferenciarVariable((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case PAREN_ABI:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(PAREN_ABI);
				setState(194);
				((TermContext)_localctx).expresion = expresion();
				((TermContext)_localctx).nodo =  ((TermContext)_localctx).expresion.nodo;
				setState(196);
				match(PAREN_CER);
				}
				break;
			case CORCH_ABI:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(CORCH_ABI);
				setState(199);
				((TermContext)_localctx).expresion = expresion();
				((TermContext)_localctx).nodo =  ((TermContext)_localctx).expresion.nodo;
				setState(201);
				match(CORCH_CER);
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				match(NO);
				setState(204);
				((TermContext)_localctx).expresion = expresion();
				((TermContext)_localctx).nodo =  new Negacion(((TermContext)_localctx).expresion.nodo);
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

	public static final String _serializedATN =
		"\u0004\u0001\"\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005V\b\u0005\n\u0005\f\u0005Y\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005a\b"+
		"\u0005\n\u0005\f\u0005d\t\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006t\b"+
		"\u0006\n\u0006\f\u0006w\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u008e\b\u0007\n\u0007\f\u0007\u0091\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00b5\b\b\n\b\f\b\u00b8\t\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d0\b\t\u0001\t\u0000\u0000"+
		"\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000\u00e3\u0000"+
		"\u0014\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u00043\u0001"+
		"\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000"+
		"\u0000\nL\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000e{\u0001"+
		"\u0000\u0000\u0000\u0010\u0092\u0001\u0000\u0000\u0000\u0012\u00cf\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u0005"+
		"\u0017\u0000\u0000\u0016\u001c\u0006\u0000\uffff\uffff\u0000\u0017\u0018"+
		"\u0003\u0002\u0001\u0000\u0018\u0019\u0006\u0000\uffff\uffff\u0000\u0019"+
		"\u001b\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001b"+
		"\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001f \u0005\u0018\u0000\u0000 !\u0006"+
		"\u0000\uffff\uffff\u0000!\u0001\u0001\u0000\u0000\u0000\"#\u0003\b\u0004"+
		"\u0000#$\u0006\u0001\uffff\uffff\u0000$2\u0001\u0000\u0000\u0000%&\u0003"+
		"\n\u0005\u0000&\'\u0006\u0001\uffff\uffff\u0000\'2\u0001\u0000\u0000\u0000"+
		"()\u0003\f\u0006\u0000)*\u0006\u0001\uffff\uffff\u0000*2\u0001\u0000\u0000"+
		"\u0000+,\u0003\u0004\u0002\u0000,-\u0006\u0001\uffff\uffff\u0000-2\u0001"+
		"\u0000\u0000\u0000./\u0003\u0006\u0003\u0000/0\u0006\u0001\uffff\uffff"+
		"\u000002\u0001\u0000\u0000\u00001\"\u0001\u0000\u0000\u00001%\u0001\u0000"+
		"\u0000\u00001(\u0001\u0000\u0000\u00001+\u0001\u0000\u0000\u00001.\u0001"+
		"\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u00003;\u0005\u0006\u0000"+
		"\u000045\u0005!\u0000\u00005<\u0006\u0002\uffff\uffff\u000067\u0005!\u0000"+
		"\u000078\u0005\u0016\u0000\u000089\u0003\u000e\u0007\u00009:\u0006\u0002"+
		"\uffff\uffff\u0000:<\u0001\u0000\u0000\u0000;4\u0001\u0000\u0000\u0000"+
		";6\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u001d\u0000"+
		"\u0000>\u0005\u0001\u0000\u0000\u0000?@\u0005!\u0000\u0000@A\u0005\u0016"+
		"\u0000\u0000AB\u0003\u000e\u0007\u0000BC\u0005\u001d\u0000\u0000CD\u0006"+
		"\u0003\uffff\uffff\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0005\u0005"+
		"\u0000\u0000FG\u0005\u0019\u0000\u0000GH\u0003\u000e\u0007\u0000HI\u0005"+
		"\u001a\u0000\u0000IJ\u0005\u001d\u0000\u0000JK\u0006\u0004\uffff\uffff"+
		"\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\u0002\u0000\u0000MN\u0005\u0019"+
		"\u0000\u0000NO\u0003\u000e\u0007\u0000OP\u0005\u001a\u0000\u0000PQ\u0006"+
		"\u0005\uffff\uffff\u0000QW\u0005\u0017\u0000\u0000RS\u0003\u0002\u0001"+
		"\u0000ST\u0006\u0005\uffff\uffff\u0000TV\u0001\u0000\u0000\u0000UR\u0001"+
		"\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Zf\u0005\u0018\u0000\u0000[\\\u0005\u0003\u0000\u0000\\b\u0005\u0017"+
		"\u0000\u0000]^\u0003\u0002\u0001\u0000^_\u0006\u0005\uffff\uffff\u0000"+
		"_a\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0005\u0018\u0000\u0000f[\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hi\u0006\u0005\uffff\uffff\u0000i\u000b\u0001\u0000\u0000\u0000jk\u0005"+
		"\u0004\u0000\u0000kl\u0005\u0019\u0000\u0000lm\u0003\u000e\u0007\u0000"+
		"mn\u0005\u001a\u0000\u0000no\u0006\u0006\uffff\uffff\u0000ou\u0005\u0017"+
		"\u0000\u0000pq\u0003\u0002\u0001\u0000qr\u0006\u0006\uffff\uffff\u0000"+
		"rt\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0018\u0000\u0000yz\u0006"+
		"\u0006\uffff\uffff\u0000z\r\u0001\u0000\u0000\u0000{|\u0003\u0010\b\u0000"+
		"|\u008f\u0006\u0007\uffff\uffff\u0000}~\u0005\u0007\u0000\u0000~\u007f"+
		"\u0003\u0010\b\u0000\u007f\u0080\u0006\u0007\uffff\uffff\u0000\u0080\u008e"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\b\u0000\u0000\u0082\u0083\u0003"+
		"\u0010\b\u0000\u0083\u0084\u0006\u0007\uffff\uffff\u0000\u0084\u008e\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\r\u0000\u0000\u0086\u0087\u0003\u0010"+
		"\b\u0000\u0087\u0088\u0006\u0007\uffff\uffff\u0000\u0088\u008e\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u000e\u0000\u0000\u008a\u008b\u0003\u0010"+
		"\b\u0000\u008b\u008c\u0006\u0007\uffff\uffff\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d}\u0001\u0000\u0000\u0000\u008d\u0081\u0001\u0000\u0000"+
		"\u0000\u008d\u0085\u0001\u0000\u0000\u0000\u008d\u0089\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u000f\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0012\t\u0000"+
		"\u0093\u00b6\u0006\b\uffff\uffff\u0000\u0094\u0095\u0005\t\u0000\u0000"+
		"\u0095\u0096\u0003\u0012\t\u0000\u0096\u0097\u0006\b\uffff\uffff\u0000"+
		"\u0097\u00b5\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u000b\u0000\u0000"+
		"\u0099\u009a\u0003\u0012\t\u0000\u009a\u009b\u0006\b\uffff\uffff\u0000"+
		"\u009b\u00b5\u0001\u0000\u0000\u0000\u009c\u009d\u0005\n\u0000\u0000\u009d"+
		"\u009e\u0003\u0012\t\u0000\u009e\u009f\u0006\b\uffff\uffff\u0000\u009f"+
		"\u00b5\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0010\u0000\u0000\u00a1"+
		"\u00a2\u0003\u0012\t\u0000\u00a2\u00a3\u0006\b\uffff\uffff\u0000\u00a3"+
		"\u00b5\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0012\u0000\u0000\u00a5"+
		"\u00a6\u0003\u0012\t\u0000\u00a6\u00a7\u0006\b\uffff\uffff\u0000\u00a7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0014\u0000\u0000\u00a9"+
		"\u00aa\u0003\u0012\t\u0000\u00aa\u00ab\u0006\b\uffff\uffff\u0000\u00ab"+
		"\u00b5\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0013\u0000\u0000\u00ad"+
		"\u00ae\u0003\u0012\t\u0000\u00ae\u00af\u0006\b\uffff\uffff\u0000\u00af"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0011\u0000\u0000\u00b1"+
		"\u00b2\u0003\u0012\t\u0000\u00b2\u00b3\u0006\b\uffff\uffff\u0000\u00b3"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b4\u0094\u0001\u0000\u0000\u0000\u00b4"+
		"\u0098\u0001\u0000\u0000\u0000\u00b4\u009c\u0001\u0000\u0000\u0000\u00b4"+
		"\u00a0\u0001\u0000\u0000\u0000\u00b4\u00a4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00a8\u0001\u0000\u0000\u0000\u00b4\u00ac\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u0011\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\u001f\u0000\u0000\u00ba\u00d0\u0006\t\uffff\uffff\u0000\u00bb"+
		"\u00bc\u0005\u001e\u0000\u0000\u00bc\u00d0\u0006\t\uffff\uffff\u0000\u00bd"+
		"\u00be\u0005 \u0000\u0000\u00be\u00d0\u0006\t\uffff\uffff\u0000\u00bf"+
		"\u00c0\u0005!\u0000\u0000\u00c0\u00d0\u0006\t\uffff\uffff\u0000\u00c1"+
		"\u00c2\u0005\u0019\u0000\u0000\u00c2\u00c3\u0003\u000e\u0007\u0000\u00c3"+
		"\u00c4\u0006\t\uffff\uffff\u0000\u00c4\u00c5\u0005\u001a\u0000\u0000\u00c5"+
		"\u00d0\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u001b\u0000\u0000\u00c7"+
		"\u00c8\u0003\u000e\u0007\u0000\u00c8\u00c9\u0006\t\uffff\uffff\u0000\u00c9"+
		"\u00ca\u0005\u001c\u0000\u0000\u00ca\u00d0\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\u000f\u0000\u0000\u00cc\u00cd\u0003\u000e\u0007\u0000\u00cd"+
		"\u00ce\u0006\t\uffff\uffff\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00b9\u0001\u0000\u0000\u0000\u00cf\u00bb\u0001\u0000\u0000\u0000\u00cf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00cf\u00bf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c1\u0001\u0000\u0000\u0000\u00cf\u00c6\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d0\u0013\u0001\u0000\u0000\u0000\f\u001c"+
		"1;Wbfu\u008d\u008f\u00b4\u00b6\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}