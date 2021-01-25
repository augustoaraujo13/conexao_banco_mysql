package testejdbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBteste {

    private Connection conn = null;

    public DBteste() {
    }

    public Connection getConnection() {

        if (conn == null) {

            try {

                return conn = (Connection) DriverManager.getConnection("URL","USUARIO", "SENHA");
                
                /*
                Exemplo de URL : jdbc:mysql://Endereço_do_banco/nome_do_banco
                Exemplo de USUARIO: root
                Exemplo de SENHA: 12345
                */
            } catch (SQLException e) {
                throw new TesteException(e.getMessage());
            }
        }
        return conn;
    }

    public Connection fecharConexao() {

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new TesteException(e.getMessage());
            }

        }

        return conn;
    }

}
