package paintbrush;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private Shape currentShape;

    private Color currentColor = Color.BLACK;
    private String currentTool = "Line"; // Line, Rectangle, Oval

    private boolean filled = false;
    private boolean dotted = false;

    public DrawingPanel() {
        setBackground(Color.WHITE);

        MouseAdapter mouseHandler = new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                switch (currentTool) {
                    case "Line":
                        currentShape = new Line(x, y, x, y, currentColor, filled, dotted);
                        break;
                    case "Rectangle":
                        currentShape = new Rectangle(x, y, x, y, currentColor, filled, dotted);
                        break;
                    case "Oval":
                        currentShape = new Oval(x, y, x, y, currentColor, filled, dotted);
                        break;
                }

                if (currentShape != null) {
                    shapes.add(currentShape);
                }
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (currentShape != null) {
                    currentShape.x2 = e.getX();
                    currentShape.y2 = e.getY();
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                currentShape = null;
            }
        };

        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
    }

    // setters from buttons / UI
    public void setCurrentColor(Color color) {
        this.currentColor = color;
    }

    public void setCurrentTool(String tool) {
        this.currentTool = tool;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setDotted(boolean dotted) {
        this.dotted = dotted;
    }

    public void clear() {
        shapes.clear();
        repaint();
    }
}