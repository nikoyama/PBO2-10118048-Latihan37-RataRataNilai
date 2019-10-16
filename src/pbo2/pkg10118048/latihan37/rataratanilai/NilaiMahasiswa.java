/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung rata-rata nilai mahasiswa
 */
public class NilaiMahasiswa {
    
    private int[] nilai; 
    private int n; // n = banyaknya mahasiswa
    private double total;

    public double inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scanner.nextInt();
        nilai = new int[n];
        for(int i = 0;i < n;i++) {
            System.out.print("Nilai Mahasiswa ke-" +(i+1)+ " : ");
            nilai[i] = scanner.nextInt();
            total += nilai [i];
        }
        return total;
    }
    
    public double hitungRataRata(double total) {
        return total / n;
    }
    
    public void tampilHasil() {
        System.out.printf("\nMaka, Rata-rata Nilainya adalah %.1f %n" 
                ,hitungRataRata(total));
        System.out.println("Delevoped by : Niko Yama");
    }
}
