package by.epam.strings.strings_as_chars_array;

/*
5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */
public class Task5 {
    public static void main(String[] args) {

        String str;

        str = "                 Lorem     Ipsum is    simply  dummy    text      of the    printing      " +
                "and  typesetting  industry                ";

        System.out.println(deleteOtherWhitespaces(str));

    }

    private static String deleteOtherWhitespaces(String str) {
        str = deleteStartWhitespaces(str);
        str = deleteEndWhitespaces(str);

        String oneSpace;
        String twoSpace;

        oneSpace = " ";
        twoSpace = "  ";

        while (str.indexOf(twoSpace) >= 0) {
            str = str.replace(twoSpace, oneSpace);
        }

        return str;
    }

    private static String deleteStartWhitespaces(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (!isWhitespace(str.charAt(i))) {
                str = str.substring(i);
                break;
            }

        }

        return str;
    }

    private static String deleteEndWhitespaces(String str) {

        for (int i = str.length() - 1; i > 0; i--) {

            if (!isWhitespace(str.charAt(i))) {
                str = str.substring(0, i + 1);
                break;
            }

        }

        return str;
    }

    private static boolean isWhitespace(char ch) {

        return Character.isWhitespace(ch);

    }

}
