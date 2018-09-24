/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import cognus.Livro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import persistencia.LivroDao;

/**
 *
 * @author Cibely
 */
public class LivroDao {
    private Connection connection;
    private int id;
    private String autor;
    private String nomeDoLivro;
    private int anoDeEdicao;
    private double notaDoUsuario;
    private String resenha;
    private java.util.Date dataDeCadastro;
    
    public LivroDao() {
        ConexaoBancoDados conexao = new ConexaoBancoDados(); 
        this.connection = conexao.getConnection();
 }


public void adiciona(Livro livro) throws SQLException{
    String sql = "INSERT INTO livro (autor, nome_Livro, ano_edicao,nota_usuario, resenha, dataDe_cadastro VALUES (?,?,?,?,?,?)";
           
   try{
       PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, livro.getAutor());
            stmt.setString(2, livro.getNomeDoLivro());
            stmt.setInt(3, livro.getAnoDeEdicao());
            stmt.setDouble(4, livro.getNotaDoUsuario());
            stmt.setString(5, livro.getResenha());
            stmt.setDate(6, (Date) livro.getDataDeCadastro());
            stmt.execute();
            stmt.close();
    } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
    
}
