import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Практическая работа №4. Задание 1: Время суток.
 * Перечисление хранит названия периодов суток.
 */
public class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        TimeOfDay timeOfDay = TimeOfDay.from(now);

        System.out.println("Текущее время: " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Время суток: " + timeOfDay);
        System.out.println(timeOfDay.getDescription());

        System.out.println("\nВсе значения перечисления:");
        for (TimeOfDay value : TimeOfDay.values()) {
            System.out.println(value + " — " + value.getDescription());
        }
    }

    enum TimeOfDay {
        NIGHT("ночь", 0, 5),
        MORNING("утро", 6, 11),
        DAY("день", 12, 17),
        EVENING("вечер", 18, 23);

        private final String name;
        private final int startHour;
        private final int endHour;

        TimeOfDay(String name, int startHour, int endHour) {
            this.name = name;
            this.startHour = startHour;
            this.endHour = endHour;
        }

        public String getDescription() {
            return "Период суток: " + name + "; время от " + startHour
                    + ":00 до " + endHour + ":59.";
        }

        public static TimeOfDay from(LocalTime time) {
            int hour = time.getHour();
            switch (hour) {
                case 0: case 1: case 2: case 3: case 4: case 5:
                    return NIGHT;
                case 6: case 7: case 8: case 9: case 10: case 11:
                    return MORNING;
                case 12: case 13: case 14: case 15: case 16: case 17:
                    return DAY;
                default:
                    return EVENING;
            }
        }
    }
}