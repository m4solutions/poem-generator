// Generated from /Users/msanchez1/Documents/sanchez.marcus/m4solutions/src/poem-generator/src/main/resources/Poem.g4 by ANTLR 4.1
package co.m4solutions.grammars.antl4.test;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PoemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PoemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PoemParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(@NotNull PoemParser.VerbContext ctx);

	/**
	 * Visit a parse tree produced by {@link PoemParser#linebreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinebreak(@NotNull PoemParser.LinebreakContext ctx);

	/**
	 * Visit a parse tree produced by {@link PoemParser#pronoun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPronoun(@NotNull PoemParser.PronounContext ctx);

	/**
	 * Visit a parse tree produced by {@link PoemParser#noun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoun(@NotNull PoemParser.NounContext ctx);

	/**
	 * Visit a parse tree produced by {@link PoemParser#adjective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjective(@NotNull PoemParser.AdjectiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link PoemParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull PoemParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link PoemParser#poem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoem(@NotNull PoemParser.PoemContext ctx);

	/**
	 * Visit a parse tree produced by {@link PoemParser#preposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreposition(@NotNull PoemParser.PrepositionContext ctx);
}