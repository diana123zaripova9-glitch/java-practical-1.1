import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Практическая работа №4: перечисление времени суток.
 * Вся реализация находится в одном файле.
 */
public class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        TimeOfDay current = TimeOfDay.from(now);
        System.out.println("Текущее время: " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Время суток: " + current);
        System.out.println(current.getDescription());

        System.out.println("\nВсе периоды суток:");
        for (TimeOfDay time : TimeOfDay.values()) {
            System.out.printf("%s — %s%n", time, time.getDescription());
        }
    }

    enum TimeOfDay {
        NIGHT("ночь", 0, 5),
        MORNING("утро", 6, 11),
        DAY("день", 12, 17),
        EVENING("вечер", 18, 23);

        private final String description;
        private final int startHour;
        private final int endHour;

        TimeOfDay(String description, int startHour, int endHour) {
            this.description = description;
            this.startHour = startHour;
            this.endHour = endHour;
        }

        public String getDescription() {
            return "Сейчас " + description + " (с " + startHour + ":00 до " + endHour + ":59).";
        }

        public static TimeOfDay from(LocalTime time) {
            int hour = time.getHour();
            if (hour <= 5) return NIGHT;
            if (hour <= 11) return MORNING;
            if (hour <= 17) return DAY;
            return EVENING;
        }
    }
}