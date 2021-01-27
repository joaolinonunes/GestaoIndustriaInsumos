/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.ClienteModel;
import br.pro.aluno.processodeproducao.model.FuncionarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author João
 */
public class FuncionarioData extends Conexao{
     public FuncionarioData() throws Exception{}
    public boolean incluir(FuncionarioModel obj) throws Exception{      
        String sql="INSERT INTO funcionario (cargo, dataContratacao, cpf_func) "
                + "values (?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getCargo());
        ps.setString(2, obj.getDataContratacao());
        ps.setString(3,obj.getCpf());
        return ps.executeUpdate()>0;
    }
    
    
     public ArrayList<FuncionarioModel> pesquisar(String texto) throws Exception{
        ArrayList<FuncionarioModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "SELECT * FROM funcionario INNER JOIN usuario ON cpf_func = cpf WHERE ";
       for(int i = 0; i < palavras.length; i++){
            if(i > 0 && i != palavras.length) 
            sql+="or ";
            sql +="nome ILIKE '%"+palavras[i]+"%'";
            System.out.println(sql);
       }
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            FuncionarioModel obj = new FuncionarioModel(rs.getInt("cep"),
            rs.getString("cidade"),
            rs.getInt("nro"),
            rs.getString("rua"),
            rs.getString("cpf"),
            rs.getString("senha"),
            rs.getString("nome"),
            rs.getString("email"),
            rs.getInt("telefone"),
            rs.getString("cargo"), 
            rs.getString("dataContratacao"));
           
        dados.add(obj);
        System.out.println();
        }
        return dados;
    }
    
    
    public ArrayList<FuncionarioModel> carregarCombo() throws Exception{
        ArrayList<FuncionarioModel> dados = new ArrayList<>();
        String sql = "SELECT * FROM funcionario INNER JOIN usuario ON cpf_func = cpf ";
       
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            FuncionarioModel obj = new FuncionarioModel(rs.getInt("cep"),
            rs.getString("cidade"),
            rs.getInt("nro"),
            rs.getString("rua"),
            rs.getString("cpf"),
            rs.getString("senha"),
            rs.getString("nome"),
            rs.getString("email"),
            rs.getInt("telefone"),
            rs.getString("cargo"), 
            rs.getString("dataContratacao"));
           
        dados.add(obj);
        }
        return dados;
    }
    
    
    
}
