public class Van {
    String color;
    String model;

    Van(String color, String model) {
        this.color = color;
        this.model = model;
    }

    void drive() {
        System.out.println("Man is driving a " + this.color + " " + this.model);
    }
}


