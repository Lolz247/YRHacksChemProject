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
        if(!this.textBox.contains(click)){
            this.typing = false;
        }
    }

    public void type(char key){
        int keyCode = key;
        if(keyCode != 8){
            text+=key;
        } else if(text.length() > 0) {
            text = text.substring(0, text.length()-1);
        }
        System.out.println("cock");
    }

    // public class NameKeyListener implements KeyListener {
    //     public void keyPressed(KeyEvent event) {
    //         int key = event.getKeyCode();
    //         String newChar = Character.toString((char)key);
    //         if (typing){
    //             String name = text;
    //             if (name.length() <= 25 && key != 8){ //8 is backspace, 32 is space, no spaces in name to not mess up networking
    //                 text = name + newChar;
    //             }
    //             else if (key == 8 && text.length() > 0){
    //                 text = text.substring(0, (text.length() - 1));
    //             }
    //         }
    //     }
    //     public void keyReleased(KeyEvent event) {}
    //     public void keyTyped(KeyEvent event) {}
    // }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(textBox.x, textBox.y, textBox.width, textBox.height);
        g.drawString(text, Const.FRAME_WIDTH/2 - textBoxSize/2, fontSize);
    }
}