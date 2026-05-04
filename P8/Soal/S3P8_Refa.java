package Soal;
import java.util.Scanner;

public class S3P8_Refa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ulang;
        double nilai, total = 0;
        int jumlah = 0;
        do {
            System.out.print("Masukkan nilai: ");
            nilai = input.nextDouble();
            
            total += nilai; //proses penjumlahan
            jumlah++;
            
            System.out.print("Masukkan nilai lagi? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
        double rataRata = total / jumlah; // menghitung rata-rata
        
        System.out.println("\nJumlah data: " + jumlah);
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-Rata: " + rataRata);
    input.close();
    }
}
