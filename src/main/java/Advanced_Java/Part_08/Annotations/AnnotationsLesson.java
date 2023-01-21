package Advanced_Java.Part_08.Annotations;

import static java.lang.annotation.ElementType.METHOD;

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

    @SuppressWarnings({}) //Indicates that the named compiler warnings should be suppressed in the annotated element
    public static void someMethod() {
        System.out.println();
    }
}

class SomeClass {
    public static void main(String[] args) {
        AnnotationsLesson.someOldMethod(); //Deprecated
    }

}
