import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.Math.*;

public class PeriodicTable {
  
  int fontSize = Const.ELEMENT_FONT_SIZE;
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
    // elements
    Element[] elements = Element.values();
    for (int i=0;i<elements.length;i++){
      int group = elements[i].getGroup();
      int period = elements[i].getPeriod();
      g.setColor(Color.RED);
      switch(elements[i].getType()){
        case "Alkali Metal": g.setColor(orange); break;
        case "Alkaline Earth Metal": g.setColor(daniel); break;
        case "Noble Gas": g.setColor(purple); break;
        case "Metal": g.setColor(blue); break;
        case "Transition Metal": g.setColor(Color.RED); break;
        case "Metalloid": g.setColor(cyan); break;
        case "Nonmetal": g.setColor(lime); break;
        case "Halogen": g.setColor(Color.GREEN); break;
        case "Lanthanide": g.setColor(brown); break;
        case "Actinide": g.setColor(purple); break;
        case "Unknown": g.setColor(Color.GRAY); break;
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
      g.setFont(FontLoader.getFont(fontSize));
      g.setColor(Color.BLACK);
      if (elements[i].getType().equals("Transition Metal")) {
        g.setColor(Color.WHITE);
      }
      int adjustX = 0;
      int adjustX2 = 0;
      adjustX = ((elements[i].getAtomicNum()+"").length()-1)*fontSize/4;
      adjustX2 = ((elements[i].getSymbol()+"").length()-1)*fontSize/3;
      int formattingAtomicNumX = (int)Math.pow(2,(3-Integer.toString(elements[i].getAtomicNum()).length()));
      int formattingAtomicNumY = 4;
      int formattingSymbolX = 4;
      g.drawString(elements[i].getAtomicNum()+"", XSpace + (group-1)*elementSpace + circleSize/3 - adjustX + formattingAtomicNumX, YSpace + (period-1)*elementSpace + circleSize/3 + formattingAtomicNumY);
      g.drawString(elements[i].getSymbol(), XSpace + (group-1)*elementSpace + circleSize/3 - adjustX2 + formattingSymbolX, YSpace + (period-1)*elementSpace + circleSize*3/4);
    }
    // element legend
    g.setColor(orange);
    g.fillOval(XSpace + (elementSpace)*3, YSpace + (elementSpace/2)*0, circleSize/3, circleSize/3);
    g.setColor(daniel);
    g.fillOval(XSpace + (elementSpace)*3, YSpace + (elementSpace/2)*1, circleSize/3, circleSize/3);
    g.setColor(purple);
    g.fillOval(XSpace + (elementSpace)*3, YSpace + (elementSpace/2)*2, circleSize/3, circleSize/3);
    g.setColor(blue);
    g.fillOval(XSpace + (elementSpace)*3, YSpace + (elementSpace/2)*3, circleSize/3, circleSize/3);
    g.setColor(Color.RED);
    g.fillOval(XSpace + (elementSpace)*3, YSpace + (elementSpace/2)*4, circleSize/3, circleSize/3);
    g.setColor(cyan);
    g.fillOval(XSpace + (elementSpace)*3, YSpace + (elementSpace/2)*5, circleSize/3, circleSize/3);
    
    g.setColor(Color.BLACK);
    g.drawString("Alkali Metal", XSpace + (elementSpace)*3 + circleSize/2, YSpace + (elementSpace/2)*0 + circleSize/4);
    g.drawString("Alkaline Earth Metal", XSpace + (elementSpace)*3 + circleSize/2, YSpace + (elementSpace/2)*1 + circleSize/4);
    g.drawString("Noble Gas", XSpace + (elementSpace)*3 + circleSize/2, YSpace + (elementSpace/2)*2 + circleSize/4);
    g.drawString("Post-Transition Metal", XSpace + (elementSpace)*3 + circleSize/2, YSpace + (elementSpace/2)*3 + circleSize/4);
    g.drawString("Transition Metal", XSpace + (elementSpace)*3 + circleSize/2, YSpace + (elementSpace/2)*4 + circleSize/4);
    g.drawString("Metalloid", XSpace + (elementSpace)*3 + circleSize/2, YSpace + (elementSpace/2)*5 + circleSize/4);


    g.setColor(lime);
    g.fillOval(XSpace + (elementSpace)*7, YSpace + (elementSpace/2)*0, circleSize/3, circleSize/3);
    g.setColor(Color.GREEN);
    g.fillOval(XSpace + (elementSpace)*7, YSpace + (elementSpace/2)*1, circleSize/3, circleSize/3);
    g.setColor(brown);
    g.fillOval(XSpace + (elementSpace)*7, YSpace + (elementSpace/2)*2, circleSize/3, circleSize/3);
    g.setColor(purple);
    g.fillOval(XSpace + (elementSpace)*7, YSpace + (elementSpace/2)*3, circleSize/3, circleSize/3);
    g.setColor(Color.GRAY);
    g.fillOval(XSpace + (elementSpace)*7, YSpace + (elementSpace/2)*4, circleSize/3, circleSize/3);
    
    g.setColor(Color.BLACK);
    g.drawString("Reactive Non-Metal", XSpace + (elementSpace)*7 + circleSize/2, YSpace + (elementSpace/2)*0 + circleSize/4);
    g.drawString("Halogen", XSpace + (elementSpace)*7 + circleSize/2, YSpace + (elementSpace/2)*1 + circleSize/4);
    g.drawString("Lanthanide", XSpace + (elementSpace)*7 + circleSize/2, YSpace + (elementSpace/2)*2 + circleSize/4);
    g.drawString("Actinide", XSpace + (elementSpace)*7 + circleSize/2, YSpace + (elementSpace/2)*3 + circleSize/4);
    g.drawString("Unknown", XSpace + (elementSpace)*7 + circleSize/2, YSpace + (elementSpace/2)*4 + circleSize/4);
  }
//------------------------------------------------------------------------------
}