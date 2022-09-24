/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedata;

/**
 *
 * @author m_henry_aditya
 */
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Bank Unan");
        int saldo = 100000;
        System.out.println("Saldo saat ini: Rp" + saldo + '\n');

        Scanner masukan = new Scanner(System.in);
        System.out.print("Simpan uang: Rp");
        saldo += masukan.nextInt();
        System.out.println("Saldo saat ini: Rp" + saldo + '\n');

        System.out.print("Ambil uang: Rp");
        saldo -= masukan.nextInt();
        System.out.println("Saldo saat ini: Rp" + saldo);

    }
}
