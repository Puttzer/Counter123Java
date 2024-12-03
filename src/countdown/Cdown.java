package src.countdown;

import java.time.LocalDateTime;
import java.time.Duration;

    public class Cdown {
        public static void main(String[] args) {
            while (true) {
                // Get the current date and time
                LocalDateTime now = LocalDateTime.now();

                // Calculate the next New Year's time
                LocalDateTime newYear = LocalDateTime.of(now.getYear() + 1, 1, 1, 0, 0, 0);

                // Calculate the duration between now and New Year
                Duration duration = Duration.between(now, newYear);

                // Extract hours, minutes, and seconds from the duration
                long hours = duration.toHours();
                long minutes = duration.toMinutes() % 60;
                long seconds = duration.getSeconds() % 60;

                // Display the countdown
                System.out.printf("Time left until New Year: %02d:%02d:%02d\n", hours, minutes, seconds);

                // Pause for one second before updating the countdown
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Countdown interrupted.");
                    break;
                }
            }
        }
    }

