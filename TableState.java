import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

// p table screen

public class TableState extends State{
    StateMachine stateMachine;
    PeriodicTable table;
    Background ptable = new Background("assets/ptable.png");
    TableState(Keyboard keyboard, Mouse mouse, StateMachine stateMachine) {
        super(keyboard, mouse);
        this.stateMachine = stateMachine;
        table = new PeriodicTable();
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
        table.switchElement(click);
    }
    public void draw(Graphics g) {
        ptable.draw(g);
        table.draw(g);
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
