/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ClientMan;
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
public class report_In extends javax.swing.JInternalFrame {
    Connection con = null;
    ResultSet rs=null;
    PreparedStatement pst = null;

    /**
     * Creates new form report_In
     */
    public report_In() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp_system/wallpaper.gif"))); // NOI18N
        jLabel3.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("  Client Details");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 255, 204)));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employees Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();

            try {
                // TODO add your handling code here:

                String sql ="select * from client";

                pst=con.prepareStatement(sql);
                rs=pst.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
                PdfPTable table = new PdfPTable(5);
                myDocument.open();

                // float[] columnWidths = new float[]{10f, 20f, 10f, 20f,20f,20f,20f,20f,20f,20f,20f,20f,20f,20f,20f};
                //table.setWidths(columnWidths);

                float[] columnWidths = new float[] {20,20,20,20,20};
                table.setWidths(columnWidths);

                table.setWidthPercentage(100); //set table width to 100%

                //newly added
                //table.getDefaultCell().setUseAscender(true);
                // table.getDefaultCell().setUseDescender(true);

                myDocument.add(new Paragraph("Clients",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("------------------------------------------------------------------------------------------------------"));

                table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Address",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Telephone",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));

                while(rs.next())
                {

                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));

                }

                myDocument.add(table);
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------------------"));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
