package model;

import expr.ExprParser;
import util.XLException;

import java.io.IOException;

public class SlotFactory {
    public static Slot build(String data){
        if(data.charAt(0)=='#'){
            return new TextSlot(data);
        }

        try {
            return new ExprSlot(new ExprParser().build(data));
        } catch (IOException e) {
            e.printStackTrace();
            throw new XLException("Unable to parse string: \n" + data);     // kan vi kasta XLException och visa dess .getMessage() samtidigt här?
        }
    }
}
