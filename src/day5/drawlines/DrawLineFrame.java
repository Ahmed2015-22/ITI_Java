package day5.drawlines;

import javax.swing.*;

public class DrawLineFrame extends JFrame {

    public DrawLineFrame() {
        setTitle("Draw Multiple Lines");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new DrawingPanel());
    }
}

