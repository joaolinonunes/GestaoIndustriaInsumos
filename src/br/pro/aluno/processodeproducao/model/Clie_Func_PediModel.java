/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.model;

/**
 *
 * @author Casa
 */
public class Clie_Func_PediModel {

  

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public PedidoModel getPedido() {
        return pedido;
    }

    public void setPedido(PedidoModel pedido) {
        this.pedido = pedido;
    }
   
    private UsuarioModel usuario;
    private PedidoModel pedido;

    public Clie_Func_PediModel(UsuarioModel usuario, PedidoModel pedido) {
        
        this.usuario = usuario;
        this.pedido = pedido;
    }

    public Clie_Func_PediModel() {
        usuario = new UsuarioModel();
        pedido = new PedidoModel();
    }
}
