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
public class Soal2 {
    public static void main(String[] args) {
        Scanner bln =new Scanner(System.in);
        int bulan;
        System.out.print("Masukkan bulan (angka) : ");
        bulan = bln.nextInt();

        switch (bulan){
            case 1 -> System.out.println("Januari");
            case 2 -> System.out.println("Februari");
            case 3 -> System.out.println("Maret");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("Mei");
            case 6 -> System.out.println("Juni");
            case 7 -> System.out.println("Juli");
            case 8 -> System.out.println("Agustus");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("Oktober");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("Desember");
            default -> System.out.println("Sistem Error");
        }
    }
}