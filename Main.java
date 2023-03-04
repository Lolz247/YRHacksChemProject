// main java file that runs jpanel and jframe

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main {
  JFrame gameWindow;
  GamePanel gamePanel;   
  MyKeyListener keyListener; 
  MyMouseListener mouseListener;
  
  boolean escpressed;
  final int CIRCLESIZE = 60;
  final int SPACING = 80;
  Color PURPLE = new Color(159, 43, 104);
  ArrayList<JButton> buttons = new ArrayList<>();
  
//------------------------------------------------------------------------------
  Main(){
    gameWindow = new JFrame("I HATE DANIEL");

    gameWindow.setSize(1600,900);
    gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gameWindow.setResizable(false);
    
    gamePanel = new GamePanel();
    gamePanel.setLayout(null);
    gameWindow.add(gamePanel); 
    
    keyListener = new MyKeyListener();
    gamePanel.addKeyListener(keyListener);
    
    mouseListener = new MyMouseListener();
    gamePanel.addMouseListener(mouseListener);
    
    JButton testbtn = new JButton("test123(4)");
    testbtn.setBounds(50,100,95,30);
    testbtn.setBackground(Color.PINK);
    testbtn.setForeground(Color.GREEN);
    gamePanel.add(testbtn);
    buttons.add(testbtn);
    
    gameWindow.setVisible(true);    
  }
//------------------------------------------------------------------------------  
  //main game loop
  public void run(){
    // code (while loop)
    while (true) {
        gameWindow.repaint();
        try {Thread.sleep(16);} catch(Exception e){}
        for (Element element: Element.values()){ //what is this

        }
    }
  }
//------------------------------------------------------------------------------  
    //act upon key events
    public class MyKeyListener implements KeyListener{
        public void keyPressed(KeyEvent e){
            //int key = e.getKeyCode();
        }
        public void keyReleased(KeyEvent e){ 
            //int key = e.getKeyCode();
        }   
        public void keyTyped(KeyEvent e){
        }           
    }
//------------------------------------------------------------------------------
    // mouse inputs
    public class MyMouseListener implements MouseListener{
        public void mouseClicked(MouseEvent e){   // gets the mouse coordinates
            int mouseX = e.getX();
            int mouseY = e.getY();
            System.out.println(mouseX + " " + mouseY);
        }
        public void mousePressed(MouseEvent e){   // MUST be implemented even if not used!
        }
        public void mouseReleased(MouseEvent e){  // MUST be implemented even if not used!
        }
        public void mouseEntered(MouseEvent e){   // MUST be implemented even if not used!
            
        }
        public void mouseExited(MouseEvent e){    // MUST be implemented even if not used!
        }
    }
//------------------------------------------------------------------------------
    //draw everything
    public class GamePanel extends JPanel{
        GamePanel(){
            setFocusable(true);
            requestFocusInWindow();
        }
        
        @Override
        public void paintComponent(Graphics g){ 
          super.paintComponent(g); //required

          g.setColor(PURPLE); //Alkali Metals
          for (int g1 = 0; g1 < 6; g1++){//i hate daniel
            g.fillOval(50, SPACING * g1 + 30 + SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          g.setColor(Color.PINK); //Alkaline Earth Metals
          for (int g2 = 0; g2 < 6; g2++){
            g.fillOval(50 + SPACING, SPACING * g2 + 30 + SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          g.setColor(Color.RED); //Transition Metals
          for (int g3 = 0; g3 < 2; g3++){
            g.fillOval(50 + 2*SPACING, SPACING * g3 + 30 + 3*SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          for (int g4 = 3; g4 < 8; g4++){
            for (int j4 = 2; j4 < 6; j4++){
                g.fillOval(50 + g4*SPACING, SPACING + 30 + j4*SPACING, CIRCLESIZE, CIRCLESIZE);
            }
          }
          for (int g5 = 8; g5 < 12; g5++){
            for (int j5 = 2; j5 < 5; j5++){
                g.fillOval(50 + g5*SPACING, SPACING + 30 + j5*SPACING, CIRCLESIZE, CIRCLESIZE);
            }
          }

          g.setColor(Color.GRAY); //Lanthanoids
          for (int p1 = 0; p1 < 15; p1++){
            g.fillOval(SPACING * p1 + 50 + 3*SPACING, 30 + 8*SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          g.setColor(Color.PINK); //Actinoids
          for (int p1 = 0; p1 < 15; p1++){
            g.fillOval(SPACING * p1 + 50 + 3*SPACING, 30 + 9*SPACING, CIRCLESIZE, CIRCLESIZE);
          }
        }
    }    
//------------------------------------------------------------------------------
    public static void main(String[] args){
        System.out.println("we love chemistry!!!"); //i hate daniel 
        Main thing = new Main();
        thing.run();
    }
}