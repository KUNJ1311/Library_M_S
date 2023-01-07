package User;

import Admin.Admin_DBConnection;
import app.bolivia.swing.JCTextField;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kunj
 */
public class User_HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    Color mouseEnterColor = new Color(0, 0, 0);
    Color mouseEnterprofile = new Color(255,204,0);
    Color mouseexitprofile = new Color(255,255,255);
    Color mouseEnterRed = new Color(255, 0, 0);
    Color mouseExitRed = new Color(255, 51, 51);
    Color mouseExitColor = new Color(51, 51, 51);
    Color mouseExitBlue = new Color(51, 51, 255);
    Color mouseEnterBlue = new Color(0, 0, 235);

    public User_HomePage() {
        initComponents();
        setDataToLables();
    }

    public void setDataToLables() {

        try {

            Connection con = Admin_DBConnection.getConnection();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select * from book_details");
            rs.last();
            lbl_nobook.setText(Integer.toString(rs.getRow()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_user_profile = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelIssuebook = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanelreturnbook = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanelHomePage = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelLMS = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanellogout = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbl_nobook = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Library Management System");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 70));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/exit.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 10, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 70));

        txt_user_profile.setBackground(new java.awt.Color(51, 51, 255));
        txt_user_profile.setFont(new java.awt.Font("Book Antiqua", 1, 25)); // NOI18N
        txt_user_profile.setForeground(new java.awt.Color(255, 255, 255));
        txt_user_profile.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_user_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/profile.png"))); // NOI18N
        txt_user_profile.setText("Welcome , Student");
        txt_user_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_user_profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_user_profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_user_profileMouseExited(evt);
            }
        });
        jPanel1.add(txt_user_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 990, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 70));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelIssuebook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelIssuebook.setPreferredSize(new java.awt.Dimension(340, 60));
        jPanelIssuebook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notebook40.png"))); // NOI18N
        jLabel13.setText("   Issued Books");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanelIssuebook.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, -1));

        jPanel2.add(jPanelIssuebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 270, -1));

        jPanelreturnbook.setBackground(new java.awt.Color(51, 51, 51));
        jPanelreturnbook.setPreferredSize(new java.awt.Dimension(340, 60));
        jPanelreturnbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-book40.png"))); // NOI18N
        jLabel14.setText("   View Books");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanelreturnbook.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 40));

        jPanel2.add(jPanelreturnbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 270, -1));

        jPanelHomePage.setBackground(new java.awt.Color(255, 51, 51));
        jPanelHomePage.setPreferredSize(new java.awt.Dimension(340, 60));
        jPanelHomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home40.png"))); // NOI18N
        jLabel6.setText("    Home Page");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanelHomePage.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, -1));

        jPanel2.add(jPanelHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jPanelLMS.setBackground(new java.awt.Color(51, 51, 51));
        jPanelLMS.setPreferredSize(new java.awt.Dimension(340, 60));
        jPanelLMS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/monitor40.png"))); // NOI18N
        jLabel5.setText("   LMS Dashboard");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanelLMS.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, -1));

        jPanel2.add(jPanelLMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 270, -1));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Features");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jPanellogout.setBackground(new java.awt.Color(51, 51, 255));
        jPanellogout.setPreferredSize(new java.awt.Dimension(340, 60));
        jPanellogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout40.png"))); // NOI18N
        jLabel12.setText("   Logout");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanellogout.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 40));

        jPanel2.add(jPanellogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 270, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 960));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(224, 224, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 51, 51)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nobook.setFont(new java.awt.Font("Century Schoolbook", 1, 50)); // NOI18N
        lbl_nobook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/bookshelf (1).png"))); // NOI18N
        lbl_nobook.setText(" 10");
        jPanel8.add(lbl_nobook, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 260, 140));

        jLabel20.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel20.setText("No Of Books");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 1270, 800));

        setSize(new java.awt.Dimension(1535, 870));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jPanelIssuebook.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        jPanelIssuebook.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
        jPanelreturnbook.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
        jPanelreturnbook.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        //open home page


    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jPanelHomePage.setBackground(mouseEnterRed);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jPanelHomePage.setBackground(mouseExitRed);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jPanelLMS.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jPanelLMS.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(User_HomePage.class.getResource("/test/question.png"));
        int a = JOptionPane.showConfirmDialog(this, "<html><b style=\"font-family:Book Antiqua;font-size:14px;color:red;\">Are You Sure You Want To Logout?</b></html>", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);

        if (a == JOptionPane.YES_OPTION) {

            User_LoginPage loginpage = new User_LoginPage();
            loginpage.setVisible(true);
            dispose();
        }
        setDefaultCloseOperation(JOptionPane.NO_OPTION);


    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
        jPanellogout.setBackground(mouseEnterBlue);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
        jPanellogout.setBackground(mouseExitBlue);
    }//GEN-LAST:event_jLabel12MouseExited

    private void txt_user_profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_user_profileMouseExited
        // TODO add your handling code here:
        txt_user_profile.setForeground(mouseexitprofile);
    }//GEN-LAST:event_txt_user_profileMouseExited

    private void txt_user_profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_user_profileMouseEntered
        // TODO add your handling code here:
        txt_user_profile.setForeground(mouseEnterprofile);
    }//GEN-LAST:event_txt_user_profileMouseEntered

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        User_ViewBooks viewbooks = new User_ViewBooks();
        User_ViewBooks.txt_user_profile.setText(User_HomePage.txt_user_profile.getText());
        viewbooks.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void txt_user_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_user_profileMouseClicked
        // TODO add your handling code here:
        txt_user_profile.setForeground(mouseexitprofile);
        User_ProfilePage profile = new User_ProfilePage();
        User_ProfilePage.txt_username.setText(User_HomePage.txt_user_profile.getText());
        profile.getStudentDetails();
        profile.setVisible(true);
    }//GEN-LAST:event_txt_user_profileMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        User_IssuedBooks book = new User_IssuedBooks();
        User_IssuedBooks.txt_user_profile.setText(User_HomePage.txt_user_profile.getText());
        book.setVisible(true);
        book.setIdtolbl();
        book.setBookDetailsToTable();
        book.setBookDetailsToTable1();
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(User_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelHomePage;
    private javax.swing.JPanel jPanelIssuebook;
    private javax.swing.JPanel jPanelLMS;
    private javax.swing.JPanel jPanellogout;
    private javax.swing.JPanel jPanelreturnbook;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbl_nobook;
    public static javax.swing.JLabel txt_user_profile;
    // End of variables declaration//GEN-END:variables
}
