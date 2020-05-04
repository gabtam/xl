package model;

import expr.Environment;
import util.XLException;

import java.util.*;

public class Sheet extends Observable implements Environment {
    Map<String, Slot> slots;
    Slot currentSlot;

    public Sheet(){
        slots = new HashMap<>();
    }

    public void addSlot(String address, String data){
        // TODO implement
    }

    public void removeSlot(String address){
        // TODO implement
    }

    public Slot get(String address){
        // TODO implement
        return null;
    }

    // TODO we need more methods here, surely, but can't think of any now.

    @Override
    public double value(String slotName) {
        if(slots.containsKey(slotName)){
            return slots.get(slotName).getValue(this);
        } else {
            throw new XLException("Non-existent slot.");
        }
    }
}
