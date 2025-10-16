import java.util.Scanner;

public class MaxOfThreeSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == b && b == c) {
            System.out.println("Все числа равны: " + a);
        } else if (a >= b && a >= c) {
            System.out.println("Наибольшее число: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Наибольшее число: " + b);
        } else {
            System.out.println("Наибольшее число: " + c);
        }

        scanner.close();
    }
}