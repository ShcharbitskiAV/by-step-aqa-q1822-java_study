package by.step.teach_java.class_work.cw_22092022_keyword_this;

public class Main {

    public static void main(String[] args) {
        Country strana = new Country();
        strana.setName("Belarus");
        strana.setContinent("Europe");
        strana.toString();

        City gorod = new City();
        gorod.setName("Vitebsk");
        gorod.setCountry("Belarus");
        gorod.setCountOfPeople(370000);
        gorod.toString();

        City gorod2 = new City();
        gorod2.setName("Wroclaw");
        gorod2.setCountry("Poland");
        gorod2.setCountOfPeople(1250000);
        gorod2.toString();

    }
}
