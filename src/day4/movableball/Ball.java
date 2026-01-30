package day4.movableball;

public class Ball {

    int x, y;
    int diameter;
    int dx = 3; // السرعة الأفقية
    int dy = 3; // السرعة الرأسية

    public Ball(int x, int y, int diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void reverseX() {
        dx = -dx;
    }

    public void reverseY() {
        dy = -dy;
    }
}

