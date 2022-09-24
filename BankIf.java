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
public class BankIf {

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Bank Unan");
        int saldo = 100000;
        System.out.println("Saldo saat ini: Rp" + saldo + '\n');

        Scanner ipt = new Scanner(System.in);
        System.out.print("Simpan uang: Rp");
        saldo += ipt.nextInt();
        System.out.println("Saldo saat ini: Rp" + saldo + '\n');

        System.out.print("Ambil uang: Rp");
        int ambilUang = ipt.nextInt(), saldoAkhir = saldo - ambilUang;
        
        if (ambilUang > saldo) 
        {
            System.out.println("Saldo Anda Tidak Mencukupi!");
        } 
        else 
        {
            System.out.println("Saldo Anda Tersisa: Rp" + saldoAkhir);
        }
    }
}
