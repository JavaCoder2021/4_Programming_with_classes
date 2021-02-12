package by.epam.strings.regular_expressions;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
 */
public class Task1 {
    public static void main(String[] args) {
        String text;

        text = "" +
                "Lorem ipsum dolor sit amet consectetur aadipiscing elit. Ut mi ipsum tempor non est eget tincidunt ornare libero? Proin ut mauris non orci ullamcorper blandit eu dapibus velit. Etiam vel neque molestie nisi mollis porta! Sed lacus sapien rutrum eget lectus ut dapibus bibendum nisi. Vivamus lectus mauris iaculis eu neque vestibulum tristique eleifend ligula. Praesent mi libero efficitur tempor sem i, auctor rhoncus augue. Vivamus pharetra metus arcu et consectetur lectus scelerisque quis. Suspendisse imperdiet erat ac dui ullamcorper fermentum. Aliquam cursus sem lobortis varius mauris et finibus justo. Etiam elit justo egestas id turpis eget finibus dapibus lectus. Vestibulum quis lectus non mauris tristique iaculis a et mi. Vivamus volutpat eros ut nulla ultricies vel rhoncus eros hendrerit. Nullam et gravida nulla. Cras non mi laoreet laoreet odio ultrices vulputate elit. Curabitur non velit et risus sagittis fermentum.\n" +
                "Cras aliquet tortor ut vestibulum ultricies. Sed sagittis sodales quam accumsan molestie eros. Ut ut tincidunt urna. Mauris vel nisi in sapien laoreet sodales. Praesent congue tortor in turpis vehicula tempor. Aliquam ut feugiat risus. Mauris et magna molestie nisi scelerisque faucibus. Curabitur pretium consectetur ante quis fringilla elit faucibus vitae.\n" +
                "Nulla in bibendum libero. In velit mauris tristique a ornare eget placerat vel ligula. Donec tincidunt ultrices urna at scelerisque. Vivamus quis sapien dictum consequat sapien vitae efficitur nibh. Maecenas nulla dolor suscipit nec massa vel elementum maximus dui. Praesent tincidunt fermentum velit. Sed eu eros turpis. Suspendisse tristique viverra aliquam. Aliquam ullamcorper tempus ipsum luctus imperdiet est porta nec. Integer et rhoncus ex. Aenean in imperdiet sem. Nulla cursus nibh id gravida euismod. Cras eu lacinia nibh et interdum libero.\n" +
                "Proin ut vehicula orci nec convallis eros. Mauris nec lectus arcu. Pellentesque tristique auctor imperdiet. Etiam leo velit vestibulum eu lacinia sit amet pretium a ex. Praesent ornare ligula magna eget convallis mauris facilisis in. Integer et erat congue sagittis leo condimentum aliquam risus. Maecenas sit amet maximus eros. Aliquam convallis justo a turpis elementum ultrices. Proin porta consectetur feugiat. Praesent odio erat vehicula sed mauris finibus ultricies bibendum urna. Proin tincidunt lobortis neque sit amet tempus mi pharetra a.\n" +
                "In tristique pretium eros at maximus. Ut at lectus aliquet elementum justo et sollicitudin augue. Ut fermentum pretium viverra. Proin convallis malesuada quam sed faucibus. Phasellus a ultrices orci sit amet interdum orci. Interdum et malesuada fames ac ante ipsum primis in faucibus. Phasellus in urna at purus sollicitudin interdum id ut enim. Nam ac rhoncus purus. Suspendisse vestibulum dui non tellus lobortis eu ultricies nunc varius. Etiam tincidunt sit amet velit quis placerat. Morbi imperdiet dui molestie tempor dapibus. Donec ullamcorper elit vitae urna sodales vulputate.";

        ui(text);
    }

