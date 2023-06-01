package ui;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
public class Pdashboard extends javax.swing.JFrame {

    /**
     * Creates new form Pdashboard
     */
    public Pdashboard() {
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

        jPanel1 = new javax.swing.JPanel();
        vabutton = new javax.swing.JButton();
        ctteacherbutton1 = new javax.swing.JButton();
        logoutbutton1 = new javax.swing.JButton();
        upinfobutton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vabutton.setBackground(new java.awt.Color(0, 153, 153));
        vabutton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        vabutton.setForeground(new java.awt.Color(255, 255, 255));
        vabutton.setText("View Attendance");
        vabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vabuttonActionPerformed(evt);
            }
        });
        jPanel1.add(vabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 210, 50));

        ctteacherbutton1.setBackground(new java.awt.Color(0, 153, 153));
        ctteacherbutton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ctteacherbutton1.setForeground(new java.awt.Color(255, 255, 255));
        ctteacherbutton1.setText("Communicate with Teacher");
        ctteacherbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctteacherbutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(ctteacherbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 210, 50));

        logoutbutton1.setBackground(new java.awt.Color(0, 153, 153));
        logoutbutton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        logoutbutton1.setForeground(new java.awt.Color(255, 255, 255));
        logoutbutton1.setText("logout");
        logoutbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(logoutbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 210, 50));

        upinfobutton2.setBackground(new java.awt.Color(0, 153, 153));
        upinfobutton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        upinfobutton2.setForeground(new java.awt.Color(255, 255, 255));
        upinfobutton2.setText("Update Information");
        upinfobutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upinfobutton2ActionPerformed(evt);
            }
        });
        jPanel1.add(upinfobutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbutton1ActionPerformed
        // TODO add your handling code here:
//        login L = new login();
//        L.show();
        dispose();
    }//GEN-LAST:event_logoutbutton1ActionPerformed

    private void ctteacherbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctteacherbutton1ActionPerformed
//              communicateteacher ct = new communicateteacher();
//              ct.show();
              dispose();
    }//GEN-LAST:event_ctteacherbutton1ActionPerformed

    private void vabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vabuttonActionPerformed
        // TODO add your handling code here:
        viewatd ca = new viewatd();
        ca.show();
        dispose();
    }//GEN-LAST:event_vabuttonActionPerformed

    private void upinfobutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upinfobutton2ActionPerformed
        // TODO add your handling code here:
//        editprofile ep = new editprofile();
//        ep.show();
        dispose();
    }//GEN-LAST:event_upinfobutton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pdashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ctteacherbutton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutbutton1;
    private javax.swing.JButton upinfobutton2;
    private javax.swing.JButton vabutton;
    // End of variables declaration//GEN-END:variables
}