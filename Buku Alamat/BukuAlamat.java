import java.util.List;
/**
 *
 * @author Asus
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String no;  
    private String email;
    private String tambah;
    public static void main(String[]args){
        
    }
    //nama
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    //alamat
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    //no telfon
    public String getNo(){
        return no;
    }
    public void setNo(String no){
        this.no = no;
    }
    //Email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void tampil(){
        System.out.println(this.getNama() + " \t\t " + this.getAlamat() + " \t\t " + this.getNo() + " \t\t " + this.getEmail());    
    }
    public void tampilsemua(){
        System.out.println("Nama    : "+ this.getNama());
        System.out.println("Alamat  : "+ this.getAlamat());
        System.out.println("No HP    : "+ this.getNo());
        System.out.println("Nama    : "+ this.getNama());
    }