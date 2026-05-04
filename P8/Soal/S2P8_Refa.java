package Soal;
import java.util.Scanner;

public class S2P8_Refa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ulang;
        double nilai, total = 0;
        
        do {
            System.out.print("Masukkan nilai: ");
            nilai = input.nextDouble();
            
            total += nilai; //proses penjumlahan
            
            System.out.print("Masukkan nilai lagi? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
        System.out.println("\nTotal nilai mahasiswa: " + total);
    input.close();
    }
}
