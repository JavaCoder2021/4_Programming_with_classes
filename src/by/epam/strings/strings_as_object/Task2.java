package by.epam.strings.strings_as_object;

/*
2. В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task2 {
    public static void main(String[] args) {
        StringBuilder string;

        string = new StringBuilder("Hello word Minsk random word print Java document word");

        System.out.println(insertBAfterA(string));
    }

    private static StringBuilder insertBAfterA(StringBuilder str) {

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a')  {
                str = str.replace(i, i+1, "ab");
            }
        }

        return str;
    }

}
