/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.ClienteModel;
import br.pro.aluno.processodeproducao.model.FuncionarioModel;
import br.pro.aluno.processodeproducao.model.PedidoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class PedidoData extends Conexao{
    public PedidoData() throws Exception{}
    public boolean incluir(PedidoModel obj) throws Exception{
        String sql="INSERT INTO pedido ( cpf_cli, cpf_func,dataPedido) "
                + "values (?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getCliente().getCpf());
        ps.setString(2, obj.getFuncionario().getCpf());
        ps.setString(3, obj.getDataPedido());
        return ps.executeUpdate()>0;
    }

   public ArrayList<PedidoModel> carregarCombo() throws Exception{
        ArrayList<PedidoModel> dados = new ArrayList<>();
        String sql = "SELECT * FROM pedido ORDER BY dataPedido ";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PedidoModel obj = new PedidoModel(rs.getInt("idPedido"),
                    rs.getString("dataPedido"),
            
            new ArrayList<>(),
            new ClienteModel(),
            new FuncionarioModel()
            );
           
            
        dados.add(obj);
        }
        return dados;
    }
}
