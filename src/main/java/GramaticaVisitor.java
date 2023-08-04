// Generated from C:/Users/Acer/Documents/Proyectos Java/CompiladoresANTLR/src/main/java\Gramatica.g4 by ANTLR 4.10.1

    import java.lang.Math;
    import java.util.Map;
    import java.util.HashMap;
    import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(GramaticaParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dec_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_var(GramaticaParser.Dec_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asig_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig_var(GramaticaParser.Asig_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(GramaticaParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(GramaticaParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(GramaticaParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GramaticaParser.TermContext ctx);
}