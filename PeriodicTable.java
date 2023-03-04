import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PeriodicTable {
  
  boolean escpressed;
  final int CIRCLESIZE = 60;
  final int SPACING = 80;
  Color PURPLE = new Color(159, 43, 104);
  ArrayList<JButton> buttons = new ArrayList<>();
  
//------------------------------------------------------------------------------
  PeriodicTable(){  
  }
//------------------------------------------------------------------------------  
  //main game loop
  public void run(){
    // code (while loop)
    while (true) {
        for (Element element:Element.values()){ //what is this

        }
    }
  }
  public void draw(Graphics g){
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
//------------------------------------------------------------------------------
}
