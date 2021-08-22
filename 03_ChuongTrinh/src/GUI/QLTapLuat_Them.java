/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ConnectData.SuKienDB;
import ConnectData.TapLuatDB;
import CustomTable.TableSuKien;
import Models.Luat;
import Models.SuKien;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nthah
 */
public class QLTapLuat_Them extends javax.swing.JDialog {

    ArrayList<SuKien> 
            gtChuaChon = new ArrayList<>(),
            gtDaChon = new ArrayList<>(),
            kl = new ArrayList<>();
    TableSuKien 
            modelChuaChon = new TableSuKien(),
            modelDaChon = new TableSuKien(),
            modelKL = new TableSuKien();
    
    public QLTapLuat_Them(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ArrayList<SuKien> allMon = SuKienDB.getAllSuKien();
        for (SuKien suKien : allMon) {
            if(suKien.getMaNhom().trim().equalsIgnoreCase("nhom5"))
                kl.add(suKien);
            else if(suKien.getMaNhom().trim().equalsIgnoreCase("nhom4")){
                kl.add(suKien);
                gtChuaChon.add(suKien);
            }
            else
                gtChuaChon.add(suKien);
        }
        modelChuaChon.setList(gtChuaChon);
        tableChuaChon.setModel(modelChuaChon);
        modelDaChon.setList(gtDaChon);
        tableDaChon.setModel(modelDaChon);
        modelKL.setList(kl);
        tableKL.setModel(modelKL);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChuaChon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThemAll = new javax.swing.JButton();
        btnThem1 = new javax.swing.JButton();
        btnBo1 = new javax.swing.JButton();
        btnBoAll = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDaChon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableKL = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableChuaChon.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableChuaChon);

        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Danh sách sự kiện giả thiết");

        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Danh sách sự kiện giả thiết đã chọn");

