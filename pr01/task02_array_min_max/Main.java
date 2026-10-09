import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Количество элементов: ");
            int n = sc.nextInt();
            if (n <= 0) { System.out.println("Размер должен быть положительным."); return; }
            int[] a = new int[n];
            int i = 0;
            do { System.out.print("a[" + i + "] = "); a[i++] = sc.nextInt(); } while (i < n);
            int sum = 0, min = a[0], max = a[0];
            int j = 0;
            while (j < n) {
                sum += a[j];
                if (a[j] < min) min = a[j];
                if (a[j] > max) max = a[j];
                j++;
            }
            System.out.printf("Сумма: %d%nМинимум: %d%nМаксимум: %d%n", sum, min, max);
        }
    }
}
