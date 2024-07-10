import ConexaoJava.UsuarioDAOJava.UsuarioDAO;
import UsuarioJava.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        Usuario usuario = new Usuario("Thiago Ferraz", "dev.ferraz86@gmail.com", "senha123");
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastraUsuario(usuario);

    }
}
