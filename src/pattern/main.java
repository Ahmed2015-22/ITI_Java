package pattern;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        Pyramid pyramid = new Pyramid(rows);
        pyramid.print();
    }
}
