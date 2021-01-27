/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.view;

import br.pro.aluno.processodeproducao.data.PedidoData;
import br.pro.aluno.processodeproducao.data.PedidoProdutoData;
import br.pro.aluno.processodeproducao.data.ProdutoData;
import br.pro.aluno.processodeproducao.model.PedidoModel;
import br.pro.aluno.processodeproducao.model.PedidoProdutoModel;
import br.pro.aluno.processodeproducao.model.ProdutoModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Casa
 */
public class JIFPedidoProduto extends javax.swing.JInternalFrame {
    PedidoProdutoModel obj;
    PedidoProdutoData DAO;
    ProdutoData DAOProduto;
    PedidoData DAOPedido;
    ArrayList<ProdutoModel> listaProduto;
    ArrayList<PedidoModel> listaPedido;
    ArrayList<PedidoProdutoModel> listaPedPro;
    ArrayList<PedidoProdutoModel> listaT;
    int acao = 0;
    int index ;
    /**
     * Creates new form JIFPedidoProduto
     */
    public JIFPedidoProduto() {
        try{ 
            
            obj = new PedidoProdutoModel();
            DAO = new PedidoProdutoData();
            DAOProduto = new ProdutoData();
            listaProduto = new ArrayList<>();
            listaProduto = DAOProduto.carregarCombo();
            DAOPedido = new PedidoData();
            listaPedido = DAOPedido.carregarCombo();
            listaPedPro = new ArrayList<>();
            listaT = new ArrayList<>();
            listaT = DAO.carregarCombo();
            initComponents();
            

            
            for(ProdutoModel cat : listaProduto){
                jcbProduto.addItem(cat.getNomeProd());
                
            }
            //listaPedido.removeAll(listaT);
            for(PedidoModel cat : listaPedido) {
               jcbPedido.addItem(""+cat.getIdPedido());  
               }      
             jcbPedido.setSelectedIndex(-1);
            //if(index > -1) 
             //jcbPedido.remove(index);
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

        jlQuantidade = new javax.swing.JLabel();
        jtQuantidade = new javax.swing.JTextField();
        jlDtaPedido = new javax.swing.JLabel();
        jcbPedido = new javax.swing.JComboBox<String>();
        jlNomeProd = new javax.swing.JLabel();
        jcbProduto = new javax.swing.JComboBox<String>();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPedidoProduto = new javax.swing.JTable();
        jbAdd = new javax.swing.JButton();
        jbRemov = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Realizar pedido de um produto");

        jlQuantidade.setText("Quantidade");

        jtQuantidade.setEnabled(false);
        jtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtQuantidadeActionPerformed(evt);
            }
        });

        jlDtaPedido.setText("Id do pedido");

        jcbPedido.setEnabled(false);
        jcbPedido.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jcbPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPedidoActionPerformed(evt);
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

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlDtaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNomeProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRemov, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlQuantidade))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNomeProd)
                    .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDtaPedido)
                    .addComponent(jcbPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jbRemov)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtQuantidadeActionPerformed

    private void jcbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProdutoActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        acao = 1; //Novo - insert
        listaPedPro.clear();
       
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
           // if(validarCampos()){
                //if(preencherObjeto()){
                    
                  //  int index = jcbPedido.getSelectedIndex();
                  // jcbPedido.removeItemAt(index);   
                   for (PedidoProdutoModel pro : listaPedPro){
                    obj.setQantCadaProduto(pro.getQantCadaProduto());
                    obj.setProduto(pro.getProduto());
                    obj.setPedido(pro.getPedido());
            
                        if(DAO.incluir(obj)){
                           // JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                            //jbCancelarActionPerformed(evt);
                            System.out.println("obj salvo no banco");
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Erro ao salvar");
                            
                        }
                          

        }
               jbCancelarActionPerformed(evt);       
             //  jcbPedido.removeItem(jcbPedido.getSelectedItem());
              // jcbPedido.removeItemAt(jcbPedido.getSelectedIndex());
               
               jcbPedido.setSelectedItem(null);
               // }
            //}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: OBJ " +e.getMessage());
            listaPedPro.clear();
            System.out.println("limpar");
            DefaultTableModel mp = (DefaultTableModel) jtbPedidoProduto.getModel();
            mp.setNumRows(0);
            
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, false);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        DefaultTableModel mp = (DefaultTableModel) jtbPedidoProduto.getModel();
        mp.setNumRows(0);
        jcbPedido.setSelectedItem(null);

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        try {
            if(validarCampos()){
            int produtoSelect = jcbProduto.getSelectedIndex();
            int pedidoSelect = jcbPedido.getSelectedIndex();
            DefaultTableModel mp = (DefaultTableModel) jtbPedidoProduto.getModel();
                mp.addRow(new String []{""+listaProduto.get(produtoSelect).getIdProd(), 
                    listaProduto.get(produtoSelect).getNomeProd(),
                     ""+listaPedido.get(pedidoSelect).getIdPedido()});
                
          
                            PedidoProdutoModel list = new PedidoProdutoModel(Integer.parseInt(jtQuantidade.getText()),
                                    listaProduto.get(jcbProduto.getSelectedIndex()),
                                    listaPedido.get(jcbPedido.getSelectedIndex()), 
                                    listaPedPro);
                           
                              listaPedPro.add(list); 
                              
                                //System.out.println(list.getQantCadaProduto());
                                System.out.println(list.getProduto().getIdProd());
                                System.out.println(list.getPedido().getIdPedido());

                              
                             
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
            int ultimo = listaPedPro.size()-1;
            listaPedPro.remove(ultimo);
            for(PedidoProdutoModel ped : listaPedPro){
                System.out.println(ped.getProduto().getNomeProd());
            }
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Erro ao salvar: " +e.getMessage());

        }
    }//GEN-LAST:event_jbRemovActionPerformed

    private void jcbPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRemov;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbPedido;
    private javax.swing.JComboBox<String> jcbProduto;
    private javax.swing.JLabel jlDtaPedido;
    private javax.swing.JLabel jlNomeProd;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JTextField jtQuantidade;
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
        //obj.setQantCadaProduto(Integer.parseInt(jtQuantidade.getText()));
       // obj.setProduto(listaProduto.get(jcbProduto.getSelectedIndex()));  
        //obj.setPedido(listaPedido.get(jcbPedido.getSelectedIndex()));
        
        for (PedidoProdutoModel pro : listaPedPro){
            obj.setQantCadaProduto(pro.getQantCadaProduto());
            obj.setProduto(pro.getProduto());
            obj.setPedido(pro.getPedido());
            
             if(DAO.incluir(obj)){
                           // JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                            //jbCancelarActionPerformed(evt);
                            System.out.println("obj salvo no banco");
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Erro ao salvar");
                            obj.removePedidoProduto(pro);
                        }
            
        }
        
        return true;
    }
}