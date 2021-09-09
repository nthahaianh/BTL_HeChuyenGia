/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuyDienTien;

import ConnectData.SuKienDB;
import ConnectData.TapLuatDB;
import Models.Luat;
import Models.SuKien;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author nthah
 */
public class SuyDienTien {

    public static ArrayList<SuKien> getKLSuyDienTien(ArrayList<String> TG) {
        ArrayList<Luat> ketQua = SuyDienTien(TG);
        ArrayList<SuKien> suKiens = SuKienDB.getAllSuKien();
        ArrayList<SuKien> VET = new ArrayList<>();
        for (SuKien suKien : suKiens) {
            if(suKien.getMaNhom().trim().equalsIgnoreCase("nhom5"))
                for (Luat luat : ketQua) {
                    if(suKien.getMaSuKien().trim().equalsIgnoreCase(luat.getKL().trim()))
                        VET.add(suKien);
                }
        }
        return VET;
    }

    public static ArrayList<Luat> SuyDienTien(ArrayList<String> TG) {
        ArrayList<Luat> R = TapLuatDB.getAllLuat();
        ArrayList<Luat> SAT = luatThoaList(R, TG);
        ArrayList<Luat> ketQua = new ArrayList<>();
        while(SAT.size()>0){
            for (Luat luat : SAT) {
                if(!kqDaCo(luat.getKL(), ketQua))      
                    ketQua.add(luat);
                if(!biTrung(luat.getKL(),TG))
                    TG.add(luat.getKL());
                R.remove(luat);
            }
            SAT.clear();
            SAT = luatThoaList(R, TG);
        }
        return ketQua;
    }

    private static boolean kqDaCo(String kl, ArrayList<Luat> ketQua) {
        for (Luat luat : ketQua) {
            if(luat.getKL().trim().equalsIgnoreCase(kl.trim()))
                return true;
        }
        return false;
    }
    
    private static boolean biTrung(String s,ArrayList<String> gt){
        for (String string : gt) {
            if(string.equalsIgnoreCase(s))
                return true;
        }
        return false;
    }

    private static ArrayList<Luat> luatThoaList(ArrayList<Luat> luats, ArrayList<String> input) {
        ArrayList<Luat> lst = new ArrayList<>();
        for (Luat luat : luats) {
            String[] li = luat.getListLeft();
            int count=0;
            for (String string : li) {
                for (String string1 : input) {
                    if(string.trim().equalsIgnoreCase(string1.trim()))
                        count++;
                }
            }
            if(count==li.length)
                lst.add(luat);
        }
        return lst;
    }
}
