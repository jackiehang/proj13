/* Bantam Java Compiler and Language Toolset.

   Copyright (C) 2009 by Marc Corliss (corliss@hws.edu) and 
                         David Furcy (furcyd@uwosh.edu) and
                         E Christopher Lewis (lewis@vmware.com).
   ALL RIGHTS RESERVED.

   The Bantam Java toolset is distributed under the following 
   conditions:

     You may make copies of the toolset for your own use and 
     modify those copies.

     All copies of the toolset must retain the author names and 
     copyright notice.

     You may not sell the toolset or distribute it in 
     conjunction with a commerical product or service without 
     the expressed written consent of the authors.

   THIS SOFTWARE IS PROVIDED ``AS IS'' AND WITHOUT ANY EXPRESS 
   OR IMPLIED WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE 
   IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A 
   PARTICULAR PURPOSE. 
*/

package proj13DeGrawHang.bantam.ast;

import proj13DeGrawHang.bantam.visitor.Visitor;

/**
 * The <tt>CastExpr</tt> class represents a cast expression.
 * It contains a target type name (<tt>type</tt>), an
 * expression to cast (<tt>expr</tt>), and a flag indicating
 * whether the cast is an upcast (<tt>upcast</tt>).
 *
 * @see ASTNode
 * @see Expr
 */
public class CastExpr extends Expr {
    /**
     * The target type
     */
    protected String type;

    /**
     * The expression to cast
     */
    protected Expr expr;

    /**
     * Boolean indicating whether the cast is an upcast
     */
    protected boolean upcast = false;

    /**
     * CastExpr constructor
     *
     * @param lineNum source line number corresponding to this AST node
     * @param type    the target type
     * @param expr    expression to cast
     */
    public CastExpr(int lineNum,  int colPos, String type, Expr expr) {
        super(lineNum,colPos);
        this.type = type;
        this.expr = expr;
    }

    /**
     * Get the target type
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Get the expression to cast
     *
     * @return expression
     */
    public Expr getExpr() {
        return expr;
    }

    /**
     * Is this an upcast?
     *
     * @return boolean indicating whether this cast is an upcast
     */
    public boolean getUpCast() {
        return upcast;
    }

    /**
     * Set whether the cast is an upcast
     *
     * @param upcast boolean indicating whether cast is an upcast
     */
    public void setUpCast(boolean upcast) {
        this.upcast = upcast;
    }

    /**
     * Visitor method
     *
     * @param v bantam.visitor object
     * @return result of visiting this node
     * @see proj13DeGrawHang.bantam.visitor.Visitor
     */
    public Object accept(Visitor v) {
        return v.visit(this);
    }
}
