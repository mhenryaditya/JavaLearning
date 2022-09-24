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
public class UcapanVarIO {
    public static void main(String[] args) {
    Scanner masukan1 = new Scanner(System.in);
    System.out.print("Masukkan kalimat: ");
    String visiULM = masukan1.nextLine();
    
    System.out.print("Masukkan kalimat lainnya: ");
    String visiIlkom = masukan1.nextLine();
    
        System.out.println(visiULM+visiIlkom);
    }
}
