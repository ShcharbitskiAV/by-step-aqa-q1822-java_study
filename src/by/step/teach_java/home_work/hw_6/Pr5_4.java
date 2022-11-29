package by.step.teach_java.home_work.hw_6;

public class Pr5_4 {
    Integer i1, i2, i3;
    Double d1, d2, d3;

    public void sumInt(){
        i1 = 10;
        i2 = 40;
        i3 = i1 + i2;
        System.out.println("Сумма двух классов оберток типа Integer = " + i3);
    }

    public static void main(String[] args) {
        Pr5_4 pr5_4 = new Pr5_4();

        pr5_4.sumInt();

        pr5_4.d1 = 70.4;
        pr5_4.d2 = pr5_4.d1;
        pr5_4.d3 = pr5_4.d1;
        pr5_4.d3++;
        System.out.println("Ссылки в классе оберток: d1= " + pr5_4.d1 + " d2= " + pr5_4.d2 + " d3 ссылается на d1 d3++ = " + pr5_4.d3);

        pr5_4.i1 = 200;
        pr5_4.i2 = 200;
        pr5_4.i3 = pr5_4.i1;
        System.out.println(pr5_4.i1 == pr5_4.i3);
        System.out.println("Сравнение двух переменных i1 = i2 значение переменных 200 так как i1 and i2 > -127 and 128 (ссылки на объект разные) " + (pr5_4.i1 == pr5_4.i2));
        pr5_4.i1 = 30;
        pr5_4.i2 = 30;
        pr5_4.i3 = pr5_4.i1;
        System.out.println(pr5_4.i1.equals(pr5_4.i3));
        System.out.println("Сравнение двух переменных i1 = i2 значение переменных 30 так как i1 and i2  < -127 and 128 (работа с пулом) для \nпонимания использую метод equals т.к. хеш-код одинаковый " + pr5_4.i1.equals(pr5_4.i2));

    }
}
