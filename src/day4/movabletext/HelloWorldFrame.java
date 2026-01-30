package day4.movabletext;

import javax.swing.*;
import java.awt.*;

public class HelloWorldFrame extends JFrame {

    private JLabel dateLabel;
    private DateTimeService dateTimeService;
    private TimeUpdaterThread timeThread;

    public HelloWorldFrame() {
        dateTimeService = new DateTimeService();
        initializeFrame();
        initializeComponents();
        startTimeThread();
    }

    private void initializeFrame() {
        setTitle("Hello World Frame");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        setLayout(new BorderLayout());
    }

    private void initializeComponents() {
        dateLabel = new JLabel("", SwingConstants.CENTER);
        dateLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(dateLabel, BorderLayout.CENTER);
    }

    private void startTimeThread() {
        timeThread = new TimeUpdaterThread(dateLabel, dateTimeService);
        timeThread.start();
    }
}
