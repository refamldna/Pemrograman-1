package Latihan1;
import java.util.Scanner;

public class P2_RefaMaulidina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int usia;

        System.out.print("Input nama: ");
        nama = input.nextLine();

        System.out.print("Input usia: ");
        usia = input.nextInt();

        System.out.println("Namaku adalah " + nama + " aku berusia " + usia);
    input.close();
    }
}