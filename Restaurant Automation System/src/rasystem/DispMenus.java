/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rasystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.*;
import java.util.*;

/**
 *
 * @author Dell
 */
public class DispMenus extends javax.swing.JFrame {

    /**
     * Creates new form DispMenus
     */
    private int flag;

    public DispMenus() {
        initComponents();
        flag = 0;

        add.setVisible(false);
        confirm.setVisible(false);
        order.setVisible(false);
        showTHEmenu();

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yy = (localDate.getYear());
        int mm = (localDate.getMonthValue());
        int dd = (localDate.getDayOfMonth());

        dateL.setText(dd + "-" + mm + "-" + yy);

    }

    public void setDetails(String oid) {
        id.setText(oid);       
        flag = 0;
    }

    public int getflag() {
        return flag;
    }

    public void click1() {
        ProceedActionPerformed(null);
    }

    public void showTHEmenu() {
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(175);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RAS", "root", "go5a1on1");
            Statement st = con.createStatement();

            String q1 = " select ID , NAME , SP  from DISH where CUISINE = \"INDIAN\" ; ";
            ResultSet rs = st.executeQuery(q1);

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "NO Indian Dishes in MENU !", "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                while (rs.next()) {
                    String s1 = rs.getString("ID");
                    String s2 = rs.getString("NAME");
                    float s3 = rs.getFloat("SP");
                    model.addRow(new Object[]{s1, s2, s3});
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ALERT", JOptionPane.ERROR_MESSAGE);
        }

        jTable2.getColumnModel().getColumn(0).setPreferredWidth(75);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(175);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(120);

        model = (DefaultTableModel) jTable2.getModel();

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RAS", "root", "go5a1on1");
            Statement st = con.createStatement();

