public class TwoDArray {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange"};
        String[] vegetables = {"carrot", "pumpking", "tomato", "potato"};
        String[] meats = {"chicken", "pork"};

        String[][] groceries = {fruits, vegetables, meats};

        groceries[1][2] = "onion";

        for (String[] foods: groceries) {
            for (String food: foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        String[][] zoo = {{"crow", "pigeon"}, {"dog", "cat", "lion"}};

        for (String[] animals: zoo) {
            for (String animal : animals) {
                System.out.print(animal + " ");
            }
            System.out.println();
        }

        char[][] telephone = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'*', '0', '#'}};
        for (char[] numbers: telephone) {
            for (char number: numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
