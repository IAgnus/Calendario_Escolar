package Panel;

import Banco.*;

public class StudentView extends javax.swing.JPanel {
    String Tipo = null;
    
  public void WhatInfo(String Tipo){
      this.Tipo = Tipo;
  }
  public void NowTheInfo(){
   DAO dao = new DAO();
   String Classificacao = null;
   Classificacao = dao.Post(Tipo);
   jText.setText(Classificacao);
  }
  
    public StudentView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame = new javax.swing.JPanel();
        Principal = new javax.swing.JPanel();
        LabelNome1 = new javax.swing.JLabel();
        LabelNome01 = new javax.swing.JLabel();
        LabelNome2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        Sair = new javax.swing.JButton();
        jBorda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new java.awt.CardLayout());

        jFrame.setBackground(new java.awt.Color(0, 51, 51));

        Principal.setBackground(new java.awt.Color(0, 51, 51));
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelNome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNome1.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome1.setText("I N F O R M A Ç Ã O   D E S T I N A D A   A   T O D O   E   Q U A L Q U E R   E S T U D A N T E   Q U E   S E   P R E Z E");
        LabelNome1.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome1.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome1.setPreferredSize(new java.awt.Dimension(40, 70));
        Principal.add(LabelNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 950, 40));

        LabelNome01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNome01.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome01.setText("Ao lado você encontrará todas as informações atualizadas");
        LabelNome01.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome01.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome01.setPreferredSize(new java.awt.Dimension(40, 70));
        Principal.add(LabelNome01, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 370, 40));

        LabelNome2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNome2.setForeground(new java.awt.Color(255, 255, 255));
        LabelNome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNome2.setText("do calendário referente ao colégio ETEMB.");
        LabelNome2.setMaximumSize(new java.awt.Dimension(40, 70));
        LabelNome2.setMinimumSize(new java.awt.Dimension(40, 70));
        LabelNome2.setPreferredSize(new java.awt.Dimension(40, 70));
        Principal.add(LabelNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 370, 40));

        jText.setEditable(false);
        jText.setColumns(20);
        jText.setFont(new java.awt.Font("Centaur", 0, 20)); // NOI18N
        jText.setRows(5);
        jText.setText("Não há nenhuma informação.");
        jScrollPane2.setViewportView(jText);

        Principal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 478, 250));

        Sair.setFont(new java.awt.Font("Centaur", 0, 12)); // NOI18N
        Sair.setForeground(new java.awt.Color(255, 255, 255));
        Sair.setText("R E T O R N A R");
        Sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, new java.awt.Color(255, 255, 255), java.awt.Color.black));
        Sair.setContentAreaFilled(false);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Principal.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 116, 31));

        jBorda.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.black));
        Principal.add(jBorda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 370, 110));

        jFrame.add(Principal);

        add(jFrame, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        CalendarView Sv = new CalendarView();
     jFrame.removeAll();
     jFrame.add(Sv);
     jFrame.repaint();
     jFrame.revalidate();
    }//GEN-LAST:event_SairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNome01;
    private javax.swing.JLabel LabelNome1;
    private javax.swing.JLabel LabelNome2;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jBorda;
    private javax.swing.JPanel jFrame;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jText;
    // End of variables declaration//GEN-END:variables
}
