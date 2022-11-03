package by.step.teach_java.home_work.hw_9_wrapper_classes;

public class ConnectionManager {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(getConnection());
        }
    }

    private static Connection[] array = new Connection[10];

    static int connectCounter = array.length;

    public static Connection getConnection() {

        if (connectCounter != 0) {
            return array[array.length - connectCounter--];
        }

        return null;
    }


}

class Connection {

    Connection() {

    }

    public void doSomething() {

    }
}
