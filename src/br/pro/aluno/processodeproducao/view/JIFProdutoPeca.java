/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.view;

import br.pro.aluno.processodeproducao.data.PecaData;
import br.pro.aluno.processodeproducao.data.ProdutoData;
import br.pro.aluno.processodeproducao.data.ProdutoPecaData;
import br.pro.aluno.processodeproducao.model.PecaModel;
import br.pro.aluno.processodeproducao.model.ProdutoModel;
import br.pro.aluno.processodeproducao.model.ProdutoPecaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casa
 */
public class JIFProdutoPeca extends javax.swing.JInternalFrame {
    ProdutoPecaModel obj;
    ProdutoPecaData DAO;
    PecaData DAOPeca;
    ProdutoData DAOProduto;
    ArrayList<PecaModel> listaPeca;
    ArrayList<ProdutoModel> listaProduto;
    ArrayList<ProdutoPecaModel> listaProPe;
    ArrayList<ProdutoPecaModel> listaT;
    int acao = 0;
    /**
     * Creates new form JIFProdutoPeca
     */
    public JIFProdutoPeca() {
        try{ 
            obj = new ProdutoPecaModel();
            DAO = new ProdutoPecaData();
            DAOPeca = new PecaData();
            listaPeca = new ArrayList<>();
            listaPeca = DAOPeca.carregarCombo();
            listaProduto = new ArrayList<>();
            DAOProduto = new ProdutoData();
            listaProduto = DAOProduto.carregarCombo();
            listaProPe = new ArrayList<>();
            listaT = new ArrayList<>();
            initComponents();
            for(PecaModel cat : listaPeca)
               jcbPeca.addItem(cat.getNomePeca());
            
            for(ProdutoModel cat : listaProduto)
                jcbProduto.addItem(cat.getNomeProd());
            
            
            jcbPeca.setSelectedIndex(-1);
            jcbProduto.setSelectedIndex(-1);
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

        jbCancelar = new javax.swing.JButton();
        jlNomeProd = new javax.swing.JLabel();
        jcbProduto = new javax.swing.JComboBox<String>();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jtPesquisa = new javax.swing.JTextField();
        jlPesquisa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jcbPeca = new javax.swing.JComboBox<String>();
        jlNomePeca = new javax.swing.JLabel();
        jtQuantidade = new javax.swing.JTextField();
        jlQuantidade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPedidoProduto = new javax.swing.JTable();
        jbAdd = new javax.swing.JButton();
        jbRemov = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Montagem de Produto e Peça");

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlNomeProd.setText("Nome do produto");

        jcbProduto.setEnabled(false);
        jcbProduto.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jcbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProdutoActionPerformed(evt);
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

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jlPesquisa.setText("Pesquisar");

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quant. Peça", "Id Peça", "Id Produto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jScrollPane2.setViewportView(jtbDados);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jcbPeca.setEnabled(false);
        jcbPeca.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jcbPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPecaActionPerformed(evt);
            }
        });

        jlNomePeca.setText("Nome da peça");

        jtQuantidade.setEnabled(false);
        jtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtQuantidadeActionPerformed(evt);
            }
        });

        jlQuantidade.setText("Quantidade");

        jtbPedidoProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id produto", "Nome produto", "Id pedido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbPedidoProduto);

        jbAdd.setText("+");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jbRemov.setText("-");
        jbRemov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemovActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNomePeca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRemov, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jlNomePeca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbAdd)
                        .addGap(43, 43, 43)
                        .addComponent(jbRemov))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jlNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jlPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNomeProd))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesquisa)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, false);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        DefaultTableModel mp = (DefaultTableModel) jtbPedidoProduto.getModel();
        mp.setNumRows(0);
        jcbPeca.setEnabled(false);
        jtQuantidade.setEnabled(false);
        jtQuantidade.setText(null);
        listaProPe.clear();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtQuantidadeActionPerformed

    private void jcbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProdutoActionPerformed

    private void jcbPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPecaActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, true);
        jcbPeca.setSelectedIndex(-1);
        jcbProduto.setSelectedIndex(-1);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        acao = 1; //Novo - insert
        jcbPeca.setEnabled(true);
        jtQuantidade.setEnabled(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            
               // if(preencherObjeto()){
                    if(acao == 1){
                        for(ProdutoPecaModel pp : listaProPe)
                         obj.setQantCadaPeca(Integer.parseInt(jtQuantidade.getText()));
                         obj.setPeca(listaPeca.get(jcbPeca.getSelectedIndex()));
                         obj.setProduto(listaProduto.get(jcbProduto.getSelectedIndex()));
                        if(DAO.incluir(obj)){
                            JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                            jbCancelarActionPerformed(evt);
                            jcbPeca.setSelectedIndex(-1);
                            jcbProduto.setSelectedIndex(-1);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Erro ao salvar");
                        }
                    }
               // }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " +e.getMessage());
            listaProPe.clear();
            System.out.println("limpar");
            DefaultTableModel mp = (DefaultTableModel) jtbPedidoProduto.getModel();
            mp.setNumRows(0);
            jtQuantidade.setText(null);
            jcbPeca.setSelectedIndex(-1);
            jcbProduto.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        try {
            if(validarCampos()){
                int produtoSelect = jcbProduto.getSelectedIndex();
                int pecaSelect = jcbPeca.getSelectedIndex();
                DefaultTableModel mp = (DefaultTableModel) jtbPedidoProduto.getModel();
                mp.addRow(new String []{""+listaProduto.get(produtoSelect).getIdProd(),
                    listaProduto.get(produtoSelect).getNomeProd(),
                    listaPeca.get(pecaSelect).getNomePeca()});
            
            
                ProdutoPecaModel list = new ProdutoPecaModel(Integer.parseInt(jtQuantidade.getText()),
                    listaPeca.get(jcbPeca.getSelectedIndex()),
                    listaProduto.get(jcbProduto.getSelectedIndex()),
                    listaProPe);

                listaProPe.add(list);

                //System.out.println(list.getQantCadaProduto());
                System.out.println(list.getProduto().getIdProd());
                System.out.println(list.getPeca().getIdPeca());
                
                

        }
        else{
            JOptionPane.showMessageDialog(this, "Erro ao salvar");

        }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " +e.getMessage());

        }
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbRemovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemovActionPerformed
        try {
            int produtoSelect = jtbPedidoProduto.getSelectedRow();
            DefaultTableModel mp = (DefaultTableModel) jtbPedidoProduto.getModel();
            mp.removeRow(produtoSelect);
            int ultimo = listaProPe.size()-1;
            listaProPe.remove(ultimo);
            for(ProdutoPecaModel ped : listaProPe){
                System.out.println(ped.getProduto().getNomeProd());
            }
            jcbPeca.setSelectedIndex(-1);
            jcbProduto.setSelectedIndex(-1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " +e.getMessage());

        }
    }//GEN-LAST:event_jbRemovActionPerformed

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        try {
            if(jtPesquisa.getText().trim().length() >= 1){
                listaT = DAO.pesquisar(jtPesquisa.getText());
                DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
                mp.setNumRows(0);//limpar a tabela
               
                for(ProdutoPecaModel ob : listaT){
                    mp.addRow(new String[]{String.valueOf(ob.getQantCadaPeca()),
                        String.valueOf(ob.getPeca().getIdPeca()),
                        String.valueOf(ob.getProduto().getIdProd()),
                    });
                }
                   
            
        }else if(jtPesquisa.getText().trim().length() == 0){
            DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
            mp.setNumRows(0);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+e.getMessage());
        }
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
        try {
            int linha = jtbDados.getSelectedRow();
            jtQuantidade.setText(""+listaT.get(linha).getQantCadaPeca());
            for(int i = 0; i < listaPeca.size(); i++)
            if(listaPeca.get(i).getIdPeca() == listaT.get(linha).getPeca().getIdPeca())
                jcbPeca.setSelectedIndex(i);
            for(int i = 0; i < listaProduto.size(); i++)
            if(listaProduto.get(i).getIdProd()== listaT.get(linha).getProduto().getIdProd())
                jcbProduto.setSelectedIndex(i);
            
            jbNovo.setEnabled(false);
            jbSalvar.setEnabled(false);
            jbCancelar.setEnabled(true);
           // jbEditar.setEnabled(true);
            //jbExcluir.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao selecionar: "+e.getMessage());
        }
    }//GEN-LAST:event_jtbDadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRemov;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbPeca;
    private javax.swing.JComboBox<String> jcbProduto;
    private javax.swing.JLabel jlNomePeca;
    private javax.swing.JLabel jlNomeProd;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTable jtbDados;
    private javax.swing.JTable jtbPedidoProduto;
    // End of variables declaration//GEN-END:variables
    
    private boolean validarCampos() throws Exception{
        String msg = "";
        if(jtQuantidade.getText().length() <= 0)
            msg +="O campo quantidade deve conter pelo menos 1 caractere \n";

        if(msg.length() == 0)
            return true;
        else
            throw new Exception(msg);      
    }
    
    
    private boolean preencherObjeto() throws Exception{
        obj.setQantCadaPeca(Integer.parseInt(jtQuantidade.getText()));
        obj.setPeca(listaPeca.get(jcbPeca.getSelectedIndex()));
        obj.setProduto(listaProduto.get(jcbProduto.getSelectedIndex()));
        return true;
    }

}
