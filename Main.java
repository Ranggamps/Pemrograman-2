/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas10;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        //Membuat Objek
        AddressBook data = new AddressBook("Rangga","Ciheulang");
        
        // Proses
        try{
            FileOutputStream fos = new FileOutputStream("BukuAlamat.dat");
            for( int i = 0; i<10; i++){
            fos.write(i);
            }
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
            System.out.println("Tersimpan");
           
        }catch (IOException ex){
            System.out.println("Gagal. Error:"+ex);
        }
        
        
        //Menampilkan
        System.out.println("Menampilkan Isi File");

            FileInputStream fis=null;
            int da;
        try{
            fis = new FileInputStream("BukuAlamat.dat");
        }catch(FileNotFoundException fnfe){
            System.out.println("File Tidak Ditemukan");
            return;
        }
        
        try{
            while((da = fis.read()) != -1){
                System.out.print((char)da);
            }
        }catch(IOException ioe){
                System.out.println(ioe.getMessage());
                return;
        }
        try{
               fis.close();
        }catch(IOException ioe){}
            
    }
    
}
