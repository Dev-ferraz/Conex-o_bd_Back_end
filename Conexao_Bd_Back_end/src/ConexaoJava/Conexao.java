package ConexaoJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/cadastra_bd";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConexao() {
        Connection conexao = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Falha na conexão com o banco de dados.");
            e.printStackTrace();
        }
        return conexao;
    }
}