/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTable;

import ConnectData.TapLuatDB;
import Models.Luat;
import Models.SuKien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nthah
 */
public class TableTapLuat extends AbstractTableModel {
    
    static String Columnname[] = {"Mã", "Giả thiết","Kết luận"};
    static Class Columnclass[] = {String.class, String.class,String.class};
    ArrayList<Luat> list = new ArrayList<>();
    
    public ArrayList<Luat> getList() {
        return list;
    }
    
    public void setList(ArrayList<Luat> list){
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return Columnname.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
                case 0: return list.get(rowIndex).getMaLuat();
                case 1: return list.get(rowIndex).getGT();
                case 2: return list.get(rowIndex).getKL();
                default: return 0;
        }
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Columnclass[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return Columnname[column];
    }
}
