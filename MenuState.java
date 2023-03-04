import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

// menu screen

public class MenuState extends State{
    StateMachine stateMachine;
    Background chemtech = new Background("assets/chemtech.png", 775, 130);
    Background menu = new Background("assets/menu.jpg", 0, 0);
    Background dec1 = new Background("assets/1.png", 200, 170);
    Background dec2 = new Background("assets/2.png", 450, 400);
    Background dec3 = new Background("assets/3.png", 300, 700);
    Background dec4 = new Background("assets/4.png", 1400, 150);
    Background dec5 = new Background("assets/5.png", 1500, 750);
    Background dec6 = new Background("assets/6.png", 1250, 450);
    MenuState(Keyboard keyboard, Mouse mouse, StateMachine stateMachine) {
        super(keyboard, mouse);
        this.stateMachine = stateMachine;
    }

    public void setup(Object[] args) {
        super.setup();

        TableButton tableButton = new TableButton(this.mouse);
        tableButton.setBounds((int)760, 260, (int)400, (int)150);
        tableButton.setText("Periodic Table");
        tableButton.setColor(Color.BLACK);
        tableButton.setHoverColor(new Color(75,75,75)); //nicer gray than Color.GRAY
        tableButton.setTextColor(Color.WHITE);
        tableButton.setFontSize(40);
        this.buttons.put("table", tableButton);

        CompoundButton compoundButton = new CompoundButton(this.mouse);
        compoundButton.setBounds((int)760, (int)510, (int)400, (int)150);
        compoundButton.setText("Compounds");
        compoundButton.setColor(new Color(252, 78, 66)); //nicer red than Color.RED
        compoundButton.setHoverColor(new Color(240,75,75));
        compoundButton.setTextColor(Color.BLACK);
        compoundButton.setFontSize(50);
        this.buttons.put("red", compoundButton);

        CreditButton creditButton = new CreditButton(this.mouse);
        creditButton.setBounds((int)760, (int)760, (int)400, (int)150);
        creditButton.setText("Credits");
        creditButton.setColor(new Color(30,70,200)); //nicer blue than Color.BLUE
        creditButton.setHoverColor(new Color(75,120,235));
        creditButton.setTextColor(Color.BLACK);
        creditButton.setFontSize(50);
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
        menu.draw(g);
        chemtech.draw(g);
        dec1.draw(g);
        dec2.draw(g);
        dec3.draw(g);
        dec4.draw(g);
        dec5.draw(g);
        dec6.draw(g);
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
