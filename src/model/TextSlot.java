package model;

import expr.Environment;

public class TextSlot implements Slot {
    String text;

    public TextSlot(int row, char column, String text) {
        this.text = text;
    }

    @Override
    public double getValue(Environment e) {
        return 0;   // TODO is this sensible or not...?
    }

    @Override
    public String getValueString(Environment e) {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
