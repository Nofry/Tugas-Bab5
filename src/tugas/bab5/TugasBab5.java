package tugas.bab5;

import java.util.Scanner;

class Jaket{
    public String nama[]= {"JaketA","JaketB","JaketC"};
    public final int jaket[]= {100000,125000,175000};
    public int jumlah[];
    public int potongan[]= {5000,5000,15000};
    public int harga[] = new int[3];
    public int Total;
    public void Pembelian(int a[]){
        jumlah = a;
        Total = 0;
        for (int i = 0; i < 3; i++) {
            if(a[i]>100){
                harga[i] = (jaket[i] * a[i])-(potongan[i]*a[i]);
            }
            else{
                harga[i]= (jaket[i] * a[i]);
            }
            Total += harga[i];
        }
    }
    public void CetakHarga(){
        System.out.println("Nama    Jumlah    Harga");
        for (int i = 0; i < 3; i++) {
            System.out.println(nama[i]+"  "+jumlah[i]+"      Rp."+harga[i]);    
        }
        System.out.println("=======================================");
        System.out.println("Total Harga: Rp."+Total);
    }
}
public class TugasBab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket CV = new Jaket();
        int a[] = new int[3];
        System.out.println("==CV.Labkomdas==");
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Jumlah "+CV.nama[i]+" : ");
            a[i]=in.nextInt();
        }
        CV.Pembelian(a);
        System.out.println("========================================");
        CV.CetakHarga();
    }   
}
