import java.awt.*;

// aka bohr-rutherford diagram

public class PlanetaryModel {
    private int shells;
    private int[] shellConfig;
    private int protonNum;
    private int neutronNum;
    private int electrons;
    private int x;
    private int y;
    private int size;
    private int elecSize;
    private int[] fillOrder;
    private boolean configurated;

    PlanetaryModel(Element element, int x, int y, int size){ // Planetary Model for element
        this.shells = Integer.parseInt(element.getNumShells());
        this.protonNum = Integer.parseInt(element.getProtonNum());
        this.neutronNum = Integer.parseInt(element.getNeutronNum());
        this.electrons = Integer.parseInt(element.getElectronNum());
        this.x = x;
        this.y = y;
        this.size = size;
        this.elecSize = size/30;
        this.fillOrder = Const.ELECTRON_FILL_ORDER;
        this.shellConfig = new int[shells];
    }

    private void findShellConfig(){
        int[] shellCount = new int[7];
        if(protonNum != 46){
            for(int i=0;electrons > 0;i++){
                shellCount[fillOrder[i]]++;
                int subshell = shellCount[fillOrder[i]]*4 - 2;
                if(electrons <= subshell){
                    shellConfig[fillOrder[i]] += electrons;
                    electrons = 0;
                } else {
                    shellConfig[fillOrder[i]] += subshell;
                    electrons -= subshell;
                }
            }
        }
        if(this.protonNum == 29){
            shellConfig[3]--;
            shellConfig[2]++;
        } else if(this.protonNum == 47){
            shellConfig[4]--;
            shellConfig[3]++;
        } else if(this.protonNum == 79){
            shellConfig[5]--;
            shellConfig[4]++;
        } else if(this.protonNum == 46){
            shellConfig = new int[]{2, 8, 18, 18};
        } else if(this.protonNum == 24){
            shellConfig[3]--;
            shellConfig[2]++;
        } else if(this.protonNum == 42){
            shellConfig[4]--;
            shellConfig[3]++;
        }
    }

    public void draw(Graphics g){
        if(!configurated){
            this.findShellConfig();
            configurated = true;
        }
        g.setColor(Color.YELLOW);
        g.fillOval(x + size*3/8, y + size*3/8, size/4, size/4);
        g.setColor(Color.BLACK);
        g.drawOval(x + size*3/8, y + size*3/8, size/4, size/4);
        g.setFont(FontLoader.getFont(size/12));
        int adjustXP = ((protonNum+"").length()-1) * size/40 - 3;
        int adjustXN = ((neutronNum+"").length()-1) * size/40 - 3;
        g.drawString(protonNum + "P", x + size*7/16 - adjustXP, y + size*8/16 -1);
        g.drawString(neutronNum + "N", x + size*7/16 - adjustXN, y + size*9/16 - 1);
        // insert protons and neutrons
        g.setColor(Color.BLACK);
        for(int i=0;i<shells;i++){
            int shellSize = size*(3+i)/8;
            g.drawOval(x + size*(5-i)/16, y + size*(5-i)/16, shellSize, shellSize);
            int degrees = 360/shellConfig[i];
            for(int j=0;j<shellConfig[i];j++){
                int currentDeg = degrees*j - 90;
                int elecX = (int)(shellSize * Math.cos(currentDeg*Math.PI/180)/2 + x + size/2);
                int elecY = (int)(shellSize * Math.sin(currentDeg*Math.PI/180)/2 + y + size/2);
                g.fillOval(elecX-(elecSize/2), elecY-(elecSize/2), elecSize, elecSize);
            }
        }
    }
}
