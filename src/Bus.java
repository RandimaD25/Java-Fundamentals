public class Bus {
    String model;
    int year;
    Engine engine;

    Bus(String model, int year, String EngineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(EngineType);
    }

    void start() {
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
