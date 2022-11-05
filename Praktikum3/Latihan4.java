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
public class Latihan4 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Apakah anda mahasiswa ITS Mandiri Yoga Fahreza? ");
       String jawaban=scan.next();
       if("Y".equals(jawaban)){
           System.out.println("Selamat berjuang di ITS Mandiri Yoga Fahreza");
       }else{
           System.out.println("Selamat datang di ITS Mandiri Yoga Fahreza");
       }
    }
}
