/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.PecaModel;
import br.pro.aluno.processodeproducao.model.ProdutoModel;
import br.pro.aluno.processodeproducao.model.ProdutoPecaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class ProdutoPecaData extends Conexao{
    public ProdutoPecaData() throws Exception{}
    public boolean incluir(ProdutoPecaModel obj) throws Exception{
        String sql="INSERT INTO produtoPeca (qantCadaPeca, idPeca, idProd) "
                + "values (?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setDouble(1, obj.getQantCadaPeca());
        ps.setInt(2, obj.getPeca().getIdPeca());
        ps.setInt(3, obj.getProduto().getIdProd());
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<ProdutoPecaModel> pesquisar(String texto) throws Exception{
        ArrayList<ProdutoPecaModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "select * from produtoPeca pp INNER JOIN produto p ON pp.idProd = p.idProd WHERE ";
        for(int i = 0; i < palavras.length; i++){
            if(i > 0 && i != palavras.length) 
            sql+="or ";
            sql +="nomeProd ILIKE '%"+palavras[i]+"%' ";         
        }

        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ProdutoPecaModel obj = new ProdutoPecaModel(rs.getInt("qantCadaPeca"),
                    new PecaModel("",0,rs.getInt("idPeca"),0,0,0,null),
                    new ProdutoModel(0, 0,rs.getInt("idProd"),"", 0, 0, 0, 0, null),
                    new ArrayList<>()
                   
            );
   
        dados.add(obj);
      
        }
        return dados;
    }
}
