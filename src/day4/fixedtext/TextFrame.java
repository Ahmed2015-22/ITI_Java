package day4.fixedtext;
import day4.fixedtext.DateTime;

import javax.swing.*;
import java.awt.*;




public class TextFrame extends JFrame {

    private JLabel dateLabel;
    private DateTime dateTimeService;

    public TextFrame() {
        dateTimeService = new DateTime();
        initializeFrame();
        initializeComponents();
    }

    private void initializeFrame() {
        setTitle("Hello World Frame");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center screen
        getContentPane().setBackground(Color.CYAN);
        setLayout(new BorderLayout());
    }

    private void initializeComponents() {
        dateLabel = new JLabel(dateTimeService.getCurrentDateTime());
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dateLabel.setFont(new Font("Arial", Font.BOLD, 16));

        add(dateLabel, BorderLayout.CENTER);
    }
}

