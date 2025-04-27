/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor2;

public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    public String toString() {
        return "Class: Employee, Name: " + nama;
    }
}
