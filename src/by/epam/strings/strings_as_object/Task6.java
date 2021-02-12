package by.epam.strings.strings_as_object;

/*
6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task6 {
    public static void main(String[] args) {
        StringBuilder string;
        StringBuilder newString;

        string = new StringBuilder("hello world");

        newString = doubleChars(string);

        System.out.println(newString.toString());

    }

    private static StringBuilder doubleChars(StringBuilder str) {
        StringBuilder newString;

        newString = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {

            newString = newString.append(str.charAt(i));
            newString = newString.append(str.charAt(i));

        }

        return newString;

    }

}
