/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTable;

import Models.SuKien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nthah
 */
public class TableSuKien extends AbstractTableModel  {
    
    static String Columnname[] = {"STT","Mã", "Nội dung"};
    static Class Columnclass[] = {String.class,String.class, String.class};
    ArrayList<SuKien> list = new ArrayList<>();
    
    public ArrayList<SuKien> getList() {
        return list;
    }
    
    public void setList(ArrayList<SuKien> list){
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
                case 0: return rowIndex+1;
                case 1: return list.get(rowIndex).getMaSuKien();
                case 2: return list.get(rowIndex).getNoiDung();
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
