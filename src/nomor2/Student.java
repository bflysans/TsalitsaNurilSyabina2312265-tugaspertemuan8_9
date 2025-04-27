/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor2;

public class Student extends Person {
    public static final String MAHASISWA_BARU = "Mahasiswa Baru";
    public static final String MAHASISWA_TAHUN2 = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String nama, String alamat, String nomorTelepon, String email, String status) {
        super(nama, alamat, nomorTelepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + nama;
    }
}

