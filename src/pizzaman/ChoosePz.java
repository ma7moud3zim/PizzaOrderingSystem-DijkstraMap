/*
* Mahmoud Abdelazim Mohamed - 12100136 - Class 15
* Mahmoud Shehata Ahmed - 12100490 - Class 15
* Ahmed Kamal Arafat - 12100530 - Class 15
* Youssef Wael Selmy - 12100384 - Class 15
*/
package pizzaman;

public class ChoosePz extends javax.swing.JFrame {
    public static String Order;
    public static int res;
    
    public ChoosePz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ChoosePizza = new javax.swing.JComboBox<>();
        chkoutBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PizzaType = new javax.swing.JComboBox<>();
        ChooseSize = new javax.swing.JComboBox<>();
        Price = new javax.swing.JLabel();
        heyLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(235, 168, 58));
        MainPanel.setPreferredSize(new java.awt.Dimension(750, 750));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Kalam", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 63, 58));
        jLabel6.setText("Pizza Type");

        ChoosePizza.setFont(new java.awt.Font("Kalam", 1, 14)); // NOI18N
        ChoosePizza.setForeground(new java.awt.Color(187, 55, 26));
        ChoosePizza.setMaximumRowCount(10);
        ChoosePizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cheese", "Seafood", "Vegetarian", "Mushrooms" }));
        ChoosePizza.setMaximumSize(new java.awt.Dimension(90, 25));
        ChoosePizza.setMinimumSize(new java.awt.Dimension(90, 25));
        ChoosePizza.setPreferredSize(new java.awt.Dimension(90, 25));
        ChoosePizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoosePizzaActionPerformed(evt);
            }
        });

        chkoutBtn.setBackground(new java.awt.Color(204, 204, 204));
        chkoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkoutBtn.setForeground(new java.awt.Color(70, 63, 58));
        chkoutBtn.setText("Checkout");
        chkoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkoutBtnActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Kalam", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(70, 63, 58));
        jLabel7.setText("Choose Pizza");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Kalam", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 63, 58));
        jLabel8.setText("Choose Size");

        PizzaType.setFont(new java.awt.Font("Kalam", 1, 14)); // NOI18N
        PizzaType.setForeground(new java.awt.Color(187, 55, 26));
        PizzaType.setMaximumRowCount(10);
        PizzaType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pan Pizza", "Stuffed Crust", "Regular" }));
        PizzaType.setPreferredSize(new java.awt.Dimension(90, 25));
        PizzaType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PizzaTypeActionPerformed(evt);
            }
        });

        ChooseSize.setFont(new java.awt.Font("Kalam", 1, 14)); // NOI18N
        ChooseSize.setForeground(new java.awt.Color(187, 55, 26));
        ChooseSize.setMaximumRowCount(10);
        ChooseSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Large", "Medium", "Small" }));
        ChooseSize.setPreferredSize(new java.awt.Dimension(90, 25));
        ChooseSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseSizeActionPerformed(evt);
            }
        });

        Price.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        Price.setForeground(new java.awt.Color(51, 51, 51));
        Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        heyLabel.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
        heyLabel.setForeground(new java.awt.Color(187, 55, 26));
        heyLabel.setText("Hey Mr!");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaman/Yellow Illustration Pizza Restaurant Logo (7).png"))); // NOI18N

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(67, 67, 67)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChooseSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PizzaType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChoosePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(heyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(156, 156, 156))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(heyLabel)
                .addGap(42, 42, 42)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PizzaType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChooseSize, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChoosePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseSizeActionPerformed
        res=Price(ChoosePizza.getSelectedIndex(),ChooseSize.getSelectedIndex(),PizzaType.getSelectedIndex());
        Order = order(ChoosePizza.getSelectedItem().toString(),PizzaType.getSelectedItem().toString(),ChooseSize.getSelectedItem().toString());
        Price.setText("Price: "+res +" $");
    }//GEN-LAST:event_ChooseSizeActionPerformed

    private void PizzaTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PizzaTypeActionPerformed
        res=Price(ChoosePizza.getSelectedIndex(),ChooseSize.getSelectedIndex(),PizzaType.getSelectedIndex());
        Price.setText("Price: "+res+" $");
        Order = order(ChoosePizza.getSelectedItem().toString(),PizzaType.getSelectedItem().toString(),ChooseSize.getSelectedItem().toString());
    }//GEN-LAST:event_PizzaTypeActionPerformed

    private void chkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkoutBtnActionPerformed
        dispose();
        TotalBill ui = new TotalBill();
        ui.setVisible(true);
    }//GEN-LAST:event_chkoutBtnActionPerformed

    private void ChoosePizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoosePizzaActionPerformed
        res=Price(ChoosePizza.getSelectedIndex(),ChooseSize.getSelectedIndex(),PizzaType.getSelectedIndex());
        Order = order(ChoosePizza.getSelectedItem().toString(),PizzaType.getSelectedItem().toString(),ChooseSize.getSelectedItem().toString());
        Price.setText("Price: "+res+" $");
    }//GEN-LAST:event_ChoosePizzaActionPerformed
    public int Price(int pizza,int size,int type){
        int[] flv={50,60,70,80};
        int[] typ={10,30,50};
        int[] siz={45,30,20};
        
        int price= flv[pizza]+typ[type]+siz[size];
        return price;
    }
    
    public String order(String pizza, String typ, String size){
        return typ + " of "+ pizza + ", " + size + " size.";
    }
    
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
            java.util.logging.Logger.getLogger(ChoosePz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoosePz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoosePz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoosePz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoosePz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ChoosePizza;
    public javax.swing.JComboBox<String> ChooseSize;
    public javax.swing.JPanel MainPanel;
    public javax.swing.JComboBox<String> PizzaType;
    public javax.swing.JLabel Price;
    public javax.swing.JButton chkoutBtn;
    public javax.swing.JLabel heyLabel;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
