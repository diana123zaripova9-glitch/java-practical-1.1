import java.util.Scanner;
public class Main {
    static long factorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Допустимы числа от 0 до 20.");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите n (0..20): ");
            int n = sc.nextInt();
            System.out.println(n + "! = " + factorial(n));
        }
    }
}
