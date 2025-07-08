public class Jeep {
    String make;
    String model;
    int year;
    String color;

    Jeep(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.make + " " + this.model + " " + this.year + " " + this.color;
    }
}
