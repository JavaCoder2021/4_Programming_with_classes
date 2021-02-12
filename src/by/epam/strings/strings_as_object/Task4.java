package by.epam.strings.strings_as_object;

/*
4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Task4 {
    public static void main(String[] args) {
        String str;
        String newStr;

        str = "информатика";
        newStr = createNewStr(str);

        System.out.println(newStr);
    }

    private static String createNewStr (String str) {

        return str.substring(7, 8).concat(str.substring(3,5)).concat(str.substring(7,8));

    }

}
