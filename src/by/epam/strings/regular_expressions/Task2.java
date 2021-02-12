package by.epam.strings.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2. Дана строка, содержащая следующий текст (xml-документ):
<notes>
    <note id = "1">
        <to>Вася</to>
        <from>Света</from>
        <heading>Напоминание</heading>
        <body>Позвони мне завтра!</body>
    </note>
        <note id = "2">
        <to>Петя</to>
        <from>Маша</from>
        <heading>Важное напоминание</heading>
    <body/>
    </note>
</notes>

Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.

 */
public class Task2 {
    public static void main(String[] args) {
        String xml;

        xml  = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "        <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "    <body/>\n" +
                "    </note>\n" +
                "</notes>";

        System.out.println(xmlParser(xml));
    }

    private static String xmlParser(String xml) {

        Pattern openedTag = Pattern.compile("<\\w.+?>");
        Pattern closedTag = Pattern.compile("</\\w.+?>");
        Pattern content = Pattern.compile(">.+?<");
        Pattern emptyTag = Pattern.compile("<\\w.+?>");

        StringBuilder strBuilder = new StringBuilder();

        String[] lines = xml.split("\n");

        for (String line : lines) {

            Matcher mOpenTag = openedTag.matcher(line);
            Matcher mClosedTag = closedTag.matcher(line);
            Matcher mContent = content.matcher(line);
            Matcher mEmptyTag = emptyTag.matcher(line);

            if (mOpenTag.find()) {
                strBuilder.append(mOpenTag.group());
                strBuilder.append(" <-- opened Tag.\n");
            }

            if (mClosedTag.find()) {
                strBuilder.append(mClosedTag.group());
                strBuilder.append(" <-- closed Tag.\n");
            }

            if (mContent.find()) {
                strBuilder.append(mContent.group(), 1, (mContent.group().length() - 1));
                strBuilder.append(" <-- content.\n");
            }

            if (mEmptyTag.find()) {
                strBuilder.append(mEmptyTag.group());
                strBuilder.append(" <-- empty Tag.\n");
            }

        }

        return strBuilder.toString();
    }
}