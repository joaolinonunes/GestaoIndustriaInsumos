/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.view;

import br.pro.aluno.processodeproducao.data.MatPrimaData;
import br.pro.aluno.processodeproducao.data.PecaData;
import br.pro.aluno.processodeproducao.model.MatPrimaModel;
import br.pro.aluno.processodeproducao.model.PecaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casa
 */
public class JIFPeca extends javax.swing.JInternalFrame {
    PecaModel obj;
    PecaData DAO;
    int acao = 0;
    MatPrimaData DAOMatPrima;
    ArrayList<MatPrimaModel> listaMatPrima;
    ArrayList<PecaModel> lista = new ArrayList<>();
    /**
     * Creates new form JIFPeca
     */
    public JIFPeca() {
        try{ 
            obj = new PecaModel();
            DAO = new PecaData();
            DAOMatPrima = new MatPrimaData();
            listaMatPrima = DAOMatPrima.carregarCombo();
            initComponents();
            for(MatPrimaModel cat : listaMatPrima)
                jcbMatPrima.addItem(cat.getDescricao());
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

        jlNomePeca = new javax.swing.JLabel();
        jtNomePeca = new javax.swing.JTextField();
        jlId2 = new javax.swing.JLabel();
        jlAltura = new javax.swing.JLabel();
        jlLargura = new javax.swing.JLabel();
        jtAltura = new javax.swing.JTextField();
        jlComprimento = new javax.swing.JLabel();
        jtLargura = new javax.swing.JTextField();
        jlQuantEstoque = new javax.swing.JLabel();
        jtComprimento = new javax.swing.JTextField();
        jtQuantEstoque = new javax.swing.JTextField();
        jlId = new javax.swing.JLabel();
        jlMatPrima = new javax.swing.JLabel();
        jcbMatPrima = new javax.swing.JComboBox<String>();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();
        jlPesquisa = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Peças");

        jlNomePeca.setText("Nome da peça");

        jtNomePeca.setEnabled(false);
        jtNomePeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomePecaActionPerformed(evt);
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

        jlQuantEstoque.setText("Quantidade no estoque");

        jtComprimento.setEnabled(false);

        jtQuantEstoque.setEnabled(false);
        jtQuantEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtQuantEstoqueActionPerformed(evt);
            }
        });

        jlId.setText("Id");

        jlMatPrima.setText("Descrição da Matéria Prima ");

        jcbMatPrima.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jcbMatPrima.setEnabled(false);
        jcbMatPrima.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jcbMatPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMatPrimaActionPerformed(evt);
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

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome da Peça", "Altura", "Largura", "Comprimento", "Quantidade"
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

        jLabel3.setText("mm");

        jLabel4.setText("mm");

        jLabel5.setText("mm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlLargura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlQuantEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlMatPrima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlComprimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jtComprimento))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcbMatPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtQuantEstoque))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNomePeca, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jlId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtNomePeca)
                                .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlNomePeca)
                        .addGap(16, 16, 16)
                        .addComponent(jlAltura))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNomePeca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLargura)
                    .addComponent(jtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlComprimento)
                    .addComponent(jtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQuantEstoque)
                    .addComponent(jtQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMatPrima)
                    .addComponent(jcbMatPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar)
                    .addComponent(jbNovo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesquisa))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNomePecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomePecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomePecaActionPerformed

    private void jtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAlturaActionPerformed

    private void jtLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLarguraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLarguraActionPerformed

    private void jtQuantEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtQuantEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtQuantEstoqueActionPerformed

    private void jcbMatPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMatPrimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMatPrimaActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        //br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        //br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jtNomePeca.setEnabled(true);
        jtAltura.setEnabled(true);
        jtLargura.setEnabled(true);
        jtComprimento.setEnabled(true);
        jtQuantEstoque.setEnabled(true);
        jcbMatPrima.setEnabled(true);
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
                            JOptionPane.showMessageDialog(this, "Erro ao salvar P");
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

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
       // br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        //br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, false);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtPesquisa.setEnabled(true);
        jtNomePeca.setEnabled(false);
        jtAltura.setEnabled(false);
        jtLargura.setEnabled(false);
        jtComprimento.setEnabled(false);
        jtQuantEstoque.setEnabled(false);
        jcbMatPrima.setEnabled(false);
        jtPesquisa.setText(null);
        jtNomePeca.setText(null);
        jtAltura.setText(null);
        jtLargura.setText(null);
        jtComprimento.setText(null);
        jtQuantEstoque.setText(null);
        jcbMatPrima.setSelectedIndex(0);
        ((DefaultTableModel) jtbDados.getModel()).setNumRows(0); //Limpar a tabela ao clicar no botão CANCELAR
        //((DefaultTableModel) jtbDados.getModel()).setRowCount(0);
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

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
        try {
            int linha = jtbDados.getSelectedRow();
            jlId2.setText(""+lista.get(linha).getIdPeca());
            jtNomePeca.setText(lista.get(linha).getNomePeca());
            jtAltura.setText(""+lista.get(linha).getAltura());
            jtLargura.setText(""+lista.get(linha).getLargura());
            jtComprimento.setText(""+lista.get(linha).getComprimento());
            jtQuantEstoque.setText(""+lista.get(linha).getQuantEstoque());
            for(int i = 0; i < listaMatPrima.size(); i++)
                if(listaMatPrima.get(i).getIdMatPrima() == lista.get(linha).getMatPrima().getIdMatPrima())
                    jcbMatPrima.setSelectedIndex(i);
            jtNomePeca.setEnabled(false);
            jtAltura.setEnabled(false);
            jtLargura.setEnabled(false);
            jtComprimento.setEnabled(false);
            jtQuantEstoque.setEnabled(false);
            jcbMatPrima.setEnabled(false);
            jbNovo.setEnabled(false);
            jbSalvar.setEnabled(false);
            jbCancelar.setEnabled(true);
            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
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
            for(PecaModel ob : lista){
                mp.addRow(new String[]{String.valueOf(ob.getIdPeca()),
                                  ob.getNomePeca(),
                                  String.valueOf(ob.getAltura()),
                                  String.valueOf(ob.getLargura()),
                                  String.valueOf(ob.getComprimento()),
                                  String.valueOf(ob.getQuantEstoque()),                                 
                                  String.valueOf(ob.getMatPrima().getIdMatPrima())});
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbMatPrima;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlComprimento;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlLargura;
    private javax.swing.JLabel jlMatPrima;
    private javax.swing.JLabel jlNomePeca;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlQuantEstoque;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtComprimento;
    private javax.swing.JTextField jtLargura;
    private javax.swing.JTextField jtNomePeca;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtQuantEstoque;
    private javax.swing.JTable jtbDados;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() throws Exception{
        String msg = "";
        if(jtNomePeca.getText().length() < 2)
            msg +="O campo nome deve conter mais de 2 caracteres \n";
        if(jtQuantEstoque.getText().length() < 0)
            msg +="O campo quantidade deve conter pelo menos 1 caractere \n";

        if(msg.length() == 0)
            return true;
        else
            throw new Exception(msg);      
    }
    
    
    private boolean preencherObjeto() throws Exception{
        obj.setIdPeca(Integer.parseInt(jlId2.getText()));
        obj.setNomePeca((jtNomePeca.getText()));
        obj.setAltura(Double.parseDouble(jtAltura.getText()));
        obj.setComprimento(Double.parseDouble(jtComprimento.getText()));
        obj.setLargura(Double.parseDouble(jtLargura.getText()));
        obj.setQuantEstoque(Integer.parseInt(jtQuantEstoque.getText()));
        
        obj.setMatPrima(listaMatPrima.get(jcbMatPrima.getSelectedIndex()));
        return true;
    }
}

