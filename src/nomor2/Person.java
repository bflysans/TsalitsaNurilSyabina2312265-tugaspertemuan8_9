/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor2;

public class Person {
    String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;

    public Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public String getName() {
    return nama;
}

    @Override 
    public String toString() {
        return "Class: Person, Name: " + nama;
    }
}
