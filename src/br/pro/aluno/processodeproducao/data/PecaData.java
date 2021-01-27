/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.MatPrimaModel;
import br.pro.aluno.processodeproducao.model.PecaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class PecaData extends Conexao{
    public PecaData() throws Exception{}
    public boolean incluir(PecaModel obj) throws Exception{
        String sql="INSERT INTO peca (nomePeca, quantEstoque, altura, "
                + "largura, comprimento, idMatPrima) "
                + "values (?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNomePeca());
        ps.setInt(2, obj.getQuantEstoque());
        ps.setDouble(3, obj.getAltura());
        ps.setDouble(4, obj.getLargura());
        ps.setDouble(5, obj.getComprimento());
        ps.setInt(6, obj.getMatPrima().getIdMatPrima());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(PecaModel obj) throws Exception{
        String sql = "UPDATE peca SET nomePeca = ?, quantEstoque = ?, altura = ?, largura = ?, "
                + "comprimento = ?, idMatPrima = ? WHERE idPeca = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNomePeca());
        ps.setInt(2, obj.getQuantEstoque());
        ps.setDouble(3, obj.getAltura());
        ps.setDouble(4, obj.getLargura());
        ps.setDouble(5, obj.getComprimento());
        ps.setInt(6, obj.getMatPrima().getIdMatPrima());
        ps.setInt(7, obj.getIdPeca());   
        return ps.executeUpdate() > 0;
    }
    
    public boolean editar2(PecaModel obj) throws Exception{
        String sql = "UPDATE peca SET  quantEstoque = ? WHERE idPeca = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
      //  ps.setString(1, obj.getNomePeca());
        ps.setInt(1, obj.getQuantEstoque());
      //  ps.setDouble(3, obj.getAltura());
       // ps.setDouble(4, obj.getLargura());
       // ps.setDouble(5, obj.getComprimento());
       // ps.setInt(6, obj.getMatPrima().getIdMatPrima());
        ps.setInt(2, obj.getIdPeca());   
        return ps.executeUpdate() > 0;
    }
    
    public boolean excluir(int idPeca) throws Exception{
        String sql = "DELETE FROM peca WHERE idPeca = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idPeca);
        return ps.executeUpdate() > 0;
    }
    
    public ArrayList<PecaModel> pesquisar(String texto) throws Exception{
        ArrayList<PecaModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "SELECT * FROM peca WHERE ";
        for(int i = 0; i < palavras.length; i++){
            if(i > 0 && i != palavras.length) 
            sql+="or ";
            sql +="nomePeca ILIKE '%"+palavras[i]+"%' ";         
        }

        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PecaModel obj = new PecaModel(rs.getString("nomePeca"),
            rs.getInt("quantEstoque"),
            rs.getInt("idPeca"),
            rs.getDouble("altura"),
            rs.getDouble("largura"),
            rs.getDouble("comprimento"),
            new MatPrimaModel(rs.getInt("idMatPrima"), 0, "", 0, 0, 0));
        dados.add(obj);
        }
        return dados;
    }
    
    public ArrayList<PecaModel> carregarCombo() throws Exception{
        ArrayList<PecaModel> dados = new ArrayList<>();
        String sql = "SELECT * FROM peca ORDER BY nomePeca ";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PecaModel obj = new PecaModel(rs.getString("nomePeca"),
            rs.getInt("quantEstoque"),
            rs.getInt("idPeca"),
            rs.getDouble("altura"),
            rs.getDouble("largura"),
            rs.getDouble("comprimento"),
            new MatPrimaModel(rs.getInt("idMatPrima"), 0, "", 0, 0, 0));
        dados.add(obj);
        }
        return dados;
    }
    
     public boolean editarEstoque(PecaModel obj) throws Exception{
        String sql = "UPDATE peca SET quantEstoque = ? WHERE idPeca = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getQuantEstoque());
         ps.setInt(2, obj.getIdPeca());   
        return ps.executeUpdate() > 0;
    }
    
    
}
