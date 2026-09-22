/*
 * Module 3.2 Programming Assignment
 * CSD-402 Java for Programmers
 *
 * This program uses nested for loops to display
 * a pyramid of powers of two with an @ symbol
 * at the end of each line.
 */

public class Module3 {

    public static void main(String[] args) {

        final int ROWS = 7;

        for (int row = 0; row < ROWS; row++) {

            for (int space = 0; space < ROWS - row - 1; space++) {
                System.out.print("   ");
            }

            int number = 1;

            for (int column = 0; column <= row; column++) {
                System.out.printf("%3d", number);
                number *= 2;
            }

            number /= 4;

            for (int column = row - 1; column >= 0; column--) {
                System.out.printf("%3d", number);
                number /= 2;
            }

            for (int space = 0; space < ROWS - row - 1; space++) {
                System.out.print("   ");
            }

            System.out.println(" @");
        }
    }
}