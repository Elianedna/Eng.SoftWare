/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author watel
 */
public class MainPageLocatario extends javax.swing.JFrame
{

    /**
     * Creates new form MainPageLocatario
     */
    public MainPageLocatario()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbSIM = new javax.swing.JRadioButton();
        rbNAO = new javax.swing.JRadioButton();
        rbSIM1 = new javax.swing.JRadioButton();
        rbSIM2 = new javax.swing.JRadioButton();
        rbSIM3 = new javax.swing.JRadioButton();
        rbNAO1 = new javax.swing.JRadioButton();
        rbNAO2 = new javax.swing.JRadioButton();
        rbNAO3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(222, 154, 74));
        jLabel2.setText("CASA EFICIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AVALIAR - SISTEMA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(222, 154, 74));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fita.png"))); // NOI18N
        jLabel13.setText("Preco");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 534, 750, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("1. Considera o sistema fácil e interativo? ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Sugentões:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rectangle 18.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -70, -1, 180));

        btnLogOut.setBackground(new java.awt.Color(222, 154, 74));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("SUBMETER");
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("Responda as perguntas segundo a sua esperiencia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("1. Considera o sistema fácil e interativo? ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("1. Considera o sistema fácil e interativo? ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("1. Considera o sistema fácil e interativo? ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        rbSIM.setText("SIM");
        rbSIM.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbSIMActionPerformed(evt);
            }
        });
        jPanel1.add(rbSIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        rbNAO.setText("NAO");
        jPanel1.add(rbNAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        rbSIM1.setText("SIM");
        rbSIM1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbSIM1ActionPerformed(evt);
            }
        });
        jPanel1.add(rbSIM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        rbSIM2.setText("SIM");
        rbSIM2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbSIM2ActionPerformed(evt);
            }
        });
        jPanel1.add(rbSIM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        rbSIM3.setText("SIM");
        rbSIM3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbSIM3ActionPerformed(evt);
            }
        });
        jPanel1.add(rbSIM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        rbNAO1.setText("NAO");
        jPanel1.add(rbNAO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        rbNAO2.setText("NAO");
        jPanel1.add(rbNAO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        rbNAO3.setText("NAO");
        jPanel1.add(rbNAO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RectangleO.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 680, 190));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SUGESTOES.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 330, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSIMActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbSIMActionPerformed
    {//GEN-HEADEREND:event_rbSIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSIMActionPerformed

    private void rbSIM1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbSIM1ActionPerformed
    {//GEN-HEADEREND:event_rbSIM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSIM1ActionPerformed

    private void rbSIM2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbSIM2ActionPerformed
    {//GEN-HEADEREND:event_rbSIM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSIM2ActionPerformed

    private void rbSIM3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbSIM3ActionPerformed
    {//GEN-HEADEREND:event_rbSIM3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSIM3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MainPageLocatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainPageLocatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainPageLocatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainPageLocatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainPageLocatario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbNAO;
    private javax.swing.JRadioButton rbNAO1;
    private javax.swing.JRadioButton rbNAO2;
    private javax.swing.JRadioButton rbNAO3;
    private javax.swing.JRadioButton rbSIM;
    private javax.swing.JRadioButton rbSIM1;
    private javax.swing.JRadioButton rbSIM2;
    private javax.swing.JRadioButton rbSIM3;
    // End of variables declaration//GEN-END:variables
}
