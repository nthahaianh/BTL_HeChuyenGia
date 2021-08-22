/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author nthah
 */
public class SuKien {
    private String maSuKien;
    private String maNhom;
    private String noiDung;

    public SuKien(String maSuKien, String maNhom, String noiDung) {
        this.maSuKien = maSuKien;
        this.maNhom = maNhom;
        this.noiDung = noiDung;
    }

    public SuKien() {
    }

    public String getMaSuKien() {
        return maSuKien;
    }

    public void setMaSuKien(String maSuKien) {
        this.maSuKien = maSuKien;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
    
}
