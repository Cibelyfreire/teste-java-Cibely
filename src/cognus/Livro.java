/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cognus;

import java.util.Date;

/**
 *
 * @author Cibely
 */
public class Livro {
    private int id;
    private String autor;
    private String nomeDoLivro;
    private int anoDeEdicao;
    private double notaDoUsuario;
    private String resenha;
    private Date dataDeCadastro;
    
    public Livro (){
        
    }
    
    public Livro(String autor){
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public int getAnoDeEdicao() {
        return anoDeEdicao;
    }

    public void setAnoDeEdicao(int anoDeEdicao) {
        this.anoDeEdicao = anoDeEdicao;
    }

    public double getNotaDoUsuario() {
        return notaDoUsuario;
    }

    public void setNotaDoUsuario(double notaDoUsuario) {
        this.notaDoUsuario = notaDoUsuario;
    }

    public String getResenha() {
        return resenha;
    }

    public void setResenha(String resenha) {
        this.resenha = resenha;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public String getnomeDoLivro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getNotadoUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
