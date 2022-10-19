package by.step.teach_java.class_work.cw_03102022_interfaces;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(TaskAnnotation.class)

public @interface TaskAnnotationTwo {
    int value();
}
