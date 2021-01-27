/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author João
 */
public class UsuarioData extends Conexao{
    public UsuarioData() throws Exception{}
     public boolean incluir(UsuarioModel obj) throws Exception{
        String sql="INSERT INTO usuario (cep, cidade, nro, "
                + "rua, cpf, senha, nome, email,telefone) "
                + "values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getCep());
        ps.setString(2, obj.getCidade());
        ps.setInt(3, obj.getNro());
        ps.setString(4, obj.getRua());
        ps.setString(5, obj.getCpf());
        ps.setString(6, obj.getSenha());
        ps.setString(7, obj.getNome());
        ps.setString(8, obj.getEmail());
        ps.setInt(9, obj.getTelefone());
        return ps.executeUpdate()>0;
    }
     public ArrayList<UsuarioModel> pesquisar(String texto) throws Exception{
        ArrayList<UsuarioModel> dados = new ArrayList<>();
        String sql="Select * from usuario where nome ilike '"+texto+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
             UsuarioModel obj = new UsuarioModel(rs.getInt("cep"),
            rs.getString("cidade"),
            rs.getInt("nro"),
            rs.getString("rua"),
            rs.getString("cpf"),
            rs.getString("senha"),
            rs.getString("nome"),
            rs.getString("email"),
             rs.getInt("telefone"));        
             dados.add(obj);
        }  
        return dados;
    } 
     /*
       public ArrayList<UsuarioModel> pesquisar(String texto) throws Exception{
        ArrayList<UsuarioModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "SELECT * FROM usuario WHERE ";
        for(int i = 0; i < palavras.length; i++){
            if(i > 0 && i != palavras.length) 
            sql+="or ";
            sql +="nome ILIKE '%"+palavras[i]+"%' ";         

        }

        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            UsuarioModel obj = new UsuarioModel(rs.getInt("cep"),
            rs.getString("cidade"),
            rs.getInt("nro"),
            rs.getString("rua"),
            rs.getString("cpf"),
            rs.getString("senha"),
            rs.getString("nome"),
            rs.getString("email"));
        dados.add(obj);
        }
        return dados;
    }*/
     public ArrayList<UsuarioModel> carregarCombo() throws Exception{
        ArrayList<UsuarioModel> dados = new ArrayList<>();
        
        String sql = "SELECT * FROM usuario WHERE ";
       
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            UsuarioModel obj = new UsuarioModel(rs.getInt("cep"),
            rs.getString("cidade"),
            rs.getInt("nro"),
            rs.getString("rua"),
            rs.getString("cpf"),
            rs.getString("senha"),
            rs.getString("nome"),
            rs.getString("email"),
            rs.getInt("telefone"));
        dados.add(obj);
        }
        return dados;
    } 
     
    public boolean validarLogin(UsuarioModel obj) throws Exception{
      
      String sql = "SELECT * FROM usuario WHERE cpf = '"+obj.getCpf()+"' AND "
                     + "senha = '"+obj.getSenha()+"'";
      PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            return true;
        }else{
            return false;
        }
        
        
    }  
     
     
     
     
}
