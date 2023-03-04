import java.awt.*;
import javax.swing.*;

// central class that runs the program

public class Chemistry {
    JFrame window;
    ChemPanel chemPanel;

    StateMachine stateMachine;
    Keyboard keyboard;
    Mouse mouse;

    public Chemistry(){
        window = new JFrame("Chemistry Calc");
        chemPanel = new ChemPanel();
        keyboard = new Keyboard();
        mouse = new Mouse();
        stateMachine = new StateMachine(keyboard, mouse);
        System.out.println("we love chemistry!!!"); //i hate daniel 
        setup();
    } 

    public void setup() {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        chemPanel.addKeyListener(keyboard);
        chemPanel.addMouseListener(mouse);
        chemPanel.addMouseMotionListener(mouse);        
        window.add(chemPanel); 
        window.pack();
        //window.setLocationRelativeTo(null);
        window.setVisible(true);
        start();
    }
    public void start(){
        while (true) {
            window.repaint();
            try  {Thread.sleep(10);} catch(Exception e){}
            stateMachine.update();
        }
    }
    //draw everything
    public class ChemPanel extends JPanel {
        ChemPanel() {
            setPreferredSize(new Dimension(Const.FRAME_WIDTH, Const.FRAME_HEIGHT));
            setFocusable(true);
            requestFocusInWindow();
        }
        
        @Override
        public void paintComponent(Graphics g){ 
            super.paintComponent(g); //required
            stateMachine.draw(g);
        }    
    }
}
