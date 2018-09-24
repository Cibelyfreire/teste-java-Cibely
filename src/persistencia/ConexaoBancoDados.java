/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {

    public static String status = "Não conectou...";

    public ConexaoBancoDados() {

    }

    public static java.sql.Connection getConexaoMySQL() throws SQLException {

        Connection connection = null;          //atributo do tipo Connection

        try {

            Class.forName("com.mysql.jdbc.Driver");

            String serverName = "localhost";

            String mydatabase = "cadastro";

            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

            String username = "root";        //nome de um usuário de seu BD      

            String password = "12345";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {

                status = ("STATUS--->Conectado com sucesso!");

            } else {

                status = ("STATUS--->Não foi possivel realizar conexão");

            }

            return connection;

        } catch (ClassNotFoundException e) {
            throw new AssertionError(e);

        } catch (SQLException e) {

            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;

        }
    }

    public static String statusConection() {

        return status;
    }

    public static boolean FecharConexao() {

        try {

            ConexaoBancoDados.getConexaoMySQL().close();

            return true;

        } catch (SQLException e) {

            return false;

        }
    }

    public static java.sql.Connection ReiniciarConexao() throws SQLException {

        FecharConexao();
        return ConexaoBancoDados.getConexaoMySQL();

    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection ("jdbc:mysql://localhost/cadastro", "root", "12345");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
       }

    
    }