            String q1 = " select ID , NAME , SP  from DISH where CUISINE = \"CONTINENTAL\" ; ";
            ResultSet rs = st.executeQuery(q1);

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "NO Continental Dishes in MENU !", "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                while (rs.next()) {
                    String s1 = rs.getString("ID");
                    String s2 = rs.getString("NAME");
                    float s3 = rs.getFloat("SP");
                    model.addRow(new Object[]{s1, s2, s3});
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ALERT", JOptionPane.ERROR_MESSAGE);
        }

        jTable3.getColumnModel().getColumn(0).setPreferredWidth(75);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(175);
        jTable3.getColumnModel().getColumn(2).setPreferredWidth(120);

        model = (DefaultTableModel) jTable3.getModel();

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RAS", "root", "go5a1on1");
            Statement st = con.createStatement();

            String q1 = " select ID , NAME , SP  from DISH where CUISINE = \"DRINKS\" ; ";
            ResultSet rs = st.executeQuery(q1);

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "NO DRINKS in MENU !", "ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                while (rs.next()) {
                    String s1 = rs.getString("ID");
                    String s2 = rs.getString("NAME");
                    float s3 = rs.getFloat("SP");
                    model.addRow(new Object[]{s1, s2, s3});
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ALERT", JOptionPane.ERROR_MESSAGE);
        }

        jTable4.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(30);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(100);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menus = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        dateL = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        Proceed = new javax.swing.JButton();
        order = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        add = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID NO.", "DISH NAME", "PRICE (Rs. )"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        menus.addTab("Indian", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID NO.", "DISH NAME", "PRICE (Rs. )"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menus.addTab("Continental", jPanel2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID NO.", "DRINK NAME", "PRICE (Rs. )"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menus.addTab("Drinks", jPanel3);

        back.setText("<< Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel11.setText("Order ID  : ");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID NO.", "DISH NAME", "Qty", "PRICE (Rs. )"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        order.setViewportView(jTable4);

        add.setText("Add Dish to Order");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        confirm.setText("Confirm Order");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel1.setText("Date      :     ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(back)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirm)
                            .addComponent(Proceed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(dateL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Proceed)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(confirm)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed

        String s = id.getText();
        if (s.equals("")) {
            JOptionPane.showMessageDialog(null, "ENTER ID No. ! ", "Order Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RAS", "root", "go5a1on1");
                Statement st = con.createStatement();

                String query = "Select ID from Sales where ID = \"" + s + "\"; ";
                ResultSet rs = st.executeQuery(query);

                if (rs.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "Order with this ID present!!\nPlease Enter different ID. ", "Alert", JOptionPane.ERROR_MESSAGE);
                    id.setText(null);
                } else {
                    flag = 1;

                    query = " create table " + s + " ( ID varchar(20) , Name varchar(30) , Qty int , Price float) ; ";
                    st.executeUpdate(query);

                    add.setVisible(true);
                    confirm.setVisible(true);
                    menus.setVisible(true);
                    order.setVisible(true);

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex, "Alert", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_ProceedActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        String s = id.getText();

        back.setVisible(false);

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RAS", "root", "go5a1on1");
            Statement st = con.createStatement();
            Statement st0 = con.createStatement();
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();
            Statement st3 = con.createStatement();
            Statement st4 = con.createStatement();

            String s0 = (String) JOptionPane.showInputDialog(null, "ENTER DISH ID ", "Take Order", JOptionPane.PLAIN_MESSAGE);

            String query = "Select ID from DISH where ID = \"" + s0 + "\"; ";
            ResultSet rs0 = st0.executeQuery(query);

            int flag = 0;
            if (!rs0.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "DISH with this ID absent!!\nPlease Enter valid ID. ", "Alert", JOptionPane.ERROR_MESSAGE);

            } else {
                rs0.close();
                String s1 = (String) JOptionPane.showInputDialog(null, "Number of Dishes ", "Take Order", JOptionPane.PLAIN_MESSAGE);
                int no = Integer.parseInt(s1);

                query = "Select * from DISH where ID = \"" + s0 + "\"; ";
                ResultSet rs = st0.executeQuery(query);
                rs.next();

                System.out.println("0");

                String i1 = rs.getString("I1");
                if (i1.equals("") == false) {
                    float qty1 = rs.getFloat("Q1");

                    query = "Select Quantity from ING where name = \"" + i1 + "\"; ";
                    ResultSet rs1 = st1.executeQuery(query);
                    rs1.next();

                    System.out.println("1");
                    System.out.println("*********");

                    if (rs1.getFloat("Quantity") < (no * qty1)) {
                        flag++;
                        JOptionPane.showMessageDialog(null, "Insufficient Stock of " + i1 + " !!", "Alert", JOptionPane.ERROR_MESSAGE);
                    } else {
                        query = "update ING set Quantity = " + (rs1.getFloat("Quantity") - (no * qty1)) + "where name = \"" + i1 + "\"; ";
                        st.executeUpdate(query);

                        String i2 = rs.getString("I2");
                        if (i2.equals("") == false) {
                            float qty2 = rs.getFloat("Q2");

                            query = "Select Quantity from ING where name = \"" + i2 + "\"; ";
                            ResultSet rs2 = st2.executeQuery(query);
                            rs2.next();

                            System.out.println("2");
                            System.out.println("*********");

                            if (rs2.getFloat("Quantity") < (no * qty2)) {
                                flag++;
                                JOptionPane.showMessageDialog(null, "Insufficient Stock of " + i2 + " !! ", "Alert", JOptionPane.ERROR_MESSAGE);
                            } else {
                                query = "update ING set Quantity = " + (rs2.getFloat("Quantity") - (no * qty2)) + "where name = \"" + i2 + "\"; ";
                                st.executeUpdate(query);

                                String i3 = rs.getString("I3");
                                if (i3.equals("") == false) {
                                    float qty3 = rs.getFloat("Q3");

                                    query = "Select Quantity from ING where name = \"" + i3 + "\"; ";
                                    ResultSet rs3 = st3.executeQuery(query);
                                    rs3.next();

                                    System.out.println("3");
                                    System.out.println("*********");

                                    if (rs3.getFloat("Quantity") < (no * qty3)) {
                                        flag++;
                                        JOptionPane.showMessageDialog(null, "Insufficient Stock of " + i3 + " !!", "Alert", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        query = "update ING set Quantity = " + (rs3.getFloat("Quantity") - (no * qty3)) + "where name = \"" + i3 + "\"; ";
                                        st.executeUpdate(query);

                                        String i4 = rs.getString("I4");
                                        if (i4.equals("") == false) {
                                            float qty4 = rs.getFloat("Q4");

                                            query = " Select Quantity from ING where name = \"" + i4 + "\"; ";
                                            ResultSet rs4 = st4.executeQuery(query);
                                            rs4.next();

                                            System.out.println("4");
                                            System.out.println("*********");

                                            if (rs4.getFloat("Quantity") < (no * qty4)) {
                                                flag++;
                                                JOptionPane.showMessageDialog(null, "Insufficient Stock of " + i1 + " !!", "Alert", JOptionPane.ERROR_MESSAGE);
                                            } else {
                                                query = "update ING set Quantity = " + (rs4.getFloat("Quantity") - (no * qty4)) + "where name = \"" + i4 + "\"; ";
                                                st.executeUpdate(query);
                                            }
                                        }
                                        System.out.println("5");
                                        System.out.println("*********");
                                    }
                                }
                            }
                        }
                    }
                }

                if (flag == 0) {
                    System.out.println("6");
                    System.out.println("*********");

                    DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
                    String str1 = rs.getString("ID");
                    String str2 = rs.getString("NAME");
                    float str3 = no * rs.getFloat("SP");
                    model.addRow(new Object[]{str1, str2, no, str3});

                    JOptionPane.showMessageDialog(null, "Added to ORDER! ", "Success!", JOptionPane.INFORMATION_MESSAGE);

                    str1 = "\"" + str1 + "\"";
                    str2 = "\"" + str2 + "\"";

                    query = "insert into " + s + " values(" + str1 + "," + str2 + "," + no + "," + str3 + "); ";
                    st.executeUpdate(query);
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Alert", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_addActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        ManHP x = new ManHP();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_backActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yy = (localDate.getYear());
        int mm = (localDate.getMonthValue());
        int dd = (localDate.getDayOfMonth());

        String dated = "\"" + yy + "-" + mm + "-" + dd + "\"";
        int input = JOptionPane.showConfirmDialog(null, "Confirm Order ?", "Select an Option...",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (input == JOptionPane.YES_OPTION) {

            String s = id.getText();
            try {
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/RAS", "root", "go5a1on1");
                Statement st = con.createStatement();

                String query = " select sum(Price) from " + s;
                ResultSet rs = st.executeQuery(query);
                rs.next();

                float total = rs.getFloat("sum(Price)");

                query = " insert into " + s + " values( '' , 'TOTAL ->' , -1 , " + total + " ) ; ";
                st.executeUpdate(query);

                int input1 = JOptionPane.showConfirmDialog(null, "The total cost is : Rs." + total + "\nProcess Transaction??", "Transaction",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (input1 == JOptionPane.YES_OPTION) {
                    query = " insert into SALES values ( " + dated + ",'" + s + "'," + total + ");";
                    st.executeUpdate(query);

                    ManHP x = new ManHP();
                    x.setVisible(true);
                    x.setLocationRelativeTo(null);
                    this.dispose();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex, "Alert", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(DispMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DispMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DispMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DispMenus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DispMenus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proceed;
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel dateL;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTabbedPane menus;
    private javax.swing.JScrollPane order;
    // End of variables declaration//GEN-END:variables
}
