/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.model;

import java.sql.Array;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class PedidoProdutoModel {

    public int getQantCadaProduto() {
        return qantCadaProduto;
    }

    public void setQantCadaProduto(int qantCadaProduto) {
        this.qantCadaProduto = qantCadaProduto;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public PedidoModel getPedido() {
        return pedido;
    }

    public void setPedido(PedidoModel pedido) {
        this.pedido = pedido;
    }

    public ArrayList<PedidoProdutoModel> getPedidoproduto() {
        return pedidoproduto;
    }

    public void setPedidoproduto(ArrayList<PedidoProdutoModel> pedidoproduto) {
        this.pedidoproduto = pedidoproduto;
    }
    
    private int qantCadaProduto;
    private ProdutoModel produto;
    private PedidoModel pedido;
    private ArrayList<PedidoProdutoModel> pedidoproduto;

    public PedidoProdutoModel(int qantCadaProduto, ProdutoModel produto, PedidoModel pedido,ArrayList<PedidoProdutoModel> pedidoproduto) {
        this.qantCadaProduto = qantCadaProduto;
        this.produto = produto;
        this.pedido = pedido;
        this.pedidoproduto = pedidoproduto;
    }

    public PedidoProdutoModel() {
        qantCadaProduto = 0;
        produto = new ProdutoModel();
        pedido = new PedidoModel();
        pedidoproduto = new ArrayList<>();
    }
    public void adicionaPedidoProduto(PedidoProdutoModel pedidoproduto){
     this.pedidoproduto.add(pedidoproduto);
    }
     public void removePedidoProduto(PedidoProdutoModel pedidoproduto){
     this.pedidoproduto.remove(pedidoproduto);
    }
    
}
