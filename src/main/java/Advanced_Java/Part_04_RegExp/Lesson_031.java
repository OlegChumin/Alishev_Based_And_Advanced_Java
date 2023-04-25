package Advanced_Java.Part_04_RegExp;

public class Lesson_031 {
    public static void main(String[] args) {
        String a = "1234";
        String b = new String("1234"); //true
        System.out.println(a.matches(b));

        String c = new String("12345"); //false
        System.out.println(a.matches(c));

        /**
         * \\d - одна цифра
         *
         * */
        String str1 = "1";
        String str2 = new String("\\d"); //false
        System.out.println("str1=" + str1 + " matches(str2=" + str2 +") == " + str1.matches(str2));
    }
}
