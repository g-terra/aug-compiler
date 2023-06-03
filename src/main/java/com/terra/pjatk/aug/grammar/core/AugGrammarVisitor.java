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
	 * Visit a parse tree produced by {@link AugGrammarParser#printable_undef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintable_undef(AugGrammarParser.Printable_undefContext ctx);
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
	 * Visit a parse tree produced by {@link AugGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(AugGrammarParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#if_then_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_stat(AugGrammarParser.If_then_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#if_then_else_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_stat(AugGrammarParser.If_then_else_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#instr_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_block(AugGrammarParser.Instr_blockContext ctx);
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
	 * Visit a parse tree produced by {@link AugGrammarParser#sub_num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_num_expr(AugGrammarParser.Sub_num_exprContext ctx);
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
	 * Visit a parse tree produced by {@link AugGrammarParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(AugGrammarParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#t_bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_bool_expr(AugGrammarParser.T_bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#f_bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_bool_expr(AugGrammarParser.F_bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#true}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(AugGrammarParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(AugGrammarParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#sub_bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_bool_expr(AugGrammarParser.Sub_bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#not_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expr(AugGrammarParser.Not_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num_rel_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_rel_expr(AugGrammarParser.Num_rel_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_rel(AugGrammarParser.Num_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num_eq_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_eq_rel(AugGrammarParser.Num_eq_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num_lt_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_lt_rel(AugGrammarParser.Num_lt_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num_le_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_le_rel(AugGrammarParser.Num_le_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num_gt_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_gt_rel(AugGrammarParser.Num_gt_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num_ge_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_ge_rel(AugGrammarParser.Num_ge_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#num_neq_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_neq_rel(AugGrammarParser.Num_neq_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#str_rel_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_rel_expr(AugGrammarParser.Str_rel_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#str_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_rel(AugGrammarParser.Str_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#str_eq_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_eq_rel(AugGrammarParser.Str_eq_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link AugGrammarParser#str_neq_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_neq_rel(AugGrammarParser.Str_neq_relContext ctx);
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