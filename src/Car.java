public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 53000.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You start the car");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stop the car");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }
}
