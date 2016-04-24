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
        System.out.println("tess");
        
        
    }
    
}
