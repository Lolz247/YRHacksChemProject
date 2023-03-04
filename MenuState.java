import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

public class MenuState extends State{
    StateMachine stateMachine;
    MenuState(Keyboard keyboard, Mouse mouse, StateMachine stateMachine) {
        super(keyboard, mouse);
        this.stateMachine = stateMachine;
    }

    public void setup(Object[] args) {
        super.setup();

        TableButton tableButton = new TableButton(this.mouse);
        tableButton.setBounds((int)200, 200, (int)400, (int)150);
        tableButton.setText("Periodic Table");
        tableButton.setColor(Color.BLACK);
        tableButton.setHoverColor(Color.GRAY);
        tableButton.setTextColor(Color.WHITE);
        tableButton.setFontSize(30);
        this.buttons.put("table", tableButton);

        CompoundButton compoundButton = new CompoundButton(this.mouse);
        compoundButton.setBounds((int)200, (int)450, (int)400, (int)150);
        compoundButton.setText("Compounds");
        compoundButton.setColor(Color.RED);
        compoundButton.setHoverColor(Color.PINK);
        compoundButton.setTextColor(Color.BLACK);
        compoundButton.setFontSize(20);
        this.buttons.put("red", compoundButton);

        CreditButton creditButton = new CreditButton(this.mouse);
        creditButton.setBounds((int)200, (int)700, (int)400, (int)150);
        creditButton.setText("Credits");
        creditButton.setColor(Color.BLUE);
        creditButton.setHoverColor(Color.CYAN);
        creditButton.setTextColor(Color.BLACK);
        creditButton.setFontSize(20);
        this.buttons.put("blue", creditButton);

        tableButton.setActive(true);
        compoundButton.setActive(true);
        creditButton.setActive(true);
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
        super.draw(g);
    }
    private class TableButton extends MenuButton {
        TableButton(Mouse mouse) {
            super(mouse);
        }
        public void draw(Graphics g) {
            super.draw(g);
        }
        public boolean run() {
            stateMachine.changeState(1);
            return true;
        }
    }
    private class CompoundButton extends MenuButton {
        CompoundButton(Mouse mouse) {
            super(mouse);
        }
        public void draw(Graphics g) {
            super.draw(g);
        }
        public boolean run() {
            stateMachine.changeState(2);
            return true;
        }
    }
    private class CreditButton extends MenuButton {
        CreditButton(Mouse mouse) {
            super(mouse);
        }
        public void draw(Graphics g) {
            super.draw(g);
        }
        public boolean run() {
            stateMachine.changeState(3);
            return true;
        }
    }
}
