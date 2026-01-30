package paintbrush;

import java.awt.*;

public abstract class Shape {
    protected int x1, y1, x2, y2;
    protected Color color;
    protected boolean filled;
    protected boolean dotted;
    public Shape(int x1, int y1, int x2, int y2, Color color, boolean filled, boolean dotted) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
        this.filled = filled;
        this.dotted = dotted;
    }
    public abstract void draw(Graphics g);
    public void update(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

}
