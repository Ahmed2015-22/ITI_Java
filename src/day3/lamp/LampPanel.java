package day3.lamp;

import javax.swing.*;
import java.awt.*;

public class LampPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));

        g2.setColor(Color.YELLOW);
        g2.fillOval(100, 50, 300, 60);   // الجزء العلوي

        g2.setColor(Color.BLACK);
        g2.drawOval(100, 50, 300, 60);

        g2.drawLine(120, 110, 80, 260);
        g2.drawLine(380, 110, 420, 260);
        g2.drawOval(80, 240, 340, 40);

        g2.setColor(Color.YELLOW);
        g2.fillOval(200, 140, 100, 140);   // الوسطى
        g2.fillOval(120, 160, 60, 100);    // اليسار
        g2.fillOval(320, 160, 60, 100);    // اليمين

        g2.setColor(Color.BLACK);
        g2.drawOval(200, 140, 100, 140);
        g2.drawOval(120, 160, 60, 100);
        g2.drawOval(320, 160, 60, 100);


        g2.drawLine(230, 280, 200, 360);
        g2.drawLine(270, 280, 300, 360);


        g2.drawRect(160, 360, 180, 30);
    }
}
