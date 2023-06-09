/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author minis
 */
public class Patient_by_Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor_by_Patient
     */
    public Patient_by_Doctor() {
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

        jLabel1 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(300, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(6200, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enter month for which you want to see the report");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 37, 270, -1));

        getContentPane().add(jMonthChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 37, 125, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("114232 Andrew Max");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setFocusCycleRoot(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("142298 Nancy Rawat");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setFocusCycleRoot(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("210311 Mahipal Pathak");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setFocusCycleRoot(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 140, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("421158 Mukul Mehta");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setFocusCycleRoot(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("534222 Diskit Dolma");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setFocusCycleRoot(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("599764 Geet Mehta");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setFocusCycleRoot(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("657320 Krishna Kumar");
        jLabel8.setFocusCycleRoot(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 130, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("855393 Elliot Hunter");
        jLabel9.setFocusCycleRoot(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("922364 Harsh Patel");
        jLabel10.setFocusCycleRoot(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 110));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 270, 100));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 270, 100));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 280, 100));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 270, 110));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 270, 110));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 280, 110));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane9.setViewportView(jTable9);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 270, 90));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane10.setViewportView(jTable10);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 280, 100));

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Type"
            }
        ));
        jScrollPane11.setViewportView(jTable11);

        getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 280, 100));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("610271 Vikram Chauhan");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setFocusCycleRoot(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 240, 140, 20));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String month = String.format("%02d",jMonthChooser1.getMonth());
        month=StringUtils.leftPad(month,7,'_');
        month=StringUtils.rightPad(month,8,'%');
        System.out.println(month);
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        // JOptionPane.showMessageDialog(null,"Incorrect username or password!");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patient_management","root","oops3");
        Statement stm=con.createStatement();
        String sql="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+114232+" and Date_of_Prescription like '"+month+"'";
        
        ResultSet rs=stm.executeQuery(sql);
        
            
            while(rs.next())
            {
                String p_ID = String.valueOf(rs.getInt(1));
                String p_name=rs.getString(2);
                String p_type=rs.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
        
                DefaultTableModel tbModel=(DefaultTableModel)jTable3.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
            }  
                
            
            String sql1="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+142298+" and Date_of_Prescription like '"+month+"'";
            ResultSet rs1=stm.executeQuery(sql1);
        
            
            while(rs1.next())
            {
                String p_ID = String.valueOf(rs1.getInt(1));
                String p_name=rs1.getString(2);
                String p_type=rs1.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
                
                DefaultTableModel tbModel=(DefaultTableModel)jTable4.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
                
            } 
            
            String sql2="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+210311+" and Date_of_Prescription like '"+month+"'";
            ResultSet rs2=stm.executeQuery(sql1);
        
            
            while(rs2.next())
            {
                String p_ID = String.valueOf(rs2.getInt(1));
                String p_name=rs2.getString(2);
                String p_type=rs2.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
              
                DefaultTableModel tbModel=(DefaultTableModel)jTable5.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
                
            } 
            
            String sql3="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+421158+" and Date_of_Prescription like '"+month+"'";
            ResultSet rs3=stm.executeQuery(sql3);
        
            
            while(rs3.next())
            {
                String p_ID = String.valueOf(rs3.getInt(1));
                String p_name=rs3.getString(2);
                String p_type=rs3.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
                
                DefaultTableModel tbModel=(DefaultTableModel)jTable1.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
                
            } 
            
            String sql4="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+53422+" and Date_of_Prescription like '"+month+"'";
            ResultSet rs4=stm.executeQuery(sql4);
            
            
            while(rs4.next())
            {
                String p_ID = String.valueOf(rs4.getInt(1));
                String p_name=rs4.getString(2);
                String p_type=rs4.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
               
                DefaultTableModel tbModel=(DefaultTableModel)jTable6.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
                
            } 
            
            String sql5="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+599764+" and Date_of_Prescription like '"+month+"'";
            ResultSet rs5=stm.executeQuery(sql5);
         
            
            while(rs5.next())
            {
                String p_ID = String.valueOf(rs5.getInt(1));
                String p_name=rs5.getString(2);
                String p_type=rs5.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
                
                DefaultTableModel tbModel=(DefaultTableModel)jTable8.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
                
            } 
            
            String sql6="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+610271+" and Date_of_Prescription like '"+month+"'";
            ResultSet rs6=stm.executeQuery(sql6);
            
            
            while(rs6.next())
            {
                String p_ID = String.valueOf(rs6.getInt(1));
                String p_name=rs6.getString(2);
                String p_type=rs6.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
                
                DefaultTableModel tbModel=(DefaultTableModel)jTable7.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
                
            } 
            
            String sql7="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+657320+" and Date_of_Prescription like '"+month+"'";
            ResultSet rs7=stm.executeQuery(sql7);
            
            
            while(rs7.next())
            {
                String p_ID = String.valueOf(rs7.getInt(1));
                String p_name=rs7.getString(2);
                String p_type=rs7.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
                
                DefaultTableModel tbModel=(DefaultTableModel)jTable9.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
                
            } 
            
            String sql8="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+855393+" and Date_of_Prescription like '"+month+"'";
            ResultSet rs8=stm.executeQuery(sql8);
            
            
            while(rs8.next())
            {
                String p_ID = String.valueOf(rs8.getInt(1));
                String p_name=rs8.getString(2);
                String p_type=rs8.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
                
                DefaultTableModel tbModel=(DefaultTableModel)jTable10.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
                
            } 
            
            String sql9="select distinct patient.Patient_ID,patient.First_Name,Patient_Type from patient,prescription,doctor where patient.Patient_ID=prescription.Patient_ID"
                + " and doctor.Doctor_ID=prescription.Doctor_ID and doctor.Doctor_ID= "+922364+" and Date_of_Prescription like '"+month+"'";
            ResultSet rs9=stm.executeQuery(sql9);
            
            
            while(rs9.next())
            {
                String p_ID = String.valueOf(rs9.getInt(1));
                String p_name=rs9.getString(2);
                String p_type=rs9.getString(3);
                
                Object tbData[]={p_ID,p_name,p_type};
                
                DefaultTableModel tbModel=(DefaultTableModel)jTable11.getModel();
                
                tbModel.addRow(tbData);
                JOptionPane.showMessageDialog(null,"Row added successfully!");
                
            } 
            
        
        }
         catch(Exception e)
        {
            System.out.println(e.getMessage());
        }       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Patient_by_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_by_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_by_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_by_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_by_Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    // End of variables declaration//GEN-END:variables
}
