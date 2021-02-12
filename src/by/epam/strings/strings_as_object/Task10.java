package by.epam.strings.strings_as_object;

/*
10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
 */
public class Task10 {
    public static void main(String[] args) {
        StringBuilder text;

        text = new StringBuilder("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In at tellus sed dui suscipit " +
                "egestas. Aliquam erat leo, egestas at eros a, fringilla auctor quam? Quisque lacinia odio sit amet lacus " +
                "volutpat molestie. Suspendisse in orci eu dolor mollis rutrum quis in ipsum. Quisque lobortis id sem et " +
                "condimentum. Aliquam id quam sit amet tortor luctus rhoncus! Suspendisse in eleifend massa. Fusce neque nisl, " +
                "viverra vitae gravida at, ornare et leo. Praesent auctor lectus at turpis auctor, malesuada laoreet magna facilisis. " +
                "Etiam id ante ante! Sed dignissim nisl eget urna pharetra, id sodales lacus aliquet? Praesent nunc quam, pretium " +
                "aliquam lorem tempus, lobortis sodales sapien. Nullam porta euismod efficitur.");

        printResult(countOfSentences(text));
    }

    private static int countOfSentences(StringBuilder str) {
        int count;

        count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isEndOfSentence(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEndOfSentence(char ch) {
        boolean isEnd;

        isEnd = false;

        if (ch == '.' || ch == '!' || ch == '?') {
            isEnd = true;
        }

        return isEnd;
    }

    private static void printResult(int count) {
        System.out.println("В тексте " + count + " предложений.");
    }
}
