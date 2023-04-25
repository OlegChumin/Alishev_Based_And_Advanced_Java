package Advanced_Java.Part_04_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Lesson_033 {
    public static void main(String[] args) {
        String text = "Привет!\n" +
                "\n" +
                "Мой адрес электронной почты: john@example.com.\n" +
                "Если у вас есть вопросы, пожалуйста, напишите мне.\n" +
                "\n" +
                "Еще один адрес электронной почты: sarah@mail.com.\n" +
                "Мы сможем обсудить все детали нашего проекта по электронной почте.\n" +
                "\n" +
                "И, наконец, последний адрес электронной почты: support@company.com.\n" +
                "Если у вас возникнут проблемы, не стесняйтесь обращаться к нашей службе поддержки.\n" +
                "\n" +
                "С наилучшими пожеланиями,\n" +
                "Ваш коллега";

        try {
            Pattern eMail = Pattern.compile("\\w+@\\w+\\.[a-z0-9]{2,3}"); //Factory method
            Matcher matcher = eMail.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException patternSyntaxException) {
            // обработка ошибки компиляции регулярного выражения
            patternSyntaxException.printStackTrace();
        } catch (IllegalStateException illegalStateException) {
            // обработка ошибки вызова метода find() в неправильном состоянии
            illegalStateException.printStackTrace(); //Вызов метода printStackTrace() выводит полную трассировку стека
            // исключения в консоль, что может помочь в диагностике ошибок и определении их причин.
        }

        /**
         * Выражение matcher.find() используется для поиска следующего вхождения регулярного выражения в тексте.
         * Метод find() ищет следующую последовательность символов, которая соответствует шаблону регулярного выражения,
         * начиная с позиции, на которой остановился предыдущий поиск. Если следующее вхождение найдено, то метод find()
         * вернет true, иначе - false.
         *
         * Метод matcher.group() возвращает строку, соответствующую последнему найденному вхождению регулярного
         * выражения. После вызова метода find(), текущее вхождение будет доступно через метод group(). Если find()
         * вернул true, то group() вернет строку, соответствующую найденному вхождению. Если find() вернул false, то
         * вызов group() приведет к исключению.
         * */
    }
}
