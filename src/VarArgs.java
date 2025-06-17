public class VarArgs {
    public static void main(String[] args) {

        System.out.println(add(1, 2, 3));
        System.out.println(add(3, 5));
        System.out.println(add(1, 2, 1, 2, 1, 2, 1, 2));
        System.out.println(average(5, 7));
        System.out.println(average(2, 3, 4, 5, 1));
        System.out.println(average());
        System.out.println(myFriends("Randima", "Kamal", "Sarith"));
    }

    static int add (int... numbers){
        int sum = 0;
        for(int number: numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(int... numbers) {
        double sum = 0;
        double avg;

        if (numbers.length == 0) {
            return 0;
        }

        for (int number: numbers) {
            sum += number;
        }

        avg = sum / numbers.length;
        return avg;
    }

    static String myFriends(String... friends) {
        for (String friend: friends) {
            System.out.println(friend);
        }

        return " ";
    }
}
