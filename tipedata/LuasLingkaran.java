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
public class LuasLingkaran {
    public static void main(String[] args){
        final double PI = 3.141592;
        double r = 11.78;
        double luasLingkaranPecahan = PI*r*r;
        double luasLingkaranBulat = (short)(PI*r*r);
        double luasLingkaranPembulatan = Math.round(PI*r*r);
        System.out.println("Luas Lingkaran (Pecahan): "+ luasLingkaranPecahan);
        System.out.println("Luas Lingkaran (Bulat): "+ luasLingkaranBulat);
        System.out.println("Luas LIngkaran (Pembulatan): "+ luasLingkaranPembulatan);
    }
}
