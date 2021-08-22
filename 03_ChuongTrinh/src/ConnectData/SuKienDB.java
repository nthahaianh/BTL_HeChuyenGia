/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectData;

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
public class SuKienDB {
    static private PreparedStatement preparedStatement = null;      // cau lenh query
    static private ResultSet resultSet = null;                      //ket qua tra ve

    static public ArrayList<SuKien> getAllSuKien(){
        String sql="select * from sukien";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<SuKien> suKienList = new ArrayList<>();
            while(resultSet.next()){
                SuKien sk = new SuKien(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
                suKienList.add(sk);
            }
            return suKienList;
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    static public ArrayList<SuKien> getAllMua(){
        String sql="select * from sukien where MaNhom = 'nhom1'";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<SuKien> suKienList = new ArrayList<>();
            while(resultSet.next()){
                SuKien sk = new SuKien(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
                suKienList.add(sk);
            }
            return suKienList;
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    static public ArrayList<String> getTenMua(){
        String sql="select noidung from sukien where MaNhom = 'nhom1'";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<String> noiDungList = new ArrayList<>();
            while(resultSet.next()){
                noiDungList.add(resultSet.getString(1));
            }
            return noiDungList;
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    static public ArrayList<String> getTenBuoi(){
        String sql="select noidung from sukien where MaNhom = 'nhom2'";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<String> noiDungList = new ArrayList<>();
            while(resultSet.next()){
                noiDungList.add(resultSet.getString(1));
            }
            return noiDungList;
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
    
    static public ArrayList<SuKien> getAllBuoi(){
        String sql="select * from sukien where MaNhom = 'nhom2'";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<SuKien> suKienList = new ArrayList<>();
            while(resultSet.next()){
                SuKien sk = new SuKien(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
                suKienList.add(sk);
            }
            return suKienList;
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    static public ArrayList<SuKien> getAllNguyenLieu(){
        String sql="select * from sukien where MaNhom = 'nhom3'";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<SuKien> suKienList = new ArrayList<>();
            while(resultSet.next()){
                SuKien sk = new SuKien(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
                suKienList.add(sk);
            }
            return suKienList;
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    static public ArrayList<SuKien> getAllMon(){
        String sql="select * from sukien where MaNhom = 'nhom4'";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<SuKien> suKienList = new ArrayList<>();
            while(resultSet.next()){
                SuKien sk = new SuKien(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
                suKienList.add(sk);
            }
            return suKienList;
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    static public ArrayList<SuKien> getAllKetLuan(){
        String sql="select * from sukien where MaNhom = 'nhom5'";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ArrayList<SuKien> suKienList = new ArrayList<>();
            while(resultSet.next()){
                SuKien sk = new SuKien(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
                suKienList.add(sk);
            }
            return suKienList;
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    static public SuKien getSuKienByMa(String ma){
        String sql="select * from sukien where MaSuKien = '?' ";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            preparedStatement.setString(1, ma);
            resultSet = preparedStatement.executeQuery();
            ArrayList<SuKien> suKienList = new ArrayList<>();
            while(resultSet.next()){
                SuKien sk = new SuKien(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
                suKienList.add(sk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    static public void addNguyenLieu(SuKien suKien){
        String sql="insert into sukien values (?,'nhom3',?)";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            preparedStatement.setString(1, suKien.getMaSuKien());
            preparedStatement.setString(2, suKien.getNoiDung());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static public void addMon(SuKien suKien){
        String sql="insert into sukien values (?,'nhom4',?)";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            preparedStatement.setString(1, suKien.getMaSuKien());
            preparedStatement.setString(2, suKien.getNoiDung());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static public void addKetLuan(SuKien suKien){
        String sql="insert into sukien values (?,'nhom5',?)";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            preparedStatement.setString(1, suKien.getMaSuKien());
            preparedStatement.setString(2, suKien.getNoiDung());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static public void updateSuKienByMa(SuKien suKien){
        String sql="update sukien set noidung=? where masukien=?";
        try {
            preparedStatement = ConnectionDB.conn().prepareStatement(sql);
            preparedStatement.setString(1, suKien.getNoiDung());
            preparedStatement.setString(2, suKien.getMaSuKien());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static public void deleteSuKienByMa(SuKien suKien){
        String sql = "delete sukien where maSuKien=?";
        try {
            PreparedStatement st = ConnectionDB.conn().prepareStatement(sql);
            st.setString(1, suKien.getMaSuKien());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SuKienDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
