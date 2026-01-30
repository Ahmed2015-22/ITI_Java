package day5.updown;

import javax.swing.*;
import java.awt.*;

public class CounterFrame extends JFrame {

    private int counter = 0;
    private JLabel counterLabel;

    public CounterFrame() {
        setTitle("Counter Frame");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);

        counterLabel = new JLabel("x = " + counter);
        counterLabel.setFont(new Font("Arial", Font.BOLD, 18));
        counterLabel.setBounds(30, 120, 100, 30);

        JButton incButton = new JButton("+");
        incButton.setBounds(140, 30, 60, 30);

        JButton decButton = new JButton("-");
        decButton.setBounds(210, 30, 60, 30);

        // ✅ Lambda Expressions
        incButton.addActionListener(e -> {
            counter++;
            updateLabel();
        });

        decButton.addActionListener(e -> {
            counter--;
            updateLabel();
        });

        panel.add(counterLabel);
        panel.add(incButton);
        panel.add(decButton);

        add(panel);
    }

    private void updateLabel() {
        counterLabel.setText("x = " + counter);
    }
}

