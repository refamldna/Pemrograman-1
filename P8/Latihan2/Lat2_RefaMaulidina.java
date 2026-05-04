package Latihan2;
import java.util.Scanner;

public class Lat2_RefaMaulidina{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int v = (int) Math.ceil(21 * 0.75);
        int k; //kehadiran

        //S1
        System.out.print("Masukkan pilihan (1 = lanjut, selain itu = tidak): ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            //S2
            System.out.print("Masukkan kehadiran: ");
            k = input.nextInt();

            for (int i = 1; k <= v; i++) {
                //S4
                System.out.println("Percobaan ke-" + i + ": Kehadiran kamu dibawah 75%, input lagi!");
                System.out.print("Masukkan Kehadiran: ");
                k = input.nextInt();
            }
            //S5
            System.out.println("Kehadiran kamu: " + k);
        } else {
           //S3
             System.out.println("Kamu tidak melanjutkan proses."); 
        }
         input.close();
       }
 }