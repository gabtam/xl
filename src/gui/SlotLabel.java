package gui;

import model.Sheet;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

public class SlotLabel extends ColoredLabel implements MouseListener, Observer {
	String address;
	private Sheet sheet;

    public SlotLabel(String address, Sheet sheet){
		super("                    ", Color.WHITE, RIGHT);
		this.sheet = sheet;
		this.address = address;
		addMouseListener(this);
		sheet.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
    	sheet.getCurrentSlot().unmark();
		sheet.getCurrentSlot().setLabel(this);
		setBackground(Color.YELLOW);
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}