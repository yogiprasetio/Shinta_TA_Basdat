package com.O6926_yogi_ta.project.View;

import com.O6926_yogi_ta.project.View.*;
import com.O6926_yogi_ta.project.Controller.*;
import com.O6926_yogi_ta.project.Connection.Connectiion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DFA-Agent02
 */
public class Login_view extends javax.swing.JFrame {
    int x = 0;
    String cabang;
    Controller control;
    
    /**
     * Creates new form BCH_view
     */
    public Login_view() throws SQLException {
        initComponents();
        this.control = new Controller();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtUsername = new javax.swing.JTextField();
        jtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(new java.awt.Color(102, 102, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("S H I N T A");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("BFI FINANCE INDONESIA");

        jLabel3.setText("USERNAME");

        jLabel4.setText("PASSWORD");

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1)
                            .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                String user = jtUsername.getText().trim();
                String pass = jtPassword.getText().trim();
                //System.out.println(Controller.arrPegawai.size());
                if("root".equals(user)&&"toor".equals(pass)){
                    try {
                        new Add_user().show();
                        setVisible(false);
                    } catch (SQLException ex) {
                        Logger.getLogger(Login_view.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }//iki if root
                    
/*else if 1 */  else /*if(Controller.arrPegawai.isEmpty() != true)*/{
                    //System.out.println("else if level 1");
                //    user = jtUsername.getText().trim();
                //    pass = jtPassword.getText().trim();
/*for iki gonan ee*/for(int xx=0;xx<Controller.arrPegawai.size();xx++){
/*if iki*/          if(user.equals(Controller.arrPegawai.get(xx).getUser_name()) && pass.equals(Controller.arrPegawai.get(xx).getPassword())){
                        //System.out.println("lewat if iki");
                        if("admincoll".equals(Controller.arrJabatan.get(xx).getNama_jabatan())){
                            //System.out.println("leewaawt if admin coll");
                            String nama = Controller.arrPegawai.get(xx).getNama_pegawai();
                            for(int r = 0;r<Controller.arrCabang.size();r++){
                                if(Controller.arrPegawai.get(xx).getKode_cabang() == Controller.arrCabang.get(r).getKode_cabang()){
                                  //  System.out.println("lewat if controller");
                                    cabang = Controller.arrCabang.get(r).getNama_cabang();
                                    try {
                                        new Admin_view(nama, cabang).show();
                                        setVisible(false);
                                        
                                    } catch (SQLException ex) {
                                        Logger.getLogger(Login_view.class.getName()).log(Level.SEVERE, null, ex);
                                    }//catch
                                    
                                }//if kode cabang
                            }//for data cabang
                        }//if admincoll
                        else if("collector".equals(Controller.arrJabatan.get(xx).getNama_jabatan())){
                            String nama = Controller.arrPegawai.get(xx).getNama_pegawai();
                            for(int r = 0;r<Controller.arrCabang.size();r++){
                                if(Controller.arrPegawai.get(xx).getKode_cabang() == Controller.arrCabang.get(r).getKode_cabang()){
                                    cabang = Controller.arrCabang.get(r).getNama_cabang();
                                    try { 
                                        new Collector_view(nama, cabang).show();
                                    } catch (SQLException ex) {
                                        Logger.getLogger(Login_view.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    setVisible(false);
                                    
                                }//if kode collector
                            }//for data cabang
                        }//iki else if collector
                        else {
                            JOptionPane.showMessageDialog(null, "WRONG PASSWORD !!!");
                            setVisible(false);
                        }//else
                    }//iki if
///*else*/            else {
//                        JOptionPane.showMessageDialog(null, "Oke");
//                        setVisible(false);
//                    }//else
                   }//iki gonan ee for
                }//iki gonan ee else if 1
//                else{
//                    JOptionPane.showMessageDialog(null, "WRONG PASSWORD !!!");
//                }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login_view().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login_view.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jtPassword;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables
}
