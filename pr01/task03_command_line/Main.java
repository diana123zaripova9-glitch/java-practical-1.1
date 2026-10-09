public class Main {
    public static void main(String[] args) {
        if (args.length == 0) { System.out.println("Передайте аргументы запуска."); return; }
        for (int i = 0; i < args.length; i++)
            System.out.printf("Аргумент %d: %s%n", i + 1, args[i]);
    }
}
