import java.util.*;
import java.awt.*;

/**
 * Abstract class for a state of the program 
 */ 
public abstract class State {
    Keyboard keyboard;
    Mouse mouse;

    private boolean active;
    // The arguments that will be passed onto the next state
    private Object[] nextArgs;

    protected HashMap<String, MenuButton> buttons;

    State(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;

        this.buttons = new HashMap<String, MenuButton>();

        this.active = false;
    }
    public boolean isActive() {
        return this.active;
    }
    public Object[] getNextArgs() {
        return this.nextArgs;
    }
    public void setNextArgs(Object[] nextArgs) {
        this.nextArgs = nextArgs;
    }
    public void setup() {
        this.active = true;
        this.nextArgs = null;
    }
    public void close() {
        this.buttons.clear();
        this.active = false;
    }
    public abstract void setup(Object[] args);
    // Process inputs
    public void update() {
        while (this.keyboard.hasNext() && this.isActive()) {
            this.type(this.keyboard.next());
        }
        while (this.mouse.hasNext() && this.isActive()) {
            this.click(this.mouse.poll());
        }
    }
    // On key type
    public abstract void type(char key);
    // On mouse click
    public abstract void click(Mouse.Click click);
    public void draw(Graphics g){
        for (MenuButton button: this.buttons.values()) {
            button.draw(g);
        }
    }
}