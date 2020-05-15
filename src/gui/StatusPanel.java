package gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class StatusPanel extends BorderPanel implements Observer {
    protected StatusPanel(StatusLabel statusLabel) {
        add(WEST, new CurrentLabel());
        add(CENTER, statusLabel);
    }

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}