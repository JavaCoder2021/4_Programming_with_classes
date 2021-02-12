package by.epam.strings.strings_as_object;

/*
9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */
public class Task9 {
    public static void main(String[] args) {
        StringBuilder str;

        str = new StringBuilder("SDfggsAoOOSjsdfЫсцллыцIjjJJHFP");

        countLowerCaseAndUpperCase(str);

    }

    private static int countOflowerCase(StringBuilder str) {
        int count;

        count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i)) && isEnglishLetter(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    private static int countOfUpperCase(StringBuilder str) {
        int count;

        count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)) && isEnglishLetter(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    private static boolean isEnglishLetter(char ch) {
        boolean isEng;
        char[] englishLetters;

        ch = Character.toLowerCase(ch);
        isEng = false;
        englishLetters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < englishLetters.length; i++) {
            if (ch == englishLetters[i]) {
                isEng = true;
            }
        }
        return isEng;
    }

    private static void countLowerCaseAndUpperCase(StringBuilder str){
        int upperCase;
        int lowerCase;

        upperCase = countOfUpperCase(str);
        lowerCase = countOflowerCase(str);

        System.out.println("Строчных: " + lowerCase);
        System.out.println("Заглавных: " + upperCase);
    }

}
