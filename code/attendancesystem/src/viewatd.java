/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MUHAMMAD SHAHZEB
 */
public class viewatd extends javax.swing.JFrame {

    /**
     * Creates new form viewatd
     */
    public viewatd() {
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

        sidepanel = new javax.swing.JPanel();
        crnamefield1 = new javax.swing.JTextField();
        newnamefield1 = new javax.swing.JTextField();
        crpasswordefield1 = new javax.swing.JTextField();
        newpasswordefield1 = new javax.swing.JTextField();
        cenamelabel = new javax.swing.JLabel();
        newnamelabel1 = new javax.swing.JLabel();
        crpassword1 = new javax.swing.JLabel();
        newpassword1 = new javax.swing.JLabel();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(0, 153, 153));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidepanel.add(crnamefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 270, 30));
        sidepanel.add(newnamefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 270, 30));
        sidepanel.add(crpasswordefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 270, 30));
        sidepanel.add(newpasswordefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 270, 30));

        cenamelabel.setBackground(new java.awt.Color(255, 255, 255));
        cenamelabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cenamelabel.setText("Class ");
        sidepanel.add(cenamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 30));

        newnamelabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        newnamelabel1.setText("Section");
        sidepanel.add(newnamelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 60, 30));

        crpassword1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        crpassword1.setText("Student Name");
        sidepanel.add(crpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 120, 30));

        newpassword1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        newpassword1.setText("Registration");
        sidepanel.add(newpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 110, 30));

        update.setBackground(new java.awt.Color(0, 153, 153));
        update.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Check");
        sidepanel.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        getContentPane().add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(viewatd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewatd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewatd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewatd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewatd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cenamelabel;
    private javax.swing.JTextField crnamefield1;
    private javax.swing.JLabel crpassword1;
    private javax.swing.JTextField crpasswordefield1;
    private javax.swing.JTextField newnamefield1;
    private javax.swing.JLabel newnamelabel1;
    private javax.swing.JLabel newpassword1;
    private javax.swing.JTextField newpasswordefield1;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
