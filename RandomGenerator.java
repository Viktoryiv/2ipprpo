import java.util.Random;
import java.util.Arrays;

public class RandomGenerator {
    public static void main(String[] args) {
        System.out.println("Генератор 5 случайных чисел от 1 до 100:");

        Random random = new Random();
        int[] numbers = new int[5];

        // Генерация 5 случайных чисел
        for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        // Вывод исходных чисел
        System.out.println("Сгенерированные числа: " + Arrays.toString(numbers));

        // Сортировка чисел
        Arrays.sort(numbers);

        // Вывод отсортированных чисел
        System.out.println("Отсортированные числа: " + Arrays.toString(numbers));
    }
}