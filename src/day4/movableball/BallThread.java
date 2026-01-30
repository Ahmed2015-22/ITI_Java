package day4.movableball;

public class BallThread extends Thread {

    private BallPanel panel;
    private boolean running = true;

    public BallThread(BallPanel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        while (running) {
            try {
                panel.updateBall();
                Thread.sleep(20); // سرعة الحركة
            } catch (InterruptedException e) {
                running = false;
            }
        }
    }
}
