package day5.drowline;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingPanel extends JPanel {

    private int x1, y1, x2, y2;
    private boolean drawing;

    public DrawingPanel() {
        setBackground(Color.CYAN);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
                x2 = x1;
                y2 = y1;
                drawing = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                drawing = false;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (drawing) {
                    x2 = e.getX();
                    y2 = e.getY();
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x2, y2);
    }
}

