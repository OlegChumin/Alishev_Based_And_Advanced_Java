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
}
