package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextField;

import model.Sheet;


@SuppressWarnings("deprecation")
public class Editor extends JTextField implements Observer, ActionListener{
	Sheet sheet;
	CurrentSlot currentSlot;
    public Editor(Sheet sheet, CurrentSlot currentSlot) {
        setBackground(Color.WHITE);
        addActionListener( this );
        this.sheet = sheet;
        this.currentSlot = currentSlot;
        currentSlot.addObserver(this);
    }

	@Override
	public void update(Observable o, Object arg) {
		if( o instanceof CurrentSlot && sheet.contains(o.toString())) {
			this.setText(sheet.get(o.toString()).toString());
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 System.out.println(this.getText());
		 
		 sheet.addSlot(currentSlot.toString(), this.getText());
		 this.setText("");
	}
}