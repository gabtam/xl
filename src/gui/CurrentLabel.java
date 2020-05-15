package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class CurrentLabel extends ColoredLabel implements Observer {
    public CurrentLabel(CurrentSlot currentSlot) {
        super("A1", Color.WHITE);
        currentSlot.addObserver(this);
    }

	@Override
	public void update(Observable o, Object arg) {
        if(o instanceof CurrentSlot) {
            CurrentSlot slot = (CurrentSlot) o;
            this.setText(slot.toString());
        }
		
	}
}