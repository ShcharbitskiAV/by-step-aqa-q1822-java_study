package by.step.teach_java.home_work.hw_6;

public class Pr5_1 {
    Integer i = 8;
    Integer i1 = 10;
    Integer i2 = 25;

    Boolean b = true;
    Boolean b1 = false;
    Boolean b2 = true;

    Double d = 2.65;
    Double d1 = 33.2;
    Double d2 = 22.32;

    Character c = 'a';
    Character c1 = 'h';

    Short s = 88;
    Short s1 = (short) 35;
    Short s2 = 78;

    Long l = 77777l;
    Long l1 = 32312l;
    Long l2 = 5435345l;

    Float f = 34.66f;
    Float f1 = 66.55f;
    Float f2 = 95.33f;

    Byte by = 6;
    Byte by1 = (byte) -60;
    Byte by2 = 127;

    public static void main(String[] args) {
        Pr5_1 pr5_1 = new Pr5_1();
        System.out.println("Integern i = " + pr5_1.i + " Integer i1 = " + pr5_1.i1 + " Integer i2 = " + pr5_1.i2);
        System.out.println("Boolean b = " + pr5_1.b + " Boolean b1 = " + pr5_1.b1 + " Boolean b2 = " + pr5_1.b2);
        System.out.println("Double d = " + pr5_1.d + " Double d1 = " + pr5_1.d1 + " Double d2 = " + pr5_1.d2);
        System.out.println("Character c = " + pr5_1.c + " Character c1 = " + pr5_1.c1);
        System.out.println("Short s = " + pr5_1.s + " Short s1 = " + pr5_1.s1 + " Short s2 = " + pr5_1.s2);
        System.out.println("Long l = " + pr5_1.l + " Long l1 = " + pr5_1.l1 + " Long i2 = " + pr5_1.l2);
        System.out.println("Float f = " + pr5_1.f + " Float f1 = " + pr5_1.f1 + " Float f2 = " + pr5_1.f2);
        System.out.println("Byte by = " + pr5_1.by + " Byte by1 = " + pr5_1.by1 + " Byte by2 = " + pr5_1.by2);

        Integer a = Integer.valueOf(55);
        Double b = Double.valueOf(44.3);
        Float c = Float.valueOf("55.44");
        Integer d = Integer.valueOf("33", 16);
        System.out.println("Ìועמה valueOf");
        System.out.println("Integer.valueOf(55) = " + a + " Double.valueOf(44.3) " + b + " Float.valueOf"
                + "(\"55.44\")" + c + " Integer.valueOf(\"33\",16)" + d);

        Integer a1 = 16;
        System.out.println("Ìועמה xXXValue Byte " + a1.byteValue());
        System.out.println("Ìועמה xXXValue Double " + a1.doubleValue());

        int a2 = Integer.parseInt("56");
        double d1 = Double.parseDouble("28");
        int i3 = Integer.parseInt("54", 8);
        System.out.println("Ìועמה parseIntXxx(): ");
        System.out.println("ParseInt = " + a2 + " ParseDouble = " + d1 + " ParseInt (i3 גמסüלטנטקםמו 54) = " + i3);

    }
}
