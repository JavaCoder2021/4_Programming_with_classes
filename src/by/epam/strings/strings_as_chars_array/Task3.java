package by.epam.strings.strings_as_chars_array;

/*
3. В строке найти количество цифр.
 */
public class Task3 {
    public static void main(String[] args) {
        String str;

        str = "He2l3lo 3word Min2sk rand7om wo2rd prin6t Jav8a docum1ent wo7r9d";

        print(counterOfDigits(str));
    }

    public static int counterOfDigits(String str) {
        int count;
        char ch;

        count = 0;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void print(int count) {
        System.out.println(count);
    }
}