    private static String sortLexems(String text) {
        StringBuilder tempString;
        String[] paragraphs;
        String[] sentences;
        String[] words;
        char sign;
        boolean sorted;
        String substr;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter symbol or string: ");

        while (!in.hasNextLine()) {
            in.next();
            System.out.println("Enter symbol or string: ");
        }
        substr = in.nextLine();

        paragraphs = splitParagraphs(text);

        for (int i = 0; i < paragraphs.length; i++) {

            sentences = splitSentences(paragraphs[i]);

            for (int j = 0; j < sentences.length; j++) {

                tempString = new StringBuilder(sentences[j]);
                sign = tempString.charAt(tempString.length() - 1);
                tempString.deleteCharAt(tempString.length() - 1);
                sentences[j] = tempString.toString().toLowerCase(Locale.ROOT);

                words = splitWords(sentences[j]);

                words = sortLexemsBySubstringsCount(words, substr);
                Arrays.sort(words);
                words = sortLexemsBySubstringsCount(words, substr);

                tempString = new StringBuilder();
                for (int k = 0; k < words.length; k++) {
                    tempString.append(words[k]).append(" ");
                }
                tempString.deleteCharAt(tempString.length() - 1);
                tempString.append(sign);

                sentences[j] = tempString.toString().toLowerCase(Locale.ROOT);
                sentences[j] = Character.toUpperCase(sentences[j].charAt(0)) + sentences[j].substring(1);
            }

            tempString = new StringBuilder();
            for (int j = 0; j < sentences.length; j++) {
                tempString.append(sentences[j]).append(" ");
            }
            tempString.deleteCharAt(tempString.length() - 1);
            paragraphs[i] = tempString.toString();
        }

        tempString = new StringBuilder();
        for (int i = 0; i < paragraphs.length; i++) {
            tempString.append(paragraphs[i]).append("\n");
        }
        tempString.deleteCharAt(tempString.length() - 1);
        text = tempString.toString();

        return text;
    }

