/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas10;
import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class AddressBook implements Serializable  {
    private String nama;
    private String alamat;

    public AddressBook(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    AddressBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
