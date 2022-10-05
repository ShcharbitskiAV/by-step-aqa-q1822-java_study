package by.step.teach_java.home_work.hw_8.Pr6_2;

public class Bird {
    static String name;
    static int ageOfBird;

    public Bird () {
        System.out.println("Birds is very important for ecology");
    }

    public static void main(String[] args) {
        Bird.name = "Crow";
        Bird.ageOfBird = 3;


        System.out.println(Bird.name);
        System.out.println(Bird.ageOfBird);

    }
}


