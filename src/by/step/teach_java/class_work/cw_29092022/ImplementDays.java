package by.step.teach_java.class_work.cw_29092022;

public class ImplementDays implements CheckDaysOfWeek {

    @Override
    public void checkDays(Days element) {
        switch (element) {

            case MONDAY: {
                if (element.getNameOfDay().equals("Понедельник")) {
                    System.out.println("Текст верный: " + element.getNameOfDay());
                } else {
                    System.out.println("Текст неверный: " + element.getNameOfDay());
                }
            }

            case TUESDAY: {
                if (element.getNameOfDay().equals("Вторник")) {
                    System.out.println("Текст верный: " + element.getNameOfDay());
                } else {
                    System.out.println("Текст неверный: " + element.getNameOfDay());
                }
            }


            case WEDNESDAY: {
                if (element.getNameOfDay().equals("Среда")) {
                    System.out.println("Текст верный: " + element.getNameOfDay());
                } else {
                    System.out.println("Текст неверный: " + element.getNameOfDay());
                }
            }


            case THURSDAY: {
                if (element.getNameOfDay().equals("Четверг")) {
                    System.out.println("Текст верный: " + element.getNameOfDay());
                } else {
                    System.out.println("Текст неверный: " + element.getNameOfDay());
                }
            }

            case FRIDAY: {
                if (element.getNameOfDay().equals("Пятница")) {
                    System.out.println("Текст верный: " + element.getNameOfDay());
                } else {
                    System.out.println("Текст неверный: " + element.getNameOfDay());
                }
            }


            case SATURDAY: {
                if (element.getNameOfDay().equals("Суббота")) {
                    System.out.println("Текст верный: " + element.getNameOfDay());
                } else {
                    System.out.println("Текст неверный: " + element.getNameOfDay());
                }
            }


            case SUNDAY: {
                if (element.getNameOfDay().equals("Воскресенье")) {
                    System.out.println("Текст верный: " + element.getNameOfDay());
                } else {
                    System.out.println("Текст неверный: " + element.getNameOfDay());
                }
            }
            default: System.out.println("Oops");
        }


    }
}
