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
 * @author João
 */
public class JIFControPeca extends javax.swing.JInternalFrame {

     PecaModel obj;
    PecaData DAO;
    int acao = 0;
    int valor = 0;
    MatPrimaData DAOMatPrima;
    ArrayList<MatPrimaModel> listaMatPrima;
    ArrayList<PecaModel> lista = new ArrayList<>();
    
    public JIFControPeca() {
       
        try{ 
            obj = new PecaModel();
            DAO = new PecaData();
            DAOMatPrima = new MatPrimaData();
            listaMatPrima = DAOMatPrima.carregarCombo();
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

        jLabel1 = new javax.swing.JLabel();
        jlPesquisa = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();
        jlQuantEstoque = new javax.swing.JLabel();
        jtQuantEstoque = new javax.swing.JTextField();
        jlNomePeca = new javax.swing.JLabel();
        jtNomePeca = new javax.swing.JTextField();
        jlId = new javax.swing.JLabel();
        jlId2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtNovoValor = new javax.swing.JTextField();
        jbSoma = new javax.swing.JButton();
        jbRetirar = new javax.swing.JButton();

        jLabel1.setText("Valor para alterar");

        setClosable(true);
        setIconifiable(true);
        setTitle("Controle do Estoque de Peças");

        jlPesquisa.setText("Pesquisar");

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
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

        jlQuantEstoque.setText("Quantidade no estoque");

        jtQuantEstoque.setEnabled(false);
        jtQuantEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtQuantEstoqueActionPerformed(evt);
            }
        });

        jlNomePeca.setText("Nome da peça");

        jtNomePeca.setEnabled(false);
        jtNomePeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomePecaActionPerformed(evt);
            }
        });

        jlId.setText("Id");

        jlId2.setText("0");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Valor para alterar");

        jtNovoValor.setEnabled(false);

        jbSoma.setText("somar  +");
        jbSoma.setEnabled(false);
        jbSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSomaActionPerformed(evt);
            }
        });

        jbRetirar.setText("subtrair  -");
        jbRetirar.setEnabled(false);
        jbRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtNovoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jbRetirar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSoma)))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSoma)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbRetirar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNovoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jlId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jlNomePeca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNomePeca)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlQuantEstoque)
                                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlId))
                        .addGap(17, 17, 17)
                        .addComponent(jlNomePeca))
                    .addComponent(jtNomePeca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jlQuantEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesquisa, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                        String.valueOf(ob.getQuantEstoque())});
            }
        }else if(jtPesquisa.getText().trim().length() == 0){
            DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
            mp.setNumRows(0);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+e.getMessage());
        }
    }//GEN-LAST:event_jtPesquisaKeyReleased

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

                    if(acao == 2){
                        if(DAO.editarEstoque(obj)){
                            JOptionPane.showMessageDialog(this, "Atualizado com sucesso");
                            jbCancelarActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "Erro ao salvar P");
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar:" +e.getMessage());
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        //br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, false);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jtPesquisa.setEnabled(true);
        jtNomePeca.setEnabled(false);
        jtQuantEstoque.setEnabled(false);
        jtNovoValor.setEnabled(false);
        jbSoma.setEnabled(false);
        jbRetirar.setEnabled(false);
        jtPesquisa.setText(null);
        jtNomePeca.setText(null);
        jtNovoValor.setText(null);
        jtQuantEstoque.setText(null);
        jlId2.setText(null);
        ((DefaultTableModel) jtbDados.getModel()).setNumRows(0); //Limpar a tabela ao clicar no botão CANCELAR
        //((DefaultTableModel) jtbDados.getModel()).setRowCount(0);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
     //   br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, true);
        jtQuantEstoque.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(false);
         jtPesquisa.setEnabled(false);
         jtNovoValor.setEnabled(true);
         jbSoma.setEnabled(true);
         jbRetirar.setEnabled(true);
        acao = 2;//Atualizar - update
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
        try {
            int linha = jtbDados.getSelectedRow();
            jlId2.setText(""+lista.get(linha).getIdPeca());
            jtNomePeca.setText(lista.get(linha).getNomePeca());
            jtQuantEstoque.setText(""+lista.get(linha).getQuantEstoque());
     //       for(int i = 0; i < listaMatPrima.size(); i++)
      //      if(listaMatPrima.get(i).getIdMatPrima() == lista.get(linha).getMatPrima().getIdMatPrima())
     //       jcbMatPrima.setSelectedIndex(i);
            jtNomePeca.setEnabled(false);
            jtQuantEstoque.setEnabled(false);
            jbSalvar.setEnabled(false);
            jbCancelar.setEnabled(true);
            jbEditar.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao selecionar: "+e.getMessage());
        }
    }//GEN-LAST:event_jtbDadosMouseClicked

    private void jtQuantEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtQuantEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtQuantEstoqueActionPerformed

    private void jtNomePecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomePecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomePecaActionPerformed

    private void jbSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomaActionPerformed
       
       valor = Integer.parseInt(jtQuantEstoque.getText())+Integer.parseInt(jtNovoValor.getText());
       jtQuantEstoque.setText(""+valor);
       valor = 0;
    }//GEN-LAST:event_jbSomaActionPerformed

    private void jbRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetirarActionPerformed
        valor = Integer.parseInt(jtQuantEstoque.getText())-Integer.parseInt(jtNovoValor.getText());
        jtQuantEstoque.setText(""+valor);
        valor = 0;
    }//GEN-LAST:event_jbRetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbRetirar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbSoma;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlNomePeca;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlQuantEstoque;
    private javax.swing.JTextField jtNomePeca;
    private javax.swing.JTextField jtNovoValor;
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
        obj.setQuantEstoque(Integer.parseInt(jtQuantEstoque.getText()));
 
        return true;
    }


}
