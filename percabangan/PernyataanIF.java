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
public class PernyataanIF {

    public static void main(String[] args) {
        int diskon = 0, totalBelanja = 500000;
        if (totalBelanja >= 100000) {
            diskon = totalBelanja / 10;
        }
        System.out.println("Diskon = " + diskon);
    }
}
