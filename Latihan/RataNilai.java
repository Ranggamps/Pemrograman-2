import java.util.Scanner;

public class RataNilai {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int satu;
        int dua;
        int tiga;
        int rata;
        
        System.out.print("Masukan Nilai Pertama   : ");
        satu = input.nextInt();
        System.out.print("Masukan Nilai Kedua     : ");
        dua = input.nextInt();
        System.out.print("Masukan Nilai Pertama   : ");
        tiga = input.nextInt();
        rata = (satu + dua + tiga)/3;

        if(rata >= 60){
            System.out.println(":-)");
        }else{
        System.out.println("(-:");
        }
    }