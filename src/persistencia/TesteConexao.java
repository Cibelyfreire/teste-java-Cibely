
package persistencia;
import java.sql.Connection; 
import java.sql.SQLException; 

/**
 *
 * @author Cibely
 */
public class TesteConexao {
    public static void main(String[] args) throws SQLException {
         ConexaoBancoDados.getConexaoMySQL();
         System.out.println("Conexão aberta!");
         
    
    }
}
