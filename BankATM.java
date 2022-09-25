/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author m_henry_aditya
 */
public class BankATM {

    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        System.out.println("Selamat Datang di Bank Unan");
        int saldo = 100000;
        System.out.println("Menu ATM");
        String pilOne = "1. Cek Saldo", pilTwo = "2. Simpan Uang", pilTh = "3. Ambil Uang";
        System.out.println(pilOne + '\t' + pilTwo + '\t' + pilTh);
        System.out.print("Pilih Menu: ");
        int pil = ipt.nextInt();
        if(pil == 1)
        {
            System.out.println("Saldo Anda: Rp" + saldo);
        }
        else if(pil == 2)
        {
            System.out.print("Jumlah simpanan: Rp");
            int simpan = ipt.nextInt();
            if(simpan <= 0)
            {
                System.out.println("Format tidak dikenali!");
            }
            else
            {
                saldo += simpan;
                System.out.println("Saldo Anda Saat Ini: Rp"+saldo);
            }
        }
        else if(pil == 3)
        {
            System.out.print("Jumlah yang diambil: Rp");
            int ambil = ipt.nextInt();
            if(ambil > saldo)
            {
                System.out.println("Saldo tidak mencukupi!");
            }
            else if(ambil <= 0)
            {
                System.out.println("Format tidak dikenali!");
            }
            else
            {
                saldo -= ambil;
                System.out.println("Saldo Anda Saat Ini: Rp"+saldo);
            }
        }
        else
        {
            System.out.println("Pilihan tidak tersedia. Silakan ketik ulang.");
        }
    }
}
