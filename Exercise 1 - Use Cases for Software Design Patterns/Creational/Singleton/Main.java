package Singleton;

class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;

    private DatabaseConnectionManager() {
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }

    public void disconnect() {
        System.out.println("Disconnected from the database.");
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager dbManager1 = DatabaseConnectionManager.getInstance();
        dbManager1.connect();

        DatabaseConnectionManager dbManager2 = DatabaseConnectionManager.getInstance();
        dbManager2.disconnect();

        System.out.println(dbManager1 == dbManager2);
    }
}
