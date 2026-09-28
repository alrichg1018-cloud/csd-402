/*
 * Name: Alrich Rigonios
 * Course: CSD-402 Java for Programmers
 * Module: 4
 * Assignment: Overloaded Average Methods
 *
 * Purpose:
 * This program demonstrates method overloading by calculating
 * the average of short, int, long, and double arrays.
 */

public class Module4 {

    // Returns the average of a short array
    public static short average(short[] array) {
        short sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (short) (sum / array.length);
    }

    // Returns the average of an int array
    public static int average(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    // Returns the average of a long array
    public static long average(long[] array) {
        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    // Returns the average of a double array
    public static double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        // Four arrays with different sizes
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {2.5, 5.5, 7.5, 10.5, 12.5, 15.5};

        // Display short array and average
        System.out.println("Short Array:");
        for (short value : shortArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(shortArray));

        // Display int array and average
        System.out.println("\nInt Array:");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(intArray));

        // Display long array and average
        System.out.println("\nLong Array:");
        for (long value : longArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(longArray));

        // Display double array and average
        System.out.println("\nDouble Array:");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}