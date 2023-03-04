import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class CompoundCalculator {
    //private NameKeyListener keyListener = new NameKeyListener();
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
        if(!this.textBox.contains(click) || (this.textBox.contains(click) && this.typing)){
            this.typing = false;
        }
    }

    public void type(char key){
        if(typing){
            if(key != '\b' && text.length() < 16){
                text+=key;
            } else if(text.length() > 0 && key == '\b') {
                text = text.substring(0, text.length()-1);
            }
        }
    }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.setFont(FontLoader.getFont(fontSize + 7));
        g.drawRect(textBox.x, textBox.y, textBox.width, textBox.height);
        g.drawString(text, textBox.x + 4, textBox.y + 2 * textBox.height / 3);
    }
}