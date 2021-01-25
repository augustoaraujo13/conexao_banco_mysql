package BancoDeDados;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private Connection conn = null;

    public ConexaoBanco() {
    }

    public static Connection abrirBanco() {

        if (conn == null) {

            try {

                conn = (Connection) DriverManager.getConnection("URL","USUARIO", "SENHA");
                
                /*
                Exemplo de URL : jdbc:mysql://Endereço_do_banco/nome_do_banco
                Exemplo de USUARIO: root
                Exemplo de SENHA: 12345
                */
            } catch (SQLException e) {
                throw new BancoException(e.getMessage());
            }
        }
        return conn;
    }

    public static Connection fecharBanco() {

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new BancoException(e.getMessage());
            }

        }

        return conn;
    }

}
