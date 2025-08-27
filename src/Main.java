import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

//        car.isRunning = true;

//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.price);
//        System.out.println(car.isRunning);
//
//        car.start();
//        System.out.println(car.isRunning);
//        car.stop();
//        System.out.println(car.isRunning);
//
//        car.drive();

//        Student student1 = new Student("Randima", 26, 3.36);
//        Student student2 = new Student("Sara", 25, 3.33);
//        student1.isEnrolled = false;
//
//        System.out.println(student1.name);
//        System.out.println(student1.isEnrolled);
//
//        student1.study();
//        student2.study();

//        User user = new User("Randima");
//        User user1 = new User("Sara", "sara@gmail.com");
//        User user2 = new User("Sandy", "sandy@gmail.com", 24);
//        User user3 = new User();
//
//        System.out.println(user.username);
//        System.out.println(user.email);
//        System.out.println(user.age);
//
//        System.out.println(user1.username);
//        System.out.println(user1.email);
//        System.out.println(user1.age);
//
//        System.out.println(user2.username);
//        System.out.println(user2.email);
//        System.out.println(user2.age);
//
//        System.out.println(user3.username);
//        System.out.println(user3.email);
//        System.out.println(user3.age);

//        array of objects
        Van van1 = new Van("Red", "BMW");
        Van van2 = new Van("Blue", "Bence");
        Van van3 = new Van("Black", "Audi");

        Van[] vans = {van1, van2, van3};

//        anonymous objects
        Van[] vans2 = {new Van("Pink", "Nissan"), new Van("Yellow", "Toyota")};
//
//        for (int i = 0; i < vans.length; i++) {
//            vans[i].drive();
//        }
//
//        for (Van van: vans) {
//            van.color = "Gold";
//        }
//
//        for (Van van: vans) {
//            van.drive();
//        }
//
//        System.out.println();
//
//        for (Van van: vans2) {
//            van.drive();
//        }

//        static keyword
//        Friend friend = new Friend("Sara");
//        Friend friend2 = new Friend("Alice");
//        Friend friend3 = new Friend("Lora");
//
//        System.out.println(friend.name);
//
////        static member access via instance reference
//        System.out.println(friend.numOfFriends);
//        System.out.println(friend2.numOfFriends);
//
////        rather than accessing by instances we can access by the class as numberOfClass is a static
//        System.out.println(Friend.numOfFriends);
//        Friend.showFriends();

//        inheritance
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//
//        System.out.println(dog.isAlive);
//        System.out.println(cat.isAlive);
//
//        dog.eat();
//        cat.eat();
//
//        System.out.println(dog.lives + " " + cat.lives);
//        dog.speak();
//        cat.speak();

//        static
//        Person person = new Person("Randima", "Dias");
//        person.showName();
//
//        UniStudent student = new UniStudent("Harry", "Potter", 3.24);
//        student.showName();
//        System.out.println(student.gpa);
//
//        student.showGPA();
//
//        Employee employee = new Employee("Emma", "Watson", 4000);
//        employee.showSalary();

//        overriding
//        Elephant elephant = new Elephant();
//        Cow cow = new Cow();
//        Fish fish = new Fish();
//
//        elephant.move();
//        cow.move();
//        fish.move();

//        toString method
//        Jeep jeep = new Jeep("Ford", "Mustang", 1999, "Red");
//        System.out.println(jeep);
////        System.out.println(jeep.make + " " + jeep.model + " " + jeep.year + " " + jeep.color);
//
//        Jeep jeep2 = new Jeep("BMW", "Blara", 2003, "Black");
//        System.out.println(jeep2);

//        abstract
//        Circle circle = new Circle(7);
//        Rectangle rectangle = new Rectangle(2, 4);
//
//        circle.display();
//        rectangle.display();
//
//        System.out.println(circle.area());
//        System.out.println(rectangle.area());

//        interface
//        Rabbit rabbit = new Rabbit();
//        Hawk hawk = new Hawk();
//        Octopus octopus = new Octopus();
//
//        rabbit.flee();
//        hawk.hunt();
//        octopus.flee();
//        octopus.hunt();

