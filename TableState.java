import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

public class TableState extends State{
    StateMachine stateMachine;
    PeriodicTable table;
    TableState(Keyboard keyboard, Mouse mouse, StateMachine stateMachine) {
        super(keyboard, mouse);
        this.stateMachine = stateMachine;
        table = new PeriodicTable();
    }

    public void setup(Object[] args) {
        super.setup();

        BackButton menuButton = new BackButton(this.mouse);
        menuButton.setBounds((int)200, 200, (int)400, (int)150);
        menuButton.setText("Periodic Table");
        menuButton.setColor(Color.BLACK);
        menuButton.setHoverColor(Color.GRAY);
        menuButton.setTextColor(Color.WHITE);
        menuButton.setFontSize(30);
        this.buttons.put("menu", menuButton);

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
            stateMachine.changeState(1);
            return true;
        }
    }
}
