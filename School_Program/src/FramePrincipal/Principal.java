package FramePrincipal;
import Banco.*;
import Panel.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Almir Filho
 */
public class Principal extends javax.swing.JFrame {
    DAO dao = new DAO();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JPanel();
        Log = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Cad = new javax.swing.JButton();
        jInfo = new javax.swing.JPanel();
        jLogin = new javax.swing.JPanel();
        jText03 = new javax.swing.JLabel();
        CampoNick = new javax.swing.JTextField();
        CampoPass = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();
        Senha = new javax.swing.JLabel();
        Apelido = new javax.swing.JLabel();
        jBorda = new javax.swing.JLabel();
        jText01 = new javax.swing.JLabel();
        jText02 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The last Program");
        setMaximumSize(new java.awt.Dimension(950, 500));
        setMinimumSize(new java.awt.Dimension(950, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu.setBackground(new java.awt.Color(0, 0, 0));
        jMenu.setMaximumSize(new java.awt.Dimension(950, 61));
        jMenu.setMinimumSize(new java.awt.Dimension(950, 61));
        jMenu.setPreferredSize(new java.awt.Dimension(950, 61));
        jMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Log.setFont(new java.awt.Font("Centaur", 0, 12)); // NOI18N
        Log.setForeground(new java.awt.Color(255, 255, 255));
        Log.setText("E N T R A R");
        Log.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, new java.awt.Color(255, 255, 255), java.awt.Color.black));
        Log.setContentAreaFilled(false);
        Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogActionPerformed(evt);
            }
        });
        jMenu.add(Log, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 15, 116, 31));

        View.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.setText("V I Z U A L I Z E   C O M O    U M     E S T U D A N T E");
        View.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255), java.awt.Color.black));
        View.setContentAreaFilled(false);
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jMenu.add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 410, 31));

        Cad.setBackground(new java.awt.Color(255, 255, 255));
        Cad.setFont(new java.awt.Font("Centaur", 0, 12)); // NOI18N
        Cad.setForeground(new java.awt.Color(255, 255, 255));
        Cad.setText("C A D A S T R A R");
        Cad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black));
        Cad.setContentAreaFilled(false);
        Cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadActionPerformed(evt);
            }
        });
        jMenu.add(Cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 15, 130, 30));

        getContentPane().add(jMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        jInfo.setBackground(new java.awt.Color(0, 51, 51));
        jInfo.setMaximumSize(new java.awt.Dimension(950, 440));
        jInfo.setMinimumSize(new java.awt.Dimension(950, 440));
        jInfo.setPreferredSize(new java.awt.Dimension(950, 440));
        jInfo.setLayout(new java.awt.CardLayout());

        jLogin.setBackground(new java.awt.Color(0, 51, 51));
        jLogin.setMaximumSize(new java.awt.Dimension(950, 440));
        jLogin.setMinimumSize(new java.awt.Dimension(950, 440));
        jLogin.setPreferredSize(new java.awt.Dimension(950, 440));
        jLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jText03.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jText03.setForeground(new java.awt.Color(255, 255, 255));
        jText03.setText("autorizados para realizarem \"Log in\".");
        jLogin.add(jText03, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 360, 50));

        CampoNick.setMargin(new java.awt.Insets(5, 5, 5, 5));
        CampoNick.setMaximumSize(new java.awt.Dimension(25, 35));
        CampoNick.setMinimumSize(new java.awt.Dimension(25, 35));
        jLogin.add(CampoNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 230, 40));

        CampoPass.setMargin(new java.awt.Insets(5, 5, 5, 5));
        CampoPass.setMaximumSize(new java.awt.Dimension(25, 35));
        CampoPass.setMinimumSize(new java.awt.Dimension(25, 35));
        jLogin.add(CampoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 230, 40));

        Entrar.setBackground(null);
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("E N T R A R");
        Entrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Entrar.setContentAreaFilled(false);
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Entrar.setMaximumSize(new java.awt.Dimension(40, 80));
        Entrar.setMinimumSize(new java.awt.Dimension(40, 80));
        Entrar.setPreferredSize(new java.awt.Dimension(40, 80));
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        jLogin.add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 140, 40));

        Senha.setBackground(new java.awt.Color(0, 0, 0));
        Senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senha.setText("S E N H A");
        Senha.setMaximumSize(new java.awt.Dimension(40, 70));
        Senha.setMinimumSize(new java.awt.Dimension(40, 70));
        Senha.setPreferredSize(new java.awt.Dimension(40, 70));
        jLogin.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 130, 40));

        Apelido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Apelido.setForeground(new java.awt.Color(255, 255, 255));
        Apelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Apelido.setText("U S U Á R I O");
        Apelido.setMaximumSize(new java.awt.Dimension(40, 70));
        Apelido.setMinimumSize(new java.awt.Dimension(40, 70));
        Apelido.setPreferredSize(new java.awt.Dimension(40, 70));
        jLogin.add(Apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 130, 40));

        jBorda.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.black));
        jLogin.add(jBorda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 440, 310));

        jText01.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jText01.setForeground(new java.awt.Color(255, 255, 255));
        jText01.setText("Esta área é de acesso restrito. Apenas os");
        jLogin.add(jText01, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 360, 60));

        jText02.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jText02.setForeground(new java.awt.Color(255, 255, 255));
        jText02.setText("setores e departamentos escolares estão");
        jLogin.add(jText02, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 360, 50));

        jInfo.add(jLogin, "card2");

        getContentPane().add(jInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 950, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadActionPerformed
     Creation_Screen register = new Creation_Screen();
        jInfo.removeAll();
        jInfo.add(register);
        jInfo.repaint();
        jInfo.revalidate();
    }//GEN-LAST:event_CadActionPerformed

    private void LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogActionPerformed
        jInfo.removeAll();
        jInfo.add(jLogin);
        jInfo.repaint();
        jInfo.revalidate();
    }//GEN-LAST:event_LogActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
     CalendarView view = new CalendarView();
     jInfo.removeAll();
     jInfo.add(view);
     jInfo.repaint();
     jInfo.revalidate();
    }//GEN-LAST:event_ViewActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        Basics User = new Basics();
        
        if(CampoNick.getText().isEmpty() || CampoPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ops! Algum campo está vázio.");
        } else {
            User.setUsuario(CampoNick.getText());
            User.setSenha(CampoPass.getText());
            dao.Login(User);

            // Limpar os campos de texto após confirmação
            CampoPass.setText(null);
            CampoNick.setText(null);
            if (dao.acesso() == true) {
                Management_Screen secondary = new Management_Screen();
                secondary.ColocarDados(User);
                secondary.setVisible(true);
                secondary.setResizable(false);
                secondary.setLocationRelativeTo(null);
                dispose();
            }
        }
    }//GEN-LAST:event_EntrarActionPerformed

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
                Principal telaAtual = new Principal();
                telaAtual.setVisible(true);
                telaAtual.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apelido;
    private javax.swing.JButton Cad;
    private javax.swing.JTextField CampoNick;
    private javax.swing.JPasswordField CampoPass;
    private javax.swing.JButton Entrar;
    private javax.swing.JButton Log;
    private javax.swing.JLabel Senha;
    private javax.swing.JButton View;
    private javax.swing.JLabel jBorda;
    private javax.swing.JPanel jInfo;
    private javax.swing.JPanel jLogin;
    private javax.swing.JPanel jMenu;
    private javax.swing.JLabel jText01;
    private javax.swing.JLabel jText02;
    private javax.swing.JLabel jText03;
    // End of variables declaration//GEN-END:variables
}
