package br.upf.sd.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {
    // Variáveis com o caminho do banco de dados.
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql:ec2-52-67-44-247.sa-east-1.compute.amazonaws.com:5432/trabalhosd";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "";

    // metodo para criar a conexao com o banco
    public Connection abrirConexao() {

        Connection conexao = null;

        try {

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

        } catch (Exception e) {
            System.out.println("Erro ao criar conexao com o banco: " + URL);
            e.printStackTrace();
        }
        return conexao;
    }

    //metodo para fechar conexao
    public void fecharConexao(Connection conexao, PreparedStatement pstmt, ResultSet rs) {

        try {

            if (conexao != null) {
                conexao.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (rs != null) {
                rs.close();
            }

        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao com o banco: " + URL);
        }
    }

}
