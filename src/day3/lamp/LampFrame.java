package day3.lamp;

import javax.swing.*;

public class LampFrame extends JFrame {

    public LampFrame() {
        setTitle("Lamp Drawing");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new LampPanel());

        setVisible(true);
    }
}
