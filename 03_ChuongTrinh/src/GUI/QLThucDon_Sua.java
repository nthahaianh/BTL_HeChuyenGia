
package GUI;

import ConnectData.SuKienDB;
import CustomTable.TableMon;
import Models.SuKien;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class QLThucDon_Sua extends javax.swing.JDialog {
    SuKien tdSua;
    ArrayList<SuKien> allMon,monDaChon;
    TableMon
            modelChuaChon = new TableMon(), 
            modelDaChon = new TableMon();    

    public QLThucDon_Sua(java.awt.Frame parent, boolean modal,SuKien tdSua) {
        super(parent, modal);
        initComponents();
        this.tdSua = tdSua;
        txtMa.setText(tdSua.getMaSuKien());
        txtThucDonCu.setText(tdSua.getNoiDung());
        String mon[] = tdSua.getNoiDung().split("\\,");
        System.out.println(tdSua.getNoiDung());
        for (int i = 0; i < mon.length; i++) {
            System.out.println("i = "+i+" - "+mon[i].trim());
        }
        allMon = SuKienDB.getAllMon();
        monDaChon = new ArrayList<>();
        int i = 0;
        while(i<allMon.size()){
            int j = 0;
            while(j<mon.length){
                SuKien monCheck = allMon.get(i);
                if(monCheck.getNoiDung().trim().equalsIgnoreCase(mon[j].trim())){                    
                    monDaChon.add(monCheck);
                    allMon.remove(monCheck);
                }
                j++;
            }
            i++;
        }
        
        modelChuaChon.setList(allMon);
        modelDaChon.setList(monDaChon);
        tableChuaChon.setModel(modelChuaChon);
        tableDaChon.setModel(modelDaChon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChuaChon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDaChon = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBoAll = new javax.swing.JButton();
        btnBo1 = new javax.swing.JButton();
        btnThem1 = new javax.swing.JButton();
        btnThemAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtThucDonCu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 450));

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

        btnSua.setBackground(new java.awt.Color(0, 51, 153));
        btnSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.setBorderPainted(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
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

        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Món ăn ngoài thực đơn");

        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Món ăn trong thực đơn");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Sửa thực đơn");

        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Mã:");

        txtMa.setForeground(new java.awt.Color(0, 51, 102));
        txtMa.setText("KL");

        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Thực đơn cũ:");

        txtThucDonCu.setForeground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBoAll, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnThemAll, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(40, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMa)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThucDonCu, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMa)
                        .addComponent(jLabel5)
                        .addComponent(txtThucDonCu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThemAll, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnBo1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBoAll, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        try {
            if(monDaChon.size()==0)
            throw new Exception("Cần có ít nhất một món trong thực đơn!");
            if(monDaChon.size()>7)
            throw new Exception("Thực đơn nhiều nhất 7 món!");
            String thucDon = "";
            for(int i=0; i<monDaChon.size();i++){
                if(i!=monDaChon.size()-1)
                thucDon+=monDaChon.get(i).getNoiDung()+",";
                else
                thucDon+=monDaChon.get(i).getNoiDung();
            }
            System.out.println("Mon da chon:");
            for (SuKien suKien : monDaChon) {
                System.out.println(suKien.getNoiDung());
            }
            tdSua.setNoiDung(thucDon);
            System.out.println("thuc don moi: "+tdSua.getNoiDung());
            SuKienDB.updateSuKienByMa(tdSua);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnBoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoAllActionPerformed
        // TODO add your handling code here:
        try {
            for (SuKien suKien : monDaChon) {
                allMon.add(suKien);
            }
            monDaChon.clear();
            capnhatBang();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBoAllActionPerformed

    private void btnBo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBo1ActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tableDaChon.getSelectedRow();
            if(selectedRow<0 || selectedRow>=tableDaChon.getRowCount()){
                throw new Exception("Cần chọn một món");
            }else{
                SuKien nl = monDaChon.get(selectedRow);
                allMon.add(nl);
                monDaChon.remove(nl);
                capnhatBang();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBo1ActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tableChuaChon.getSelectedRow();
            if(selectedRow<0 || selectedRow>=tableChuaChon.getRowCount()){
                throw new Exception("Cần chọn một nguyên liệu");
            }else{
                SuKien nl = allMon.get(selectedRow);
                monDaChon.add(nl);
                allMon.remove(nl);
                capnhatBang();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnThem1ActionPerformed


    private void btnThemAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemAllActionPerformed
        // TODO add your handling code here:
        try {
            for (SuKien suKien : allMon) {
                monDaChon.add(suKien);
            }
            allMon.clear();
            capnhatBang();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnThemAllActionPerformed

    private void capnhatBang() {
        //Cap nhat lai du lieu vao bang
        modelDaChon.setList(monDaChon);
        tableDaChon.setModel(modelDaChon);
        tableDaChon.revalidate();
        tableDaChon.repaint();
        
        modelChuaChon.setList(allMon);
        tableChuaChon.setModel(modelChuaChon);
        tableChuaChon.revalidate();
        tableChuaChon.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBo1;
    private javax.swing.JButton btnBoAll;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThemAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableChuaChon;
    private javax.swing.JTable tableDaChon;
    private javax.swing.JLabel txtMa;
    private javax.swing.JLabel txtThucDonCu;
    // End of variables declaration//GEN-END:variables
}
