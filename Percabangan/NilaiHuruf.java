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
public class NilaiHuruf {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner (System.in);
            System.out.print("Masukkan nilai mata kuliah : ");
        int nilai = masukkan.nextInt();
        if (nilai <= 100)
            System.out.println("Nilai : A ");
        else
        if (nilai <= 85)
            System.out.println("Nilai : B ");
        else
        if (nilai <= 75)
            System.out.println("Nilai : C ");
        else
        if (nilai <= 65)
            System.out.println("Nilai : D ");
        else
        if (nilai <= 55)
            System.out.println("Nilai : E ");
        else
        if ((nilai <= 0) || (nilai > 100)) {    
            System.out.println("ERROR");
         
    }
}
}

