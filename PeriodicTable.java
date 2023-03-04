import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PeriodicTable {
  
  boolean escpressed;
  final int CIRCLESIZE = 60;
  final int SPACING = 80;
  Color PURPLE = new Color(140, 82, 255);
  Color BROWN = new Color(105, 87, 39);
  Color PINK = new Color(255, 112, 253);
  Color ORANGE = new Color(255, 145, 77);
  Color DANIEL = new Color(255, 189, 89);
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
    g.setColor(ORANGE); //Alkali Metals
          for (int g1 = 0; g1 < 6; g1++){//i hate daniel
            g.fillOval(50, SPACING * g1 + 30 + SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          g.setColor(DANIEL); //Alkaline Earth Metals
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
          g.setColor(new Color(193, 255, 114)); //Reactive Nonmetals
          g.fillOval(50, 30, CIRCLESIZE, CIRCLESIZE);
          g.fillOval(50 + 13*SPACING, 30 + SPACING, CIRCLESIZE, CIRCLESIZE);
          for (int g6 = 0; g6 < 2; g6++){
            g.fillOval(50 + 14*SPACING, SPACING * g6 + 30 + SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          for (int g7 = 0; g7 < 3; g7++){
            g.fillOval(50 + 15*SPACING, SPACING * g7 + 30 + SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          for (int g8 = 0; g8 < 4; g8++){
            g.fillOval(50 + 16*SPACING, SPACING * g8 + 30 + SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          g.setColor(PURPLE);
          for (int g9 = 0; g9 < 6; g9++){
            g.fillOval(50 + 17*SPACING, SPACING * g9 + 30, CIRCLESIZE, CIRCLESIZE);
          }

          g.setColor(new Color(12, 192, 223)); //Metalloids
          g.fillOval(50 + 12*SPACING, 30 + SPACING, CIRCLESIZE, CIRCLESIZE);
          for (int g10 = 0; g10 < 2; g10++){
            g.fillOval(50 + 13*SPACING, SPACING * g10 + 30 + 2*SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          for (int g11 = 0; g11 < 2; g11++){
            g.fillOval(50 + 14*SPACING, SPACING * g11 + 30 + 3*SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          g.fillOval(50 + 15*SPACING, 30 + 4*SPACING, CIRCLESIZE, CIRCLESIZE);
          g.fillOval(50 + 16*SPACING, 30 + 5*SPACING, CIRCLESIZE, CIRCLESIZE);

          g.setColor(new Color(82, 113, 255)); //Post-transition Metals
          for (int g12 = 0; g12 < 4; g12++){
            g.fillOval(50 + 12*SPACING, SPACING * g12 + 30 + 2*SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          for (int g13 = 0; g13 < 2; g13++){
            g.fillOval(50 + 13*SPACING, SPACING * g13 + 30 + 4*SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          g.fillOval(50 + 14*SPACING, 30 + 5*SPACING, CIRCLESIZE, CIRCLESIZE);
          g.fillOval(50 + 15*SPACING, 30 + 5*SPACING, CIRCLESIZE, CIRCLESIZE);

          g.setColor(Color.GRAY); //Unknown
          for (int g14 = 0; g14 < 10; g14++){
            g.fillOval(50 + 8*SPACING + SPACING*g14, 30 + 6*SPACING, CIRCLESIZE, CIRCLESIZE);
          }

          g.setColor(new Color(178, 140, 90)); //Lanthanoids
          for (int p1 = 0; p1 < 15; p1++){
            g.fillOval(SPACING * p1 + 50 + 3*SPACING, 30 + 8*SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          g.fillOval(50 + 2*SPACING, 30 + 5*SPACING, CIRCLESIZE, CIRCLESIZE);

          g.setColor(PINK); //Actinoids
          for (int p1 = 0; p1 < 15; p1++){
            g.fillOval(SPACING * p1 + 50 + 3*SPACING, 30 + 9*SPACING, CIRCLESIZE, CIRCLESIZE);
          }
          g.fillOval(50 + 2*SPACING, 30 + 6*SPACING, CIRCLESIZE, CIRCLESIZE);
        }
//------------------------------------------------------------------------------
}
