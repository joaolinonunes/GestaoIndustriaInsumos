/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Casa
 */
public class FuncionarioModel extends UsuarioModel{

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

   
    private String cargo;
    private String dataContratacao;
    

    public FuncionarioModel(int cep, String cidade, int nro, String rua, String cpf, String senha, String nome, String email,int telefone, String cargo, String dataContratacao) {
        super(cep,cidade,nro,rua,cpf,senha,nome,email,telefone);
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
        
    }

    public FuncionarioModel() {
        cargo = new String();
        dataContratacao = new String();
        
    }
    
}
