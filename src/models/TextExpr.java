package models;

import expr.Environment;
import expr.Expr;

public class TextExpr extends Expr {
    String text;

    public TextExpr(String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }

    @Override
    public String toString(int prec) {
        return text;
    }

    @Override
    public double value(Environment env) {
        return 0;
    }
}
