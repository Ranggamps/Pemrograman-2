public class Mobil {
    private int KecMax = 100;
    private int Percepatan;
    private int KecAktual = 10;
    private boolean Started;
    private int percepatan;
   
//bagian overloading
    
    public int getKecMax(){
        return KecMax;
    }
    public int getPercepatan(){
        return Percepatan;
    }
    public void setPercepatan(int percepatan){
        this.percepatan = percepatan;
    }
    public int getKecAktual(){
        return this.KecAktual;
    }
    
    public void start(){
        Started = true;
        System.out.println("Start");
        System.out.println("Mobil Dijalankan");
    }
    public void stop(int berhenti){
        if (Started == false){
            System.out.println("Mobil Berhenti");
        }else{
            System.out.println("Mobil sudah berhenti dan belum dinyalakan");
        }
    }
    public void rem(){
        if (Started == false){
             System.out.println("Mobil di rem tapi mesin belum hidup");
        }else{   
            KecAktual = KecAktual - 5;
            System.out.println("Mobil Direm, Kecepatan diturunakan, Kecepatan sekarang = " + KecAktual); 
        }
    }
    

    public void naikgigi(int ngigi){
        if(Started == false){
            System.out.println("Gigi dinaikan tapi mesin belum nyala ");
        }else{
            KecAktual = KecAktual + 5;
            System.out.println("Naikan gigi ke gigi = " + ngigi);
            System.out.println("Dan kecepatan sekarang = " + KecAktual);
        }
    }
    public void turungigi(int tgigi){
        if(Started == false){
            System.out.println("Gigi diturunkan tapi mesin belum nyala ");
        }else{
            KecAktual = KecAktual - 5;
            System.out.println("Gigi Diturunkan = " + tgigi);
            System.out.println("Dan kecepatan sekarang = " + KecAktual);
        }
    }
    public void gas(){
        if(Started == false){
            System.out.println("Mobil Belum Dinyalakan ");
        }else{
            System.out.println("Kecepatan awal = " + KecAktual);
        
        }
    }