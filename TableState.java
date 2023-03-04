import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

// p table screen

public class TableState extends State{
    StateMachine stateMachine;
    PeriodicTable table;
    Background bg1 = new Background("assets/ptable.png",0,0);
    private int tableType;
    TableState(Keyboard keyboard, Mouse mouse, StateMachine stateMachine) {
        super(keyboard, mouse);
        this.stateMachine = stateMachine;
        table = new PeriodicTable();
        tableType = 0;
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

        ElementButton elementButton = new ElementButton(this.mouse);
        elementButton.setBounds((int)300, 100, (int)200, (int)100);
        elementButton.setText("Elements");
        elementButton.setColor(Color.BLACK);
        elementButton.setHoverColor(Color.GRAY);
        elementButton.setTextColor(Color.WHITE);
        elementButton.setFontSize(15);
        this.buttons.put("elements", elementButton);
        elementButton.setActive(true);


        IonButton ionButton = new IonButton(this.mouse);
        ionButton.setBounds((int)550, 100, (int)200, (int)100);
        ionButton.setText("Ions");
        ionButton.setColor(Color.BLACK);
        ionButton.setHoverColor(Color.GRAY);
        ionButton.setTextColor(Color.WHITE);
        ionButton.setFontSize(15);
        this.buttons.put("ions", ionButton);
        ionButton.setActive(true);


        ConfigButton configButton = new ConfigButton(this.mouse);
        configButton.setBounds((int)800, 100, (int)200, (int)100);
        configButton.setText("Electron configuration");
        configButton.setColor(Color.BLACK);
        configButton.setHoverColor(Color.GRAY);
        configButton.setTextColor(Color.WHITE);
        configButton.setFontSize(15);
        this.buttons.put("config", configButton);
        configButton.setActive(true);
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
        table.flipTile(click);
    }
    public void draw(Graphics g) {
        bg1.draw(g);
        super.draw(g);
        table.draw(g);
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
    private class ElementButton extends MenuButton {
        ElementButton(Mouse mouse) {
            super(mouse);
        }
        public void draw(Graphics g) {
            super.draw(g);
        }
        public boolean run() {
            tableType = 0;
            return true;
        }
    }
    private class IonButton extends MenuButton {
        IonButton(Mouse mouse) {
            super(mouse);
        }
        public void draw(Graphics g) {
            super.draw(g);
        }
        public boolean run() {
            tableType = 1;
            return true;
        }
    }
    private class ConfigButton extends MenuButton {
        ConfigButton(Mouse mouse) {
            super(mouse);
        }
        public void draw(Graphics g) {
            super.draw(g);
        }
        public boolean run() {
            tableType = 2;
            return true;
        }
    }

}
