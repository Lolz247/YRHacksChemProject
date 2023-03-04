import java.io.*;
import java.util.*;

// refer to class name (text to code converter)

public class TextToCodeConverter {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("ElementList.txt"));
        String code = new String();
        br.readLine();
        for(int i=0;i<118;i++){
            String str = br.readLine();
            String[] line = str.split(",", 28);
            for(int j=0;j<line.length;j++){
                if(line[j].length() == 0){
                    line[j] = "no";
                }
            }
            String atomicNum = line[0];
            String name = line[1];
            String symbol = line[2];
            String mass = line[3];
            String neutronNum = line[4];
            String protonNum = line[5];
            String electronNum = line[6];
            String period = line[7];
            String group = line[8];
            String phase = line[9];
            String radioactive = line[10];
            String natural = line[11];
            //String metal = line[12];
            //String nonMental = line[13];
            //String metalloid = line[14];
            String type = line[15];
            String radius = line[16];
            String eNeg = line[17];
            String firstIE = line[18];
            String density = line[19];
            String melting = line[20];
            String boiling = line[21];
            String numIsotopes = line[22];
            String discoverer = line[23];
            String year = line[24];
            String specHeat = line[25];
            String numShells = line[26];
            String numVal = line[27];
            if(i > 0){
                code = code + "\n";
            }
            code = code +   (name + "(\"" + atomicNum + "\", \"" + symbol + "\", \"" + mass + "\", \"" + neutronNum + "\", \"" + protonNum + "\", \"" + electronNum + "\", \"" + 
                            period + "\", \"" + group + "\", \"" + phase + "\", \"" + radioactive + "\", \"" + natural + "\", \"" + type + "\", \"" + radius + "\", \"" + 
                            eNeg + "\", \"" + firstIE + "\", \"" + density + "\", \"" + melting + "\", \"" + boiling + "\", \"" + numIsotopes + "\", \"" + discoverer + "\", \"" + 
                            year + "\", \"" + specHeat + "\", \"" + numShells + "\", \"" + numVal + "\"),");
        }
        System.out.println(code);
    }
}
