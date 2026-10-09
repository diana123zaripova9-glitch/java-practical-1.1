import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, -2, 9, 2};
        int sum = 0;
        for (int number : numbers) sum += number;
        double average = (double) sum / numbers.length;
        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Сумма: " + sum);
        System.out.printf("Среднее арифметическое: %.2f%n", average);
    }
}
