package bancodedados;

public class BancoDeDados {

    public static void main(String[] args) {
       
        /*
        ESTANCIANDO O MEU BANCO
        
        */
        
         Conexao c = new Conexao();
        
        c.abrirBanco();
        c.fecharBanco();
    }
    
}
