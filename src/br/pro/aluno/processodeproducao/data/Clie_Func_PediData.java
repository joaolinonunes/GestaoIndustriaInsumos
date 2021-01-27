/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.Clie_Func_PediModel;
import br.pro.aluno.processodeproducao.model.ClienteModel;
import br.pro.aluno.processodeproducao.model.PedidoProdutoModel;
import java.sql.PreparedStatement;

/**
 *
 * @author João
 */
public class Clie_Func_PediData extends Conexao{
    public Clie_Func_PediData() throws Exception{}
     public boolean incluir(Clie_Func_PediModel obj) throws Exception{
        String sql="INSERT INTO clie_func_pedi (cpf_usu, idpedido) "
                + "values (?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getUsuario().getCpf());
        ps.setInt(3, obj.getPedido().getIdPedido());
        return ps.executeUpdate()>0;
    }
     
     
}
