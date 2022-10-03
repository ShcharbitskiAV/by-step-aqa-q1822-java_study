package by.step.teach_java.class_work.cw_03102022;

import java.text.Annotation;


@TaskAnnotationTwo(2023)
@TaskAnnotationTwo(2024)
@TaskAnnotationTwo(2025)

public class Main {

    public static void main(String[] args) {
        showMethod();

    }



    public static void showMethod() {
        Main obj = new Main();
        try {
            Annotation[] array = (Annotation[]) obj.getClass().getAnnotations();
            for (Annotation annotation : array) {
                System.out.println(annotation);
            }

        } catch (Exception ex) {

        }

    }
}
