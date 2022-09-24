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

public class LuasSegitigaIO {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai alas: ");
        
        int alas = masukan.nextInt();
        System.out.print("Masukkan tinggi: ");
        
        int tinggi = masukan.nextInt();
        double luas = (double) (alas * tinggi) / 2;
        System.out.println("Luas Segitiga: " + luas);
    }
}
