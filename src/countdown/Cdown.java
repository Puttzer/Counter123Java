package src.countdown;
import java.time.LocalDateTime;
import java.time.Duration;

public class Cdown {
    public static void main(String[] args) throws InterruptedException {
        // will only count for 10 seconds then stop.
        int maxUpdates = 10;
        // Counter for the number of updates
        int updateCount = 0;
        // as long as count is less than 10 this will run.
        while (updateCount < maxUpdates) {
            // Get date and time from local computer
            LocalDateTime now = LocalDateTime.now();
            // When is the new year?
            LocalDateTime newYear = LocalDateTime.of(now.getYear() + 1, 1, 1, 0, 0, 0);
            // Calc time from now to then.
            Duration duration = Duration.between(now, newYear);
            // Get, Hours Min, and sec separate
            long hours = duration.toHours();
            long minutes = duration.toMinutes() % 60;
            long seconds = duration.getSeconds() % 60;
            // Displays time left.
            // Returns the division remainder
            System.out.printf("Time left until New Year: %02d:%02d:%02d\n", hours, minutes, seconds);
            // Increment with 1
            updateCount++;
            // Pause 1 sec, then update
            Thread.sleep(1000);
        }
        // Message when count reaches 9. "0 -> 9"
        System.out.println("Countdown finished. Program will exit now.");
    }
}
