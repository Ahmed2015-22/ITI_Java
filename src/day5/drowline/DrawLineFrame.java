package day5.drowline;

import javax.swing.*;

public class DrawLineFrame extends JFrame {
    public DrawLineFrame() {
        setTitle("Hello World Frame");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new DrawingPanel());
    }

}
