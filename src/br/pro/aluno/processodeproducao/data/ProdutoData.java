/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.ProdutoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class ProdutoData extends Conexao{
    public ProdutoData() throws Exception{}
    public boolean incluir(ProdutoModel obj) throws Exception{
        String sql="INSERT INTO produto (valorProd, tempFabric, nomeProd, "
                + "altura, comprimento, largura, quantEstoque) "
                + "values (?,?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setDouble(1, obj.getValorProd());
        ps.setDouble(2, obj.getTempFabric());
        ps.setString(3, obj.getNomeProd());
        ps.setDouble(4, obj.getAltura());
        ps.setDouble(5, obj.getComprimento());
        ps.setDouble(6, obj.getLargura());
        ps.setInt(7, obj.getQuantEstoque());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(ProdutoModel obj) throws Exception{
        String sql = "UPDATE produto SET ValorProd = ?, tempFabric = ?, nomeProd = ?, altura = ?, "
                + "comprimento = ?, largura = ?, quantEstoque = ? WHERE idProd = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setDouble(1, obj.getValorProd());
        ps.setDouble(2, obj.getTempFabric());
        ps.setString(3, obj.getNomeProd());
        ps.setDouble(4, obj.getAltura());
        ps.setDouble(5, obj.getComprimento());
        ps.setDouble(6, obj.getLargura());
        ps.setInt(7, obj.getQuantEstoque());
        ps.setInt(8, obj.getIdProd());   
        return ps.executeUpdate() > 0;
    }
    
    public boolean excluir(int idProd) throws Exception{
        String sql = "DELETE FROM produto WHERE idProd = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idProd);
        return ps.executeUpdate() > 0;
    }
    
    public ArrayList<ProdutoModel> pesquisar(String texto) throws Exception{
        ArrayList<ProdutoModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "SELECT * FROM produto WHERE ";
        for(int i = 0; i < palavras.length; i++){
            if(i > 0 && i != palavras.length) 
            sql+="or ";
            sql +="nomeProd ILIKE '%"+palavras[i]+"%' ";         
//            sql+="valorProd ILIKE '"+palavras[i]+"%' OR tempFabric ILIKE '%"+palavras[i]+"%' "
//            + "OR nomeProd ILIKE '%"+palavras[i]+"%' OR altura ILIKE '%"+palavras[i]+"%' "
//            + "OR comprimento ILIKE '%"+palavras[i]+"%' OR largura ILIKE '%"+palavras[i]+"%' "
//            + "OR quantEstoque ILIKE '%"+palavras[i]+"%' ";
        }

        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ProdutoModel obj = new ProdutoModel(rs.getDouble("valorProd"),
            rs.getDouble("tempFabric"),
            rs.getInt("idProd"),
            rs.getString("nomeProd"),
            rs.getDouble("altura"),
            rs.getDouble("comprimento"),
            rs.getDouble("largura"),
            rs.getInt("quantEstoque"),
            new ArrayList<>());
        dados.add(obj);
        }
        return dados;
    }
    public ArrayList<ProdutoModel> carregarCombo() throws Exception{
        ArrayList<ProdutoModel> dados = new ArrayList<>();
        String sql = "SELECT * FROM produto ORDER BY nomeProd ";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ProdutoModel obj = new ProdutoModel(rs.getDouble("valorProd"),
            rs.getDouble("tempFabric"),
            rs.getInt("idProd"),
            rs.getString("nomeProd"),
            rs.getDouble("altura"),
            rs.getDouble("comprimento"),
            rs.getDouble("largura"),
            rs.getInt("quantEstoque"),
            new ArrayList<>());
        dados.add(obj);
        }
        return dados;
    }
}
