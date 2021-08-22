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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConnectData.ConnectionDB.conn();
        ArrayList<Luat> luats = TapLuatDB.getAllLuat();
        
//        inDuLieu(suKiens, luats);
//        
        ArrayList<String> input = new ArrayList<>();
//        input.add("b3");
//        input.add("m4");
//        input.add("nl2");
//        input.add("nl23");
//        input.add("nl20");
//        input.add("nl24");
//        input.add("nl21");

//        ArrayList<String> allNL = new
            System.out.println("input "+input);
//        
//        ArrayList<Luat> R = luats;
        ArrayList<String> TG = input;
//        ArrayList<Luat> SAT = luatThoaList(R, TG);
        
//        ArrayList<Luat> VET = SuyDienTien(TG);
        
        System.out.println("Ket qua:");
        ArrayList<SuKien> ketLuan = getKLSuyDienTien(input);
        
        for (SuKien suKien : ketLuan) {
            System.out.println(suKien.getNoiDung());
        }
        
        System.out.println(Pattern.matches("[0-9]+", "21"));

//        ArrayList<SuKien> thu = SuKienDB.getAllKetLuan();
//        for (SuKien suKien : thu) {
//            System.out.println(suKien.getMaSuKien());
//        }
    }

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

    private static void inDSLuat(ArrayList<Luat> lst) {
        for (Luat luat : lst) {
            System.out.println(luat.getMaLuat()+" - "+luat.getGT()+" - "+luat.getKL());   
        }
    }

    private static void inDuLieu(ArrayList<SuKien> suKiens, ArrayList<Luat> luats) {
        for (SuKien suKien : suKiens) {
            System.out.println(suKien.getMaSuKien()+" - "+suKien.getMaNhom()+" - "+suKien.getNoiDung());
        }
        
        for (Luat luat : luats) {
            System.out.println(luat.getMaLuat()+" - "+luat.getGT()+" - "+luat.getKL());
            String[] li = luat.getListLeft();
            System.out.print("\t");
            System.out.print(li.length+"  :   ");
            for (String item : li) {
                System.out.print(item+" + ");
            }
            System.out.println("");
        }
    }

}
