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
public class Luat {
    private String maLuat;
    private  String GT;
    private String KL;

    public Luat(String maLuat, String GT, String KL) {
        this.maLuat = maLuat;
        this.GT = GT;
        this.KL = KL;
    }

    public Luat() {
    }

    public String getMaLuat() {
        return maLuat;
    }

    public void setMaLuat(String maLuat) {
        this.maLuat = maLuat;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getKL() {
        return KL;
    }

    public void setKL(String KL) {
        this.KL = KL;
    }
    
    public String[] getListLeft(){
        return GT.split("\\^");
    }
}
