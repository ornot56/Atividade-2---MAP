/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.map.cadastroproduto.view;

import br.edu.map.cadastroproduto.dao.ProdutoDAO;
import br.edu.map.cadastroproduto.model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class NovoProdutoJFrame extends javax.swing.JFrame {
    
    private ProdutoDAO dao = new ProdutoDAO();
    private ProdutosJFrame principal;
    private Produto produto;

    /**
     * Creates new form NovoProdutoJFrame
     */
    public NovoProdutoJFrame(ProdutosJFrame parent) {
        this.principal = parent;
        initComponents();
    }
    
    public NovoProdutoJFrame(ProdutosJFrame parent, Produto produto) {
        this.principal = parent;
        initComponents();
        this.produto = produto;
    }

    private NovoProdutoJFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void preencherCliente(){
        
        textNome.setText(produto.getNome());
        textPreco.setText(Float.toString(produto.getPreco())); 
        textCor.setText(produto.getEspc().getCor());
        textSistema.setText(produto.getEspc().getSistema());
        textFabricante.setText(produto.getEspc().getFabricante());
        textDetalhes.setText(produto.getEspc().getDetalhes());
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNovoProduto = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        textPreco = new javax.swing.JTextField();
        textCor = new javax.swing.JTextField();
        labelCor = new javax.swing.JLabel();
        textSistema = new javax.swing.JTextField();
        labelSistema = new javax.swing.JLabel();
        textFabricante = new javax.swing.JTextField();
        labelFabricante = new javax.swing.JLabel();
        labelDetalhes = new javax.swing.JLabel();
        textDetalhes = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNovoProduto.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        labelNovoProduto.setText("NOVO PRODUTO");
        labelNovoProduto.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelNome.setText("Nome:");

        labelPreco.setText("Preço:");

        labelCor.setText("Cor:");

        labelSistema.setText("Sistema:");

        labelFabricante.setText("Fabricante:");

        labelDetalhes.setText("Detalhes:");

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPreco)
                                    .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCor)
                                    .addComponent(textCor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelSistema)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(textSistema)))
                            .addComponent(textFabricante)
                            .addComponent(textDetalhes)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome)
                                    .addComponent(labelFabricante)
                                    .addComponent(labelDetalhes))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(labelNovoProduto)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNovoProduto)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSistema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDetalhes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
        
        if(produto == null){
            Produto p = new Produto();

            String nome = textNome.getText();
            float preco = Float.parseFloat(textPreco.getText());
            String cor = textCor.getText();
            String fabricante = textFabricante.getText();
            String sistema = textSistema.getText();
            String detalhes = textDetalhes.getText();


            p.setNome(nome);
            p.setPreco(preco);
            p.getEspc().setCor(cor);
            p.getEspc().setFabricante(fabricante);
            p.getEspc().setSistema(sistema);
            p.getEspc().setDetalhes(detalhes);

            try {
                dao.inserirProduto(p);
                principal.preencherTabela(null);
                dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir Produto!");
            }
        }else{
            
            String nome = textNome.getText();
            float preco = Float.parseFloat(textPreco.getText());
            String cor = textCor.getText();
            String fabricante = textFabricante.getText();
            String sistema = textSistema.getText();
            String detalhes = textDetalhes.getText();


            produto.setNome(nome);
            produto.setPreco(preco);
            produto.getEspc().setCor(cor);
            produto.getEspc().setFabricante(fabricante);
            produto.getEspc().setSistema(sistema);
            produto.getEspc().setDetalhes(detalhes);

            try {
                dao.editarProduto(produto);
                principal.preencherTabela(null);
                dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao editar Produto!");
            }

        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NovoProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoProdutoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelDetalhes;
    private javax.swing.JLabel labelFabricante;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNovoProduto;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelSistema;
    private javax.swing.JTextField textCor;
    private javax.swing.JTextField textDetalhes;
    private javax.swing.JTextField textFabricante;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextField textSistema;
    // End of variables declaration//GEN-END:variables
}