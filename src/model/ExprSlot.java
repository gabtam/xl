package model;

import expr.Environment;
import expr.Expr;

public class ExprSlot implements Slot {
    Expr expr;

    public ExprSlot(Expr expr) {
        this.expr = expr;
    }

    @Override
    public double getValue(Environment e) {
        return expr.value(e);
    }

    @Override
    public String getValueString(Environment e) {
        return null;
    }

    @Override
    public String toString() {
        return expr.toString();
    }
}
