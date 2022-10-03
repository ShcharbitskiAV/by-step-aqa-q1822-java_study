package by.step.teach_java.class_work.cw_03102022;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface TaskAnnotation {
    TaskAnnotationTwo [] value();
}
