package model;

import expr.Environment;
import gui.CurrentSlot;
import util.XLException;

import java.util.*;

public class Sheet extends Observable implements Environment {
    Map<String, Slot> slots;

    public Sheet(){
        slots = new HashMap<>();
    }

    public void addSlot(String address, String data){
        slots.put(address,  SlotFactory.build(data));
        
        setChanged();
        notifyObservers();
    }

    public void removeSlot(String address){
        slots.remove(address);
        
        setChanged();
        notifyObservers();
    }

    public Slot get(String address){
        // TODO implement
        return slots.get(address);
    }

    public boolean contains(String address) {
    	return slots.containsKey(address);
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
