package day5.direction;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovePanel extends JPanel implements KeyListener {

    private int x = 250;
    private int y = 150;
    private final int STEP = 10;
    private final String text = "Hello Java";

    public MovePanel() {
        setBackground(Color.CYAN);
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLACK);
        g.drawString(text, x, y);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y -= STEP;
                break;
            case KeyEvent.VK_DOWN:
                y += STEP;
                break;
            case KeyEvent.VK_LEFT:
                x -= STEP;
                break;
            case KeyEvent.VK_RIGHT:
                x += STEP;
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
