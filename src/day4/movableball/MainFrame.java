package day4.movableball;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Bouncing Ball");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        BallPanel panel = new BallPanel();
        add(panel);

        new BallThread(panel).start();
    }
}

