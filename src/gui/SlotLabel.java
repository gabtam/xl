package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

public class SlotLabel extends ColoredLabel implements Observer {
	public boolean selected = false;
    public SlotLabel()  {
        super("                    ", Color.WHITE, RIGHT);
        addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				selected = true;
				setBackground(Color.YELLOW);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}});

    }
    public SlotLabel(String content)  {
    	
    	super(content, Color.WHITE, RIGHT);

    }
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}