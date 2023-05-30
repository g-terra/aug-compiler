// Generated from com/terra/pjatk/aug/grammar/core/AugGrammar.g4 by ANTLR 4.13.0
package com.terra.pjatk.aug.grammar.core;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AugGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AugGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AugGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr(AugGrammarParser.InstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#simple_instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_instr(AugGrammarParser.Simple_instrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#assign_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stat(AugGrammarParser.Assign_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#output_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_stat(AugGrammarParser.Output_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#printable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintable_expr(AugGrammarParser.Printable_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#printable_num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintable_num_expr(AugGrammarParser.Printable_num_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#printable_str_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintable_str_expr(AugGrammarParser.Printable_str_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#printable_undef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintable_undef(AugGrammarParser.Printable_undefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expr(AugGrammarParser.Num_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#t_num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_num_expr(AugGrammarParser.T_num_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#f_num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_num_expr(AugGrammarParser.F_num_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(AugGrammarParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(AugGrammarParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#read_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_int(AugGrammarParser.Read_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(AugGrammarParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(AugGrammarParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#str_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_expr(AugGrammarParser.Str_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#read_str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_str(AugGrammarParser.Read_strContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#concatenate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenate(AugGrammarParser.ConcatenateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#substring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring(AugGrammarParser.SubstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(AugGrammarParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(AugGrammarParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AugGrammarParser.StringContext ctx);
}