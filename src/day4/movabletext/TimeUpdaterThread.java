package day4.movabletext;

import javax.swing.*;

public class TimeUpdaterThread extends Thread {

    private JLabel label;
    private DateTimeService dateTimeService;
    private boolean running = true;

    public TimeUpdaterThread(JLabel label, DateTimeService dateTimeService) {
        this.label = label;
        this.dateTimeService = dateTimeService;
    }

    @Override
    public void run() {
        while (running) {
            try {
                SwingUtilities.invokeLater(() ->
                        label.setText(dateTimeService.getCurrentDateTime())
                );

                Thread.sleep(1000); // تحديث كل ثانية

            } catch (InterruptedException e) {
                running = false;
            }
        }
    }

    public void stopThread() {
        running = false;
    }
}
