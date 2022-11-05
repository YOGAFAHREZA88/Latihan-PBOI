/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author YOGA FAHREZA
 */
public class InputBR {
    public static void main(String[] args) {
        //Buat BufferedReader
        BufferedReader brl = new BufferedReader (new InputStreamReader(System.in));
        try {
            //Ambil data nama dari keyboard
            System.out.print("Nama = ");
            String nama = brl.readLine();
            //Ambil data umur dari keyboard
            System.out.print("Umur = ");
            int umur = Integer.parseInt(brl.readLine());
            //Print
            System.out.println("Assalamu'alaikum "+nama+" Apa kabar? Tidak terasa sekarang anda sudah "+umur+" tahun.");
            
        } catch (IOException ex) {
            System.out.println("Error pada saat input data");
        }
    }
}
