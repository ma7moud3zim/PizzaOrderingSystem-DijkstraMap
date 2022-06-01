/*
* Mahmoud Abdelazim Mohamed - 12100136 - Class 15
* Mahmoud Shehata Ahmed - 12100490 - Class 15
* Ahmed Kamal Arafat - 12100530 - Class 15
* Youssef Wael Selmy - 12100384 - Class 15
*/
package graphdijkstra;

import graphdijkstra.GraphWeighted.NodeWeighted;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import pizzaman.ChoosePz;
import pizzaman.Login;
import static pizzaman.connection.con;


public class Map extends javax.swing.JFrame {
    
    public static double DistNum=0;
    
    GraphWeighted graphWeighted = new GraphWeighted();
    public static NodeWeighted []arr = new NodeWeighted[7];
    


    static public int loc;
    static public double DelChrg;
    static public int DelTime;
    
    public Map() {
        initComponents();
        this.simpleGraph.setImage(new ImageIcon(this.getClass().getResource("Simple graph.png")).getImage());
        arr[0] = new NodeWeighted(0, "Pizza Man");
        arr[1] = new NodeWeighted(1, "Maadi");
        arr[2] = new NodeWeighted(2, "Giza");
        arr[3] = new NodeWeighted(3, "Al-Haram");
        arr[4] = new NodeWeighted(4, "Qena");
        arr[5] = new NodeWeighted(5, "Luxor");
        arr[6] = new NodeWeighted(6, "Aswan");
        
        graphWeighted.addEdge(arr[0], arr[1], 8);
        graphWeighted.addEdge(arr[0], arr[2], 11);
        graphWeighted.addEdge(arr[1], arr[3], 3);
        graphWeighted.addEdge(arr[1], arr[4], 8);
        graphWeighted.addEdge(arr[1], arr[2], 7);
        graphWeighted.addEdge(arr[2], arr[4], 9);
        graphWeighted.addEdge(arr[3], arr[4], 5);
        graphWeighted.addEdge(arr[3], arr[5], 2);
        graphWeighted.addEdge(arr[4], arr[6], 6);
        graphWeighted.addEdge(arr[5], arr[4], 1);
        graphWeighted.addEdge(arr[5], arr[6], 8);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPanel = new javax.swing.JPanel();
        simpleGraph = new gui.ImagePanel();
        Home1 = new javax.swing.JLabel();
        Home2 = new javax.swing.JLabel();
        Home3 = new javax.swing.JLabel();
        Home4 = new javax.swing.JLabel();
        Home5 = new javax.swing.JLabel();
        Home6 = new javax.swing.JLabel();
        CnfrmBtn = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        phnTitle = new javax.swing.JLabel();
        phnTitle1 = new javax.swing.JLabel();
        nmIn = new javax.swing.JTextField();
        ExitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackPanel.setBackground(new java.awt.Color(235, 168, 58));

        simpleGraph.setPreferredSize(new java.awt.Dimension(900, 600));

        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphdijkstra/Home1.png"))); // NOI18N
        Home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home1MouseClicked(evt);
            }
        });

        Home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphdijkstra/Home2.png"))); // NOI18N
        Home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home2MouseClicked(evt);
            }
        });

        Home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphdijkstra/Home3.png"))); // NOI18N
        Home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home3MouseClicked(evt);
            }
        });

        Home4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphdijkstra/Home4.png"))); // NOI18N
        Home4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home4MouseClicked(evt);
            }
        });

        Home5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphdijkstra/Home5.png"))); // NOI18N
        Home5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home5MouseClicked(evt);
            }
        });

        Home6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphdijkstra/Home6.png"))); // NOI18N
        Home6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout simpleGraphLayout = new javax.swing.GroupLayout(simpleGraph);
        simpleGraph.setLayout(simpleGraphLayout);
        simpleGraphLayout.setHorizontalGroup(
            simpleGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simpleGraphLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(Home1)
                .addGap(219, 219, 219)
                .addComponent(Home4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(Home6)
                .addContainerGap())
            .addGroup(simpleGraphLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(Home2)
                .addGroup(simpleGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(simpleGraphLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Home3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simpleGraphLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Home5)
                        .addGap(75, 75, 75))))
        );
        simpleGraphLayout.setVerticalGroup(
            simpleGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simpleGraphLayout.createSequentialGroup()
                .addGroup(simpleGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(simpleGraphLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(simpleGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Home2)
                            .addGroup(simpleGraphLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Home3))))
                    .addGroup(simpleGraphLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(Home5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addGroup(simpleGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simpleGraphLayout.createSequentialGroup()
                        .addComponent(Home1)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simpleGraphLayout.createSequentialGroup()
                        .addComponent(Home4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simpleGraphLayout.createSequentialGroup()
                        .addComponent(Home6)
                        .addGap(110, 110, 110))))
        );

        CnfrmBtn.setText("Confirm");
        CnfrmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnfrmBtnActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        Title.setText("Choose your location: ");

        phnTitle.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        phnTitle.setText("Your Phone is:");

        phnTitle1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        phnTitle1.setText("Type Name:");

        nmIn.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N

        ExitBtn.setBackground(new java.awt.Color(158, 12, 49));
        ExitBtn.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        ExitBtn.setText("X");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitBtn)
                .addGap(18, 18, 18)
                .addComponent(CnfrmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(simpleGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackPanelLayout.createSequentialGroup()
                                .addComponent(phnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phnTitle1)
                                .addGap(18, 18, 18)
                                .addComponent(nmIn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phnTitle)
                    .addComponent(nmIn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phnTitle1))
                .addGap(18, 18, 18)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(simpleGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CnfrmBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Home2MouseClicked(MouseEvent evt) {//GEN-FIRST:event_Home2MouseClicked
        Title.setText("Choose your location: "+ arr[2].name);
        loc = 2;
    }//GEN-LAST:event_Home2MouseClicked

    private void Home3MouseClicked(MouseEvent evt) {//GEN-FIRST:event_Home3MouseClicked
        Title.setText("Choose your location: " + arr[3].name);
        loc = 3;
    }//GEN-LAST:event_Home3MouseClicked

    private void Home5MouseClicked(MouseEvent evt) {//GEN-FIRST:event_Home5MouseClicked
        Title.setText("Choose your location: " + arr[5].name);
        loc = 5;
    }//GEN-LAST:event_Home5MouseClicked

    private void Home6MouseClicked(MouseEvent evt) {//GEN-FIRST:event_Home6MouseClicked
        Title.setText("Choose your location: "+ arr[6].name);
        loc = 6;
    }//GEN-LAST:event_Home6MouseClicked

    private void Home4MouseClicked(MouseEvent evt) {//GEN-FIRST:event_Home4MouseClicked
        Title.setText("Choose your location: " + arr[4].name);
        loc = 4;
    }//GEN-LAST:event_Home4MouseClicked

    private void Home1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_Home1MouseClicked
        Title.setText("Choose your location: " + arr[1].name);
        loc = 1;
    }//GEN-LAST:event_Home1MouseClicked

    private void CnfrmBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CnfrmBtnActionPerformed
        try {
            // Close this window 
            dispose();
            
            // Open the window of choose pizza
            ChoosePz ui = new ChoosePz();
            ui.setVisible(true);
            // Calculate Charge and put the Welcome statement 
            Login.nm = nmIn.getText();
            ui.heyLabel.setText("Welcome Mr " + nmIn.getText() + "!" );
            DistNum = graphWeighted.DijkstraShortestPath(arr[0], arr[loc]);
            DelChrg = DistNum*2.5;
            DelTime = (int)DistNum*3;
            
            // Insert them into database
            String sql = "insert into details values(?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, Login.phn);
            pstm.setString(2, nmIn.getText());
            pstm.setFloat(3, (float) DistNum);
            pstm.executeUpdate();
        } catch (SQLException ex) {}
    }//GEN-LAST:event_CnfrmBtnActionPerformed

    private void ExitBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed


    public static void main(String args[]) {
    
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
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel BackPanel;
    public javax.swing.JButton CnfrmBtn;
    public javax.swing.JButton ExitBtn;
    public javax.swing.JLabel Home1;
    public javax.swing.JLabel Home2;
    public javax.swing.JLabel Home3;
    public javax.swing.JLabel Home4;
    public javax.swing.JLabel Home5;
    public javax.swing.JLabel Home6;
    public javax.swing.JLabel Title;
    public javax.swing.JTextField nmIn;
    public javax.swing.JLabel phnTitle;
    public javax.swing.JLabel phnTitle1;
    public gui.ImagePanel simpleGraph;
    // End of variables declaration//GEN-END:variables
}