    private static String[] sortLexemsBySubstringsCount(String[] lexems, String substr) {
        boolean sorted;
        String tempString;

        sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lexems.length - 1; i++) {
                if (countingSubstring(lexems[i], substr) < countingSubstring(lexems[i + 1], substr)) {
                    tempString = lexems[i];
                    lexems[i] = lexems[i + 1];
                    lexems[i + 1] = tempString;
                    sorted = false;
                }
            }
        }
        return lexems;
    }

    // searching substrings in words and returning count of matches
    private static int countingSubstring(String word, String substr) {
        int count;

        count = 0;

        Pattern pattern = Pattern.compile(substr);
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()) {
            count++;
        }

        return count;

    }

    // sort all words in sentences by up
    private static String sortWordByLength(String text) {

        String[] paragraphs = splitParagraphs(text);

        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);

            for (int j = 0; j < sentences.length; j++) {
                sentences[j] = wordsSorting(sentences[j]);
            }

            StringBuilder paragraphBuilder = new StringBuilder();
            for (int j = 0; j < sentences.length; j++) {
                paragraphBuilder.append(sentences[j]).append(" ");
            }

            paragraphBuilder.deleteCharAt(paragraphBuilder.length() - 1);

            paragraphs[i] = paragraphBuilder.toString();
        }

        StringBuilder textBuilder = new StringBuilder();

        for (int i = 0; i < paragraphs.length; i++) {
            textBuilder.append(paragraphs[i]).append("\n");
        }

        textBuilder.deleteCharAt(textBuilder.length() - 1);

        text = textBuilder.toString();

        return text;
    }

    // sort paragraphs by sentence's length
    private static String sortParagraphsBySentencesCount(String text) {
        String[] paragraphs;
        String temp;
        StringBuilder str;
        boolean sorted;

        paragraphs = splitParagraphs(text);
        sorted = false;
        str = new StringBuilder();

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < paragraphs.length - 1; i++) {
                if (splitSentences(paragraphs[i]).length > splitSentences(paragraphs[i + 1]).length) {
                    temp = paragraphs[i];
                    paragraphs[i] = paragraphs[i + 1];
                    paragraphs[i + 1] = temp;
                    sorted = false;
                }
            }

        }

        for (String paragraph : paragraphs) {
            str.append(paragraph).append("\n");
        }

        return str.toString();

    }

    // sort words by up
    private static String wordsSorting(String sentence) {
        String[] words;
        StringBuilder tempStringBuilder;
        char sign;
        boolean sorted;
        String tempString;

        sorted = false;

        tempStringBuilder = new StringBuilder(sentence);
        sign = tempStringBuilder.charAt(tempStringBuilder.length() - 1); // "sign" - last StringBuilder's element ("!", "?" , ".")
        tempStringBuilder.deleteCharAt(tempStringBuilder.length() - 1); // delete "sign" from StringBuilder
        sentence = tempStringBuilder.toString();
        words = splitWords(sentence); // split sentences to word's array

        // sort array by word's length
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].length() > words[i + 1].length()) {
                    tempString = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = tempString;
                    sorted = false;
                }
            }
        }

        tempStringBuilder = new StringBuilder();
        // create new sentence from word's array
        for (String word : words) {
            tempStringBuilder.append(word).append(" ");
        }
        tempStringBuilder.deleteCharAt(tempStringBuilder.length() - 1); // delete whitespace in the end of sentence
        tempStringBuilder.append(sign); // add sign (".", "!", "?") to the sentence's end

        //first sentence's letter do to upper case, other - to lower cas
        sentence = tempStringBuilder.toString().toLowerCase(Locale.ROOT);
        sentence = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);

        return sentence;
    }

    // split sentences to word's array
    private static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }

    // split paragraphs to sentence's array
    private static String[] splitSentences(String paragraph) {
        Pattern pattern = Pattern.compile("\\.*[!?.]\\s*");
        String[] sentences;
        StringBuilder[] tempStingBuilder;
        char[] sings;
        int j;

        sentences = pattern.split(paragraph);
        tempStingBuilder = new StringBuilder[sentences.length];
        sings = new char[sentences.length];
        j = 0;

        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) == '.' || paragraph.charAt(i) == '!' || paragraph.charAt(i) == '?') {
                sings[j] = paragraph.charAt(i);
                j++;
            }
        }

        for (int i = 0; i < tempStingBuilder.length; i++) {
            tempStingBuilder[i] = new StringBuilder(sentences[i] + sings[i]);
        }

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = tempStingBuilder[i].toString();
        }

        return sentences;
    }

    // split text to paragraph's array
    private static String[] splitParagraphs(String text) {
        Pattern pattern = Pattern.compile("\n");
        return pattern.split(text);
    }

    private static void ui(String text) {
        int choose;
        Scanner in = new Scanner(System.in);
        System.out.println("" +
                "Menu:\n" +
                "1. Show text\n" +
                "2. Sort paragraphs by sentences's count.\n" +
                "3. Sort words in sentences by length.\n" +
                "4. Sort lexems by count of symbol.\n" +
                "Please select the action:\t");

        while (!in.hasNextInt()) {
            in.next();
            System.out.println("" +
                    "Menu:\n" +
                    "1. Show text\n" +
                    "2. Sort paragraphs by sentences's count.\n" +
                    "3. Sort words in sentences by length.\n" +
                    "4. Sort lexems by count of symbol.\n" +
                    "Please select the action:\t");
        }
        choose = in.nextInt();

        switch (choose) {
            case 1:
                System.out.println(text);
                ui(text);
                break;
            case 2:
                System.out.println(sortParagraphsBySentencesCount(text));
                ui(text);
                break;
            case 3:
                System.out.println(sortWordByLength(text));
                ui(text);
                break;
            case 4:
                System.out.println(sortLexems(text));
                ui(text);
                break;
            default:
                System.out.println("Incorrect choose!");
                ui(text);
        }
    }

}
