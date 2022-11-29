package by.step.teach_java.home_work.hw_5_arrays_loops.Pr4_5;

public class Pr4_5 {

    public static void main(String[] args) {
        String s = "Peter, 2013, software developer, 500--John, 2012, CEO, 10000--David, 2014, technician, 300--Ivan, 1990, DevOps, 8000--Petr, 2000, Developer, 8000";
        String[] arrayOfStringPerson = s.split("--");
        Person[] persons = new Person[arrayOfStringPerson.length];

        String[] tempInformationAboutPerson;

        Person p;

        for (int i = 0; i < arrayOfStringPerson.length; i++) {
            tempInformationAboutPerson = arrayOfStringPerson[i].split(", ");
            p = new Person(tempInformationAboutPerson[0], tempInformationAboutPerson[1], tempInformationAboutPerson[2], tempInformationAboutPerson[3]);
            persons[i] = p;
        }

        for (Person pers : persons) {
            System.out.println(pers.toString());
        }

    }

}


class Person {
    String name, year, position, sallary;

    public Person(String name, String year, String position, String sallary) {
        this.name = name;
        this.year = year;
        this.position = position;
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", position='" + position + '\'' +
                ", sallary='" + sallary + '\'' +
                '}';
    }
}
