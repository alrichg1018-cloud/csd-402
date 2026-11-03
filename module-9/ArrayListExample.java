
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Grapes");
        items.add("Mango");
        items.add("Pineapple");
        items.add("Strawberry");
        items.add("Watermelon");
        items.add("Peach");
        items.add("Blueberry");

        Scanner input = new Scanner(System.in);

        System.out.println("Items in the ArrayList:");
        for (String item : items) {
            System.out.println(item);
        }

        System.out.print("\nEnter an index (0-9): ");
        String userInput = input.nextLine();

        try {
            Integer selectedIndex = Integer.valueOf(userInput);
            int index = selectedIndex; // Auto-unboxing

            String selectedItem = items.get(index);
            System.out.println("Selected item: " + selectedItem);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        input.close();
    }
}
