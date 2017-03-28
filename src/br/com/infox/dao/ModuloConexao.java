/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dao;

import java.sql.*;

/**
 *
 * @author rhuan
 */
public class ModuloConexao {

    //Método responsável por estabelecer a conexão com o BD

    public static Connection conector() {
        java.sql.Connection conexao = null;
        String status = "Não conectou...";
        //Chamando o driver do mysql presente em bibliotecas
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informações referentes ao BD
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "root";
        //Estabelecendo a conexão com o BD
        try {
            Class.forName(driver); // Executa o arquivo do driver
            // Obtem a conexao utiliando os parâmetros passados
            conexao = DriverManager.getConnection(url, user, password);
            //status = ("Banco de dados conectado com sucesso!");
            //System.out.println(status);
            return conexao;
        } catch (Exception e) {
            //status = (" ATENÇÃO!!\nFalha de conexão com o banco de dados!!\nErro:"+e);
            //System.out.println(status);
            return null;
        }
    }
}
