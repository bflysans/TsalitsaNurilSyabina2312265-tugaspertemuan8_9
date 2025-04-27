/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo_pertemuan8.pkg9;

public class geometris {
    private String warna = "putih";
    private boolean diisi;

    public geometris() {
    }

    public geometris(String warna, boolean diisi) {
        this.warna = warna;
        this.diisi = diisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isDiisi() {
        return diisi;
    }

    public void setDiisi(boolean diisi) {
        this.diisi = diisi;
    }

    @Override
    public String toString() {
        return "warna: " + warna + " diisi: " + diisi;
    }
}


