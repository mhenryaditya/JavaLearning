/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author m_henry_aditya
 */
import java.util.Scanner;

public class Matematika {

    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        System.out.println("Menu Pilihan Matematika");
        System.out.println("1. Penjumlahan" + '\t' + "2. Pengurangan" + '\t' + "3. Perkalian" + '\t' + "4. Pembagian");
        System.out.print("Pilih Menu: ");
        int input = ipt.nextInt();

        if (input == 1) 
        {
            System.out.print("Masukkan Angka Pertama: ");
            double x = ipt.nextDouble();
            System.out.print("Masukkan Angka Kedua: ");
            double y = ipt.nextDouble();
            System.out.println("Hasil Penambahannya: " + (x + y));
        } 
        else if (input == 2) 
        {
            System.out.print("Masukkan Angka Pertama: ");
            double b = ipt.nextDouble();
            System.out.print("Masukkan Angka Kedua: ");
            double c = ipt.nextDouble();
            System.out.println("Hasil Pengurangannya: " + (b - c));
        } 
        else if (input == 3) 
        {
            System.out.print("Masukkan Angka Pertama: ");
            double e = ipt.nextDouble();
            System.out.print("Masukkan Angka Kedua: ");
            double f = ipt.nextDouble();
            System.out.println("Hasil Perkaliannya: " + (e * f));
        } 
        else if (input == 4) 
        {
            System.out.print("Masukkan Angka Pertama: ");
            double h = ipt.nextDouble();
            System.out.print("Masukkan Angka Kedua: ");
            double i = ipt.nextDouble();
            System.out.println("Hasil Pembagiannya: " + (h / i));
        } 
        else 
        {
            System.out.println("ERR: PILIHAN TIDAK TERSEDIA");
        }
    }
}
