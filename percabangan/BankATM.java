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
            System.out.print("1. Cek Saldo" + '\t');
            System.out.print("2. Simpan Uang " + '\t');
            System.out.println("3. Ambil Uang");

            System.out.print("Pilih Menu: ");
            int menu = ipt.nextInt();
            
            if (menu == 1)
            {
                System.out.println("Saldo Anda: "+saldo);
            }
            else if (menu == 2)
            {
                System.out.print("Jumlah Uang Yang Anda Simpan: Rp");
                saldo += ipt.nextInt();
                System.out.println("Saldo Anda: "+saldo);
            }
            else if (menu == 3)
            {
                System.out.print("Jumlah Uang Yang Anda Ambil: Rp");
                saldo -= ipt.nextInt();
                System.out.println("Saldo Anda: "+saldo);
            }
            else
            {
                System.out.println("Inputan Anda Tidak Memenuhi");
            }
        }
    }
