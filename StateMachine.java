import java.awt.*;

/*
 * Statemachine that controls the flow of the program
 */
public class StateMachine {
    Keyboard keyboard;
    Mouse mouse;

    int current;
    State[] states;

    StateMachine(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;

        this.current = 0;
        // Initialize states
        this.states = new State[]{
            new MenuState(this.keyboard, this.mouse, this), 
            new TableState(this.keyboard, this.mouse, this), 
            new CompoundState(this.keyboard, this.mouse, this),
            new CreditsState(this.keyboard, this.mouse, this),
        };

        this.states[this.current].setup(new Object[]{});
    }
    public void update() {
        // Update the current state
        this.states[this.current].update();
        // Switch to the next state if the current one has closed
        if (!this.states[current].isActive()) {
            this.nextState();
        }
    }
    public void draw(Graphics g) {
        // Render the current state
        this.states[this.current].draw(g);
    }
    public void nextState() {
        // Arguments passed from previous state to next state
        Object[] args = this.states[current].getNextArgs();
        this.current++;
        this.states[current].setup(args);
    }
    public void changeState(int state){
        Object[] args = this.states[current].getNextArgs();
        this.current = state;
        this.states[current].setup(args);
    }
}