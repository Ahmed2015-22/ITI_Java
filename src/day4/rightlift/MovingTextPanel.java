package day4.rightlift;

import javax.swing.*;
import java.awt.*;

public class MovingTextPanel extends JPanel {

    private int x = 0;
    private final int y = 100;
    private final String text = "Hello Java OOP";
    private int direction = 1; // 1 يمين, -1 شمال

    public void moveText() {
        x += direction * 5;

        int textWidth = getFontMetrics(getFont()).stringWidth(text);

        if (x + textWidth >= getWidth()) {
            direction = -1;
        } else if (x <= 0) {
            direction = 1;
        }

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString(text, x, y);
    }
}

