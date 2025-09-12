import java.time.LocalTime;

public class Alarm implements Runnable{
    private final LocalTime alarmTime;

    Alarm(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run () {

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();

                int hours = now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();

                System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}
