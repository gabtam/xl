package models;

import expr.Expr;

public class Slot {
    private int row;
    private char column;

    public Slot(int row, char column){
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }
}