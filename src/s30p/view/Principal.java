/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s30p.view;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import model.Proprietarios;
/**
 *
 * @author koonjshah
 */
public class Principal extends javax.swing.JFrame {
    //Teste Git adicionado novo código
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnProprietarios = new javax.swing.JMenuItem();
        MnCondominios = new javax.swing.JMenuItem();
        MnImoveis = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MnSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SU Software - Gestão de Imóveis");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jMenu1.setText("Cadastro");

        MnProprietarios.setText("Proprietários....");
        MnProprietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnProprietariosActionPerformed(evt);
            }
        });
        jMenu1.add(MnProprietarios);

        MnCondominios.setText("Condomínios");
        MnCondominios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCondominiosActionPerformed(evt);
            }
        });
        jMenu1.add(MnCondominios);

        MnImoveis.setText("Imóveis");
        MnImoveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnImoveisActionPerformed(evt);
            }
        });
        jMenu1.add(MnImoveis);
        jMenu1.add(jSeparator1);

        MnSair.setText("Sair");
        MnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSairActionPerformed(evt);
            }
        });
        jMenu1.add(MnSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimento");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnProprietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnProprietariosActionPerformed
      CadastroProprietario cadastro = new CadastroProprietario(new Proprietarios());
      desktop.add(cadastro);
      cadastro.show();
    }//GEN-LAST:event_MnProprietariosActionPerformed

    private void MnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MnSairActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        Dimension d = ((Principal)evt.getSource()).getSize();        
        desktop.setSize(d);
        
    }//GEN-LAST:event_formComponentResized

    private void MnImoveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnImoveisActionPerformed
      CadastroImoveis cadastro = new CadastroImoveis();
      desktop.add(cadastro);
      cadastro.show();

    }//GEN-LAST:event_MnImoveisActionPerformed

    private void MnCondominiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCondominiosActionPerformed
       CadastroCondominio cadastro = new CadastroCondominio();
       desktop.add(cadastro);
       cadastro.show();
    }//GEN-LAST:event_MnCondominiosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void addInternalFrame(JInternalFrame toClose, JInternalFrame toOpen){
        toClose.dispose();
        this.desktop.remove(toClose);
        
        this.desktop.add(toOpen);
        toOpen.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnCondominios;
    private javax.swing.JMenuItem MnImoveis;
    private javax.swing.JMenuItem MnProprietarios;
    private javax.swing.JMenuItem MnSair;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
