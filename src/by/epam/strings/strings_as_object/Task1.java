package by.epam.strings.strings_as_object;

/*
1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Task1 {
    public static void main(String[] args) {

        String str;

        str = "                 Lorem     Ipsum is    simply                   dummy    text      of the    printing      " +
                "and  typesetting  industry                ";
        System.out.println(searchingMaxCountOfSpaces(str));;
    }

    private static int searchingMaxCountOfSpaces (String str) {
        int count;
        int max;

        count = 0;
        max = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            if (isWhitespace(str.charAt(i))) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        return max;
    }

    private static boolean isWhitespace(char ch) {

        if (Character.isWhitespace(ch)) {
            return true;
        } else {
            return false;
        }

    }
}
