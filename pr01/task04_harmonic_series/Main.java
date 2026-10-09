public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int n = 1; n <= 10; n++) {
            sum += 1.0 / n;
            System.out.printf("H(%2d) = %.6f%n", n, sum);
        }
    }
}
