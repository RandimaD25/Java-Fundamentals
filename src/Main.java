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
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Octopus octopus = new Octopus();

        rabbit.flee();
        hawk.hunt();
        octopus.flee();
        octopus.hunt();

    }
}


