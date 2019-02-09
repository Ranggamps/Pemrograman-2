/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[]args){

        /*Person p = new Student("Budi","Bandung","Informatika");
        
        System.out.println("Nama    : "+ p.getName());
        System.out.println("Jurusan : "+ p.getDescription());
        System.out.println("Alamat  : "+ p.getAddress());
        
        Dosen d = new Dosen("Nama Dosen", "MSi","Alamatnya dimana" );
        d.setHonor(1000);
        d.setTunjungan(2000);*/
        System.out.println("=================================================");
        System.out.println("================== Rangga  ======================");
        System.out.println("================== Tugas 2 ======================");
        System.out.println("================== 1842810 ======================");
        System.out.println("=================================================");
        
        Circle c = new Circle("Lingkaran", "Area Lingkaran");
        System.out.println(" Bentuk :   "+ c.getName());
        System.out.println(" Dimana :   "+ c.getArea());
        
        System.out.println("_________________________________________________");
        
        Rectangle r = new Rectangle("Persegi Panjang", "Area Persegi Panjang");
        System.out.println(" Bentuk :   "+ r.getName());
        System.out.println(" Dimana :   "+ r.getArea());
    }
}
