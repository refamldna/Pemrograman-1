package Soal;
import java.util.Scanner;

public class S1P8_Refa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ulang;
        
        do {
            System.out.print("Masukkan nilai: ");
            double nilai = input.nextDouble();
            
            System.out.println("Nilai: " + nilai);
            
            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();
        } while (ulang == 'y' || ulang == 'Y');
    input.close();
    }
}
