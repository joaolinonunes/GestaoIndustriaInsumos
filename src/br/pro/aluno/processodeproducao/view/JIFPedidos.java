/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.view;

import br.pro.aluno.processodeproducao.data.ClienteData;
import br.pro.aluno.processodeproducao.data.FuncionarioData;
import br.pro.aluno.processodeproducao.data.PedidoData;
import br.pro.aluno.processodeproducao.data.ProdutoData;
import br.pro.aluno.processodeproducao.model.ClienteModel;
import br.pro.aluno.processodeproducao.model.FuncionarioModel;
import br.pro.aluno.processodeproducao.model.PedidoModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author João
 */
public class JIFPedidos extends javax.swing.JInternalFrame {    
        int acao = 0;
    PedidoModel obj;
    PedidoData DAO;
    ProdutoData DAOProduto;
    ClienteData DAOCliente;
    FuncionarioData DAOFuncionario;
    ArrayList<ClienteModel> listaCliente;
    ArrayList<FuncionarioModel> listaFuncionario;
    //ArrayList<ProdutoModel> listaProduto;
    /**
     * Creates new form JIFPedidos
     */
    public JIFPedidos() {
        
        try {
        obj = new PedidoModel();
        DAO = new PedidoData();
        DAOCliente = new ClienteData();
        DAOFuncionario = new FuncionarioData();
        listaCliente = DAOCliente.carregarCombo();
        listaFuncionario = DAOFuncionario.carregarCombo();
       // listaProduto = new ArrayList<>();
       // listaProduto = DAOProduto.carregarCombo();
        initComponents();
        for(ClienteModel cat : listaCliente)
               jcbCli.addItem(""+cat.getCpf());
             for(FuncionarioModel cat : listaFuncionario)
                jcbFunc.addItem(cat.getCpf());
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Erro: inicio "+e.getMessage());
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCliente = new javax.swing.JLabel();
        jLFuncionario = new javax.swing.JLabel();
        jlId2 = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jtData = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jcbFunc = new javax.swing.JComboBox<String>();
        jcbCli = new javax.swing.JComboBox<String>();

        setClosable(true);
        setMaximizable(true);
        setTitle("Dados dos Pedidos");

        jLCliente.setText("Cliente");

        jLFuncionario.setText("Funcionario");

        jlId2.setText("0");

        jlId.setText("Id");

        jlData.setText("Data do pedido");

        jtData.setEnabled(false);
        jtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDataActionPerformed(evt);
            }
        });

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jcbFunc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));
        jcbFunc.setEnabled(false);
        jcbFunc.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jcbFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFuncActionPerformed(evt);
            }
        });

        jcbCli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));
        jcbCli.setEnabled(false);
        jcbCli.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jcbCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCliente)
                            .addComponent(jLFuncionario))
                        .addGap(34, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtData, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbCli, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(46, 46, 46))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(372, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCliente)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbCli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFuncionario))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addComponent(jbNovo)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDataActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        //br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        //br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jtData.setEnabled(true);
        jcbCli.setEnabled(true);
        jcbFunc.setEnabled(true);
        acao = 1; //Novo - insert
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if(validarCampos()){
                if(preencherObjeto()){
                    if(acao == 1){
                        if(DAO.incluir(obj)){
                            JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                            jbCancelarActionPerformed(evt);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Erro ao salvar");
                        }
                    }
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar  no banco: " +e.getMessage());
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        //br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        //br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, false);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jtData.setEnabled(false);
        jcbCli.setEnabled(false);
        jcbFunc.setEnabled(false);
        jtData.setText(null);
        jcbCli.setSelectedIndex(0);
        jcbFunc.setSelectedIndex(0);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jcbFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFuncActionPerformed

    private void jcbCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLFuncionario;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbCli;
    private javax.swing.JComboBox<String> jcbFunc;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlId2;
    private javax.swing.JTextField jtData;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() throws Exception {
 String msg = "";
        if(jtData.getText().length() < 6)
            msg +="O campo Data deve conter mais de 6 caracteres \n";

        if(msg.length() == 0)
            return true;
        else
            throw new Exception(msg);    }

    private boolean preencherObjeto() throws Exception {
        obj.setDataPedido(jtData.getText());
        obj.setIdPedido(Integer.parseInt(jlId2.getText()));
        obj.setCliente(listaCliente.get(jcbCli.getSelectedIndex()));
        obj.setFuncionario(listaFuncionario.get(jcbFunc.getSelectedIndex()));
        return true;
 }
}
