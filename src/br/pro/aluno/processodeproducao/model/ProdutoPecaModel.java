/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.model;

import com.sun.javafx.collections.ArrayListenerHelper;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class ProdutoPecaModel {

    public int getQantCadaPeca() {
        return qantCadaPeca;
    }

    public void setQantCadaPeca(int qantCadaPeca) {
        this.qantCadaPeca = qantCadaPeca;
    }

    public PecaModel getPeca() {
        return peca;
    }

    public void setPeca(PecaModel peca) {
        this.peca = peca;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }
    
    public ArrayList<ProdutoPecaModel> getProdutopeca() {
        return produtopeca;
    }

    public void setProdutopeca(ArrayList<ProdutoPecaModel> produtopeca) {
        this.produtopeca = produtopeca;
    }
    private int qantCadaPeca;
    private PecaModel peca;
    private ProdutoModel produto;
    private ArrayList<ProdutoPecaModel> produtopeca; 

    public ProdutoPecaModel(int qantCadaPeca, PecaModel peca, ProdutoModel produto,ArrayList<ProdutoPecaModel> produtopeca) {
        this.qantCadaPeca = qantCadaPeca;
        this.peca = peca;
        this.produto = produto;
        this.produtopeca = produtopeca;
    }

    public ProdutoPecaModel() {
        qantCadaPeca = 0;
        peca = new PecaModel();
        produto = new ProdutoModel();
        produtopeca = new ArrayList<>();
                
    }

    
}
