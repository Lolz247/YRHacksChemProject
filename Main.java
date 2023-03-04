// main java file that runs jpanel and jframe

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
  JFrame gameWindow;
  GamePanel gamePanel;   
  MyKeyListener keyListener; 
  MyMouseListener mouseListener;
  
  boolean escpressed;
  final int CIRCLESIZE = 60;
  
//------------------------------------------------------------------------------
  Main(){
    gameWindow = new JFrame("I HATE DANIEL");
    gameWindow.setSize(1600,900);
    gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gameWindow.setResizable(false);
    
    gamePanel = new GamePanel();
    gameWindow.add(gamePanel); 
    
    keyListener = new MyKeyListener();
    gamePanel.addKeyListener(keyListener);
    
    mouseListener = new MyMouseListener();
    gamePanel.addMouseListener(mouseListener);
    
    gameWindow.setVisible(true);    
  }
//------------------------------------------------------------------------------  
  //main game loop
  public void run(){
    // code (while loop)
    while (true) {
        gameWindow.repaint();
        try {Thread.sleep(16);} catch(Exception e){}
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
          g.setColor(Color.GRAY);
          g.fillRect(300,300,1000,5);
          
          for (int j = 0; j < 10; j++){//i hate daniel
            g.fillOval(50, 80 * j + 30, CIRCLESIZE, CIRCLESIZE);
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