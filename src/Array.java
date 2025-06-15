import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        String[] fruits = {"apple", "banana", "orange", "water melon"};
//
//        fruits[0] = "pine apple";
//
//        int numOfFruits = fruits.length;
//        System.out.println(numOfFruits);
//
//        for(int i=0; i < numOfFruits; i++) {
//            System.out.println(fruits[i]);
//        }
//
//        Arrays.sort(fruits);
//        Arrays.fill(fruits, "mango");
//
//        for (String fruit: fruits) {
//            System.out.println(fruit);
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the size of the array: ");
//        int sizeOfArray = scanner.nextInt();
//        scanner.nextLine();
//
//        String[] foods = new String[sizeOfArray];
//
//        for (int i = 0; i < sizeOfArray; i++) {
//            System.out.print("Enter the food: ");
//            foods[i] = scanner.nextLine();
//        }
//
//        for (String food: foods) {
//            System.out.println(food);
//        }


        int[] numbers = {1, 4, 6, 2, 6, 9};

        Scanner scanner = new Scanner(System.in);
        int target;
        boolean isFound = false;
        System.out.print("Enter the target value: ");
        target = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.printf("Element found in index %d", i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element cannot found in the array");
        }


        String targetFruit;
        boolean isFoundFruit = false;

        String[] fruits = {"orange", "apple", "banana"};

        System.out.print("Enter the target fruit: ");
        targetFruit = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].contains(targetFruit)) {
                System.out.printf("Fruit found in index %d", i);
                isFoundFruit = true;
                break;
            }
        }

        if (!isFoundFruit) {
            System.out.println("Fruit cannot found");
        }
        scanner.close();
    }
}
