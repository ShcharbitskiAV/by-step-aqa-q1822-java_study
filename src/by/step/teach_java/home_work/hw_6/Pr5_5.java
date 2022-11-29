package by.step.teach_java.home_work.hw_6;

public class Pr5_5 {

    public static void main(String[] args) {

        Dog d = new Dog(); //1
        Cat c = new Cat(); //2
        Cat c1 = new Cat("Cat says mew-mew"); //3
        Horse h1 = new Horse(); //4
        h1.horse();
        h1.say();

        h1.horse(2);
        h1.say();

        h1.horse(1.5, 4);//5
        h1.say();

        h1.horse(4, 1.5);
        h1.say();

        Part_6 part_6 = new Part_6(); //6

        part_6.second();

        Part_7 part_7 = new Part_7("HO_HO_HO");//7
    }
}

class Dog {

}

class Cat {

    public Cat() {
        System.out.println("Mew");
    }

    public Cat(String s) {
        System.out.println(s);
    }
}

class Horse {

    String voice;

    void horse() {
        voice = "Gav";
    }

    void horse(int a) {
        voice = "RRRR";
    }

    void horse(double x) {
        voice = "Gav-Gav";
    }

    void horse(double x, int y) {
        voice = "r-r-r-r-r-r";
    }

    void horse(int x, double y) {
        voice = "gav-gav-gav";
    }

    void say() {
        System.out.println("Лошадка говорит " + voice);
    }
}

class Part_6 {
    int a;
    char e = 'R';

    void second() {
        first();
        this.first();
    }

    void first() {
        System.out.println("Значение переменной a=" + a + " Значение переменной e=" + e);
    }
}

class Part_7 {
    public Part_7() {
        System.out.println("Hello from first constructor");
    }

    public Part_7(String s) {
        this();
        System.out.println("Hello from second constructor " + s);
    }
}
