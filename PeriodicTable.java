import java.awt.*;
import java.util.*;

// draws circles, element text, legend, e.t.c

public class PeriodicTable {
  Element current = Element.valueOf("Hydrogen"); // element for the variable named "current"
  ElementTile tile = new ElementTile(current, Const.FRAME_WIDTH*4/5, Const.FRAME_HEIGHT/8, 350);
  PlanetaryModel planetaryModel = new PlanetaryModel(current, Const.FRAME_WIDTH*13/16, Const.FRAME_HEIGHT*3/5, 300); 
  // Planetary Model: need to make button thing for each element that switches model (element rect already made here (line 27)(default is hydrogen))
  int fontSize = Const.ELEMENT_FONT_SIZE;
  final int circleSize = Const.ELEMENT_SIZE;
  final int elementSpace = Const.ELEMENT_SPACE;
  final int XSpace = Const.X_SPACE;
  final int YSpace = Const.Y_SPACE;
  private int tableType = 0;
  private int newType = 0;

  Color purple = Const.PURPLE;
  Color pink = Const.PINK; 
  Color orange = Const.ORANGE;
  Color daniel = Const.DANIEL; // lighter orange (alkaline earth metals)
  Color lime = Const.LIME;
  Color cyan = Const.CYAN;
  Color blue = Const.BLUE;
  Color brown = Const.BROWN;
  Color red = Const.RED;

