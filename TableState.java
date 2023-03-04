import java.awt.*;

// p table screen

public class TableState extends State{
    StateMachine stateMachine;
    PeriodicTable table;
    Background bg1 = new Background("assets/ptable.png",0,0);
    Background bg2 = new Background("assets/123.png", 300, 100);
    Color basec = new Color(40,40,40);
    Color basec2 = new Color(75,75,75);
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
        menuButton.setColor(basec);
        menuButton.setHoverColor(basec2);
        menuButton.setTextColor(Color.WHITE);
        menuButton.setFontSize(15);
        this.buttons.put("menu", menuButton);

        menuButton.setActive(true);

        ElementButton elementButton = new ElementButton(this.mouse);
        elementButton.setBounds((int)300, 225, (int)200, (int)100);
        elementButton.setText("Elements");
        elementButton.setColor(basec);
        elementButton.setHoverColor(basec2);
        elementButton.setTextColor(Color.WHITE);
        elementButton.setFontSize(25);
        this.buttons.put("elements", elementButton);
        elementButton.setActive(true);


        IonButton ionButton = new IonButton(this.mouse);
        ionButton.setBounds((int)550, 225, (int)200, (int)100);
        ionButton.setText("Ions");
        ionButton.setColor(basec);
        ionButton.setHoverColor(basec2);
        ionButton.setTextColor(Color.WHITE);
        ionButton.setFontSize(25);
        this.buttons.put("ions", ionButton);
        ionButton.setActive(true);


        ConfigButton configButton = new ConfigButton(this.mouse);
        configButton.setBounds((int)800, 225, (int)200, (int)100);
        configButton.setText("Electron configuration");
        configButton.setColor(basec);
        configButton.setHoverColor(basec2);
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
        bg2.draw(g);
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
            table.changeTableType(0);
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
            table.changeTableType(1);
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
            table.changeTableType(2);
            return true;
        }
    }

}
