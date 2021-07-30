/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagithublatihan;

/**
 *
 * @author ASUS
 */
public class LatihanSoal3 {
    public static void main(String[] args) {
        int sukupertama = 10;
        int selisih = 5;
        int nilaiterakhir = 80;
        int updatenilai;
        int totalnilai = 0;
        System.out.println("Deret Aritmatika");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                
                updatenilai = sukupertama;
                sukupertama += selisih;
                System.out.print(" "+updatenilai);
                
                totalnilai += updatenilai;
                
            }
            System.out.println(" ");
        }
        System.out.println("jumlah deret aritmatika = "+totalnilai);
    }
}
