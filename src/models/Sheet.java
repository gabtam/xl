package models;

import expr.Expr;

import java.util.ArrayList;
import java.util.List;

public class Sheet {
    List<Cell> list = new ArrayList<>();



    private static class Cell {
        private int row;
        private char slot;
        private Expr content;

        public Cell(int row, char slot, Expr content){
            this.row = row;
            this.slot = slot;
            this.content = content;
        }

        public int getRow() {
            return row;
        }

        public char getSlot() {
            return slot;
        }

        public Expr getContent() {
            return content;
        }

        public void setContent(Expr content) {
            this.content = content;
        }
    }
}
