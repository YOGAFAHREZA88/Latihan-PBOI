/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;
import javax.swing.JOptionPane;
/**
 *
 * @author YOGA FAHREZA
 */
public class JOPPenjumlahan {
    public static void main(String[] args) {
        int nilaiA = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai A!"));
        int nilaiB = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai B!"));
        int jumlah = nilaiA + nilaiB;
        
        System.out.println("Nilai A = " + nilaiA);
        System.out.println("Nilai B = " + nilaiB);
        System.out.println("Jumlah = " + jumlah);
    }
}
