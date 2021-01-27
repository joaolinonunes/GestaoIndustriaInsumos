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
public class ClienteModel extends UsuarioModel{

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getRepresenta() {
        return representa;
    }

    public void setRepresenta(String representa) {
        this.representa = representa;
    }

    private String dataCadastro;
    private String representa;
    

    public ClienteModel(int cep, String cidade, int nro, String rua, String cpf, String senha, String nome, String email,int telefone, String dataCadastro, String representa) {
        super(cep,cidade,nro,rua,cpf,senha,nome,email,telefone); 
        this.dataCadastro = dataCadastro;
        this.representa = representa;
        
    }

    public ClienteModel() {
        
        dataCadastro = new String();
        representa = new String();
        
    }
    
}
