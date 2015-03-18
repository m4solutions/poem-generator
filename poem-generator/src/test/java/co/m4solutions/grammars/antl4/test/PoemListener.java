// Generated from /Users/msanchez1/Documents/sanchez.marcus/m4solutions/src/poem-generator/src/main/resources/Poem.g4 by ANTLR 4.1
package co.m4solutions.grammars.antl4.test;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PoemParser}.
 */
public interface PoemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PoemParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(@NotNull PoemParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoemParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(@NotNull PoemParser.VerbContext ctx);

	/**
	 * Enter a parse tree produced by {@link PoemParser#linebreak}.
	 * @param ctx the parse tree
	 */
	void enterLinebreak(@NotNull PoemParser.LinebreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoemParser#linebreak}.
	 * @param ctx the parse tree
	 */
	void exitLinebreak(@NotNull PoemParser.LinebreakContext ctx);

	/**
	 * Enter a parse tree produced by {@link PoemParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void enterPronoun(@NotNull PoemParser.PronounContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoemParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void exitPronoun(@NotNull PoemParser.PronounContext ctx);

	/**
	 * Enter a parse tree produced by {@link PoemParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(@NotNull PoemParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoemParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(@NotNull PoemParser.NounContext ctx);

	/**
	 * Enter a parse tree produced by {@link PoemParser#adjective}.
	 * @param ctx the parse tree
	 */
	void enterAdjective(@NotNull PoemParser.AdjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoemParser#adjective}.
	 * @param ctx the parse tree
	 */
	void exitAdjective(@NotNull PoemParser.AdjectiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link PoemParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull PoemParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoemParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull PoemParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link PoemParser#poem}.
	 * @param ctx the parse tree
	 */
	void enterPoem(@NotNull PoemParser.PoemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoemParser#poem}.
	 * @param ctx the parse tree
	 */
	void exitPoem(@NotNull PoemParser.PoemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PoemParser#preposition}.
	 * @param ctx the parse tree
	 */
	void enterPreposition(@NotNull PoemParser.PrepositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoemParser#preposition}.
	 * @param ctx the parse tree
	 */
	void exitPreposition(@NotNull PoemParser.PrepositionContext ctx);
}