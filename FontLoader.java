import java.io.*;
import java.awt.*;

// Class for loading and storing fonts
public class FontLoader {
    private static final String FONT_PATH = "assets/monospace.medium.ttf";
    
    private static Font font = loadFont();
    private static Font[] fonts = new Font[100];
    private static Font loadFont() {
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(FONT_PATH));
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
    // Each font size only needs to be loaded once
    public static Font getFont(int size) {
        if (fonts[size - 1] == null) {
            fonts[size - 1] = font.deriveFont((float)size);
        }
        return fonts[size - 1];
    }
}