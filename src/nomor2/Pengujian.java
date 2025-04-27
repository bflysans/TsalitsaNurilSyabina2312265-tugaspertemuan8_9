/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor2;
 
public class Pengujian {
    public static void main(String[] args) {
        Person person = new Person("Lee Minho", "Bandung", "08123456789", "aldi@gmail.com");
        Student student = new Student("Ronaldo", "Jakarta", "08234567890", "budi@gmail.com", "Freshman");
        Employee employee = new Employee("Dybala", "Surabaya", "08345678901", "citra@gmail.com", "Kantor A", 7000000.0, new MyDate(2020, 5, 15));
        Faculty faculty = new Faculty("Raditya", "Yogyakarta", "08456789012", "dian@gmail.com", "Kampus B", 8000000.0, new MyDate(2018, 8, 20), "10AM - 5PM", "Professor");
        Staff staff = new Staff("Selena", "Malang", "08567890123", "eka@gmail.com", "Kantor C", 6000000.0, new MyDate(2022, 3, 10), "S.Kom");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
