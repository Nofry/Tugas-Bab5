import java.util.Scanner;
class Hitungan{
     public static void Penjumlahan(int bilangan1, int bilangan2){
        int nilai = bilangan1 + bilangan2;
        System.out.println("Hasil Penjumlahan : "+nilai);
    }
    public static void Pengurangan(int bilangan1, int bilangan2){
        int nilai = bilangan1 - bilangan2;
        System.out.println("Hasil Pengurangan : "+nilai);
    }
    public void Perkalian(int bilangan1, int bilangan2){
        int nilai = bilangan1 * bilangan2;
        System.out.println("Hasil Perkalian : "+nilai);
    }
    public void Pembagian(int bilangan1, int bilangan2){
        double nilai = (double) bilangan1 / bilangan2;
        System.out.println("Hasil Pembagian : "+nilai);
    }
    public void Sederhana(int bilangan1, int bilangan2){
        int temp, a, b;
        if(bilangan2==0){
            return;
        }
        a = (bilangan1 < bilangan2) ? bilangan2:bilangan1;
        b = (bilangan1 < bilangan2) ? bilangan1:bilangan2;
        while(b!=0){
            temp = a%b;
            a=b;
            b=temp;
        }
        bilangan1 /=a;
        bilangan2 /=a;
        System.out.println("Hasil Penyederhanaan : "+bilangan1+"/"+bilangan2);
    }
}
public class LatihanBab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih, x, y;
        System.out.println("===Main Menu===");
        System.out.println("[1] Penjumlahan");
        System.out.println("[2] Pengurangan");
        System.out.println("[3] Perkalian");
        System.out.println("[4] Pembagian");
        System.out.println("[5] Penyederhanaan Pecahan");
        System.out.println("[0] Exit");
        System.out.println("===============");
        System.out.print("Masukkan Pilihan Menu: ");
        pilih = in.nextInt();
        switch(pilih){
            case 1: System.out.println("=PENJUMLAHAN=");
                    System.out.print("Masukkan Bilangan 1: ");
                    x = in.nextInt();
                    System.out.print("Masukkan Bilangan 2: ");
                    y = in.nextInt();
                    Hitungan.Penjumlahan(x, y);
                    break;
            case 2: System.out.println("=PENGURANGAN=");
                    System.out.print("Masukkan Bilangan 1: ");
                    x = in.nextInt();
                    System.out.print("Masukkan Bilangan 2: ");
                    y = in.nextInt();
                    Hitungan.Pengurangan(x, y);
                    break;
            case 3: System.out.println("=PERKALIAN=");
                    Hitungan perkalian = new Hitungan();
                    System.out.print("Masukkan Bilangan 1: ");
                    x = in.nextInt();
                    System.out.print("Masukkan Bilangan 2: ");
                    y = in.nextInt();
                    perkalian.Perkalian(x, y);
                    break;
            case 4: System.out.println("=PEMBAGIAN=");
                    Hitungan pembagian = new Hitungan();
                    System.out.print("Masukkan Bilangan 1: ");
                    x = in.nextInt();
                    System.out.print("Masukkan Bilangan 2: ");
                    y = in.nextInt();
                    pembagian.Pembagian(x, y);
                    break;
            case 5: System.out.println("=PENYEDERHANAAN=");
                    Hitungan sederhana = new Hitungan();
                    System.out.print("Masukkan Pembilang : ");
                    x = in.nextInt();
                    System.out.print("Masukkan Penyebut  : ");
                    y = in.nextInt();
                    sederhana.Sederhana(x, y);
                    break;
            case 0: System.out.println("TERIMAKASIH=");
                    break;
            default: System.out.println("Pilihan Tidak Valid!! Coba Lagi!");
        }
        
        
    }
    
}
