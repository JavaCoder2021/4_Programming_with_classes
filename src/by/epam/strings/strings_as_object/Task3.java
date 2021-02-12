package by.epam.strings.strings_as_object;

/*
3. Проверить, является ли заданное слово палиндромом.
 */
public class Task3 {
    public static void main(String[] args) {
        StringBuilder string;

        string = new StringBuilder("qwertrewq");

        printResult(isPalindrome(string));

    }


    private static boolean isPalindrome(StringBuilder str) {
        boolean isPalindrome;

        isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
            }
        }

        return isPalindrome;

    }

    private static void printResult(boolean result) {
        if (result) {
            System.out.println("Строка является палиндромом!");
        } else {
            System.out.println("Строка НЕ является палиндромом!");
        }
    }
}