//        Polymorphism
//        Lorry lorry = new Lorry();
//        Bike bike = new Bike();
//        Boat boat = new Boat();
//
//        Vehicle[] vehicles = {lorry, bike, boat};
//
//        for (Vehicle vehicle: vehicles) {
//            vehicle.go();
//        }
//
//        Nimal nimal = new Nimal();
//        Kamal kamal = new Kamal();
//
//        Man[] mans = {nimal, kamal};
//
//        for (Man man: mans) {
//            man.study();
//        }

//        Runtime polymorphism

//        Reptile reptile;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Choose Lion (1) or Tiger (2): ");
//        int choice = scanner.nextInt();
//
//        if (choice == 1) {
//            reptile = new Lion();
//            reptile.speak();
//        } else if (choice == 2) {
//            reptile = new Tiger();
//            reptile.speak();
//        }
//
//        scanner.close();

//       Getters and Setters

//        Guitar guitar = new Guitar("Yamaha", "Black", 36000);
//
//        guitar.setColor("Cream");
//        guitar.setPrice(-12000);
//
//        System.out.println(guitar.getModel() + " " + guitar.getColor() + " " + guitar.getPrice());

//        Aggregation

//        Book book1 = new Book("Harry Potter", 1203);
//        Book book2 = new Book("BBF", 234);
//        Book book3 = new Book("The fall", 340);
//
//        Book[] books = {book1, book2, book3};
//
//        Library library = new Library("NYC Public Library", 1897, books);
//        library.displayInfo();

//        Composition
//        Bus bus = new Bus("Layland", 2010, "V8");
//
//        System.out.println(bus.model);
//        System.out.println(bus.year);
//        System.out.println(bus.engine.type);
//
//        bus.start();

//        Wrapper classes
//        Integer a = new Integer(123);
//        Double b = new Double(2.14);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);
//
////         New way of Wrapper classes
////         This technique is called "Autoboxing"
//        Integer l = 123;
//        Double m = 3.13;
//
////        Unboxing
//        int x = l;
//        double y = m;
//
////        Convert primitive data types in to string using wrapper classes
//        String o = Integer.toString(123);
//        String p = Double.toString(2.32);
//        String q = Character.toString('$');
//        String r = Boolean.toString(true);
//
//        String result = o + p + q + r;
//        System.out.println(result);
//
//        char letter = 'B';
//        System.out.println(Character.isLetter(letter));
//
//        System.out.println(Character.isUpperCase(letter));

//        ArrayList
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(5);
//        list.remove(2);
//        list.set(0, 10);
//
//        System.out.println(list);
//
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");
//        fruits.add("Coconut");
//        fruits.remove(0);
//        fruits.set(1, "Pineapple");
//
//        Collections.sort(fruits);
//
//        System.out.println(fruits.get(0));
//        System.out.println(fruits.size());
//        System.out.println(fruits);
//
//        for(String fruit: fruits) {
//            System.out.println(fruit);
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<String> foods = new ArrayList<>();
//
//        Boolean terms = true;
//        while (terms) {
//            System.out.print("What would you like to eat: ");
//            String food = scanner.nextLine();
//            foods.add(food);
//
//            System.out.print("Would you like to add more food : (true / false): ");
//            terms = scanner.nextBoolean();
//            scanner.nextLine();
//        }
//
//
//        System.out.println(foods);
//
//        scanner.close();

//        Exception
//        try {
//            System.out.println(1/0);
//        } catch (ArithmeticException e) {
//            System.out.println("YOU CANNOT DIVIDE BY 0 " + e);
//        }
//
//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.print("Enter a number: ");
//            int number = scanner.nextInt();
//            System.out.println(number);
//        } catch (InputMismatchException e) {
//            System.out.println("Entered value is not a number");
//        } catch (Exception e) { //safety net
//            System.out.println("Something wen wrong");
//        } finally {
//            System.out.println("This always execute");
//        }

//        How to write a file using java

        String filePath = "C:\\Users\\Dell\\Desktop\\text.txt";
        String textContent = """
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                Rocking Everywhere
                """;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}


