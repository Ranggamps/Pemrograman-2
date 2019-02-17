/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Soal1 {
    
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        
    // membuat variable
        int x1,y1;
        int x2,y2;
        int r1,r2;
        double p;
        
    // input data
        System.out.print("Masukan titik x1    :   ");
            x1 = s.nextInt();
        System.out.print("Masukan titik x2    :   ");
            x2 = s.nextInt();
        System.out.print("Masukan titik y1    :   ");
            y1 = s.nextInt();
        System.out.print("Masukan titik y2    :   ");
            y2 = s.nextInt();
        System.out.print("Masukan titik r1    :   ");
            r1 = s.nextInt();
        System.out.print("Masukan titik r2    :   ");
            r2 = s.nextInt();
            
    // Proses matematika    
        p = sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    
    // Kondisi
            if(p < (r2-r1)){
                System.out.println("C2 didalam C1");
            }else if(p < (r1-r2)){
                System.out.println("C1 didalam C2");
            }else if((p > (r1+r2))|| p == (r1-r2)){
                System.out.println("C1 & C2 Ber Irisan");
            }else if(p > (r1+r2)){
            System.out.println("C1 & C2 Saling Lepas");    
            }           
    }
}