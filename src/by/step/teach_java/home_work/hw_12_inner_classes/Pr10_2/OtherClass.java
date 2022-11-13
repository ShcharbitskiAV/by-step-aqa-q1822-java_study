package by.step.teach_java.home_work.hw_12_inner_classes.Pr10_2;

public class OtherClass {
    public static void main(String[] args) {
        FirstClass.SecondClass secondClass = new FirstClass.SecondClass();
        //создать объект внутреннего класса в отдельном нельзя. Если добавить static, то работает
    }
}
