package LatihanP7;
import java.util.Scanner;

public class P7_RefaMaulidina {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int kehadiran, realisasi, nilai;
        double presensi;

        System.out.print("Masukkan Jumlah Kehadiran: ");
        kehadiran = input.nextInt();
        System.out.print("Masukkan Jumlah Realisasi: ");
        realisasi = input.nextInt();

        System.out.print("Masukkan Nilai Akhir: ");
        nilai = input.nextInt();

        presensi = (double) kehadiran / realisasi * 100;

        char grade;
        if (presensi >= 75) {
            //bagian a
            if (nilai >= 80) {
                grade = 'A';
            } else if (nilai >= 70) {
                grade = 'B';
            } else if (nilai >= 60){
                 grade = 'C';
            } else if (nilai >= 55) {
                grade = 'D';
            } else {
                grade = 'E';
            }
        } else {
            // bagian b
            if (nilai >= 55) {
                grade = 'D';
            } else {
                grade = 'E';
            }
        }
            System.out.printf("Kehadiran: %.2f%%\n", presensi);
            System.out.println("Nilai akhir: " + nilai);
            System.out.println("Grade: " + grade);
     }
 }