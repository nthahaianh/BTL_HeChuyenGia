/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectData;

import Models.Luat;
import Models.SuKien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nthah
 */
public class TapLuatDB {
    static private PreparedStatement preparedStatement = null;    // cau lenh query
    static private ResultSet resultSet = null;            //ket qua tra ve

    static public ArrayList<Luat> getAllLuat(){
        String sql="select * from tapluat";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<Luat> luatList = new ArrayList<>();
            while(resultSet.next()){
                Luat luat = new Luat(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
                luatList.add(luat);
            }
            return luatList;
        } catch (SQLException ex) {
            Logger.getLogger(TapLuatDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    static public void addLuat(Luat luat) {
        String sql="INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES (?,?)";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            preparedStatement.setString(1, luat.getGT());
            preparedStatement.setString(2, luat.getKL());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TapLuatDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static public void updateLuatByMa(Luat luat) {
        String sql="update tapluat set GiaThiet=?, KetLuan=? where maluat=?";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            preparedStatement.setString(1, luat.getGT());
            preparedStatement.setString(2, luat.getKL());
            preparedStatement.setInt(3, Integer.valueOf(luat.getMaLuat().toString().trim()));
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TapLuatDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteLuatByMa(Luat luatXoa) {
        String sql = "delete TAPLUAT where MaLuat=?";
        try {
            PreparedStatement st = ConnectionDB.conn().prepareStatement(sql);
            st.setInt(1, Integer.valueOf(luatXoa.getMaLuat().toString().trim()));
            st.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(TapLuatDB.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
