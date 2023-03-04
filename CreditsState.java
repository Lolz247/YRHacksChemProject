import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;

// credits screen

public class CreditsState extends State{
    StateMachine stateMachine;
    Font textfont = new Font("Arial", 1, 40);
    Background creds = new Background("assets/graph.png");
    Background bg1 = new Background("assets/bg1.png");
    CreditsState(Keyboard keyboard, Mouse mouse, StateMachine stateMachine) {
        super(keyboard, mouse);
        this.stateMachine = stateMachine;
    }

    public void setup(Object[] args) {
        super.setup();

        BackButton menuButton = new BackButton(this.mouse);
        menuButton.setBounds((int)30, 10, (int)100, (int)50);
        menuButton.setText("Main Menu");
        menuButton.setColor(Color.BLACK);
        menuButton.setHoverColor(Color.GRAY);
        menuButton.setTextColor(Color.WHITE);
        menuButton.setFontSize(15);
        this.buttons.put("menu", menuButton);

        menuButton.setActive(true);
    }
    public void type(char key) {
        /*if (this.buttons.get("name").isActive()) {
            ((NameButton)this.buttons.get("name")).type(key);
        }*/
    }
    public void click(Mouse.Click click) {
        for (MenuButton button: this.buttons.values()) {
            if (button.click(click)) {
                break;
            }
        }
    }
    public void draw(Graphics g) {
        creds.draw(g);
        g.setColor(Color.PINK);
        g.setFont(textfont);
        g.drawString("Developers:", 900, 100);
        g.drawString("Daniel Liu", 500, 300);
        g.drawString("William Dai", 500, 400);
        g.drawString("Ilya Kononov", 500, 500);
        g.drawString("Kevin Hua", 500, 600);
        super.draw(g);
    }
    private class BackButton extends MenuButton {
        BackButton(Mouse mouse) {
            super(mouse);
        }
        public void draw(Graphics g) {
            super.draw(g);
        }
        public boolean run() {
            stateMachine.changeState(0);
            return true;
        }
    }
}
