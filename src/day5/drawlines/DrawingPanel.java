package day5.drawlines;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {

    private ArrayList<Line> lines = new ArrayList<>();

    private int startX, startY, currentX, currentY;
    private boolean drawing;

    public DrawingPanel() {
        setBackground(Color.CYAN);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
                currentX = startX;
                currentY = startY;
                drawing = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                drawing = false;

                lines.add(new Line(startX, startY, currentX, currentY));
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (drawing) {
                    currentX = e.getX();
                    currentY = e.getY();
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);

        for (Line line : lines) {
            g.drawLine(
                    line.getX1(), line.getY1(),
                    line.getX2(), line.getY2()
            );
        }

        if (drawing) {
            g.drawLine(startX, startY, currentX, currentY);
        }
    }
}

