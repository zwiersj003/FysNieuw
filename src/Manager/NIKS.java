package Manager;


import Manager.NIKS5;
import Manager.NIKS5;
import Manager.NIKS5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yassinee
 */
public class NIKS extends javax.swing.JFrame {

    /**
     * Creates new form Managerhome
     */
    public NIKS() {
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

        Name = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        AddBaggage = new javax.swing.JLabel();
        AddBaggage1 = new javax.swing.JLabel();
        AddBaggage2 = new javax.swing.JLabel();
        AddBaggage3 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ID1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name.setText("Logged in as:");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 140, 50));

        Home.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home.setText("Home");
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 70, 30));

        Search.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Search.setText("Search");
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 90, 40));

        AddBaggage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddBaggage.setText("Help");
        getContentPane().add(AddBaggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, -1, -1));

        AddBaggage1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddBaggage1.setText("Graphs");
        getContentPane().add(AddBaggage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        AddBaggage2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddBaggage2.setText("Status");
        getContentPane().add(AddBaggage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        AddBaggage3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddBaggage3.setText("Log files");
        getContentPane().add(AddBaggage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ID.setText("Search");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 130, 50));

        jTextField1.setText("Search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 690, 30));

        ID1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ID1.setText("Employee ID:");
        getContentPane().add(ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 130, 50));

        jCheckBox1.setText("Name");
        jCheckBox1.setToolTipText("");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jCheckBox2.setText("Color");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jCheckBox3.setText("Status");
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 180, -1, 30));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 710, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/layoutCorendonFinalVeranderd.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -50, 1300, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(NIKS5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NIKS5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NIKS5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NIKS5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NIKS5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBaggage;
    private javax.swing.JLabel AddBaggage1;
    private javax.swing.JLabel AddBaggage2;
    private javax.swing.JLabel AddBaggage3;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Search;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
