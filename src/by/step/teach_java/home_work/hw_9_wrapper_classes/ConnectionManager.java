package by.step.teach_java.home_work.hw_9_wrapper_classes;

public class ConnectionManager {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getObjects());
        }
    }

    private static Connection[] connection = {new Connection(), new Connection(),
            new Connection(), new Connection(), new Connection()};
    static int freeConnections = connection.length;

    public static Connection getObjects() {

        if (freeConnections != 0) {
            return connection[connection.length - freeConnections--];
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
