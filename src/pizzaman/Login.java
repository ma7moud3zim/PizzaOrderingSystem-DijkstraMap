/*
* Mahmoud Abdelazim Mohamed - 12100136 - Class 15
* Mahmoud Shehata Ahmed - 12100490 - Class 15
* Ahmed Kamal Arafat - 12100530 - Class 15
* Youssef Wael Selmy - 12100384 - Class 15
*/

package pizzaman;

import graphdijkstra.Map;
import static graphdijkstra.Map.DelChrg;
import static graphdijkstra.Map.DelTime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static pizzaman.connection.con;
import static graphdijkstra.Map.DistNum;

public class Login extends javax.swing.JFrame {
    public static String phn; 
    public static String nm;
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        Loginpanel = new javax.swing.JPanel();
        PhoneText = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        LoginTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Loginpanel.setBackground(new java.awt.Color(235, 168, 58));
        Loginpanel.setPreferredSize(new java.awt.Dimension(750, 750));

        PhoneText.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        PhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextActionPerformed(evt);
            }
        });

        LoginButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(187, 55, 26));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        LoginTitle.setBackground(new java.awt.Color(255, 255, 255));
        LoginTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoginTitle.setForeground(new java.awt.Color(187, 55, 26));
        LoginTitle.setText("Enter Your Phone");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaman/pizza 1 (600 ├Ч 600 px).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaman/Yellow Illustration Pizza Restaurant Logo (7).png"))); // NOI18N

        javax.swing.GroupLayout LoginpanelLayout = new javax.swing.GroupLayout(Loginpanel);
        Loginpanel.setLayout(LoginpanelLayout);
        LoginpanelLayout.setHorizontalGroup(
            LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginpanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginTitle)
                    .addGroup(LoginpanelLayout.createSequentialGroup()
                        .addGroup(LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(32, 32, 32))
            .addGroup(LoginpanelLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginpanelLayout.setVerticalGroup(
            LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginpanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGroup(LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginpanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(LoginTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LoginpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try{
         String sql = "select * from details where phone = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setString(1, PhoneText.getText());
         phn = PhoneText.getText();
         ResultSet res = pstm.executeQuery();
         
         if(res.next()){
             dispose();
             ChoosePz ui = new ChoosePz();
             ui.setVisible(true);
             
             nm =  res.getString("userNm");
             ui.heyLabel.setText("Welcome back Mr " + nm + "!" );
             Map.DistNum = res.getFloat("shortPath");
             Map.DelChrg = DistNum*2.5;
             Map.DelTime = (int)DistNum*3;
         }             
         else {
             dispose();
             Map mp = new Map();
             mp.setVisible(true);
             
             mp.phnTitle.setText(mp.phnTitle.getText()+" " + phn);
         }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Message: " + e);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    public static void main(String args[]) throws ClassNotFoundException {
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        connection.ConnectToSQl();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JPanel Loginpanel;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
