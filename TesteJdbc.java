package testejdbc;

public class TesteJdbc {

    public static void main(String[] args) {
       
        /*
        ESTANCIANDO O MEU BANCO
        
        */
        
         DBteste c = new DBteste();
        
        c.getConnection();
        c.fecharConexao();
    }
    
}
