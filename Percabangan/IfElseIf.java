/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;

import java.util.Scanner;

/**
 *
 * @author YOGA FAHREZA
 */
public class IfElseIf {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda = ");
        String Nama = inp.nextLine();
        
        System.out.print("Masukkan NIM = ");
        String nim = inp.next();
        
        System.out.print("Masukkan Nilai IPK = ");
        float nilai = inp.nextFloat(); 
         
        if(nilai < 3.00) {
            System.out.println("Cukup");
        } else if(nilai < 3.49) {
            System.out.println("Memuaskan");
        } else if(nilai < 3.74) {
            System.out.println("Sangat Memuaskan");
        } else {
            System.out.println("Cum Laude");
        }
    }
}
