package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbFile {

    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

   
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✅ Conexão com o banco estabelecida com sucesso!");
            } catch (SQLException e) {
                System.err.println("❌ Erro ao conectar ao banco de dados: " + e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("🔒 Conexão com o banco encerrada.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Erro ao fechar a conexão: " + e.getMessage());
        }
    }
}
