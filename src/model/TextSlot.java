package model;

import expr.Environment;

public class TextSlot implements Slot {
    String text;

    public TextSlot(String text) {
        this.text = text;
    }

    @Override
    public double getValue(Environment e) {
        return 0;   // TODO is this sensible or not...?
    }

    @Override
    public String getValueString(Environment e) {
        return text.substring(1);
    }

    @Override
    public String toString() {
        return text;
    }
}
