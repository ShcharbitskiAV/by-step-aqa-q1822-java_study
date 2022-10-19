package by.step.teach_java.class_work.cw_22092022_keyword_this;

import java.util.Objects;

public class City {

    private String country;
    private String name;
    private int countOfPeople;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountOfPeople(int countOfPeople) {
        this.countOfPeople = countOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return countOfPeople == city.countOfPeople &&
                Objects.equals(country, city.country) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, name, countOfPeople);
    }

    @Override
    public String toString() {
        return "City{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", countOfPeople=" + countOfPeople +
                '}';
    }
}
