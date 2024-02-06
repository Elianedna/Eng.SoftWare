/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author watel
 */
public class CadastrarEqManutencao extends javax.swing.JFrame
{

    /**
     * Creates new form CadastrarEqManutencao
     */
    public CadastrarEqManutencao()
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
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        passSenha1 = new javax.swing.JPasswordField();
        passSenha2 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CASA EFICIENTE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(222, 154, 74));
        jLabel2.setText("TECNICO DE MANUTENCAO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 330, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(222, 154, 74));
        jLabel3.setText("Cadastro de ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel4.setText("Entre com os seus dados para criar a sua conta.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        txtSobrenome.setBackground(new java.awt.Color(102, 102, 102));
        txtSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        txtSobrenome.setText("Joao");
        txtSobrenome.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                txtSobrenomeMouseEntered(evt);
            }
        });
        jPanel1.add(txtSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 250, -1));

        txtEmail.setBackground(new java.awt.Color(102, 102, 102));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("exemplo@CasaEficiente.com");
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                txtEmailMouseEntered(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 250, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(222, 154, 74));
        jLabel5.setText("Nome");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(222, 154, 74));
        jLabel7.setText("E-mail");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(222, 154, 74));
        jLabel8.setText("Senha");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(222, 154, 74));
        jLabel9.setText("Confirmar Senha");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        btnSignUp.setBackground(new java.awt.Color(222, 154, 74));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("SignUp");
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        jLabel10.setText("Esqueceu-se da Senha?");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 130, -1));

        jLabel13.setForeground(new java.awt.Color(222, 154, 74));
        jLabel13.setText("Voltar ao menu principal");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 140, -1));

        passSenha1.setBackground(new java.awt.Color(102, 102, 102));
        passSenha1.setForeground(new java.awt.Color(255, 255, 255));
        passSenha1.setText("jPasswordField1");
        passSenha1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                passSenha1MouseEntered(evt);
            }
        });
        jPanel1.add(passSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 260, -1));

        passSenha2.setBackground(new java.awt.Color(102, 102, 102));
        passSenha2.setForeground(new java.awt.Color(255, 255, 255));
        passSenha2.setText("jPasswordField2");
        passSenha2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                passSenha2MouseEntered(evt);
            }
        });
        jPanel1.add(passSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 260, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manuten3.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSobrenomeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtSobrenomeMouseEntered
    {//GEN-HEADEREND:event_txtSobrenomeMouseEntered
        txtSobrenome.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeMouseEntered

    private void txtEmailMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_txtEmailMouseEntered
    {//GEN-HEADEREND:event_txtEmailMouseEntered
        // TODO add your handling code here:
        txtEmail.setText("");
    }//GEN-LAST:event_txtEmailMouseEntered

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtEmailActionPerformed
    {//GEN-HEADEREND:event_txtEmailActionPerformed
        txtEmail.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void passSenha1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_passSenha1MouseEntered
    {//GEN-HEADEREND:event_passSenha1MouseEntered
        // TODO add your handling code here:
        passSenha1.setText("");
    }//GEN-LAST:event_passSenha1MouseEntered

    private void passSenha2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_passSenha2MouseEntered
    {//GEN-HEADEREND:event_passSenha2MouseEntered
        // TODO add your handling code here:
        passSenha2.setText("");
    }//GEN-LAST:event_passSenha2MouseEntered

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
            java.util.logging.Logger.getLogger(CadastrarEqManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(CadastrarEqManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(CadastrarEqManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(CadastrarEqManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new CadastrarEqManutencao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passSenha1;
    private javax.swing.JPasswordField passSenha2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
