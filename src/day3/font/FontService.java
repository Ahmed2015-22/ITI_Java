package day3.font;

import java.awt.*;

public class FontService {

    public Font[] getAllFonts() {
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        return ge.getAllFonts();
    }
}
