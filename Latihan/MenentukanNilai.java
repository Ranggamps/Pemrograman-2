import java.util.Scanner;
import java.util.*;

public class MenentukanNilai {
    

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        while (lanjut){
        System.out.println("Tipe Nilai : A, B, C, D");
        System.out.println("Masukan Nilai = ");
        String n = input.next();
        switch(n){
            
            case "A" :
                     System.out.println("Excellent");
                break;
                
            case "B" :
                     System.out.println("Good Job!");
                break;
                
            case "C" :
                     System.out.println("Study Harder!");
                break;
                
            case "D" :
                     System.out.println("Sorry, you failed");
                break;
                
        default :   System.out.println("Nilai Tidak Valid");
                
        }if ((input.nextLine().matches("n"))){
            lanjut  = false;
         }
        
        }
    }