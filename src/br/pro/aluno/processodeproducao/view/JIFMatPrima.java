/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.view;

import br.pro.aluno.processodeproducao.data.MatPrimaData;
import br.pro.aluno.processodeproducao.model.MatPrimaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casa
 */
public class JIFMatPrima extends javax.swing.JInternalFrame {
    MatPrimaModel obj;
    MatPrimaData DAO;
    ArrayList<MatPrimaModel> lista;
    int acao = 0;
    /**
     * Creates new form JIFMatPrima
     */
    public JIFMatPrima() {
        try{
            obj = new MatPrimaModel();
            DAO = new MatPrimaData();
            lista = new ArrayList<>();
            initComponents();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro: "+e.getMessage());
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

        jtComprimento = new javax.swing.JTextField();
        jtQuantidade = new javax.swing.JTextField();
        jlId = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jtDescricao = new javax.swing.JTextField();
        jlId2 = new javax.swing.JLabel();
        jlAltura = new javax.swing.JLabel();
        jlLargura = new javax.swing.JLabel();
        jtAltura = new javax.swing.JTextField();
        jlComprimento = new javax.swing.JLabel();
        jtLargura = new javax.swing.JTextField();
        jlQuantidade = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();
        jlPesquisa = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Matéria Prima");

        jtComprimento.setEnabled(false);

        jtQuantidade.setEnabled(false);
        jtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtQuantidadeActionPerformed(evt);
            }
        });

        jlId.setText("Id");

        jlDescricao.setText("Descrição");

        jtDescricao.setEnabled(false);
        jtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescricaoActionPerformed(evt);
            }
        });

        jlId2.setText("0");

        jlAltura.setText("Altura");

        jlLargura.setText("Largura");

        jtAltura.setEnabled(false);
        jtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAlturaActionPerformed(evt);
            }
        });

        jlComprimento.setText("Comprimento");

        jtLargura.setEnabled(false);
        jtLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLarguraActionPerformed(evt);
            }
        });

        jlQuantidade.setText("Quantidade");

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
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

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descricão", "Altura", "Largura", "Comprimento", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDados);

        jlPesquisa.setText("Pesquisar");

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jLabel1.setText("mm");

        jLabel2.setText("mm");

        jLabel3.setText("mm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jlDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtDescricao))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jlAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtAltura))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jlLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtLargura))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jlComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jtQuantidade)
                                                        .addComponent(jtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(30, 30, 30)
                                                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescricao)
                    .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAltura)
                    .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLargura)
                    .addComponent(jtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlComprimento)
                    .addComponent(jtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQuantidade)
                    .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar)
                    .addComponent(jbNovo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesquisa))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtQuantidadeActionPerformed

    private void jtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescricaoActionPerformed

    private void jtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAlturaActionPerformed

    private void jtLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLarguraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLarguraActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, false);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtPesquisa.setEnabled(true);
        ((DefaultTableModel) jtbDados.getModel()).setNumRows(0); //Limpar a tabela ao clicar no botão CANCELAR
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        //        jtPesquisa.setEnabled(false);
        acao = 2;//Atualizar - update
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        try {
            if(DAO.excluir(Integer.parseInt(jlId2.getText()))){
                JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
                jbCancelarActionPerformed(evt);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao excluir.");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro: "+erro.getMessage());
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
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

                    if(acao==2){
                        if(DAO.editar(obj)){
                            JOptionPane.showMessageDialog(this, "Atualizado com sucesso");
                            jbCancelarActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "Erro ao salvar");
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " +e.getMessage());
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
        try {
            int linha = jtbDados.getSelectedRow();
            if(linha > -1){
                jlId2.setText(jtbDados.getValueAt(linha, 0).toString());
                jtDescricao.setText(jtbDados.getValueAt(linha, 1).toString());
                jtAltura.setText(jtbDados.getValueAt(linha, 2).toString());
                jtLargura.setText(jtbDados.getValueAt(linha, 3).toString());
                jtComprimento.setText(jtbDados.getValueAt(linha, 4).toString());
                jtQuantidade.setText(jtbDados.getValueAt(linha, 5).toString());
                jtDescricao.setEnabled(false);
                jtAltura.setEnabled(false);
                jtLargura.setEnabled(false);
                jtComprimento.setEnabled(false);
                jtQuantidade.setEnabled(false);
                jbNovo.setEnabled(false);
                jbSalvar.setEnabled(false);
                jbCancelar.setEnabled(true);
                jbEditar.setEnabled(true);
                jbExcluir.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao selecionar: "+e.getMessage());
        }
    }//GEN-LAST:event_jtbDadosMouseClicked

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        try {
            if(jtPesquisa.getText().trim().length() >= 1){
            lista = DAO.pesquisar(jtPesquisa.getText());
            DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
            mp.setNumRows(0);//limpar a tabela
            for(MatPrimaModel ob : lista){
                mp.addRow(new String[]{String.valueOf(ob.getIdMatPrima()),
                                  ob.getDescricao(),
                                  String.valueOf(ob.getAltura()),
                                  String.valueOf(ob.getLargura()),
                                  String.valueOf(ob.getComprimento()),
                                  String.valueOf(ob.getQuantidade())});
            }
            }else if(jtPesquisa.getText().trim().length() == 0){
                DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
                mp.setNumRows(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+e.getMessage());
        }
    }//GEN-LAST:event_jtPesquisaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlComprimento;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlLargura;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtComprimento;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtLargura;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTable jtbDados;
    // End of variables declaration//GEN-END:variables
    
    private boolean validarCampos() throws Exception{
        String msg = "";
        if(jtDescricao.getText().length() < 2)
            msg +="O campo descrição deve conter mais de 2 caracteres \n";
        if(jtQuantidade.getText().length() < 0)
            msg +="O campo quantidade deve conter pelo menos 1 caractere \n";

        if(msg.length() == 0)
            return true;
        else
            throw new Exception(msg);      
    }
    
    
    private boolean preencherObjeto() throws Exception{
        obj.setIdMatPrima(Integer.parseInt(jlId2.getText()));
        obj.setDescricao((jtDescricao.getText()));
        obj.setAltura(Double.parseDouble(jtAltura.getText()));
        obj.setComprimento(Double.parseDouble(jtComprimento.getText()));
        obj.setLargura(Double.parseDouble(jtLargura.getText()));
        obj.setQuantidade(Integer.parseInt(jtQuantidade.getText()));
        return true;
    }
}
