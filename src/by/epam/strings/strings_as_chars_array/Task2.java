package by.epam.strings.strings_as_chars_array;

/*
2. Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task2 {
    public static void main(String[] args) {
        String str;
        String substr;

        str = "Hello word Minsk random word print Java document word";
        substr = "word";

        str = changeWord(str, substr);

        print(str);

    }

    private static String changeWord(String str, String substr) {
        String newSubstr;

        newSubstr = "letter";

        while (str.indexOf(substr) != -1) {
            str = str.substring(0, str.indexOf(substr)).concat(newSubstr).concat(str.substring(str.indexOf(substr) + substr.length()));
        }

        return str;
    }


    public static void print(String str) {
        System.out.println(str);
    }
}
