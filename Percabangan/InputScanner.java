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
public class InputScanner {
    public static void main(String[] args) {
        //Buat Scanner
        Scanner sl = new Scanner(System.in);
        //Ambil nilai dari keyboard
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = sl.nextInt();
        
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = sl.nextInt();
        //Hitung dan print
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = "+jumlah);
    }
}
