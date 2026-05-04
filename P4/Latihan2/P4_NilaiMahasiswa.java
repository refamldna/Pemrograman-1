package Latihan2;

import java.util.Scanner;

public class P4_NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double kehadiran, realisasi, tugas, uts, uas;
        double presensi, nilaiTugas, nilaiUTS, nilaiUAS, hasil;
        char grade;

        System.out.println("=== Program Menghitung Nilai Mahasiswa ===");

        System.out.print("Masukkan nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Masukkan jumlah kehadiran: ");
        kehadiran = input.nextDouble();

        System.out.print("Masukkan jumlah realisasi pertemuan: ");
        realisasi = input.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();

        presensi = (kehadiran / realisasi) * 100;
        nilaiTugas = tugas * 0.2;
        nilaiUTS = uts * 0.3;
        nilaiUAS = uas * 0.4;

        hasil = presensi * 0.1 + nilaiTugas + nilaiUTS + nilaiUAS;

        // logika (A) & (B)
        if (presensi >= 75) {
            // (A)
            if (hasil >=80) {
                grade = 'A';
            } else if (hasil >= 70) {
                grade = 'B';
            } else if (hasil >= 60) {
                grade = 'C';
            } else if (hasil >= 55) {
                grade = 'D';
            } else {
                grade = 'E';
            }
        } else {
            // (B)
            if (hasil >= 55) {
                grade = 'D';
            } else {
                grade = 'E';
            }
        }
        System.out.println("\n=== Hasil Nilai ===");
        System.out.println("Nama Mahasiswa  :   " + nama);
        System.out.printf("Nilai Presensi  : %.2f%%\n" , presensi);
        System.out.println("Nilai Tugas :   " + nilaiTugas);
        System.out.println("Nilai UTS   :   " + nilaiUTS);
        System.out.println("Nilai UAS   :   " + nilaiUAS);
        System.out.println("Nilai Akhir :   " + hasil);
        System.out.println("Grade   :   " + grade);
    }
}