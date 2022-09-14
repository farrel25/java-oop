package farrel.putra.application;

import farrel.putra.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Farrel", null);
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null)
            throw new DatabaseError("Tidak bisa connect ke database");
    }
}
