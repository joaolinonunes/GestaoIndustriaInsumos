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
public class ProdutoModel {

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }

    public double getTempFabric() {
        return tempFabric;
    }

    public void setTempFabric(double tempFabric) {
        this.tempFabric = tempFabric;
    }

     public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
    
    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    
    private double valorProd;
    private double tempFabric;
    private int idProd;
    private String nomeProd;  
    private double altura;
    private double comprimento;
    private double largura;
    private int quantEstoque;
    private ArrayList<ProdutoPecaModel> pecas;

    public ProdutoModel(double valorProd, double tempFabric, int idProd, String nomeProd, double altura, double comprimento, double largura, int quantEstoque,ArrayList<ProdutoPecaModel> pecas) {
        this.valorProd = valorProd;
        this.tempFabric = tempFabric;
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
        this.quantEstoque = quantEstoque;
        this.pecas = pecas;
    }

    public ProdutoModel() {
        valorProd = 0;
        tempFabric = 0;
        idProd = 0;
        idProd = 0;
        altura = 0;
        comprimento = 0;
        largura = 0;
        quantEstoque = 0;
        pecas = new ArrayList<>();
    }
    
    public void adicionaPeca(ProdutoPecaModel peca){
     this.pecas.add(peca);
    }
     public void removeProduto(ProdutoPecaModel peca){
     this.pecas.remove(peca);
    }
    
}
