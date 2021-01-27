/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.model;

import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class PedidoModel {

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public ArrayList<PedidoProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<PedidoProdutoModel> produtos) {
        this.produtos = produtos;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
    private String dataPedido;
    private int idPedido;
    private ArrayList<PedidoProdutoModel> produtos;
    private ClienteModel cliente;
    private FuncionarioModel funcionario;

    public PedidoModel( int idPedido, String dataPedido, ArrayList<PedidoProdutoModel> produtos, ClienteModel cliente,FuncionarioModel funcionario) {
        this.dataPedido = dataPedido;
        this.idPedido = idPedido;
        this.produtos = produtos;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
    

    public PedidoModel() {
        dataPedido = new String();
        idPedido = 0;
        produtos = new ArrayList<>();
        cliente = new ClienteModel();
        funcionario = new FuncionarioModel();
        
        
    }
    
    public void adicionaProduto(PedidoProdutoModel produto){
     this.produtos.add(produto);
    }
     public void removeProduto(PedidoProdutoModel produto){
     this.produtos.remove(produto);
    }
}
