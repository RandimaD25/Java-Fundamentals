import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("You have 5 seconds to enter your name");
//
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.setDaemon(true);
//        thread.start();
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Hello " + name);
//
//        scanner.close();




//        Multithreading
//        ARunnable aRunnable = new ARunnable();
//        Thread thread = new Thread(aRunnable);
//        thread.start();

//        instead of creating aRunnable object, we can pass an anonymous
//        runnable object to the Thread constructor.

        Thread thread1 = new Thread(new ARunnable("Ping"));
        Thread thread2 = new Thread(new ARunnable("Pong"));

        System.out.println("GAME START");
        thread1.start();
        thread2.start();

//        to finish thread1 and thread2 before printing "GAME OVER"
//        otherwise it will print first "GAME START" and "GAME OVER"
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("GAME OVER");
    }
}
