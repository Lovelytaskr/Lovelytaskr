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
public class LatihanSoal4B {
    public static void main(String[] args){
        int sukupertama = 5; //nilai suku pertama
        int selisih = 5; //selisih tiap suku
        int nilaiakhir = 75; //nilai suku terakhir 
        int updatenilai;
        
        for (int i = 0; i < 6; i++) { //perulangan luar untuk membentuk perulangan ke bawah
            for (int j = 5; j > i; j--) { //perulangan dalam untuk membentuk perulangan ke-
                //sebagai penjumlah
                updatenilai = sukupertama;
                sukupertama += selisih;
                System.out.print(" "+updatenilai); //menampilkan hasil output 
            }
            System.out.println(" "); //memisahkan baris ke bawah
            
        }
    }
}
