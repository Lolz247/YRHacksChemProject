import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
// possible exceptions
import java.io.IOException;

public class Background{
    private int x, y, width, height;
    private BufferedImage bgPic;
  
//------------------------------------------------------------------------------     
    Background(String picName, int x, int y){
        this.x = x;
        this.y = y;
        try {                
            this.bgPic = ImageIO.read(new File(picName));
        } catch (IOException ex){}
    }
    public void draw(Graphics g){
        g.drawImage(this.bgPic, this.x, this.y, null);
    }
}