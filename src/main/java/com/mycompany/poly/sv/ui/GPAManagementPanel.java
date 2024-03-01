/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.poly.sv.ui;

import com.mycompany.poly.sv.dao.DiemDAO;
import com.mycompany.poly.sv.dao.SinhVienDAO;
import com.mycompany.poly.sv.helpers.DataValidator;
import com.mycompany.poly.sv.helpers.MessageDialogHelper;
import com.mycompany.poly.sv.model.BangDiem;
import com.mycompany.poly.sv.model.SinhVien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Utech
 */
public class GPAManagementPanel extends javax.swing.JPanel {
    private MainForm parentForm;
    private static DefaultTableModel tblModel;
    /**
     * Creates new form GPAManagementPanel
     */
    public GPAManagementPanel() {
        initComponents();
        
        initTable();
        loadToTable();
    }

    
    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String [] {
            "Mã Sinh Viên", "Mã Lớp", "Tiếng Anh", "XSTK", "GDTC", "Điểm TB"});
        
        tblGPAs.setModel(tblModel);
    }
    
    public static void loadToTable() {
        try {
            DiemDAO dao = new DiemDAO();
            List<BangDiem> list = new ArrayList<>();
            list = dao.findAll();
            tblModel.setRowCount(0);
            
            for(BangDiem bd : list) {
                tblModel.addRow(new Object[] {
                bd.getMSSV(), bd.getMaLop(), bd.getTiengAnh(), bd.getXSTK(), bd.getGDTC()
                    ,String.format("%.3f", ((bd.getTiengAnh() + bd.getGDTC() + bd.getXSTK()) / 3))});
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtIDSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGPAs = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtMaLop = new javax.swing.JTextField();
        txtTA = new javax.swing.JTextField();
        txtXSTK = new javax.swing.JTextField();
        txtGDTC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblGPA = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/sv/icons/gpa-icon-24.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ ĐIỂM");

        jLabel2.setText("Mã Sinh Viên");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/sv/icons/search-icon-16.png"))); // NOI18N
        btnSearch.setText("Tìm Kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblGPAs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblGPAs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGPAsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGPAs);

        jLabel4.setText("Mã Sinh Viên");

        jLabel3.setText("Mã Lớp");

        jLabel6.setText("Tiếng Anh");

        jLabel10.setText("XSTK");

        jLabel7.setText("GDTC");

        txtTA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTAFocusLost(evt);
            }
        });

        txtXSTK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtXSTKFocusLost(evt);
            }
        });

        txtGDTC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGDTCFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("ĐIỂM TB");
        jLabel8.setToolTipText("");

        lblGPA.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblGPA.setText("X.X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblGPA)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGPA)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnNew.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/sv/icons/new-icon-16.png"))); // NOI18N
        btnNew.setText("Làm Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/sv/icons/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/sv/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Cập Nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/sv/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGDTC, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(txtXSTK)
                                    .addComponent(txtMSSV)
                                    .addComponent(txtMaLop)
                                    .addComponent(txtTA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSearch)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtXSTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaLop, sb, "Lớp của sinh viên không được để trống");
        DataValidator.validateEmpty(txtMSSV, sb, "Mã sinh viên không được để trống");
        if(sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
        }
        
        try {
            BangDiem bd = new BangDiem();
            bd.setMaLop(txtMaLop.getText());
            bd.setMSSV(txtMSSV.getText());
            bd.setTiengAnh(Float.parseFloat(txtTA.getText()));
            bd.setGDTC(Float.parseFloat(txtGDTC.getText()));
            bd.setXSTK(Float.parseFloat(txtXSTK.getText()));
            
            DiemDAO dao = new DiemDAO();
            if(dao.insert(bd)) {
                btnNewActionPerformed(evt);
                MessageDialogHelper.showMessageDialog(parentForm, "Bảng điểm đã được lưu!", "Thông báo");
                loadToTable();
            }
            else {
                MessageDialogHelper.showMessageDialog(parentForm, "Lỗi khi lưu bảng điểm, vui lòng kiểm tra lại!", "Thông báo");
            }
                
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtMaLop.setText("");
        txtIDSearch.setText("");
        txtMSSV.setText("");
        txtTA.setText("");
        txtXSTK.setText("");
        txtGDTC.setText("");
        lblGPA.setText("X.X");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaLop, sb, "Lớp của sinh viên không được để trống");
        DataValidator.validateEmpty(txtMSSV, sb, "Mã sinh viên không được để trống");
        if(sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        
        if(MessageDialogHelper.showConFirmDialog(parentForm, "Bạn có muốn cập nhật thông tin sinh viên không?", "Lựa chọn") == JOptionPane.NO_OPTION)
            return; 
        
        try {
            BangDiem bd = new BangDiem();
            bd.setMaLop(txtMaLop.getText());
            bd.setMSSV(txtMSSV.getText());
            bd.setTiengAnh(Float.parseFloat(txtTA.getText()));
            bd.setGDTC(Float.parseFloat(txtGDTC.getText()));
            bd.setXSTK(Float.parseFloat(txtXSTK.getText()));
            
            DiemDAO dao = new DiemDAO();
            
            if(dao.update(bd)) {
                MessageDialogHelper.showMessageDialog(parentForm, "Điểm sinh viên đã được cập nhật", "Thông báo");
                btnNewActionPerformed(evt);
                loadToTable();
            }
            else {
                MessageDialogHelper.showConFirmDialog(parentForm, "Lỗi khi cập nhật điểm", "Lỗi");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
 
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void printAverageGPA() throws NumberFormatException {
        float ta = Float.parseFloat(txtTA.getText());
        float xs = Float.parseFloat(txtXSTK.getText());
        float gd = Float.parseFloat(txtGDTC.getText());
        
        float avg = (ta + xs + gd) / 3;
        
        String st = String.format("%.2f", avg);
        lblGPA.setText(st);
    }

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            DiemDAO dao = new DiemDAO();
            BangDiem bd = dao.findByMSV(txtIDSearch.getText());
            
            if(bd != null) {
                txtMSSV.setText(bd.getMSSV());
                txtMaLop.setText(bd.getMaLop());
                txtTA.setText(String.format("%.3s", bd.getTiengAnh()));
                txtGDTC.setText(String.format("%.3s", bd.getGDTC()));
                txtXSTK.setText(String.format("%.3s",bd.getXSTK()));
                
                printAverageGPA();
            }
            else {
                MessageDialogHelper.showErrorDialog(parentForm, "Không tìm thấy điểm của sinh viên", "Lỗi");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         try {
            if(txtMSSV.getText().equals("")) {
                MessageDialogHelper.showMessageDialog(parentForm, "Mã sinh viên không được để trống", "Thông báo");
                return;
            }
            DiemDAO dao = new DiemDAO();
            BangDiem bd = dao.findByMSV(txtMSSV.getText());
            
            if(bd == null)  {
                MessageDialogHelper.showMessageDialog(parentForm, "Mã sinh viên không tồn tại", "Lỗi");
                return;
            }
            if(MessageDialogHelper.showConFirmDialog(parentForm, "Bạn có muốn xóa điểm của sinh viên này không?", "Hỏi") == JOptionPane.NO_OPTION)
            {
                return;
            }
            
            if(dao.deleteByMSV(txtMSSV.getText()))  {
                MessageDialogHelper.showMessageDialog(parentForm, "Điểm của sinh viên đã được xóa", "Thông báo");
                loadToTable();
                btnNewActionPerformed(evt);
            }
            else {
                MessageDialogHelper.showMessageDialog(parentForm, "Điểm của sinh viên không thể xóa", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblGPAsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGPAsMouseClicked
        try {
            int row = tblGPAs.getSelectedRow();
            if(row >= 0){
                String id = (String) tblGPAs.getValueAt(row, 0);
                DiemDAO dao = new DiemDAO();
                BangDiem bd = dao.findByMSV(id);
              
                if(bd != null) {
                    txtMSSV.setText(bd.getMSSV());
                    txtMaLop.setText(bd.getMaLop());
                    txtTA.setText(String.format("%.3s", bd.getTiengAnh()));
                    txtGDTC.setText(String.format("%.3s", bd.getGDTC()));
                    txtXSTK.setText(String.format("%.3s",bd.getXSTK()));
                    
                    printAverageGPA();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblGPAsMouseClicked

    private void txtTAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTAFocusLost
        if(txtTA.getText().equals("") || txtGDTC.getText().equals("") 
                || txtXSTK.getText().equals("") )
            return;
        
        printAverageGPA();
    }//GEN-LAST:event_txtTAFocusLost

    private void txtGDTCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGDTCFocusLost
        if(txtTA.getText().equals("") || txtGDTC.getText().equals("") 
                || txtXSTK.getText().equals("") )
            return;
        
        printAverageGPA();
    }//GEN-LAST:event_txtGDTCFocusLost

    private void txtXSTKFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtXSTKFocusLost
        if(txtTA.getText().equals("") || txtGDTC.getText().equals("") 
                || txtXSTK.getText().equals("") )
            return;
        
        printAverageGPA();
    }//GEN-LAST:event_txtXSTKFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblGPA;
    private javax.swing.JTable tblGPAs;
    private javax.swing.JTextField txtGDTC;
    private javax.swing.JTextField txtIDSearch;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtTA;
    private javax.swing.JTextField txtXSTK;
    // End of variables declaration//GEN-END:variables
}