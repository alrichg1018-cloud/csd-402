/*
 * Module 5 Programming Assignment
 * CSD-402 Java for Programmers
 *
 * This program demonstrates methods that locate the largest
 * and smallest values in two-dimensional arrays.
 */

public class Module5 {

    /*
     * Returns the row and column location of the largest
     * value in a two-dimensional double array.
     */
    public static int[] locateLargest(double[][] arrayParam) {

        int row = 0;
        int column = 0;
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {

            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new int[] {row, column};
    }


    /*
     * Returns the row and column location of the largest
     * value in a two-dimensional integer array.
     */
    public static int[] locateLargest(int[][] arrayParam) {

        int row = 0;
        int column = 0;
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {

            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new int[] {row, column};
    }


    /*
     * Returns the row and column location of the smallest
     * value in a two-dimensional double array.
     */
    public static int[] locateSmallest(double[][] arrayParam) {

        int row = 0;
        int column = 0;
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {

            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new int[] {row, column};
    }


    /*
     * Returns the row and column location of the smallest
     * value in a two-dimensional integer array.
     */
    public static int[] locateSmallest(int[][] arrayParam) {

        int row = 0;
        int column = 0;
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {

            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new int[] {row, column};
    }


    public static void main(String[] args) {

        int[][] intArray = {
            {4, 7, 2},
            {9, 5, 1},
            {6, 3, 8}
        };

        double[][] doubleArray = {
            {4.5, 7.2, 2.1},
            {9.8, 5.4, 1.2},
            {6.6, 3.3, 8.7}
        };

        int[] intLargest = locateLargest(intArray);
        int[] intSmallest = locateSmallest(intArray);

        int[] doubleLargest = locateLargest(doubleArray);
        int[] doubleSmallest = locateSmallest(doubleArray);

        System.out.println("Integer Array:");
        System.out.println(
            "Largest element location: [" +
            intLargest[0] + "][" + intLargest[1] + "]"
        );

        System.out.println(
            "Smallest element location: [" +
            intSmallest[0] + "][" + intSmallest[1] + "]"
        );

        System.out.println();

        System.out.println("Double Array:");
        System.out.println(
            "Largest element location: [" +
            doubleLargest[0] + "][" + doubleLargest[1] + "]"
        );

        System.out.println(
            "Smallest element location: [" +
            doubleSmallest[0] + "][" + doubleSmallest[1] + "]"
        );
    }
}