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
public class Kelulusan2 {
    public static void main(String[] args) {
        //Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        //Ambil Nama
        System.out.print("Masukkan Nama = ");
        String Nama = inp.nextLine();
        
        //Ambil Jenis_Kelamin
        System.out.print("Masukkan Jenis Kelamin = ");
        String Jenis_Kelamin = inp.next();
        
        //Ambil Tinggi_Badan
        System.out.print("Masukkan Tinggi Badan = ");
        int Tinggi_Badan = inp.nextInt();
        
        //Print
        if ( "Laki-Laki".equals(Jenis_Kelamin)) {
        if(Tinggi_Badan <= 170){
       System.out.println("Anda Gagal");}
    
        else if((Tinggi_Badan >170) && (Tinggi_Badan <= 230)) 
            System.out.println("Selamat Anda Lulus");}
       
   
    if ("Perempuan".equals(Jenis_Kelamin)) {
        if(Tinggi_Badan <= 160){
            System.out.println("Anda Gagal");}
        
        else if((Tinggi_Badan >160) && (Tinggi_Badan <= 210)) 
            System.out.println("Selamat Anda Lulus");
        }
    }
}    
