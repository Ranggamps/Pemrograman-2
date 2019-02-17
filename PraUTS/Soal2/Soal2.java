package soal1&2;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Soal2 {
    
    public static void main(String args[]) {
// 1. Proses
        if(args.length == 8){
        int [] arrdata = new int[8];
               arrdata[0] = Integer.parseInt(args[0]);
               arrdata[1] = Integer.parseInt(args[1]);
               arrdata[2] = Integer.parseInt(args[2]);
               arrdata[3] = Integer.parseInt(args[3]);
               arrdata[4] = Integer.parseInt(args[4]);
               arrdata[5] = Integer.parseInt(args[5]);
               arrdata[6] = Integer.parseInt(args[6]);
               arrdata[7] = Integer.parseInt(args[7]);
        
// Sorting
        for (int x = 0; x < 8 - 1; x++) {
            for (int i = 0; i < 8 - 1; i++) {
                if (arrdata[i] < arrdata[i + 1]) {
                    int j = arrdata[i];
                    arrdata[i] = arrdata[i + 1];
                    arrdata[i + 1] = j;
                
                }
                
            }
        }
        
// Menampilkan Hasil Sorting
        System.out.println("");
        System.out.println("Hasil Sorting   :    ");
        for (int a = 0; a < 3; a++) {
            System.out.print(arrdata[a] + ", ");
        }
        System.out.println("");
        }
        
            // Nama
        System.out.println("========== Soal 2 =========");
        System.out.println("=== Pengurutan Bilangan ===");
        System.out.println("=====  Rangga 1842810 =====");
    
  }
    
}
