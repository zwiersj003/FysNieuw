/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author Yassinee
 */
public class AdminHelp extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public AdminHelp() {
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

        Home = new javax.swing.JLabel();
        Home1 = new javax.swing.JLabel();
        Home2 = new javax.swing.JLabel();
        Home3 = new javax.swing.JLabel();
        Home4 = new javax.swing.JLabel();
        Home5 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home.setText("help");
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 50, 30));

        Home1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home1.setText("Home");
        getContentPane().add(Home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 70, 30));

        Home2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home2.setText("Search");
        getContentPane().add(Home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 90, 30));

        Home3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home3.setText("Create Account");
        getContentPane().add(Home3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, 30));

        Home4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home4.setText("Edit Account");
        getContentPane().add(Home4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 180, 30));

        Home5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home5.setText("Delete Account");
        getContentPane().add(Home5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 180, 30));

        Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name.setText("Logged in as:");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layoutCorendonFinalVeranderd.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, -1));

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
            java.util.logging.Logger.getLogger(AdminHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHelp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home1;
    private javax.swing.JLabel Home2;
    private javax.swing.JLabel Home3;
    private javax.swing.JLabel Home4;
    private javax.swing.JLabel Home5;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
