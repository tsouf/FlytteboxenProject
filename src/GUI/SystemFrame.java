package GUI;

import java.awt.*;

/**
 * Created by Martynas on 2017-05-24.
 */
public class SystemFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemFrame
     */
    public SystemFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        storagesButton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        viewCustomer = new javax.swing.JButton();
        createCustomer = new javax.swing.JButton();
        editCustomer = new javax.swing.JButton();
        deleteCustomer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        viewStorages = new javax.swing.JButton();
        createStorages = new javax.swing.JButton();
        deleteStorage = new javax.swing.JButton();
        editStoragesTypes = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        createCustomerPanel1 = new GUI.Customer.CreateCustomer();
        viewCustomerPanel1 = new GUI.Customer.ViewCustomer();
        editCustomerPanel1 = new GUI.Customer.EditCustomer();
        deleteCustomerPanel1 = new GUI.Customer.DeleteCustomer();
        createStorages1 = new GUI.Storages.CreateStorages();
        viewStorages1 = new GUI.Storages.ViewStorages();
        deleteStorages1 = new GUI.Storages.DeleteStorages();
        editStorageTypes1 = new GUI.Storages.EditStorageTypes();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flytteboxen");
        setLocationByPlatform(true);
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        storagesButton.setBackground(new java.awt.Color(102, 102, 102));
        storagesButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        storagesButton.setForeground(new java.awt.Color(255, 255, 255));
        storagesButton.setText("Storages");
        storagesButton.setBorder(null);
        storagesButton.setMargin(new java.awt.Insets(2, 14, 2, 0));
        storagesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storagesButtonMouseClicked(evt);
            }
        });
        storagesButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                storagesButtonComponentShown(evt);
            }
        });
        storagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storagesButtonActionPerformed(evt);
            }
        });

        customerButton.setBackground(new java.awt.Color(102, 102, 102));
        customerButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        customerButton.setForeground(new java.awt.Color(255, 255, 255));
        customerButton.setText("Customers");
        customerButton.setBorder(null);
        customerButton.setMargin(new java.awt.Insets(2, 0, 2, 14));
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Webp.net-resizeimage (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(storagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(storagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(1200, 74));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1204, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, "card4");

        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 74));

        viewCustomer.setBackground(new java.awt.Color(102, 102, 102));
        viewCustomer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        viewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        viewCustomer.setText("View Customer");
        viewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerActionPerformed(evt);
            }
        });

        createCustomer.setBackground(new java.awt.Color(102, 102, 102));
        createCustomer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        createCustomer.setForeground(new java.awt.Color(255, 255, 255));
        createCustomer.setText("Create Customer");
        createCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerActionPerformed(evt);
            }
        });

        editCustomer.setBackground(new java.awt.Color(102, 102, 102));
        editCustomer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        editCustomer.setForeground(new java.awt.Color(255, 255, 255));
        editCustomer.setText("Edit Customer");
        editCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCustomerActionPerformed(evt);
            }
        });

        deleteCustomer.setBackground(new java.awt.Color(102, 102, 102));
        deleteCustomer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deleteCustomer.setForeground(new java.awt.Color(255, 255, 255));
        deleteCustomer.setText("Delete Customer");
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(viewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(createCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(editCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(viewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(createCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel3, "cards3");

        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 74));

        viewStorages.setBackground(new java.awt.Color(102, 102, 102));
        viewStorages.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        viewStorages.setForeground(new java.awt.Color(255, 255, 255));
        viewStorages.setText("View Storages");
        viewStorages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStoragesActionPerformed(evt);
            }
        });

        createStorages.setBackground(new java.awt.Color(102, 102, 102));
        createStorages.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        createStorages.setForeground(new java.awt.Color(255, 255, 255));
        createStorages.setText("Create Storages");
        createStorages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStoragesActionPerformed(evt);
            }
        });

        deleteStorage.setBackground(new java.awt.Color(102, 102, 102));
        deleteStorage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deleteStorage.setForeground(new java.awt.Color(255, 255, 255));
        deleteStorage.setText("Delete Storages");
        deleteStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStorageActionPerformed(evt);
            }
        });

        editStoragesTypes.setBackground(new java.awt.Color(102, 102, 102));
        editStoragesTypes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        editStoragesTypes.setForeground(new java.awt.Color(255, 255, 255));
        editStoragesTypes.setText("Edit Storages Types");
        editStoragesTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStoragesTypesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(viewStorages, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(createStorages, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(editStoragesTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(deleteStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(viewStorages, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addComponent(createStorages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editStoragesTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteStorage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, "cards2");

        jPanel6.setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(1200, 506));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1196, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 534, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, "card2");
        jPanel6.add(createCustomerPanel1, "card3");
        jPanel6.add(viewCustomerPanel1, "card4");
        jPanel6.add(editCustomerPanel1, "card5");
        jPanel6.add(deleteCustomerPanel1, "card6");
        jPanel6.add(createStorages1, "card7");
        jPanel6.add(viewStorages1, "card8");
        jPanel6.add(deleteStorages1, "card9");
        jPanel6.add(editStorageTypes1, "card10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void storagesButtonMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void storagesButtonComponentShown(java.awt.event.ComponentEvent evt) {
        // TODO add your handling code here:
    }

    private void storagesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        storagesButton.setBackground(Color.RED);
        customerButton.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "cards2");
        CardLayout cards = (CardLayout)jPanel6.getLayout();
        cards.show(jPanel6, "card2");
    }

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        customerButton.setBackground(Color.RED);
        storagesButton.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.show(jPanel1, "cards3");
        CardLayout cards = (CardLayout)jPanel6.getLayout();
        cards.show(jPanel6, "card2");
    }

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {
        // TODO add your handling code here:
    }

    private void editCustomerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        editCustomer.setBackground(Color.RED);
        viewCustomer.setBackground(Color.decode("#666666"));
        createCustomer.setBackground(Color.decode("#666666"));
        deleteCustomer.setBackground(Color.decode("#666666"));
        viewStorages.setBackground(Color.decode("#666666"));
        createStorages.setBackground(Color.decode("#666666"));
        deleteStorage.setBackground(Color.decode("#666666"));
        editStoragesTypes.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel6.getLayout();
        card.show(jPanel6, "card5");
    }

    private void viewCustomerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        viewCustomer.setBackground(Color.RED);
        editCustomer.setBackground(Color.decode("#666666"));
        createCustomer.setBackground(Color.decode("#666666"));
        deleteCustomer.setBackground(Color.decode("#666666"));
        viewStorages.setBackground(Color.decode("#666666"));
        createStorages.setBackground(Color.decode("#666666"));
        deleteStorage.setBackground(Color.decode("#666666"));
        editStoragesTypes.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel6.getLayout();
        card.show(jPanel6, "card4");
    }

    private void viewStoragesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        viewStorages.setBackground(Color.RED);
        editCustomer.setBackground(Color.decode("#666666"));
        createStorages.setBackground(Color.decode("#666666"));
        createCustomer.setBackground(Color.decode("#666666"));
        deleteCustomer.setBackground(Color.decode("#666666"));
        viewCustomer.setBackground(Color.decode("#666666"));
        deleteStorage.setBackground(Color.decode("#666666"));
        editStoragesTypes.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel6.getLayout();
        card.show(jPanel6, "card8");
    }

    private void createCustomerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        createCustomer.setBackground(Color.RED);
        editCustomer.setBackground(Color.decode("#666666"));
        viewCustomer.setBackground(Color.decode("#666666"));
        deleteCustomer.setBackground(Color.decode("#666666"));
        viewStorages.setBackground(Color.decode("#666666"));
        createStorages.setBackground(Color.decode("#666666"));
        deleteStorage.setBackground(Color.decode("#666666"));
        editStoragesTypes.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel6.getLayout();
        card.show(jPanel6, "card3");

    }

    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        deleteCustomer.setBackground(Color.RED);
        editCustomer.setBackground(Color.decode("#666666"));
        viewCustomer.setBackground(Color.decode("#666666"));
        createCustomer.setBackground(Color.decode("#666666"));
        viewStorages.setBackground(Color.decode("#666666"));
        createStorages.setBackground(Color.decode("#666666"));
        deleteStorage.setBackground(Color.decode("#666666"));
        editStoragesTypes.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel6.getLayout();
        card.show(jPanel6, "card6");
    }

    private void createStoragesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        createStorages.setBackground(Color.RED);
        createCustomer.setBackground(Color.decode("#666666"));
        editCustomer.setBackground(Color.decode("#666666"));
        viewStorages.setBackground(Color.decode("#666666"));
        deleteCustomer.setBackground(Color.decode("#666666"));
        viewCustomer.setBackground(Color.decode("#666666"));
        deleteStorage.setBackground(Color.decode("#666666"));
        editStoragesTypes.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel6.getLayout();
        card.show(jPanel6, "card7");
    }

    private void deleteStorageActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        deleteStorage.setBackground(Color.RED);
        createCustomer.setBackground(Color.decode("#666666"));
        editCustomer.setBackground(Color.decode("#666666"));
        viewStorages.setBackground(Color.decode("#666666"));
        deleteCustomer.setBackground(Color.decode("#666666"));
        viewCustomer.setBackground(Color.decode("#666666"));
        createStorages.setBackground(Color.decode("#666666"));
        editStoragesTypes.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel6.getLayout();
        card.show(jPanel6, "card9");
    }

    private void editStoragesTypesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        editStoragesTypes.setBackground(Color.RED);
        deleteStorage.setBackground(Color.decode("#666666"));
        createCustomer.setBackground(Color.decode("#666666"));
        editCustomer.setBackground(Color.decode("#666666"));
        viewStorages.setBackground(Color.decode("#666666"));
        deleteCustomer.setBackground(Color.decode("#666666"));
        viewCustomer.setBackground(Color.decode("#666666"));
        createStorages.setBackground(Color.decode("#666666"));
        CardLayout card = (CardLayout)jPanel6.getLayout();
        card.show(jPanel6, "card10");
    }

    /**
     * @param args the command line arguments
     */
  //  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
    /*    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
      /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify
    private javax.swing.JButton createCustomer;
    private GUI.Customer.CreateCustomer createCustomerPanel1;
    private javax.swing.JButton createStorages;
    private GUI.Storages.CreateStorages createStorages1;
    private javax.swing.JButton customerButton;
    private javax.swing.JButton deleteCustomer;
    private GUI.Customer.DeleteCustomer deleteCustomerPanel1;
    private javax.swing.JButton deleteStorage;
    private GUI.Storages.DeleteStorages deleteStorages1;
    private javax.swing.JButton editCustomer;
    private GUI.Customer.EditCustomer editCustomerPanel1;
    private GUI.Storages.EditStorageTypes editStorageTypes1;
    private javax.swing.JButton editStoragesTypes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton storagesButton;
    private javax.swing.JButton viewCustomer;
    private GUI.Customer.ViewCustomer viewCustomerPanel1;
    private javax.swing.JButton viewStorages;
    private GUI.Storages.ViewStorages viewStorages1;
    // End of variables declaration
}
