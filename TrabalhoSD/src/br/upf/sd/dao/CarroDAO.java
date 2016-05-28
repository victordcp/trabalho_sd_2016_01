package br.upf.sd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import br.upf.sd.factory.ConnectionFactory;
import br.upf.sd.model.Carro;

public class CarroDAO extends ConnectionFactory {

    private static CarroDAO instance;

    //metodo responsável por criar uma instancia da classe CarroDAO (Singleton)
    public static CarroDAO getInstance() {
        if (instance == null) {
            instance = new CarroDAO();
        }
        return instance;
    }

    //metodo para listar todos os carros do banco
    public ArrayList<Carro> listarTodos() {
        Connection conexao = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Carro> carros = null;

        conexao = abrirConexao();
        carros = new ArrayList<Carro>();

        try {
            pstmt = conexao.prepareStatement("select * from carros order by id");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                //Carro carro1 = new Carro(0, "marca", "modelo", Integer.SIZE, Float.NaN, Float.NaN, Character.MIN_VALUE);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar todos os carros: " + e);
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, pstmt, rs);
        }
        return carros;
        

    }
    
    
    //metodo para listar carros por id
    
    //metodo para alterar um carro
    
    //metodo para apagar um carro
    

}