  ArrayList<Rectangle> tiles = new ArrayList<>();
  
//------------------------------------------------------------------------------
  PeriodicTable(){  
  }
//------------------------------------------------------------------------------  
  public void draw(Graphics g) {
    // elements
    if(newType != tableType){
      tableType = newType;
    }
    Element[] elements = Element.values();
    for (int i=0;i<elements.length;i++){
      int group = elements[i].getGroup();
      int period = elements[i].getPeriod();
      g.setColor(red);
      boolean fConfig = false;
      switch(elements[i].getType()){
        case "Alkali Metal": g.setColor(orange); break;
        case "Alkaline Earth Metal": g.setColor(daniel); break;
        case "Noble Gas": g.setColor(purple); break;
        case "Metal": g.setColor(blue); break;
        case "Transition Metal": g.setColor(red); break;
        case "Metalloid": g.setColor(cyan); break;
        case "Nonmetal": g.setColor(lime); break;
        case "Halogen": g.setColor(Color.GREEN); break;
        case "Lanthanide": g.setColor(brown); break;
        case "Actinide": g.setColor(pink); break;
        case "Unknown": g.setColor(Color.GRAY); break;
      }
      if(i > 55 && i < 71){
        period+=3;
        group = i-55+2;
        fConfig = true;
      }
      if(i > 87 && i < 103){
        period+=3;
        group = i-87+2;
        fConfig = true;
      }
      g.fillOval(XSpace + (group-1)*elementSpace, YSpace + (period-1)*elementSpace, circleSize, circleSize);
      tiles.add(new Rectangle(XSpace + (group-1)*elementSpace, YSpace + (period-1)*elementSpace, elementSpace, elementSpace));
      g.setColor(Color.BLACK);
      int adjustX = 0;
      int adjustX2 = 0;
      int adjustX3 = 0;
      adjustX = ((elements[i].getAtomicNum()+"").length()-1)*fontSize/4;
      adjustX2 = ((elements[i].getSymbol()+"").length()-1)*fontSize/3;
      int formattingAtomicNumX = (int)Math.pow(2,(3-Integer.toString(elements[i].getAtomicNum()).length()));
      int formattingAtomicNumY = 4;
      int formattingSymbolX = 4;
      if(tableType == 0){
        g.setFont(FontLoader.getFont(fontSize));
        g.drawString(elements[i].getAtomicNum()+"", XSpace + (group-1)*elementSpace + circleSize/3 - adjustX + formattingAtomicNumX, YSpace + (period-1)*elementSpace + circleSize/3 + formattingAtomicNumY);
        g.drawString(elements[i].getSymbol(), XSpace + (group-1)*elementSpace + circleSize/3 - adjustX2 + formattingSymbolX, YSpace + (period-1)*elementSpace + circleSize*3/4);
      }else if(tableType == 1){
        g.setFont(FontLoader.getFont(fontSize));
        g.drawString(elements[i].getSymbol(), XSpace + (group-1)*elementSpace + circleSize/3 - adjustX2 + formattingSymbolX, YSpace + (period-1)*elementSpace + circleSize*3/4 - 8);
        int chargeIndex = 0;
        g.setFont(FontLoader.getFont(fontSize - 5));
        for(String charge: elements[i].getCharges()){
          if (elements[i].getSymbol().length() == 1) {
            g.drawString(charge, XSpace + (group-1)*elementSpace + circleSize/3 - adjustX2 + formattingSymbolX - 15 + chargeIndex * 30, YSpace + (period-1)*elementSpace + circleSize*3/4 - 23);
          } else { 
            g.drawString(charge, XSpace + (group-1)*elementSpace + circleSize/3 - adjustX2 + formattingSymbolX - 10 + chargeIndex * 30, YSpace + (period-1)*elementSpace + circleSize*3/4 - 23);
          }
          chargeIndex++;
        }
      }else if(tableType == 2){
        g.setFont(FontLoader.getFont(fontSize + 2));
        int energyLevel = period;
        char subshell = 's';
        int orbital = group;
        if (group >= 3 && group <= 12 && (!fConfig || group == 3)){
          energyLevel--;
          orbital = group - 2;
          subshell = Const.SUBSHELLS.get(2);
          if(group == 3){
            energyLevel -= 3;
          }
        }else if(group > 12 && group <= 18 && !fConfig){
          subshell = Const.SUBSHELLS.get(1);
          orbital = group - 12;
        }else if (fConfig){
          subshell = 'f';
          energyLevel = energyLevel - 5;
          orbital = group - 3;
        }
        if (Integer.toString(energyLevel).length() + 1 + Integer.toString(orbital).length() == 3) {
          adjustX3 = 6;
        } else if (Integer.toString(energyLevel).length() + 1 + Integer.toString(orbital).length() == 4) {
          adjustX3 = 11;
        }
        g.drawString((energyLevel + "" + subshell), XSpace + (group-1)*elementSpace + circleSize/3 - adjustX3 - 2, YSpace + (period-1)*elementSpace + circleSize/3 + 16);
        g.setFont(FontLoader.getFont(fontSize - 4));
        g.drawString("" + orbital, XSpace + (group-1)*elementSpace + circleSize/3 - adjustX3 + 25, YSpace + (period-1)*elementSpace + circleSize/3 + 6);
      }
    
    g.setFont(FontLoader.getFont(fontSize));
    g.setColor(orange);
    g.fillOval(XSpace + (elementSpace)*2 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*0, circleSize/3, circleSize/3);
    g.setColor(daniel);
    g.fillOval(XSpace + (elementSpace)*2 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*1, circleSize/3, circleSize/3);
    g.setColor(purple);
    g.fillOval(XSpace + (elementSpace)*2 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*2, circleSize/3, circleSize/3);
    g.setColor(blue);
    g.fillOval(XSpace + (elementSpace)*6 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*0, circleSize/3, circleSize/3);
    g.setColor(Color.RED);
    g.fillOval(XSpace + (elementSpace)*6 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*1, circleSize/3, circleSize/3);
    g.setColor(cyan);
    g.fillOval(XSpace + (elementSpace)*6 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*2, circleSize/3, circleSize/3);

    g.setColor(Color.BLACK);
    g.drawString("Alkali Metal", XSpace + (elementSpace)*2 + 5 + circleSize/2, Const.FRAME_HEIGHT - 155 + (elementSpace/2)*0 + circleSize/4);
    g.drawString("Alkaline Earth Metal", XSpace + (elementSpace)*2 + 5 + circleSize/2, Const.FRAME_HEIGHT - 155 + (elementSpace/2)*1 + circleSize/4);
    g.drawString("Noble Gas", XSpace + (elementSpace)*2 + 5 + circleSize/2, Const.FRAME_HEIGHT - 155 + (elementSpace/2)*2 + circleSize/4);
    g.drawString("Post-Transition Metal", XSpace + (elementSpace)*6 + 5 + circleSize/2, Const.FRAME_HEIGHT - 155 + (elementSpace/2)*0 + circleSize/4);
    g.drawString("Transition Metal", XSpace + (elementSpace)*6 + 5 + circleSize/2, Const.FRAME_HEIGHT - 155 + (elementSpace/2)*1 + circleSize/4);
    g.drawString("Metalloid", XSpace + (elementSpace)*6 + 5 + circleSize/2, Const.FRAME_HEIGHT - 155 + (elementSpace/2)*2 + circleSize/4);


    g.setColor(lime);
    g.fillOval(XSpace + (elementSpace)*10 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*0, circleSize/3, circleSize/3);
    g.setColor(Color.GREEN);
    g.fillOval(XSpace + (elementSpace)*10 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*1, circleSize/3, circleSize/3);
    g.setColor(brown);
    g.fillOval(XSpace + (elementSpace)*10 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*2, circleSize/3, circleSize/3);
    g.setColor(pink);
    g.fillOval(XSpace + (elementSpace)*14 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*0, circleSize/3, circleSize/3);
    g.setColor(Color.GRAY);
    g.fillOval(XSpace + (elementSpace)*14 + 5, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*1, circleSize/3, circleSize/3);
    
    g.setColor(Color.BLACK);
    g.drawString("Reactive Non-Metal", XSpace + (elementSpace)*10 + 5 + circleSize/2, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*0 + circleSize/4);
    g.drawString("Halogen", XSpace + (elementSpace)*10 + 5 + circleSize/2, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*1 + circleSize/4);
    g.drawString("Lanthanide", XSpace + (elementSpace)*10 + 5 + circleSize/2, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*2 + circleSize/4);
    g.drawString("Actinide", XSpace + (elementSpace)*14 + 5 + circleSize/2, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*0 + circleSize/4);
    g.drawString("Unknown", XSpace + (elementSpace)*14 + 5 + circleSize/2, Const.FRAME_HEIGHT - 156 + (elementSpace/2)*1 + circleSize/4);
    // planetry model
    planetaryModel.draw(g);
    if(!tile.getFlip()){
      tile.draw(g);
    } else {
      tile.draw(current, g);
    }
  }
  }
  public void switchElement(Mouse.Click click){
    try {
      int i = 0;
    for (Rectangle elementTile: this.tiles) {
      if (elementTile.contains(click)) {
          current = Element.values()[i];
          tile = new ElementTile(current, Const.FRAME_WIDTH*4/5, Const.FRAME_HEIGHT/8, 350);
          planetaryModel = new PlanetaryModel(current, Const.FRAME_WIDTH*13/16, Const.FRAME_HEIGHT*3/5, 300);
          break;
      }
      i++;
    }
    } catch (Exception e) {
    }
  }
  public void flipTile(Mouse.Click click){
    if(tile.getRect().contains(click)){
      tile.flip();
    }
  }
  public void changeTableType(int newType){
    this.newType = newType;
  }
}