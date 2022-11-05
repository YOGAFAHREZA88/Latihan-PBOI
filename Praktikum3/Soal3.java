/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;
import java.util.Scanner;
/**
 *
 * @author YOGA FAHREZA
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int sisi, luas, keliling;
        
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling Persegi");
        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1:
                System.out.print ("Masukkan panjang sisi persegi : ");
                sisi = input.nextInt();
                luas = sisi*sisi;
                System.out.println("Luas persegi adalah : "+ luas +" cm");
                break;
            case 2:
                System.out.print("Masukkan panjang sisi persegi : ");
                sisi = input.nextInt();
                keliling = 4*sisi;
                System.out.println("Keliling persegi adalah : "+ keliling +" cm");
                break;
            default:
                System.out.println("Sistem Error");
        }
    }
}
