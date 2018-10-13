package Panel;

public class CalendarView extends javax.swing.JPanel {

    public CalendarView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame = new javax.swing.JPanel();
        Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Evento2 = new javax.swing.JButton();
        Evento3 = new javax.swing.JButton();
        Noticia01 = new javax.swing.JButton();
        Noticia02 = new javax.swing.JButton();
        Noticia03 = new javax.swing.JButton();
        Evento1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new java.awt.CardLayout());

        jFrame.setBackground(new java.awt.Color(0, 51, 51));
        jFrame.setLayout(new java.awt.CardLayout());

        Principal.setBackground(new java.awt.Color(0, 51, 51));
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Notícias - ETEMB");
        Principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 180, 38));

        jLabel2.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calendário Escolar - ETEMB");
        Principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 950, 38));

        jLabel3.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eventos - ETEMB");
        Principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 38));

        Evento2.setFont(new java.awt.Font("Centaur", 0, 16)); // NOI18N
        Evento2.setForeground(new java.awt.Color(255, 255, 255));
        Evento2.setText("Evento II");
        Evento2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black));
        Evento2.setContentAreaFilled(false);
        Evento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento2ActionPerformed(evt);
            }
        });
        Principal.add(Evento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 330, 30));

        Evento3.setFont(new java.awt.Font("Centaur", 0, 16)); // NOI18N
        Evento3.setForeground(new java.awt.Color(255, 255, 255));
        Evento3.setText("Evento III");
        Evento3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black));
        Evento3.setContentAreaFilled(false);
        Evento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento3ActionPerformed(evt);
            }
        });
        Principal.add(Evento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 330, 30));

        Noticia01.setFont(new java.awt.Font("Centaur", 0, 16)); // NOI18N
        Noticia01.setForeground(new java.awt.Color(255, 255, 255));
        Noticia01.setText("Notícia I");
        Noticia01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black));
        Noticia01.setContentAreaFilled(false);
        Noticia01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Noticia01ActionPerformed(evt);
            }
        });
        Principal.add(Noticia01, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 330, 30));

        Noticia02.setFont(new java.awt.Font("Centaur", 0, 16)); // NOI18N
        Noticia02.setForeground(new java.awt.Color(255, 255, 255));
        Noticia02.setText("Notícia II");
        Noticia02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black));
        Noticia02.setContentAreaFilled(false);
        Noticia02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Noticia02ActionPerformed(evt);
            }
        });
        Principal.add(Noticia02, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 330, 30));

        Noticia03.setFont(new java.awt.Font("Centaur", 0, 16)); // NOI18N
        Noticia03.setForeground(new java.awt.Color(255, 255, 255));
        Noticia03.setText("Notícia III");
        Noticia03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black));
        Noticia03.setContentAreaFilled(false);
        Noticia03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Noticia03ActionPerformed(evt);
            }
        });
        Principal.add(Noticia03, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 330, 30));

        Evento1.setFont(new java.awt.Font("Centaur", 0, 16)); // NOI18N
        Evento1.setForeground(new java.awt.Color(255, 255, 255));
        Evento1.setText("Evento 1");
        Evento1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black));
        Evento1.setContentAreaFilled(false);
        Evento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento1ActionPerformed(evt);
            }
        });
        Principal.add(Evento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 330, 30));

        jFrame.add(Principal, "card2");

        add(jFrame, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void Noticia01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Noticia01ActionPerformed
     StudentView Screen = new StudentView();
     jFrame.removeAll();
     jFrame.add(Screen);
     jFrame.repaint();
     jFrame.revalidate();
     Screen.WhatInfo("Notícia I");
     Screen.NowTheInfo();
    }//GEN-LAST:event_Noticia01ActionPerformed

    private void Evento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento3ActionPerformed
    StudentView Screen = new StudentView();
     jFrame.removeAll();
     jFrame.add(Screen);
     jFrame.repaint();
     jFrame.revalidate();
     Screen.WhatInfo("Evento III");
     Screen.NowTheInfo();
    }//GEN-LAST:event_Evento3ActionPerformed

    private void Evento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento1ActionPerformed
     StudentView Screen = new StudentView();
     jFrame.removeAll();
     jFrame.add(Screen);
     jFrame.repaint();
     jFrame.revalidate();
     Screen.WhatInfo("Evento I");
     Screen.NowTheInfo();
    }//GEN-LAST:event_Evento1ActionPerformed

    private void Evento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Evento2ActionPerformed
     StudentView Screen = new StudentView();
     jFrame.removeAll();
     jFrame.add(Screen);
     jFrame.repaint();
     jFrame.revalidate();
     Screen.WhatInfo("Evento II");
     Screen.NowTheInfo();
    }//GEN-LAST:event_Evento2ActionPerformed

    private void Noticia02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Noticia02ActionPerformed
     StudentView Screen = new StudentView();
     jFrame.removeAll();
     jFrame.add(Screen);
     jFrame.repaint();
     jFrame.revalidate();
     Screen.WhatInfo("Notícia II");
     Screen.NowTheInfo();
    }//GEN-LAST:event_Noticia02ActionPerformed

    private void Noticia03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Noticia03ActionPerformed
     StudentView Screen = new StudentView();
     jFrame.removeAll();
     jFrame.add(Screen);
     jFrame.repaint();
     jFrame.revalidate();
     Screen.WhatInfo("Notícia III");
     Screen.NowTheInfo();
    }//GEN-LAST:event_Noticia03ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Evento1;
    private javax.swing.JButton Evento2;
    private javax.swing.JButton Evento3;
    private javax.swing.JButton Noticia01;
    private javax.swing.JButton Noticia02;
    private javax.swing.JButton Noticia03;
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel jFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
