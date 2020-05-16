package model;

import expr.Environment;
import util.XLException;

import java.util.*;

public class Sheet extends Observable implements Environment {
    Map<String, Slot> slots;
    String status;

    public Sheet(){
        slots = new HashMap<>();
    }

    public void addSlot(String address, String data){
        Slot toAdd = SlotFactory.build(data);
        if (validate(toAdd, address)){
            slots.put(address,  SlotFactory.build(data));

            setChanged();
            notifyObservers();
        }
    }

    public void removeSlot(String address){
        slots.remove(address);
        
        setChanged();
        notifyObservers();
    }

    public Slot get(String address){
        return slots.get(address);
    }

    public boolean contains(String address) {
        return slots.containsKey(address);
    }
    public void clear() {
    	slots.clear();
    	setChanged();
    	notifyObservers();
    }
    
    private boolean validate(Slot slot, String address){
        Slot previous = get(address);
        slots.put(address, new ErrorSlot());
        try {
            slot.getValue(this);
        } catch (XLException | NullPointerException e){     // den här notationen är skitball!
            status = e.getMessage();
            if(previous==null) slots.remove(address);
            else slots.put(address, previous);
            return false;
        }
        return true;
    }

    @Override
    public double value(String slotName) {
        if(slots.containsKey(slotName)){
            return slots.get(slotName).getValue(this);
        } else {
            return 0;
//            throw new XLException("Non-existent slot.");
        }
    }
}
