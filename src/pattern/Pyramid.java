package pattern;

public class Pyramid {

    private int rows;
    public Pyramid(int rows) {
        this.rows = rows;
    }

    public void print() {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
