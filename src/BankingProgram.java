import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 10;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("************");
            System.out.println("BANK PROGRAM");
            System.out.println("************");

            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit\n");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> balance(balance);
                case 2 -> {
                    balance += deposit();
                    System.out.printf("New Balance: $ %.2f\n\n", balance);
                }
                case 3 -> {
                    balance -= withdraw(balance);
                    System.out.printf("New balance: $ %.2f\n\n", balance);
                }
                case 4 -> isRunning = false;
                default -> System.out.println("Choose a valid choice");
            }
        }
        System.out.println("Thank you, Have a nice day");
        scanner.close();
    }

    static void balance(double balance) {
        System.out.printf("Your balance is = $ %.2f\n\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter the amount need to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount need to be positive");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;

        System.out.print("Enter the amount to be withdraw: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount should be positive");
            return 0;
        } else if (amount > balance) {
            System.out.println("Your account balance is insufficient");
            return 0;
        }
        else {
            return amount;
        }
    }
}
