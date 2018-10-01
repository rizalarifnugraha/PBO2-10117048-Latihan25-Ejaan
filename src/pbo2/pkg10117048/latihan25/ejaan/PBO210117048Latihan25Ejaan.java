/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan25.ejaan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha
 * Kelas : PBO2
 * NIM : 10117048
 * Deskripsi Program : Program ini berisi ejaan nama dari nama awal hingga 
 *                     terakhir.
 */
public class PBO210117048Latihan25Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nameFront;
        int i = 0;
        int j = 1;
        
        Scanner name = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk dieja\t : ");
        nameFront = name.next();
        String[] frontName = nameFront.split("");
        
        System.out.println("");
        System.out.println("Ejaan untuk " + nameFront + " adalah : ");
        while (i < frontName.length){
            System.out.println("Huruf ke-" + j + " : " + frontName[i]);
            j = j + 1;
            i = i + 1;
        }
    }
    
}
