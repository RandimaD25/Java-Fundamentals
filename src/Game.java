import java.util.Locale;
import java.util.Random;
import  java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        while (playAgain.equals("yes")) {
            System.out.print("Enter your choice: ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissor")
            ) {
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissor") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");
            }

            System.out.print("Do you wanna play again (yes/no): ");
            playAgain = scanner.nextLine();
        }


        System.out.println("**** Bye ****");

        scanner.close();
    }
}
