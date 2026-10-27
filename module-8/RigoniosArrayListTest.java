
import java.util.ArrayList;
import java.util.Scanner;

/**
 * CSD-402 Module 8
 * Program: RigoniosArrayListTest
 *
 * This program accepts integers from the user and
 * stores them in an ArrayList until 0 is entered.
 * It then displays the largest integer in the list.
 */
public class RigoniosArrayListTest {

    /**
     * Finds the largest integer in an ArrayList.
     *
     * @param list the ArrayList containing integers
     * @return the largest integer or 0 if empty
     */
    public static Integer max(ArrayList list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int largest = (Integer) list.get(0);

        for (Object item : list) {
            int number = (Integer) item;

            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop):");

        int number;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            numbers.add(number);
        } while (number != 0);

        System.out.println("\nNumbers entered: " + numbers);
        System.out.println("Largest number: " + max(numbers));

        // Test the method with an empty ArrayList
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Empty list test: " + max(emptyList));

        input.close();
    }
}