        btnThemAll.setBackground(new java.awt.Color(0, 51, 153));
        btnThemAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemAll.setForeground(new java.awt.Color(255, 255, 255));
        btnThemAll.setText(">>");
        btnThemAll.setBorderPainted(false);
        btnThemAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemAllActionPerformed(evt);
            }
        });

        btnThem1.setBackground(new java.awt.Color(0, 51, 153));
        btnThem1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem1.setForeground(new java.awt.Color(255, 255, 255));
        btnThem1.setText(">");
        btnThem1.setBorderPainted(false);
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        btnBo1.setBackground(new java.awt.Color(0, 51, 153));
        btnBo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBo1.setForeground(new java.awt.Color(255, 255, 255));
        btnBo1.setText("<");
        btnBo1.setBorderPainted(false);
        btnBo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBo1ActionPerformed(evt);
            }
        });

        btnBoAll.setBackground(new java.awt.Color(0, 51, 153));
        btnBoAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBoAll.setForeground(new java.awt.Color(255, 255, 255));
        btnBoAll.setText("<<");
        btnBoAll.setBorderPainted(false);
        btnBoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoAllActionPerformed(evt);
            }
        });

        tableDaChon.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableDaChon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBoAll, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnThemAll, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(153, 153, 153))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThemAll, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnBo1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBoAll, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Thêm luật mới");

        tableKL.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKLMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableKL);

        btnThem.setBackground(new java.awt.Color(0, 51, 153));
        btnThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.setBorderPainted(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(0, 51, 153));
        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.setBorderPainted(false);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Danh sách kết luận (Chỉ chọn 1 kết luận)");

        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Kết luận đang chọn:");

        txtKL.setForeground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtKL, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtKL))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemAllActionPerformed
        // TODO add your handling code here:
        try {
            for (SuKien suKien : gtChuaChon) {
                if(!suKien.getMaNhom().trim().equalsIgnoreCase("nhom1")&&!suKien.getMaNhom().trim().equalsIgnoreCase("nhom2"))
                    gtDaChon.add(suKien);
                else if(suKien.getMaSuKien().trim().equalsIgnoreCase("m1"))
                    gtDaChon.add(suKien);
                else if(suKien.getMaSuKien().trim().equalsIgnoreCase("b1"))
                    gtDaChon.add(suKien);
            }
            for (SuKien suKien : gtDaChon) {
                gtChuaChon.remove(suKien);
            }
            capNhatBang();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnThemAllActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        try {
            int selectedRow = tableChuaChon.getSelectedRow();
            if(selectedRow<0 || selectedRow>=tableChuaChon.getRowCount())
                throw new Exception("Cần chọn một nguyên liệu");
            if(gtChuaChon.get(selectedRow).getMaNhom().trim().equalsIgnoreCase("nhom1"))
                for (SuKien suKien : gtDaChon) {
                    if(suKien.getMaNhom().trim().equalsIgnoreCase("nhom1"))
                        throw new Exception("Chỉ được chọn nhiều nhất 1 mùa");
                }
            if(gtChuaChon.get(selectedRow).getMaNhom().trim().equalsIgnoreCase("nhom2"))
                for (SuKien suKien : gtDaChon) {
                    if(suKien.getMaNhom().trim().equalsIgnoreCase("nhom2"))
                        throw new Exception("Chỉ được chọn nhiều nhất 1 buổi");
                }
            SuKien gt = gtChuaChon.get(selectedRow);
            gtDaChon.add(gt);
            gtChuaChon.remove(gt);
            capNhatBang();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnBo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBo1ActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tableDaChon.getSelectedRow();
            if(selectedRow<0 || selectedRow>=tableDaChon.getRowCount()){
                throw new Exception("Cần chọn một món");
            }else{
                SuKien gt = gtDaChon.get(selectedRow);
                gtChuaChon.add(gt);
                gtDaChon.remove(gt);
                capNhatBang();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBo1ActionPerformed

    private void btnBoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoAllActionPerformed
        // TODO add your handling code here:
        try {
            for (SuKien gt : gtDaChon) {
                gtChuaChon.add(gt);
            }
            gtDaChon.clear();
            capNhatBang();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBoAllActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {
            if(gtDaChon.size()==0)
                throw new Exception("Cần có ít nhất một giả thiết!");
            if(gtDaChon.size()>7)
                throw new Exception("Nhiều nhất 10 giả thiết!");
            if(txtKL.getText().trim().contains("mon"))
                for (SuKien suKien : gtDaChon) {
                    if(suKien.getMaSuKien().trim().equalsIgnoreCase(txtKL.getText().trim()))
                        throw new Exception("Kết luận trùng giả thiết!");
                }
            if(txtKL.getText().trim().equals(""))
                throw new Exception("Chưa chọn kết luận!");
            String giaThiet = "";
            for(int i=0; i<gtDaChon.size();i++){
                if(i!=gtDaChon.size()-1)
                giaThiet+=gtDaChon.get(i).getMaSuKien().trim()+"^";
                else
                giaThiet+=gtDaChon.get(i).getMaSuKien().trim();
            }
            Luat luatMoi = new Luat();
            luatMoi.setGT(giaThiet);
            luatMoi.setKL(txtKL.getText().trim());
            TapLuatDB.addLuat(luatMoi);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void tableKLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKLMouseClicked
        // TODO add your handling code here:
        txtKL.setText(kl.get(tableKL.getSelectedRow()).getMaSuKien());
    }//GEN-LAST:event_tableKLMouseClicked

    private void capNhatBang() {
        //Cap nhat lai du lieu vao bang
        modelDaChon.setList(gtDaChon);
        tableDaChon.setModel(modelDaChon);
        tableDaChon.revalidate();
        tableDaChon.repaint();
        modelChuaChon.setList(gtChuaChon);
        tableChuaChon.setModel(modelChuaChon);
        tableChuaChon.revalidate();
        tableChuaChon.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBo1;
    private javax.swing.JButton btnBoAll;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThemAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableChuaChon;
    private javax.swing.JTable tableDaChon;
    private javax.swing.JTable tableKL;
    private javax.swing.JLabel txtKL;
    // End of variables declaration//GEN-END:variables
}
