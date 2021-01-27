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
public class UsuarioModel {

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

  

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    private int cep;
    private String cidade;
    private int nro;
    private String rua;
    private String cpf;
    private String senha;
    private String nome;
    private String email;
    private int telefone;

    public UsuarioModel(int cep, String cidade, int nro, String rua, String cpf, String senha, String nome, String email, int telefone) {
        this.cep = cep;
        this.cidade = cidade;
        this.nro = nro;
        this.rua = rua;
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public UsuarioModel() {
        cep = 0;
        cidade = new String();
        nro = 0;
        rua = new String();
        cpf = new String();
        senha = new String();
        nome = new String();
        email = new String();
        telefone = 0;
    }
}
