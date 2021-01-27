/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.MatPrimaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class MatPrimaData extends Conexao{
    public MatPrimaData() throws Exception{}
    public boolean incluir(MatPrimaModel obj) throws Exception{
        String sql="INSERT INTO matPrima (quantidade, descricao, altura, "
                + "largura, comprimento) "
                + "values (?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getQuantidade());
        ps.setString(2, obj.getDescricao());
        ps.setDouble(3, obj.getAltura());
        ps.setDouble(4, obj.getLargura());
        ps.setDouble(5, obj.getComprimento());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(MatPrimaModel obj) throws Exception{
        String sql = "UPDATE matPrima SET quantidade = ?, descricao = ?, altura = ?, largura = ?, "
                + "comprimento = ? WHERE idMatPrima = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getQuantidade());
        ps.setString(2, obj.getDescricao());
        ps.setDouble(3, obj.getAltura());
        ps.setDouble(4, obj.getLargura());
        ps.setDouble(5, obj.getComprimento());
        ps.setInt(6, obj.getIdMatPrima());   
        return ps.executeUpdate() > 0;
    }
    
    public boolean excluir(int idMatPrima) throws Exception{
        String sql = "DELETE FROM matPrima WHERE idMatPrima = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idMatPrima);
        return ps.executeUpdate() > 0;
    }
    
    public ArrayList<MatPrimaModel> pesquisar(String texto) throws Exception{
        ArrayList<MatPrimaModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "SELECT * FROM matPrima WHERE ";
        for(int i = 0; i < palavras.length; i++){
            if(i > 0 && i != palavras.length) 
            sql+="or ";
            sql +="descricao ILIKE '%"+palavras[i]+"%' ";         
        }

        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            MatPrimaModel obj = new MatPrimaModel(rs.getInt("idMatPrima"),
            rs.getInt("quantidade"),
            rs.getString("descricao"),
            rs.getDouble("altura"),
            rs.getDouble("largura"),
            rs.getDouble("comprimento"));
        dados.add(obj);
        }
        return dados;
    }
    
    public ArrayList<MatPrimaModel> carregarCombo() throws Exception{
        ArrayList<MatPrimaModel> dados = new ArrayList<>();
        String sql = "SELECT * FROM matPrima ORDER BY descricao ";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            MatPrimaModel obj = new MatPrimaModel(rs.getInt("idMatPrima"),
            rs.getInt("quantidade"),
            rs.getString("descricao"),
            rs.getDouble("altura"),
            rs.getDouble("largura"),
            rs.getDouble("comprimento"));
        dados.add(obj);
        }
        return dados;
    }
}
