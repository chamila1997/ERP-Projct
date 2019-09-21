/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ProjectPlanning;

import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import dbConnect.DBconnect;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author SAHAN
 */
public class Project_schedule extends javax.swing.JInternalFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs= null;

    /**
     * Creates new form Project_schedule
     */
    public Project_schedule() {
        initComponents();
       con = DBconnect.connect();
        tableload();        
        setVisible(true);//not moving jinternal frame

    }
    
    public void tableload(){
        try{
          String sql = "SELECT Project_id,Project_name,Location FROM project";
          pst = con.prepareStatement(sql);
          rs = pst.executeQuery();
          
          ProjectTable.setModel(DbUtils.resultSetToTableModel(rs));
          
        }catch (SQLException e){    }
        
        try{
          String sql = "SELECT empId,name,nic,phone,department,email FROM employee";
          pst = con.prepareStatement(sql);
          rs = pst.executeQuery();
          
          employeeTable.setModel(DbUtils.resultSetToTableModel(rs));
          
        }catch (SQLException e){    }
        
        try{
          String sql = "SELECT Project_id,Project_name,Location,Emp_name,Department,ephone FROM schedule";
          pst = con.prepareStatement(sql);
          rs = pst.executeQuery();
          
          ScheduleViewTable.setModel(DbUtils.resultSetToTableModel(rs));
          
        }catch (SQLException e){    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProjectTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ScheduleViewTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Employee 1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Phone");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Age");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Projects");

        ProjectTable.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        ProjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        ProjectTable.setRowHeight(35);
        ProjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProjectTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProjectTable);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        employeeTable.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        employeeTable.setRowHeight(35);
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(employeeTable);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField5.setPreferredSize(new java.awt.Dimension(100, 30));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField3.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Schedule View Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        ScheduleViewTable.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        ScheduleViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        ScheduleViewTable.setRowHeight(35);
        ScheduleViewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScheduleViewTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ScheduleViewTable);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Project Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Location       :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText(" ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Phone          :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Department   :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Employee      :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Projects");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Employees");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(208, 208, 208))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 240, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(130, 130, 130)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton4))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6)
                            .addGap(195, 195, 195))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1102, 1102, 1102)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(260, 260, 260)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 412, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(16, 16, 16)))
                                .addComponent(jLabel11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(332, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProjectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectTableMouseClicked
        int raw = ProjectTable.getSelectedRow();
        String Project_id = ProjectTable.getValueAt(raw, 0).toString();
        String Project_name = ProjectTable.getValueAt(raw, 1).toString();
        String Location = ProjectTable.getValueAt(raw, 2).toString();

        jTextField5.setText(Project_name);
        jTextField3.setText(Location);
        idLabel.setText(Project_id);
    }//GEN-LAST:event_ProjectTableMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Project_name = jTextField1.getText();
        String sql = "SELECT Project_id,Project_name,Location FROM project WHERE Project_name LIKE '%"+Project_name+"%'";
        try{
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            ProjectTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (SQLException e){    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        int raw = employeeTable.getSelectedRow();
        String Emp_name = employeeTable.getValueAt(raw, 1).toString();
        String Department = employeeTable.getValueAt(raw, 4).toString();
        String ephone = employeeTable.getValueAt(raw, 3).toString();

        jTextField2.setText(Emp_name);
        jTextField4.setText(Department);
        jTextField6.setText(ephone);

        // TODO add your handling code here: employee
    }//GEN-LAST:event_employeeTableMouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String Emp_name = jTextField7.getText();
        String sql = "SELECT Emp_name,Eage,ephone FROM employee WHERE Emp_name LIKE '%"+Emp_name+"%'";
        try{
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            employeeTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (SQLException e){    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void ScheduleViewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScheduleViewTableMouseClicked
        int raw = ScheduleViewTable.getSelectedRow();
        String Project_id = ScheduleViewTable.getValueAt(raw, 0).toString();
        String Project_name = ScheduleViewTable.getValueAt(raw, 1).toString();
        String Location = ScheduleViewTable.getValueAt(raw, 2).toString();
        String Emp_name = ScheduleViewTable.getValueAt(raw, 3).toString();
        String Eage = ScheduleViewTable.getValueAt(raw, 4).toString();
        String ephone = ScheduleViewTable.getValueAt(raw, 5).toString();

        jTextField5.setText(Project_name);
        jTextField3.setText(Location);
        idLabel.setText(Project_id);
        jTextField2.setText(Emp_name);
        jTextField4.setText(Eage);
        jTextField6.setText(ephone);
    }//GEN-LAST:event_ScheduleViewTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to Update ?");
        if(x==0)
        {
            String Project_id = idLabel.getText();
            String Project_name = jTextField5.getText();                           // awlk thynwa...............update wena awlak.1st table eken update wen na
            String Location = jTextField3.getText();
            String Emp_name = jTextField2.getText();
            String Department = jTextField4.getText();
            String ephone = jTextField6.getText();

            String sql = "UPDATE schedule SET Project_name = '"+Project_name+"',Location = '"+Location+"',Emp_name = '"+Emp_name+"',Department = '"+Department+"',ephone = '"+ephone+"' WHERE Project_id='"+Project_id+"'";

            try{
                pst = con.prepareStatement(sql);
                pst.execute();
                tableload();
            }catch (SQLException e){    }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to Save ?");
        if(x==0)
        {
            String Project_id = idLabel.getText();
            String Project_name = jTextField5.getText();
            String Location = jTextField3.getText();
            String Emp_name = jTextField2.getText();
            String Department = jTextField4.getText();
            String ephone = jTextField6.getText();

            //String sql = "INSERT INTO schedule SET Project_name = '"+Project_name+"',Location = '"+Location+"',Emp_name = '"+Emp_name+"',Eage = '"+Eage+"',ephone = '"+ephone+"' WHERE Project_id='"+Project_id+"'";
            String sql ="INSERT INTO schedule (Project_name,Location,Emp_name,Department,ephone) Values('"+Project_name+"','"+Location+"','"+Emp_name+"','"+Department+"','"+ephone+"')";
            try{
                pst = con.prepareStatement(sql);
                pst.execute();
                tableload();
            }catch (SQLException e){    }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        idLabel.setText(null);  //clear button
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField1.setText(null);
        jTextField7.setText(null);

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProjectTable;
    private javax.swing.JTable ScheduleViewTable;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
