package paintbrush;

import java.awt.*;

public class Line extends Shape {
    public Line(int x1, int y1, int x2, int y2, Color color, boolean filled, boolean dotted) {
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
        g.drawLine(x1, y1, x2, y2);
    }

}
