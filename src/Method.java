import java.util.Scanner;

public class Method {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        happyBirthday(name, age);


        double result = square(4);
        System.out.println(result);


        double cubeResult = cube(3);
        System.out.println(cubeResult);


        System.out.println(fullName("Randima", "Dias"));

        int ageNew = 10;
        if (ageCheck(ageNew)) {
            System.out.println("You may sign up");
        } else {
            System.out.println("You need to 18+");
        }

        scanner.close();
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy Birthday to you\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double numer) {
        return Math.pow(numer, 3);
    }

    static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
