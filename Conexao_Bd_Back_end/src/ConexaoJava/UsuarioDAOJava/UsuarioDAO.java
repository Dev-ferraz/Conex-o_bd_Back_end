package ConexaoJava.UsuarioDAOJava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexaoJava.Conexao;
import UsuarioJava.Usuario;

public class UsuarioDAO {
    public void cadastraUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
        Connection conexao = Conexao.getConexao();

        if (conexao != null) {
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getEmail());
                stmt.setString(3, usuario.getSenha());

                stmt.executeUpdate();
                System.out.println("Usuário cadastrado com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao cadastrar o usuário.");
                e.printStackTrace();
            } finally {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar a conexão.");
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("A conexão com o banco de dados não foi estabelecida.");
        }
    }
}
    

