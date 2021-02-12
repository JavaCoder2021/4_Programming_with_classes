package by.epam.strings.strings_as_chars_array;

/*
4. В строке найти количество чисел.
 */
public class Task4 {
    public static void main(String[] args) {
        String str;

        str = "He23llo 324word Min21sk rand722om w3ord pr6int Jav128a document wo72rd"; // 8

        System.out.println(counterOfNumbers(str));
    }

    public static int counterOfNumbers(String str) {
        int count;

        count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                if (!isDigit(str.charAt(i + 1)) || i == str.length() - 1) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isDigit(char ch) {

        return Character.isDigit(ch);

    }
}
