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

        Student student1 = new Student("Randima", 26, 3.36);
        Student student2 = new Student("Sara", 25, 3.33);
        student1.isEnrolled = false;

        System.out.println(student1.name);
        System.out.println(student1.isEnrolled);

        student1.study();
        student2.study();
    }
}


