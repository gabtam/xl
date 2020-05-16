package gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

import gui.Editor;
import model.Sheet;

class ClearAllMenuItem extends JMenuItem implements ActionListener {
	Sheet sheet;
	Editor editor;
    public ClearAllMenuItem(Sheet sheet) {
        super("Clear all");
        this.sheet = sheet;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        sheet.clear();
    }
}