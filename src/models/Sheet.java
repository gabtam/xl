package models;

import expr.Environment;
import java.util.*;

public class Sheet extends Observable implements Environment {
    List<Slot> slots;
    Map<String, Double> vars;
    Slot currentSlot;

    public Sheet(){
        slots = new ArrayList<>();
        vars = new HashMap<>();
    }

    @Override
    public double value(String name) {
        return vars.get(name);
    }
}
