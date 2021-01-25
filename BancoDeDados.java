package bancodedados;

public class BancoDeDados {

    public static void main(String[] args) {
       
        /*
        ESTANCIANDO o BANCO
        */
        
         Conexao c = new Conexao();
        
        c.abrirBanco();
        c.fecharBanco();
    }
    
}
