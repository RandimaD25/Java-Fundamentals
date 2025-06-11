import java.util.Scanner;
import java.util.Random;

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

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the width: ");
//        double width = scanner.nextDouble();
//
//        System.out.print("Enter your height: ");
//        double height = scanner.nextDouble();
//
//        double area = width * height;
//        System.out.println("Area is: " + area + "cm²");
//
//        scanner.close();

//        Mad libs game

//        Scanner scanner = new Scanner(System.in);
//
//        String adjective1;
//        String noun;
//        String adjective2;
//        String verb;
//        String adjective3;
//
//        System.out.print("Enter an adjective: ");
//        adjective1 = scanner.nextLine();
//
//        System.out.print("Enter a noun: ");
//        noun = scanner.nextLine();
//
//        System.out.print("Enter an adjective: ");
//        adjective2 = scanner.nextLine();
//
//        System.out.print("Enter a verb: ");
//        verb = scanner.nextLine();
//
//        System.out.print("Enter an adjective: ");
//        adjective3 = scanner.nextLine();
//
//        System.out.println("\nToday I went to the " + adjective1 + " school.");
//        System.out.println("There was a small " + noun + " .");
//        System.out.println("I saw " + adjective2 + " kids were " + verb +" there.");
//        System.out.println("I am saw happy to see that " + adjective3 + " school.");
//
//        scanner.close();

//        arithmetic operators
//        int x = 10;
//        int y = 3;
//        int z;

//        z = x + y;
//        z = x - y;
//        z = x * y;
//        z = x / y;
//          z = x % y;
//        System.out.println(z);

//        Augmented Assignment Operators
//        int x = 10;
//        int y = 5;

//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;
//        x %= y;
//        System.out.println(x);

//        Increment and decrement operator
//        int a = 20;
//        a++;
//        a++;
//        a++;
//        a--;
//        a--;
//        System.out.println(a);

//        order of operations (P-E-M-D-A-S)
//        double result = 2 + 5 * (4 + 6) / 2;
//        System.out.println(result);

//        Shopping cart program
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What item would you like to buy: ");
//        String item = scanner.nextLine();
//
//        System.out.print("What is the price for each: ");
//        double price = scanner.nextDouble();
//
//        System.out.print("How many would you like: ");
//        int count = scanner.nextInt();
//
//        double total = price * count;
//
//        System.out.println("You have bought " + count + " " + item + "/s");
//        System.out.println("Your total is: $" + total);
//
//        scanner.close();

