import java.awt.*;

public class ElementTile {
    private String symbol;
    private String name;
    private int atomicNum;
    private int electrons;
    private String mass;
    private String type;
    private int[] shells;
    private int[] fillOrder;

    private int x;
    private int y;
    private int size;
    private Rectangle rect;

    private boolean flip;

    Color purple = Const.PURPLE;
    Color pink = Const.PINK; 
    Color orange = Const.ORANGE;
    Color daniel = Const.DANIEL;
    Color lime = Const.LIME;
    Color cyan = Const.CYAN;
    Color blue = Const.BLUE;
    Color brown = Const.BROWN;
    Color red = Const.RED;

    ElementTile(Element element, int x, int y, int size){ // Square element tile to be implemented into periodic table
        this.symbol = element.getSymbol();
        this.name = element.toString();
        this.atomicNum = element.getAtomicNum();
        this.electrons = Integer.parseInt(element.getElectronNum());
        this.mass = element.getMass();
        this.type = element.getType();
        this.shells = new int[element.getPeriod()];
        this.fillOrder = Const.ELECTRON_FILL_ORDER;

        this.x = x;
        this.y = y;
        this.size = size;
        this.rect = new Rectangle(x, y, size, size*5/4);
        findShellConfig();
    }
    private void findShellConfig(){
        int electrons = atomicNum;
        int[] shellCount = new int[7];
        for(int i=0;electrons > 0;i++){
            shellCount[fillOrder[i]]++;
            int subshell = shellCount[fillOrder[i]]*4 - 2;
            if(electrons <= subshell){
                shells[fillOrder[i]] += electrons;
                electrons = 0;
            } else {
                shells[fillOrder[i]] += subshell;
                electrons -= subshell;
            }
        }
        if(this.atomicNum == 29){
            shells[3]--;
            shells[2]++;
        } else if(this.atomicNum == 47){
            shells[4]--;
            shells[3]++;
        } else if(this.atomicNum == 79){
            shells[5]--;
            shells[4]++;
        } else if(this.atomicNum == 46){
            shells = new int[]{2, 8, 18, 18};
        } else if(this.atomicNum == 24){
            shells[3]--;
            shells[2]++;
        } else if(this.atomicNum == 42){
            shells[4]--;
            shells[3]++;
        }
    }

    public boolean getFlip(){
        return this.flip;
    }
    public void flip(){
        this.flip = !flip;
    }
    public Rectangle getRect() {
        return this.rect;
    }

    public void draw(Graphics g){
        switch(type){
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

        g.fillRect(x, y, size, size*5/4);
        g.setColor(Color.BLACK);
        g.setFont(FontLoader.getFont(size/4));
        g.drawString(symbol, x+size/12, y+size*2/3);
        g.drawString(atomicNum+"", x+size/12, y+size/5);
        g.setFont(FontLoader.getFont(size/10));
        g.drawString(name, x+size/12, y+size);
        g.setFont(FontLoader.getFont(size/8));
        g.drawString(mass, x+size/12, y+size*9/8);
        for(int i=0;i<shells.length;i++){
            g.drawString(shells[i]+"", x+size*5/6, y+size/6 + size*i/10);
        }
    }
    public void draw(Element element, Graphics g){
        switch(type){
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

        g.fillRect(x, y, size, size*5/4);
        g.setFont(FontLoader.getFont(size/20));
        g.setColor(Color.BLACK);
        g.setFont(FontLoader.getFont(size/12));
        g.drawString(symbol, x+size/12, y+size/8);
        g.setFont(FontLoader.getFont(size/16));
        g.drawString("Mass: " + mass, x+size/12, y+size/4);
        g.drawString("Radius: " + element.getRadius(), x+size/12, y+size*3/8);
        g.drawString("Electronegativity: " + element.getENeg(), x+size/12, y+size/2);
        g.drawString("Phase: " + element.getPhase(), x+size/12, y+size*5/8);
        g.drawString("Density: " + element.getDensity(), x+size/12, y+size*3/4);
        g.drawString("Melting Point: " + element.getMelting(), x+size/12, y+size*7/8);
        g.drawString("Boiling Point: " + element.getBoiling(), x+size/12, y+size);
    }
}
