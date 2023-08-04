// Generated from C:/Users/Acer/Documents/Proyectos Java/CompiladoresANTLR/src/main/java\Gramatica.g4 by ANTLR 4.10.1

    import java.lang.Math;
    import java.util.Map;
    import java.util.HashMap;
    import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(GramaticaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(GramaticaParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void enterDec_var(GramaticaParser.Dec_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void exitDec_var(GramaticaParser.Dec_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#asig_var}.
	 * @param ctx the parse tree
	 */
	void enterAsig_var(GramaticaParser.Asig_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#asig_var}.
	 * @param ctx the parse tree
	 */
	void exitAsig_var(GramaticaParser.Asig_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(GramaticaParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(GramaticaParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(GramaticaParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(GramaticaParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(GramaticaParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(GramaticaParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GramaticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GramaticaParser.TermContext ctx);
}