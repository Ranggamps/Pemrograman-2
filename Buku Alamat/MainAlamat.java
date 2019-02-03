import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainAlamat {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Boolean ulang = true;
        BukuAlamat data = new BukuAlamat();
        ArrayList<BukuAlamat> list = new ArrayList<>();
        
        //Menambakan nilai
        data.setNama("Rangga");
        data.setAlamat("Ciheulang");
        data.setNo("089");
        data.setEmail("@Rangga");
        
        list.add(data);
        //mock up
        while (ulang){
            System.out.println("====================================");
            System.out.println("=============Rangga Mps=============");
            System.out.println("Selamat Datang Diperpustakaan Alamat");
            System.out.println("==============1842810===============");
            System.out.println("====================================");
            
            System.out.println("Menu Perpustakaan");
            System.out.println("1. Tambah Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Keluar");
            System.out.println("Pilihan mu ? :)");
            
            int pilihan;
            try{
                pilihan = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException nfe){
                pilihan = 0;
            }
            
            input = new Scanner(System.in);
        
            switch(pilihan){
                case 1:
                       System.out.println("Menambahkan Data");
                       Boolean inputlagi = true;
                    while (inputlagi){
                        BukuAlamat tambah = new BukuAlamat();
                        
                        System.out.print("Masukan Nama  :");
                        String nama = input.nextLine();
                        tambah.setNama(nama);
                        
                        System.out.print("Masukan Alamat :");
                        String alamat = input.nextLine();
                        tambah.setAlamat(alamat);
                        
                        System.out.print("Masukan No Hp  :");
                        String no = input.nextLine();
                        tambah.setNo(no);
                        
                        System.out.print("Masukan Email  :");
                        String email = input.nextLine();
                        tambah.setEmail(email);
                    
                    list.add(tambah);
                    
                        System.out.print("Masukan Data Lagi ? (Y/T) :");
                        String terus = input.nextLine().toUpperCase();
                        
                        if(!terus.equals("Y")){
                            inputlagi = false;
                        }
                    
                    }
                break;
            
                case 2:
                    System.out.println("Update Data");
                    System.out.println("==========================");
                    System.out.println("No  \t  Nama    \t  Alamat  \t  No HP   \t  Email");
                    System.out.println("==========================");
                    for(int i = 0; i < list.size(); i++){
                        BukuAlamat edit = list.get(i);
                        System.out.print((i+1)+"\t");
                        edit.tampil();
                    }
                    System.out.print("Masukan No Urut Entry ?");
                    
                    int editno;
                    try{
                        editno  = Integer.parseInt(input.nextLine());
                    }catch (NumberFormatException nfe){
                        editno  =   0;
                    }
                    try{
                        if(editno > 0){
                            BukuAlamat edit = list.get(editno -1 );
                            Boolean selesai = false;
                            while (!selesai){
                                edit.tampilsemua();
                                System.out.println("Apa yang ingin diubah");
                                System.out.println("1. Nama");
                                System.out.println("2. Alamat");
                                System.out.println("3. No Hp");
                                System.out.println("4. Email");
                                System.out.println("5. Selesai");
                                System.out.println("Ketikan 1/2/3/4/5");
                                
                                int pilihedit;
                                try{
                                        pilihedit = Integer.parseInt(input.nextLine());
                                }catch(NumberFormatException nfe){
                                    pilihedit = 0;
                                }
                                
                                switch(pilihedit){
                                    case 1:
                                        System.out.print("Masukan Nama  :");
                                        edit.setNama(input.nextLine());
                                        break;
                                    case 2:
                                        System.out.print("Masukan Alamat :");
                                        edit.setAlamat(input.nextLine());
                                        break;
                                    case 3:
                                        System.out.print("Masukan No HP  :");
                                        edit.setNo(input.nextLine());
                                        break;
                                    case 4:
                                        System.out.print("Masukan Email  :");
                                        edit.setEmail(input.nextLine());
                                    case 5:
                                        System.out.print("Selesai Mengubah Data");
                                        selesai = true;
                                        break;
                                        
                                    default:
                                        System.out.println("Masukan angka untuk menu selanjutnya");
                                        break;                                       
                                }
                            }
                        }else{
                            System.out.println("Nomor Salah");
                        }
                    }catch(Exception e){
                        System.out.println("Nomor Salah");
                    }break;
                    
                case 3:
                    System.out.println("Menu Hapus Data");
                    System.out.println("==========================");
                    System.out.println("No  \t  Nama    \t  Alamat  \t  No HP   \t  Email");
                    System.out.println("==========================");
                    for(int i = 0; i < list.size(); i++){
                        BukuAlamat edit = list.get(i);
                        System.out.print((i+1)+"\t");
                        edit.tampil();
                    }
                    System.out.print("Masukan No urut Data yang ingin dihapus");
                    int hapusno;
                    try{
                        hapusno = Integer.parseInt(input.nextLine());
                    }catch (NumberFormatException nfe){
                        hapusno = 0;
                    }
                    try{
                        if(hapusno > 0){
                            list.remove(hapusno - 1);
                            System.out.println("Data Dihapus");
                        }else{
                            System.out.println("Tidak ada No");
                        }
                    }catch(Exception e){
                        System.out.println("Tidak ada No");
                    }break;
                
                case 4:
                    System.out.println("Menu Hapus Data");
                    System.out.println("==========================");
                    System.out.println("No  \t  Nama    \t  Alamat  \t  No HP   \t  Email");
                    System.out.println("==========================");
                    for(int i = 0; i < list.size(); i++){
                        BukuAlamat edit = list.get(i);
                        System.out.print((i+1)+"\t");
                        edit.tampil();
                    }
                    break;
                
                case 5:
                    ulang = false;
                    break;
                    
                default:
                    System.out.println("Masukan Angka sesuai menu");
                    break;
                    
            }
        }
     
    }    
}
