package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/NesneyeYonelik"; // Veritabanı URL'sini güncelleyin
    private static final String USER = "postgres"; // PostgreSQL kullanıcı adınızı yazın
    private static final String PASSWORD = "12345"; // PostgreSQL şifrenizi yazın

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
