package day4.rightlift;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private MovingTextPanel panel;

    public MainFrame() {
        setTitle("Moving Text");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new MovingTextPanel();
        panel.setBackground(Color.CYAN);

        add(panel, BorderLayout.CENTER);

        new TextMoverThread(panel).start();
    }
}
