import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange", "water melon"};

        fruits[0] = "pine apple";

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        for(int i=0; i < numOfFruits; i++) {
            System.out.println(fruits[i]);
        }

        Arrays.sort(fruits);
        Arrays.fill(fruits, "mango");

        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter the food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food: foods) {
            System.out.println(food);
        }
        scanner.close();


    }
}
