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
         + -> 1 или более
         * -> 0 или более
         ? -> 0 или 1 символов до (может быть, а может и не быть)
         (x|y|z) -> одна строка из множества строк
         * */
        String str1 = "1";
        String str2 = new String("\\d"); //true
        System.out.println("str1=" + str1 + " matches(str2=" + str2 +") == " + str1.matches(str2));

        String str3 = "113453454";
        String str4 = new String("\\d+"); //true "\\d+" -> 1 или более цифр
        System.out.println("str3=" + str3 + " matches(str5=" + str4 +") == " + str3.matches(str4));

        String str5 = "-41241";
        String str6 = new String("-\\d*"); //true "\\d*" -> 0 или более цифр
        System.out.println("str5=" + str5 + " matches(str6=" + str6 +") == " + str5.matches(str6));

        String str7 = "41241";
        String str8 = new String("-?\\d*"); //true "-?\\d*" -> знак - может быть или нет, d* -> от 0 цифр
        System.out.println("str7=" + str7 + " matches(str8=" + str8 +") == " + str7.matches(str8));

        String str9 = "+41241";
        String str10 = new String("-?\\d*"); //false "-?\\d*" -> знак +, d* -> от 0 цифр
        System.out.println("str9=" + str9 + " matches(str10=" + str10 +") == " + str9.matches(str10));

        String str11 = "+41241";
        String str12 = new String("-?\\d*"); //false "-?\\d*" -> знак +, d* -> от 0 цифр
        System.out.println("str11=" + str11 + " matches(str12=" + str12 +") == " + str11.matches(str12));

        String str13 = "41241";
        String str14 = "-41241";
        String str15 = "+41241";
        String regex3 = new String("(-|+|)?\\d+");
        System.out.println("str13=" + str13 + " matches(regex3" + regex3 +") == " + str13.matches(regex3)); //true
        System.out.println("str14=" + str14 + " matches(regex3" + regex3 +") == " + str14.matches(regex3)); //true
        System.out.println("str15=" + str15 + " matches(regex3" + regex3 +") == " + str15.matches(regex3)); //true
    }
}