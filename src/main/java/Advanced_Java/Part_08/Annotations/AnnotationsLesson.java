package Advanced_Java.Part_08.Annotations;

/**
 Аннотация @SuppressWarnings используется для подавления предупреждений компилятора. Например, @SuppressWarnings
 ("unchecked") отключает предупреждения, связанные с "сырыми" типами (Raw Types).
 */
@MyAnnotation
public class AnnotationsLesson {
    @MyAnnotation
    private String name;

    @MyAnnotation
    public AnnotationsLesson(@MyAnnotation String name) {
        this.name = name;
    }

    @MyAnnotation
    public String getName() {
        return name;
    }

    @MyAnnotation
    public void setName(@MyAnnotation String name) {
        this.name = name;
    }

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {
    }

    @Deprecated
    public static void someOldMethod() {
        System.out.println();
    }

    @SuppressWarnings("unchecked") //Indicates that the named compiler warnings should be suppressed in the annotated element
    public static void someMethod() {
        System.out.println();
    }

    /**
     * Функциональность varargs позволяет создавать методы с переменным количеством аргументов. До Java 5 единственной
     * возможностью создания методов с необязательными параметрами было создание нескольких методов, каждый из которых
     * с разным количеством параметров. Varargs позволяет создать один метод с переменным количеством параметров с
     * помощью следующего синтаксиса:
     * // можно написать так:
     * void printStrings(String... stringList)
     *
     * // вместо этого мы делаем:
     * void printStrings(String string1, String string2)
     * Однако при использовании в аргументах метода обобщенных типов выдаются предупреждения.
     * Аннотация @SafeVarargs позволяет подавить их:
     * private void printStringVarargs(String... tests) {...}
     * private void printStringSafeVarargs(List<String>... testStringLists) {...}
     * Методы printString() и printStringVarargs() приводят к одинаковому результату. Но при компиляции для метода
     * printStringSafeVarargs() выдается предупреждение, поскольку в нем используются обобщенные типы:
     * Добавив аннотацию @SafeVarargs, мы можем избавиться от этого предупреждения:
     * @SafeVarargs
     * private void printStringSafeVarargs(List<String>... testStringLists) {...}
     */
    @SafeVarargs
    public void method(Integer x, String... str) {

    }
}

class SomeClass {
    public static void main(String[] args) {
        AnnotationsLesson.someOldMethod(); //Deprecated
    }

}
