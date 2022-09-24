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
public class PernyataanIfElseIf {

    public static void main(String[] args) {
        double skorUjian = 86;
        char nilai;

        if (skorUjian >= 90 && skorUjian <= 100) {
            nilai = 'A';
            System.out.println("Nilai: " + nilai);
        } else if (skorUjian >= 80 && skorUjian < 90) {
            nilai = 'B';
            System.out.println("Nilai: " + nilai);
        } else if (skorUjian >= 70 && skorUjian < 80) {
            nilai = 'C';
            System.out.println("Nilai: " + nilai);
        } else if (skorUjian >= 0 && skorUjian < 70) {
            nilai = 'D';
            System.out.println("Nilai: " + nilai);
        } else {
            System.out.println("Rentang Nilai Tidak Memenuhi!");
        }
    }
}
