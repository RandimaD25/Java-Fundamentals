import java.util.Arrays;

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


    }
}
