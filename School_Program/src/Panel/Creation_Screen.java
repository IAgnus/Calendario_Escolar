package Panel;
import Banco.*;
import javax.swing.JOptionPane;

public class Creation_Screen extends javax.swing.JPanel {
    String PassWordConfirm = "Rosimarconcevideiton";
    String PassWordConfirmed = null;
    public Creation_Screen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNome01 = new javax.swing.JLabel();
        CampoPass = new javax.swing.JPasswordField();
        PrimeiroNome = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        LabelTrabalho = new javax.swing.JLabel();
        CampoNick = new javax.swing.JTextField();
        jText01 = new javax.swing.JLabel();
        jText02 = new javax.swing.JLabel();
        LabelNome02 = new javax.swing.JLabel();
        LocalTrabalho = new javax.swing.JComboBox<>();
        Cadastrar = new javax.swing.JButton();
        SegundoNome = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelNome01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNome01.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome01.setText("P R I M E I R O   N O M E");
        LabelNome01.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome01.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome01.setPreferredSize(new java.awt.Dimension(40, 70));
        add(LabelNome01, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, 40));

        CampoPass.setMargin(new java.awt.Insets(5, 5, 5, 5));
        CampoPass.setMaximumSize(new java.awt.Dimension(25, 35));
        CampoPass.setMinimumSize(new java.awt.Dimension(25, 35));
        add(CampoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 230, 40));

        PrimeiroNome.setMargin(new java.awt.Insets(5, 5, 5, 5));
        PrimeiroNome.setMaximumSize(new java.awt.Dimension(25, 35));
        PrimeiroNome.setMinimumSize(new java.awt.Dimension(25, 35));
        add(PrimeiroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 230, 40));

        Senha.setBackground(new java.awt.Color(0, 0, 0));
        Senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senha.setText("S E N H A");
        Senha.setMaximumSize(new java.awt.Dimension(40, 70));
        Senha.setMinimumSize(new java.awt.Dimension(40, 70));
        Senha.setPreferredSize(new java.awt.Dimension(40, 70));
        add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 130, 40));

        Usuario.setBackground(new java.awt.Color(0, 0, 0));
        Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario.setText("U S U Á R I O");
        Usuario.setMaximumSize(new java.awt.Dimension(40, 70));
        Usuario.setMinimumSize(new java.awt.Dimension(40, 70));
        Usuario.setPreferredSize(new java.awt.Dimension(40, 70));
        add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 130, 40));

        LabelTrabalho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelTrabalho.setForeground(new java.awt.Color(255, 255, 255));
        LabelTrabalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTrabalho.setText("L O C A L  D E  T R A B A L H O");
        LabelTrabalho.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelTrabalho.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelTrabalho.setPreferredSize(new java.awt.Dimension(40, 70));
        add(LabelTrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 190, 40));

        CampoNick.setMargin(new java.awt.Insets(5, 5, 5, 5));
        CampoNick.setMaximumSize(new java.awt.Dimension(25, 35));
        CampoNick.setMinimumSize(new java.awt.Dimension(25, 35));
        add(CampoNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 230, 40));

        jText01.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jText01.setForeground(new java.awt.Color(255, 255, 255));
        jText01.setText("fruto de análise.");
        add(jText01, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 910, 60));

        jText02.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jText02.setForeground(new java.awt.Color(255, 255, 255));
        jText02.setText("Esta área é de acesso restrito ao chefe de departamento escolar. Toda a informação posta aqui será");
        add(jText02, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 910, 60));

        LabelNome02.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNome02.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome02.setText("S E G U N D O   N O M E");
        LabelNome02.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome02.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome02.setPreferredSize(new java.awt.Dimension(40, 70));
        add(LabelNome02, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 40));

        LocalTrabalho.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        LocalTrabalho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamento escolar", "Setor escolar" }));
        LocalTrabalho.setSelectedItem(null);
        LocalTrabalho.setToolTipText("");
        add(LocalTrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 200, 40));

        Cadastrar.setBackground(null);
        Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.setText("C A D A S T R A R");
        Cadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Cadastrar.setContentAreaFilled(false);
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cadastrar.setMaximumSize(new java.awt.Dimension(40, 80));
        Cadastrar.setMinimumSize(new java.awt.Dimension(40, 80));
        Cadastrar.setPreferredSize(new java.awt.Dimension(40, 80));
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        add(Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 140, 40));

        SegundoNome.setMargin(new java.awt.Insets(5, 5, 5, 5));
        SegundoNome.setMaximumSize(new java.awt.Dimension(25, 35));
        SegundoNome.setMinimumSize(new java.awt.Dimension(25, 35));
        add(SegundoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
    Basics User = new Basics();
    DAO dao = new DAO();
    
    if(LocalTrabalho.getSelectedItem() == null || SegundoNome.getText().isEmpty() || PrimeiroNome.getText().isEmpty() || CampoNick.getText().isEmpty() || CampoPass.getText().isEmpty()){
       JOptionPane.showMessageDialog(null, "Ops! Algum campo está Vazio.");
    } else {
    
    User.setPrimeiro_Nome(PrimeiroNome.getText());
    User.setSegundo_Nome(SegundoNome.getText());
    
    if (LocalTrabalho.getSelectedItem() == "Departamento escolar") {
    User.setLocal_Trabalho("Departamento escolar");
    } else {
    User.setLocal_Trabalho("Setor escolar");
    }
    
    User.setUsuario(CampoNick.getText());
    User.setSenha(CampoPass.getText());
    
    while (PassWordConfirmed == null) {
    PassWordConfirmed = JOptionPane.showInputDialog("Senha de Confirmação do chefe de departamento:");
    }  
    
    if (PassWordConfirmed.equals(PassWordConfirm)) {
    dao.Cadastro(User);
    } else if (PassWordConfirmed != PassWordConfirm ) {
    JOptionPane.showMessageDialog(null, "Senha Incorreta.");  
    }
     // Limpar os campos de texto após confirmação
    PrimeiroNome.setText(null);
    SegundoNome.setText(null);
    LocalTrabalho.setSelectedItem(null);
    CampoNick.setText(null);
    CampoPass.setText(null);
    }
    }//GEN-LAST:event_CadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField CampoNick;
    private javax.swing.JPasswordField CampoPass;
    private javax.swing.JLabel LabelNome01;
    private javax.swing.JLabel LabelNome02;
    private javax.swing.JLabel LabelTrabalho;
    private javax.swing.JComboBox<String> LocalTrabalho;
    private javax.swing.JTextField PrimeiroNome;
    private javax.swing.JTextField SegundoNome;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jText01;
    private javax.swing.JLabel jText02;
    // End of variables declaration//GEN-END:variables
}
