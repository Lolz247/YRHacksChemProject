import java.awt.*;

public class CompoundCalculator {
    //private NameKeyListener keyListener = new NameKeyListener();
    private Rectangle textBox;
    private int textBoxSize;
    private int fontSize;
    private boolean typing;
    private String text;

    CompoundCalculator(){
        textBoxSize = Const.TEXTBOX_SIZE;
        fontSize = Const.FONT_SIZE;
        textBox = new Rectangle(Const.FRAME_WIDTH/2 - textBoxSize/2, Const.FRAME_HEIGHT/4 + fontSize, textBoxSize, fontSize*2);
        text = "";
    }

    public void enterTextBox(Mouse.Click click){
        if(this.textBox.contains(click)){
            this.typing = true;
        }
    }

    public void exitTextBox(Mouse.Click click){
        if(!this.textBox.contains(click) || (this.textBox.contains(click) && this.typing)){
            this.typing = false;
        }
    }

    public void type(char key){
        if(typing){
            if(key != '\b' && text.length() < 16){
                text+=key;
            } else if(text.length() > 0 && key == '\b') {
                text = text.substring(0, text.length()-1);
            }
        }
    }

    public String findCompound(String compound){
        String alphabet = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        try{
            String[] elements = compound.split(" ");
            int num1 = 1;
            int num2 = 1;
            if(!alphabet.contains(elements[0].charAt(elements[0].length()-1)+"")){
                num1 = Integer.parseInt(elements[0].charAt(elements[0].length()-1)+"");
                elements[0] = elements[0].substring(0, elements[0].length()-1);
            }
            if(!alphabet.contains(elements[1].charAt(elements[1].length()-1)+"")){
                num2 = Integer.parseInt(elements[1].charAt(elements[1].length()-1)+"");
                elements[1] = elements[1].substring(0, elements[1].length()-1);
            }
            Element el1 = Element.valueOf(elements[0]);
            Element el2 = Element.valueOf(elements[1]);
            int charge1 = 0;
            int charge2 = 0;
            if(el1.getCharges().length >= 1){
                charge1 = Integer.parseInt(el1.getCharges()[0]);
            } else {
                return "Element/Compound does not exist."; 
            }
            if(el2.getCharges().length >= 1){
                charge2 = Integer.parseInt(el2.getCharges()[0]);
            } else {
                return "Element/Compound does not exist.";
            }

            if(charge1 < 0 && charge2 < 0){

            }
        } catch (Exception e) {
            return "Element/Compound does not exist.";
        }
        return null;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.setFont(FontLoader.getFont(fontSize + 7));
        g.drawRect(textBox.x, textBox.y, textBox.width, textBox.height);
        g.drawString(text, textBox.x + 4, textBox.y + 2 * textBox.height / 3);
    }
}