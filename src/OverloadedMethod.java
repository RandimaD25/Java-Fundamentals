public class OverloadedMethod {
    public static void main (String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 4));
        String pizza = bakedPizza("Chicken","Mozzarella", "Flat bread");
        System.out.println(pizza);
    }

    static double add (double a, double b) {
        return  a + b;
    }

    static  double add (double a, double b, double c) {
        return a + b + c;
    }

    static String bakedPizza(String bread) {
        return bread + " pizza";
    }

    static String bakedPizza (String cheese, String bread) {
        return cheese + " " + bread + " pizza";
    }

    static String bakedPizza(String toppings, String cheese, String bread) {
        return toppings + " " + cheese + " " + bread + " " + " pizza";
    }
}