//        If statement
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        if (name.isEmpty()) {
//            System.out.println("You haven't enter your name");
//        } else {
//            System.out.println("Hello " + name);
//        }
//
//        if(age >= 60) {
//            System.out.println("You are a senior");
//        } else if (age >= 18) {
//            System.out.println("You are an adult");
//        } else if (age == 0) {
//            System.out.println("You just born");
//        } else if (age < 0) {
//            System.out.println("You haven't born");
//        } else {
//            System.out.println("You are a child");
//        }
//        scanner.close();

//        Random Numbers
//        Random random = new Random();
//
//        int number = random.nextInt(1, 6);
//        double number2 = random.nextDouble();
//        boolean isHead = random.nextBoolean();
//
//        System.out.println(number);
//        System.out.println(number2);
//        System.out.println(isHead);

//        Math class
//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;
//        result = Math.pow(2, 3);
//        result = Math.abs(-5);
//        result = Math.sqrt(9);
//        result = Math.round(5.5);
//        result = Math.ceil(3.19);
//        result = Math.floor(5.99);
//        result = Math.max(10, 20);
//        result = Math.min(10, 20);
//
//        System.out.println(result);

//        Hypotenuse c = a² + b²
//        Scanner scanner = new Scanner(System.in);
//
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter side a: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Enter side b: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//        System.out.println("Hypotenuse (c) = " + c + " cm");

//        circumference = 2 * PI * r

//        System.out.print("Enter the radius: ");
//        double r = scanner.nextDouble();
//        double circumference = 2 * Math.PI * r;
//        System.out.println("Circumference = " + circumference + " cm");

//        area = PI * r²
//        double area = Math.PI * Math.pow(r, 2);
//        System.out.println("Area = " + area + " cm²");

//        volume = 4/3 * PI * r³
//        double volume = 4 / 3 * Math.PI * Math.pow(r, 3);
//        System.out.println("Volume = " + volume + " cm³");
//
//        scanner.close();

//        printf method

//        String name = "Spongebob";
//        char firstLetter = 'S';
//        int age = 25;
//        double height = 160.5;
//        boolean isEmployeed = true;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name stat with %c\n", firstLetter);
//        System.out.printf("Your age is %d\n", age);
//        System.out.printf("You height is %f cm \n", height);
//        System.out.printf("You are employeed %b\n", isEmployeed);
//        System.out.printf("%s is %d years old.\n", name, age);
//
//        double price1 = 99000.9999;
//        double price2 = 12000.234;
//        double price3 = -23000.5;
//
//        System.out.printf("%+.3f\n", price1);
//        System.out.printf("%+.3f\n", price2);
//        System.out.printf("%+.3f\n", price3);
//
//        System.out.printf("%,.1f\n", price1);
//        System.out.printf("%,.1f\n", price2);
//        System.out.printf("%,.1f\n", price3);
//
//        System.out.printf("%(.1f\n", price1);
//        System.out.printf("%(.1f\n", price3);
//
//        System.out.printf("% .1f\n", price1);
//        System.out.printf("% .1f\n", price3);
//
//        int num1 = 1;
//        int num2 = 10;
//        int num3 = 100;
//        int num4 = 1000;
//
//        System.out.printf("%-4d\n", num1);
//        System.out.printf("%-4d\n", num2);
//        System.out.printf("%-4d\n", num3);
//        System.out.printf("%-4d\n", num4);

//        Compound interest calculator

//        Scanner scanner = new Scanner(System.in);
//        double principal;
//        double rate;
//        int timeCompound;
//        int years;
//        double amount;
//
//        System.out.print("Enter the principal amount: ");
//        principal = scanner.nextDouble();
//
//        System.out.print("Enter the rate (in %): ");
//        rate = scanner.nextDouble() / 100;
//
//        System.out.print("Enter the time compounded yearly: ");
//        timeCompound = scanner.nextInt();
//
//        System.out.print("Enter the years: ");
//        years = scanner.nextInt();
//
//        amount = principal * Math.pow((1 + rate / timeCompound), timeCompound * years);
//        System.out.printf("Amount after the %d years : $ %.2f", years, amount);
//
//        scanner.close();

//        nested is statement

//        boolean isStudent = false;
//        boolean isSenior = false;
//        double price = 9.99;
//
//        if (isStudent) {
//            if (isSenior) {
//                System.out.println("You get 10% discount");
//                System.out.println("You get 20% discount");
//                System.out.printf("Ticket price = %.2f", price * 0.7);
//            } else {
//                System.out.println("You get 10% discount");
//                System.out.printf("Ticket price = %.2f", price * 0.9);
//            }
//        } else {
//            if (isSenior) {
//                System.out.println("You get 20% discount");
//                System.out.printf("Ticket price = %.2f", price * 0.8);
//            } else {
//                System.out.println("You don't have discount");
//                System.out.printf("Ticket price = %.2f", price);
//            }
//        }

//        String methods
//        String name = "Randima Methmini Dias";
//        int length = name.length();
//
//        char index = name.charAt(10);
//        int indexOf = name.indexOf("M");
//        int indexLast = name.lastIndexOf("a");
//        String upper = name.toUpperCase();
//        String lower = name.toLowerCase();
//        String trim = name.trim();
//        String replace = name.replace("a", "z");
//        boolean contains = name.contains("e");
//        boolean equal = name.equals("randima methmini Dias");
//        boolean ignoreCase = name.equalsIgnoreCase("randima methmini Dias");
//
//        System.out.println(name.isEmpty());
//        System.out.println(equal);
//        System.out.println(ignoreCase);

//        substring
//        String email = "randimadias123@gmail.com";
//
//        String username = email.substring(0, 14);
//        String domain = email.substring(15);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your email: ");
//        String emailNew = scanner.nextLine();
//
//        if (emailNew.contains("@")) {
//            String usernameNew = emailNew.substring(0, emailNew.indexOf('@'));
//            String domainNew = emailNew.substring(emailNew.indexOf('@') + 1);
//            System.out.println("Your user name is: " + usernameNew);
//            System.out.println("Your domain is: " + domainNew);
//        } else {
//            System.out.println("Email needs to contain @");
//        }

//        scanner.close();

//        Weight conversion program

//        Scanner scanner = new Scanner(System.in);
//        double weight;
//        double newWeight;
//        int choice;
//
//        System.out.println("If you want to convert kg s to lbs choose 1");
//        System.out.println("If you want to convert lbs to kg s choose 2");
//        System.out.print("What is your choice: ");
//        choice = scanner.nextInt();
//
//        if (choice == 1) {
//            System.out.print("Enter your weight in kg s: ");
//            weight = scanner.nextDouble();
//            newWeight = weight * 2.20462;
//            System.out.printf("So weight in lbs is: %.2f lbs\n", newWeight);
//        } else if (choice == 2) {
//            System.out.print("Enter your weight in lbs: ");
//            weight = scanner.nextDouble();
//            newWeight = weight / 2.20462;
//            System.out.printf("So weight in kg s is: %.2f kg", newWeight);
//        } else {
//            System.out.println("You have entered invalid choice");
//        }
//
//        scanner.close();

//        ternary operator

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        scanner.close();
    }
}
