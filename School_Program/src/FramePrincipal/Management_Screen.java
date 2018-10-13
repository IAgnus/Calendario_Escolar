package FramePrincipal;
import Banco.*;
import Panel.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Almir Filho
 */
public class Management_Screen extends javax.swing.JFrame {
    Principal principal = new Principal();
    DAO dao = new DAO();
    Basics user = new Basics();
    String Usuario = null;
     
    public void ColocarDados(Basics user) {
    this.user.setUsuario(user.getUsuario());
    Usuario = user.getUsuario();
    this.user = dao.Dados(user.getUsuario());
    LabelNome01.setText(this.user.getPrimeiro_Nome());
    LabelNome02.setText(this.user.getSegundo_Nome());
    LabelTrabalho.setText(this.user.getLocal_Trabalho());
    }
    
    public Management_Screen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        View = new javax.swing.JButton();
        File = new javax.swing.JButton();
        jInfo = new javax.swing.JPanel();
        jFile = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        LabelNome01 = new javax.swing.JLabel();
        LabelNome02 = new javax.swing.JLabel();
        LabelTrabalho = new javax.swing.JLabel();
        LabelNome3 = new javax.swing.JLabel();
        LabelNome1 = new javax.swing.JLabel();
        LabelNome2 = new javax.swing.JLabel();
        LabelNome4 = new javax.swing.JLabel();
        jBorda = new javax.swing.JLabel();
        jEscolha = new javax.swing.JComboBox<>();
        Publicacao1 = new javax.swing.JButton();
        Publicacao2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 500));

        jMenu.setBackground(new java.awt.Color(0, 0, 0));
        jMenu.setMaximumSize(new java.awt.Dimension(950, 61));
        jMenu.setMinimumSize(new java.awt.Dimension(950, 61));
        jMenu.setPreferredSize(new java.awt.Dimension(950, 61));
        jMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sair.setFont(new java.awt.Font("Centaur", 0, 12)); // NOI18N
        Sair.setForeground(new java.awt.Color(255, 255, 255));
        Sair.setText("S A I R");
        Sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, new java.awt.Color(255, 255, 255), java.awt.Color.black));
        Sair.setContentAreaFilled(false);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 15, 116, 31));

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

        File.setBackground(new java.awt.Color(255, 255, 255));
        File.setFont(new java.awt.Font("Centaur", 0, 12)); // NOI18N
        File.setForeground(new java.awt.Color(255, 255, 255));
        File.setText("N O V O   D O C U M E N T O");
        File.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black));
        File.setContentAreaFilled(false);
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });
        jMenu.add(File, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 15, 170, 30));

        jInfo.setBackground(new java.awt.Color(0, 51, 51));
        jInfo.setLayout(new java.awt.CardLayout());

        jFile.setBackground(new java.awt.Color(0, 51, 51));
        jFile.setForeground(new java.awt.Color(255, 255, 255));
        jFile.setMaximumSize(new java.awt.Dimension(950, 440));
        jFile.setMinimumSize(new java.awt.Dimension(950, 440));
        jFile.setRequestFocusEnabled(false);
        jFile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jText.setColumns(20);
        jText.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        jText.setRows(5);
        jScrollPane1.setViewportView(jText);

        jFile.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 478, 250));

        LabelNome01.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        LabelNome01.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome01.setText("XXXXXXXXX");
        LabelNome01.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome01.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome01.setPreferredSize(new java.awt.Dimension(40, 70));
        jFile.add(LabelNome01, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 340, 30));

        LabelNome02.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        LabelNome02.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome02.setText("YYYYYYYY");
        LabelNome02.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome02.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome02.setPreferredSize(new java.awt.Dimension(40, 70));
        jFile.add(LabelNome02, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 340, 40));

        LabelTrabalho.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        LabelTrabalho.setForeground(new java.awt.Color(255, 255, 255));
        LabelTrabalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTrabalho.setText("L O C A L  D E  T R A B A L H O");
        LabelTrabalho.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, java.awt.Color.white));
        LabelTrabalho.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelTrabalho.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelTrabalho.setPreferredSize(new java.awt.Dimension(40, 70));
        jFile.add(LabelTrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 340, 30));

        LabelNome3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNome3.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome3.setText("(Máx. 500 caracteres)");
        LabelNome3.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome3.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome3.setPreferredSize(new java.awt.Dimension(40, 70));
        jFile.add(LabelNome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 140, 20));

        LabelNome1.setFont(new java.awt.Font("Centaur", 0, 15)); // NOI18N
        LabelNome1.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome1.setText("(A U T O R (A)) ---- P R I M E I R O   N O M E");
        LabelNome1.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome1.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome1.setPreferredSize(new java.awt.Dimension(40, 70));
        jFile.add(LabelNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 340, 40));

        LabelNome2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNome2.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome2.setText("C L A S S I F I C A Ç Ã O");
        LabelNome2.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome2.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome2.setPreferredSize(new java.awt.Dimension(40, 70));
        jFile.add(LabelNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 160, 30));

        LabelNome4.setFont(new java.awt.Font("Centaur", 0, 15)); // NOI18N
        LabelNome4.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome4.setText("(A U T O R ( A )) ---- S E G U N D O   N O M E");
        LabelNome4.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome4.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome4.setPreferredSize(new java.awt.Dimension(40, 70));
        jFile.add(LabelNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 340, 40));

        jBorda.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.black));
        jFile.add(jBorda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 340, 260));

        jEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evento I", "Evento II", "Evento III", "Notícia I", "Notícia II", "Notícia III" }));
        jEscolha.setSelectedItem(null);
        jFile.add(jEscolha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 220, 30));

        Publicacao1.setBackground(new java.awt.Color(255, 255, 255));
        Publicacao1.setFont(new java.awt.Font("Centaur", 0, 12)); // NOI18N
        Publicacao1.setForeground(new java.awt.Color(255, 255, 255));
        Publicacao1.setText("D E S F A Z E R   C A D A S T R O");
        Publicacao1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black));
        Publicacao1.setContentAreaFilled(false);
        Publicacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Publicacao1ActionPerformed(evt);
            }
        });
        jFile.add(Publicacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 190, 30));

        Publicacao2.setBackground(new java.awt.Color(255, 255, 255));
        Publicacao2.setFont(new java.awt.Font("Centaur", 0, 12)); // NOI18N
        Publicacao2.setForeground(new java.awt.Color(255, 255, 255));
        Publicacao2.setText("P U B L I C A R");
        Publicacao2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black));
        Publicacao2.setContentAreaFilled(false);
        Publicacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Publicacao2ActionPerformed(evt);
            }
        });
        jFile.add(Publicacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 170, 30));

        jInfo.add(jFile, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        jInfo.removeAll();
        jInfo.add(jFile);
        jInfo.repaint();
        jInfo.revalidate();;
        jText.setText(null);
    }//GEN-LAST:event_FileActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        principal.setVisible(true);
        principal.setResizable(false);
        principal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
     CalendarView view = new CalendarView();
     jInfo.removeAll();
     jInfo.add(view);
     jInfo.repaint();
     jInfo.revalidate();
    }//GEN-LAST:event_ViewActionPerformed

    private void Publicacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Publicacao1ActionPerformed
    dao.Exclusao(Usuario);
    principal.setVisible(true);
    principal.setResizable(false);
    principal.setLocationRelativeTo(null);
    dispose();
    }//GEN-LAST:event_Publicacao1ActionPerformed

    private void Publicacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Publicacao2ActionPerformed
    Basics Calendario = new Basics();
    Calendario.setInformacao(jText.getText());
    if (jEscolha.getSelectedItem() == "Evento I") {
    Calendario.setDescricao("Evento I");
    }
    if (jEscolha.getSelectedItem() == "Evento II") {
    Calendario.setDescricao("Evento II");
    }
    if (jEscolha.getSelectedItem() == "Evento III") {
    Calendario.setDescricao("Evento III");
    }
    if(jEscolha.getSelectedItem() == "Notícia I") {
    Calendario.setDescricao("Notícia I");
    }
    if(jEscolha.getSelectedItem() == "Notícia II") {
    Calendario.setDescricao("Notícia II");
    }
    if(jEscolha.getSelectedItem() == "Notícia III") {
    Calendario.setDescricao("Notícia III");
    }
    dao.NewFile(Calendario);
    }//GEN-LAST:event_Publicacao2ActionPerformed

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
            java.util.logging.Logger.getLogger(Management_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton File;
    private javax.swing.JLabel LabelNome01;
    private javax.swing.JLabel LabelNome02;
    private javax.swing.JLabel LabelNome1;
    private javax.swing.JLabel LabelNome2;
    private javax.swing.JLabel LabelNome3;
    private javax.swing.JLabel LabelNome4;
    private javax.swing.JLabel LabelTrabalho;
    private javax.swing.JButton Publicacao1;
    private javax.swing.JButton Publicacao2;
    private javax.swing.JButton Sair;
    private javax.swing.JButton View;
    private javax.swing.JLabel jBorda;
    private javax.swing.JComboBox<String> jEscolha;
    private javax.swing.JPanel jFile;
    private javax.swing.JPanel jInfo;
    private javax.swing.JPanel jMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jText;
    // End of variables declaration//GEN-END:variables
}
