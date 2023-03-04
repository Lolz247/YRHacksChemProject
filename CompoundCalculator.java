import java.util.*;
import java.io.*;
import java.awt.*;

public class CompoundCalculator {
    private Rectangle textBox;
    private int textBoxSize;
    private int fontSize;
    private boolean typing;
    private String text;

    CompoundCalculator(){
        textBoxSize = Const.TEXTBOX_SIZE;
        fontSize = Const.FONT_SIZE;
        textBox = new Rectangle(Const.FRAME_WIDTH/2 - textBoxSize/2, Const.FRAME_HEIGHT/4 + fontSize, textBoxSize, fontSize*2);
        text = "";
    }

    public void enterTextBox(Mouse.Click click){
        if(this.textBox.contains(click)){
            this.typing = true;
        }
    }

    public void exitTextBox(Mouse.Click click){
        if(!this.textBox.contains(click)){
            this.typing = false;
        }
    }

    public void type(Keyboard input){
        while(input.hasNext() && typing){
            text = text + input.next();
        }
    }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(textBox.x, textBox.y, textBox.width, textBox.height);
        g.drawString(text, Const.FRAME_WIDTH/2 - textBoxSize/2, fontSize);
    }
}