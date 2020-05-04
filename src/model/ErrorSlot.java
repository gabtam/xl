package model;

import expr.Environment;
import util.XLException;

// TODO maybe rename this
public class ErrorSlot implements Slot {

    @Override
    public double getValue(Environment e) {
        throw new XLException("Trying to read value of circular referencing!");
    }

    @Override
    public String getValueString(Environment e) {
        return "WARNING: Circular reference!";
    }
}