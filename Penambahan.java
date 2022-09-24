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
public class Penambahan {

    public static void main(String[] args) {
        int x, y, z;
        x = 42;
        y = x++;
        System.out.println("x saat ini: " + x);
        System.out.println("y saat ini: " + y + '\n');
       
        z = ++x;
        System.out.println("x saat ini: " + x);
        System.out.println("z saat ini: " + z);
        
    }
}
