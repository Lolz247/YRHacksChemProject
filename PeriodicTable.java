import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PeriodicTable {
  
  boolean escpressed;
  final int circleSize = Const.ELEMENT_SIZE;
  final int elementSpace = Const.ELEMENT_SPACE;
  final int XSpace = Const.X_SPACE;
  final int YSpace = Const.Y_SPACE;

  Color purple = Const.PURPLE;
  Color pink = Const.PINK; 
  Color orange = Const.ORANGE;
  Color daniel = Const.DANIEL;
  Color lime = Const.LIME;
  Color cyan = Const.CYAN;
  Color blue = Const.BLUE;
  Color brown = Const.BROWN;

  ArrayList<JButton> buttons = new ArrayList<>();
  
//------------------------------------------------------------------------------
  PeriodicTable(){  
  }
//------------------------------------------------------------------------------  
  //main game loop
  public void run(){
    // code (while loop)
    while (true) {
    }
  }
  public void draw(Graphics g) {
    Element[] elements = Element.values();
    for (int i=0;i<elements.length;i++){ //what is this
      int group = elements[i].getGroup();
      int period = elements[i].getPeriod();
      g.setColor(Color.RED);
      switch(elements[i].getType()){
        case "Akali Metal": g.setColor(orange); break;
        case "Alkaline Earth Metal": g.setColor(daniel); break;
        case "Noble Gas": g.setColor(purple); break;
        case "Metal": g.setColor(blue); break;
        case "Transition Metal": g.setColor(Color.RED); break;
        case "Metalloid": g.setColor(cyan); break;
        case "Nonmetal": g.setColor(lime); break;
        case "Halogen": g.setColor(Color.GREEN); break;
        case "Lanthanide": g.setColor(brown); break;
        case "Actinide": g.setColor(purple); break;
        case "Transactinide": g.setColor(Color.GRAY); break;
      }
      if(i > 55 && i < 71){
        period+=3;
        group = i-55+2;
      }
      if(i > 87 && i < 103){
        period+=3;
        group = i-87+2;
      }
      g.fillOval(XSpace + (group-1)*elementSpace, YSpace + (period-1)*elementSpace, circleSize, circleSize);
    }
  }
//------------------------------------------------------------------------------
}