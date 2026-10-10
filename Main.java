/**
 * Практическая работа №4: перечисление «Времена года».
 * Задание выполнено в одном файле.
 */
public class Main {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + " °C");
        System.out.println(favoriteSeason.getDescription());

        printSeasonMessage(favoriteSeason);

        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            System.out.printf("%s: средняя температура %d °C; %s%n",
                    season, season.getAverageTemperature(), season.getDescription());
        }
    }

    static void printSeasonMessage(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Зима — время снега и морозов.");
                break;
            case SPRING:
                System.out.println("Весна — природа пробуждается.");
                break;
            case SUMMER:
                System.out.println("Лето — время тепла и каникул.");
                break;
            case AUTUMN:
                System.out.println("Осень — время золотых листьев.");
                break;
            default:
                throw new IllegalStateException("Неизвестное время года: " + season);
        }
    }

    enum Season {
        WINTER(-10),
        SPRING(10),
        SUMMER(25) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN(8);

        private final int averageTemperature;

        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return "Холодное время года";
        }
    }
}