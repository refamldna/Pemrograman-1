package Lat1;
import java.util.Scanner;

public class P8_RefaMaulidina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int batasAngka = input.nextInt();
        for (int a = 1; a <= batasAngka; a++) {
            System.out.print("Nilai ke: " + a);
        input.close();
        }
    }
}