package by.epam.strings.strings_as_object;

/*
5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class Task5 {
    public static void main(String[] args) {
        StringBuilder str;

        str = new StringBuilder("Hello word Minsk random word print Java document word");

        System.out.println(countA(str));
    }

    private static int countA (StringBuilder str) {
        int count;

        count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }
}
