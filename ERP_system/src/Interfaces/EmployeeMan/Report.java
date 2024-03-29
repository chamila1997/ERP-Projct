/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.EmployeeMan;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import dbConnect.DBconnect;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.plaf.basic.BasicInternalFrameUI;


/**
 *
 * @author SAHAN
 */
public class Report extends javax.swing.JInternalFrame {
    
    Connection con = null;
    ResultSet rs=null;
    PreparedStatement pst = null;


    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        
           setVisible(true);//not moving jinternal frame
        
        BasicInternalFrameUI basicInternalFrameUI = (javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI(); //not moving jinternal frame
        for(MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()){                //not moving jinternal frame
        basicInternalFrameUI.getNorthPane().removeMouseListener(listener);                                    //not moving jinternal frame
        }
        
         //DB connection
        con = DBconnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amount1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Generate Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Executive", "Non-executive" }));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("  Employee Details");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 255, 204)));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("   Salary NetPay   >");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 255, 204)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText(" Enter The Amount      :");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("   Salary NetPay   <");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 255, 204)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText(" Enter The Amount      :");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Generate Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(amount))
                .addGap(46, 46, 46)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(amount1))
                .addGap(46, 46, 46)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp_system/wallpaper.gif"))); // NOI18N
        jLabel3.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employees Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();

            try {
                // TODO add your handling code here:
                
                String position = jComboBox1.getSelectedItem().toString();

                String sql ="select * from employee where position = '"+position+"'";

                pst=con.prepareStatement(sql);
                rs=pst.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
                PdfPTable table = new PdfPTable(16);
                myDocument.open();

                // float[] columnWidths = new float[]{10f, 20f, 10f, 20f,20f,20f,20f,20f,20f,20f,20f,20f,20f,20f,20f};
                //table.setWidths(columnWidths);

                float[] columnWidths = new float[] {20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20};
                table.setWidths(columnWidths);

                table.setWidthPercentage(100); //set table width to 100%

                //newly added
                //table.getDefaultCell().setUseAscender(true);
                // table.getDefaultCell().setUseDescender(true);

                myDocument.add(new Paragraph("Employees List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Age",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Street",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("City",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("State",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("NIC",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Phone",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Department",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("E-mail",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Position",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("BRA",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));

                table.addCell(new PdfPCell(new Paragraph("Incentive",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Transport",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("EPF NO",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));

                while(rs.next())
                {

                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(9),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(12),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(13),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(14),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(15),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(16),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));

                }

                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.close();
                JOptionPane.showMessageDialog(null,"Report was successfully generated");
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);

            }
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);

                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Salary Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();

            try {
                // TODO add your handling code here:
                
                String Amount = amount.getText();

                String sql ="select * from salary where NetPay > '"+Amount+"'";

                pst=con.prepareStatement(sql);
                rs=pst.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
                PdfPTable table = new PdfPTable(19);
                myDocument.open();

                // float[] columnWidths = new float[]{10f, 20f, 10f, 20f,20f,20f,20f,20f,20f,20f,20f,20f,20f,20f,20f};
                //table.setWidths(columnWidths);

                float[] columnWidths = new float[] {20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20};
                table.setWidths(columnWidths);

                table.setWidthPercentage(100); //set table width to 100%

                //newly added
                //table.getDefaultCell().setUseAscender(true);
                // table.getDefaultCell().setUseDescender(true);

                myDocument.add(new Paragraph("Employees List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Basic Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("BRA",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Incentive",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Transport",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Normal_OT",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Holiday_OT",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Attendance",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("No-Pay",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("EPF",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("ETF",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Medical",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));

                table.addCell(new PdfPCell(new Paragraph("OtherIncntv",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("OtherDeductn",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                
                table.addCell(new PdfPCell(new Paragraph("Loan",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Advance",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("NetPay",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("EpfNo",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));

                while(rs.next())
                {

                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(9),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(12),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(13),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(14),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(15),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(16),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(17),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(18),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(19),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));

                }

                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.close();
                JOptionPane.showMessageDialog(null,"Report was successfully generated");
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);

            }
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);

                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
           JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Salary Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();

            try {
                // TODO add your handling code here:
                
                String Amount = amount.getText();

                String sql ="select * from salary where NetPay < '"+Amount+"'";

                pst=con.prepareStatement(sql);
                rs=pst.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
                PdfPTable table = new PdfPTable(19);
                myDocument.open();

                // float[] columnWidths = new float[]{10f, 20f, 10f, 20f,20f,20f,20f,20f,20f,20f,20f,20f,20f,20f,20f};
                //table.setWidths(columnWidths);

                float[] columnWidths = new float[] {20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20};
                table.setWidths(columnWidths);

                table.setWidthPercentage(100); //set table width to 100%

                //newly added
                //table.getDefaultCell().setUseAscender(true);
                // table.getDefaultCell().setUseDescender(true);

                myDocument.add(new Paragraph("Employees List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Basic Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("BRA",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Incentive",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Transport",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Normal_OT",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Holiday_OT",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Attendance",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("No-Pay",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("EPF",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("ETF",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Medical",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));

                table.addCell(new PdfPCell(new Paragraph("OtherIncntv",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("OtherDeductn",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                
                table.addCell(new PdfPCell(new Paragraph("Loan",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Advance",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("NetPay",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("EpfNo",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));

                while(rs.next())
                {

                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(9),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(12),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(13),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(14),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(15),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(16),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(17),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(18),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(19),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));

                }

                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.close();
                JOptionPane.showMessageDialog(null,"Report was successfully generated");
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);

            }
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);

                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
