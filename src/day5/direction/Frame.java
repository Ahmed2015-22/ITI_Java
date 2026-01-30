package day5.direction;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        setTitle("Hello World Frame");
        setSize(600, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        MovePanel panel = new MovePanel();
        add(panel);

        setVisible(true);
    }
}
