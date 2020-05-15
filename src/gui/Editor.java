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
    public Editor(Sheet sheet) {
        setBackground(Color.WHITE);
        addActionListener( this );
    }

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		setText(arg.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 System.out.println(this.getText());
		 this.setText("");
	}
}