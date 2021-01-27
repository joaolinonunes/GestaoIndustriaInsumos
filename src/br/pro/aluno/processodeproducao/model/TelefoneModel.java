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
public class TelefoneModel {

    public int getNroTel() {
        return nroTel;
    }

    public void setNroTel(int nroTel) {
        this.nroTel = nroTel;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }
    private int nroTel;
    private UsuarioModel usuario;

    public TelefoneModel(int nroTel, UsuarioModel usuario) {
        this.nroTel = nroTel;
        this.usuario = usuario;
    }

    public TelefoneModel() {
        nroTel = 0;
        usuario = new UsuarioModel();
    } 
}
