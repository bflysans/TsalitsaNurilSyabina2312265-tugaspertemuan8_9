/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor2;

public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, String jamKerja, String pangkat) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    public String toString() {
        return "Class: Faculty, Name: " + nama;
    }
}

