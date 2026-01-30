package day4.rightlift;

public class TextMoverThread extends Thread {

    private MovingTextPanel panel;
    private boolean running = true;

    public TextMoverThread(MovingTextPanel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        while (running) {
            try {
                panel.moveText();
                Thread.sleep(30); // سرعة الحركة
            } catch (InterruptedException e) {
                running = false;
            }
        }
    }
}

