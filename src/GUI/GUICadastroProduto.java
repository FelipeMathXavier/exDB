package GUI;

import DAO.CategoriaDAO;
import DAO.ProdutoDAO;
import MODEL.Categoria;
import MODEL.Produto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class GUICadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form GUICadastroProduto
     */
    public GUICadastroProduto() throws SQLException {
        initComponents();
        CategoriaDAO dao = new CategoriaDAO();
        for(Categoria c: CategoriaDAO.listarCategoria()) {
            cboxCategoria.addItem(c);
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
        campoNome = new javax.swing.JTextField();
        campoQuantidade = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboxCategoria = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadastrarProdutos = new javax.swing.JMenuItem();
        CadastrarCategoria = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        listarNome = new javax.swing.JMenuItem();
        listarQuantidade = new javax.swing.JMenuItem();
        listarMaiorQuantidade = new javax.swing.JMenuItem();
        listarCategoria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        deletarProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Insira os dados do produto nos campos abaixo:");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        btn_salvar.setText("Cadastrar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria");

        jLabel3.setText("Nome");

        jLabel4.setText("Quantidade");

        jMenu1.setText("Cadastrar");

        CadastrarProdutos.setText("Produtos");
        CadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrarProdutos);

        CadastrarCategoria.setText("Categorias");
        CadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrarCategoria);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listar");

        listarNome.setText("Prod. por nome");
        listarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarNomeActionPerformed(evt);
            }
        });
        jMenu2.add(listarNome);

        listarQuantidade.setText("Prod. por quantidade");
        listarQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarQuantidadeActionPerformed(evt);
            }
        });
        jMenu2.add(listarQuantidade);

        listarMaiorQuantidade.setText("Maior/Menor quantidade");
        listarMaiorQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMaiorQuantidadeActionPerformed(evt);
            }
        });
        jMenu2.add(listarMaiorQuantidade);

        listarCategoria.setText("Por categoria");
        listarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(listarCategoria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Deletar");

        deletarProduto.setText("Produtos");
        deletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(deletarProduto);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btn_salvar)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (!campoNome.getText().equals("") && !campoQuantidade.getText().equals("")) {
            try {
                Categoria categoria = (Categoria) cboxCategoria.getSelectedItem();
                Produto produto = new Produto();
                produto.setNome(campoNome.getText());
                produto.setQuantidade(Integer.parseInt(campoQuantidade.getText()));
                produto.setId_categoria(categoria.getId());
                ProdutoDAO.cadastrarProduto(produto);
                JOptionPane.showMessageDialog(null, "Cadastro realizado");
                campoNome.setText("");
                campoQuantidade.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir informações no banco");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Certifique-se de preencher todos os campos!", "Fique atento!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void CadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdutosActionPerformed
        GUICadastroProduto janela = null;
        try {
            janela = new GUICadastroProduto();
        } catch (SQLException ex) {
            Logger.getLogger(GUIMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarProdutosActionPerformed

    private void CadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarCategoriaActionPerformed
        GUICadastrarCategoria janela = new GUICadastrarCategoria();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarCategoriaActionPerformed

    private void listarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarNomeActionPerformed
        GUIListarNome janela = new GUIListarNome();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listarNomeActionPerformed

    private void listarQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarQuantidadeActionPerformed
        GUIListarQuantidade janela = new GUIListarQuantidade();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listarQuantidadeActionPerformed

    private void listarMaiorQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMaiorQuantidadeActionPerformed
        GUIListarMaiorMenorQuantidade janela = new GUIListarMaiorMenorQuantidade();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listarMaiorQuantidadeActionPerformed

    private void listarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCategoriaActionPerformed
        GUIListarCategoria janela = null;
        try {
            janela = new GUIListarCategoria();
        } catch (SQLException ex) {
            Logger.getLogger(GUICadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listarCategoriaActionPerformed

    private void deletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarProdutoActionPerformed
        GUIDeletarProduto janela = new GUIDeletarProduto();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deletarProdutoActionPerformed
    
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
            java.util.logging.Logger.getLogger(GUICadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new GUICadastroProduto().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(GUICadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastrarCategoria;
    private javax.swing.JMenuItem CadastrarProdutos;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JComboBox<Object> cboxCategoria;
    private javax.swing.JMenuItem deletarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listarCategoria;
    private javax.swing.JMenuItem listarMaiorQuantidade;
    private javax.swing.JMenuItem listarNome;
    private javax.swing.JMenuItem listarQuantidade;
    // End of variables declaration//GEN-END:variables
}