/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;

/**
 *
 * @author YOGA FAHREZA
 */
import java.util.Scanner;

public class IfNilaiTerbesar {
    public static void main(String[] args) {
        int nilai1, nilai2, nilai3;
        Scanner inputan = new Scanner (System.in). useDelimiter("\n");
        System.out.println("masukkan 3 angka");
        System.out.print("masukkan nilai 1 : ");
        nilai1=inputan.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nilai2=inputan.nextInt();
        System.out.print("masukkan nilai 3 : ");
        nilai3=inputan.nextInt();
        System.out.println("Kesimpulan : ");
        
        if (( nilai2 < nilai1) && (nilai3 > nilai1)) {
            System.out.println ("Nilai 1 adalah nilai terbesar");}
        if ((nilai1 < nilai2) && (nilai3 < nilai2)) {
            System.out.println("Nilai 2 adalah nilai terbesar");}
        if ((nilai3 > nilai2) && (nilai3 > nilai1)) {
            System.out.println ("Nilai 3 adalah terbesar");}
    
    else
            System.out.println("Semua Nilai Adalah Sama");
         }
}
