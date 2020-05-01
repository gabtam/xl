package models;

import expr.Expr;

public class ExprSlot extends Slot {
    Expr expr;

    public ExprSlot(int row, char column, Expr expr) {
        super(row, column);
        this.expr = expr;
    }
}
