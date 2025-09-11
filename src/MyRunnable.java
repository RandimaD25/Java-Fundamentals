//Runnable is an interface
public class MyRunnable implements Runnable{

//    Any code you want to run in a separate thread, place it inside the run method
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

            if (i == 5) {
                System.out.println("Time's up!");
                System.exit(0);
            }
        }
    }
}
