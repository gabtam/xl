package model;

import gui.SlotLabel;

import java.awt.*;
import java.util.Observable;

public class CurrentSlot extends Observable {
    SlotLabel label;

    public CurrentSlot(){

    }

    public void setLabel(SlotLabel label) {
        this.label = label;
    }

    public void unmark(){
        if(label != null) label.setBackground(Color.WHITE);
    }
}
