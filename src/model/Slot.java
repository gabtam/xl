package model;

import expr.Environment;

public interface Slot {
    double getValue(Environment e);
    String getValueString(Environment e);
    // TODO figure out which methods, don't think it needs it's own class
}