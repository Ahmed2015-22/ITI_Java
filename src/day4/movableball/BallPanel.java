package day4.movableball;

import javax.swing.*;
import java.awt.*;

public class BallPanel extends JPanel {

    private Ball ball;

    public BallPanel() {
        ball = new Ball(50, 50, 30);
        setBackground(Color.WHITE);
    }

    public void updateBall() {
        ball.move();

        if (ball.x <= 0 || ball.x + ball.diameter >= getWidth()) {
            ball.reverseX();
        }

        if (ball.y <= 0 || ball.y + ball.diameter >= getHeight()) {
            ball.reverseY();
        }

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(ball.x, ball.y, ball.diameter, ball.diameter);
    }
}

