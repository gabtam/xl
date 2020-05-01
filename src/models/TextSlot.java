package models;

public class TextSlot extends Slot {
    String text;

    public TextSlot(int row, char column, String text) {
        super(row, column);
        this.text = text;
    }
}
