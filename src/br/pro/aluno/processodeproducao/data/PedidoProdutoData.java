/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.PedidoModel;
import br.pro.aluno.processodeproducao.model.PedidoProdutoModel;
import br.pro.aluno.processodeproducao.model.ProdutoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class PedidoProdutoData extends Conexao{
    public PedidoProdutoData() throws Exception{}
    public boolean incluir(PedidoProdutoModel obj) throws Exception{
       
        String sql="INSERT INTO pedidoProduto (qantCadaProduto, idProd, idPedido) "
                + "values (?,?,?)";
        
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setDouble(1, obj.getQantCadaProduto());
        ps.setInt(2, obj.getProduto().getIdProd());
        ps.setInt(3, obj.getPedido().getIdPedido());
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<PedidoProdutoModel> carregarCombo() throws Exception{
        ArrayList<PedidoProdutoModel> dados = new ArrayList<>();
        String sql = "SELECT * FROM pedidoProduto ORDER BY qantCadaProduto ";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PedidoProdutoModel obj = new PedidoProdutoModel(rs.getInt("qantCadaProduto"),
                    new ProdutoModel(),
                    new PedidoModel(rs.getInt("idPedido"),"",null,null,null),
                    new ArrayList<>()
            
            );
           
            
        dados.add(obj);
        }
        return dados;
    }
    
}
