/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author edu
 */
public class PDF_GUI extends javax.swing.JFrame {

    /**
     * Creates new form PDF_GUI
     */
    public PDF_GUI() {
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

        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        jLabel2 = new javax.swing.JLabel();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        panelRectTranslucido1 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelRectTranslucido2 = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel4 = new javax.swing.JLabel();
        NamePDF_TXT = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        jLabel5 = new javax.swing.JLabel();
        NameEmpresa_TXT = new org.edisoncor.gui.textField.TextFieldRoundIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelImage3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 102), new java.awt.Color(255, 0, 102), new java.awt.Color(204, 0, 102), new java.awt.Color(204, 0, 102)));
        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        panelImage3.setOpaque(false);
        panelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice2.setBackground(new java.awt.Color(255, 0, 0));
        panelNice2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Configurar PDF");
        panelNice2.add(jLabel2);
        jLabel2.setBounds(40, 0, 320, 30);

        buttonAction1.setText("X");
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });
        panelNice2.add(buttonAction1);
        buttonAction1.setBounds(360, 0, 40, 35);

        panelImage3.add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelRectTranslucido1.setBackground(new java.awt.Color(255, 255, 255));
        panelRectTranslucido1.setColorDeBorde(new java.awt.Color(255, 255, 255));
        panelRectTranslucido1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRectTranslucido1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jButton1.setText("Voltar");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRectTranslucido1.add(jButton1);

        jButton2.setText("Criar");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelRectTranslucido1.add(jButton2);

        panelImage3.add(panelRectTranslucido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 340, 40));

        panelRectTranslucido2.setBackground(new java.awt.Color(255, 255, 255));
        panelRectTranslucido2.setColorDeBorde(new java.awt.Color(204, 0, 102));
        panelRectTranslucido2.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRectTranslucido2.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nome do arquivo:");
        panelRectTranslucido2.add(jLabel4);

        NamePDF_TXT.setPreferredSize(new java.awt.Dimension(150, 20));
        panelRectTranslucido2.add(NamePDF_TXT);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nome da empresa:");
        panelRectTranslucido2.add(jLabel5);

        NameEmpresa_TXT.setPreferredSize(new java.awt.Dimension(150, 20));
        panelRectTranslucido2.add(NameEmpresa_TXT);

        panelImage3.add(panelRectTranslucido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 340, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(358, 209));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Model.PDF_Generator.GerarPDF();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PDF_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDF_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDF_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDF_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDF_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static org.edisoncor.gui.textField.TextFieldRoundIcon NameEmpresa_TXT;
    public static org.edisoncor.gui.textField.TextFieldRoundIcon NamePDF_TXT;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido1;
    private org.edisoncor.gui.panel.PanelRectTranslucido panelRectTranslucido2;
    // End of variables declaration//GEN-END:variables
}
