import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("I like pizza\n");
//        System.out.println(("It is really good"));
//
//        int age = 26;
//        System.out.println(age);
//
//        int year = 2025;
//        System.out.println("This year is " + year);
//
//        double price = 19;
//        System.out.println("$" + price);
//
//        char result = 'A';
//        char currency = '$';
//        System.out.println(result);
//
//        boolean isSell = true;
//        System.out.println(isSell);
//
//        String name = "Randima";
//        System.out.println(name);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();


//        System.out.print("Enter your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student: ");
//        boolean isStudent = scanner.nextBoolean();

//        System.out.println("You are " + age + " years old");
//        System.out.println("Hello " + name);
//        System.out.println("Your gpa is " + gpa);
//
//        if (isStudent) {
//            System.out.println("You are a student");
//        } else {
//            System.out.println("You are NOT a student");
//        }

//        scanner.close();

//        calculate area of the rectangle

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        double area = width * height;
        System.out.println("Area is: " + area + "cm²");

        scanner.close();
    }
}
