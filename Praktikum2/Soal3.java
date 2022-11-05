/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author YOGA FAHREZA
 */
import java.util.Scanner;


public class Soal3 {
    public static void main(String[] args) {
        String Nama;
        String NIM;
        String Semester;
        String Kelas;
        Scanner inputan=new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Masukkan Nama: ");
        Nama=inputan.next();
        System.out.print("Masukkan NIM: ");
        NIM=inputan.next();
        System.out.print("Masukkan Semester: ");
        Semester=inputan.next();
        System.out.print("Masukkan Kelas: ");
        Kelas=inputan.next();
        
        System.out.println("Nama "+Nama);
        System.out.println("NIM "+NIM);
        System.out.println("Semester "+Semester);
        System.out.println("Kelas "+Kelas);
    }
}
