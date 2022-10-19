package by.step.teach_java.class_work.cw_29092022_enum_interface;

public enum Days {

    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String nameOfDay;

    Days(String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }
}