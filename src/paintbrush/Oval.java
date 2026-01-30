package paintbrush;

import java.awt.*;

public class Oval extends Shape{
    public Oval(int x1, int y1, int x2, int y2, Color color, boolean filled, boolean dotted) {
        super(x1, y1, x2, y2, color, filled, dotted);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        if (dotted) {
            Graphics2D g2d = (Graphics2D) g;
            float[] dashPattern = {5, 5};
            g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_MITER, 10, dashPattern, 0));
        }
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        int topLeftX = Math.min(x1, x2);
        int topLeftY = Math.min(y1, y2);
        if (filled) {
            g.fillOval(topLeftX, topLeftY, width, height);
        } else {
            g.drawOval(topLeftX, topLeftY, width, height);
        }
    }
}
