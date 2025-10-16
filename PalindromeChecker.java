import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово для проверки: ");
        String word = scanner.nextLine();

        // Проверка на палиндром
        if (isPalindrome(word)) {
            System.out.println("'" + word + "' является палиндромом!");
        } else {
            System.out.println("'" + word + "' не является палиндромом.");
        }

        scanner.close();
    }

    // Метод для проверки палиндрома
    public static boolean isPalindrome(String str) {
        // Игнорирование регистра
        String lowerCaseStr = str.toLowerCase();

        // Сравнение символов с обоих концов
        int left = 0;
        int right = lowerCaseStr.length() - 1;

        while (left < right) {
            if (lowerCaseStr.charAt(left) != lowerCaseStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}