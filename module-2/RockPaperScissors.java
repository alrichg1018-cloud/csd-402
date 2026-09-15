import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int computerChoice = (int)(Math.random() * 3 + 1);

        System.out.println("Rock-Paper-Scissors");
        System.out.println();
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice: ");

        int userChoice = input.nextInt();

        System.out.println();

        if (computerChoice == 1) {
            System.out.println("Computer selected: Rock");
        }
        else if (computerChoice == 2) {
            System.out.println("Computer selected: Paper");
        }
        else {
            System.out.println("Computer selected: Scissors");
        }

        if (userChoice == 1) {
            System.out.println("You selected: Rock");
        }
        else if (userChoice == 2) {
            System.out.println("You selected: Paper");
        }
       else if (userChoice == 3) {
    System.out.println("You selected: Scissors");
}
else {
    System.out.println("Invalid selection.");
    input.close();
    return;
}

        System.out.println();

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        }
        else if ((userChoice == 1 && computerChoice == 3) ||
                 (userChoice == 2 && computerChoice == 1) ||
                 (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer wins!");
        }

        input.close();
    }
}