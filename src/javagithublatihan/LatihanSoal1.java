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
public class LatihanSoal1 {
    public static void main(String[] args){
       int a, b, n, Un = 0; //inisialisasi dengan tipe data integer
       a=3; //nilai suku pertama
       System.out.println("Nilai suku pertama = " + a); //menampilkan nilai output suku pertama
       
       b=5; //selisih antara nilai suku-suku
       System.out.println("Nilai selisih tiap suku = " + b); //menampilkan nilai selisih pada output
       n=10; //nilai suku terakhir 
       
        for (int i = 1; i <= n; i++) { //perulangan angka 1 sampai 10
            
            Un = a + (i-1)*b; //operator dengan rumus mencari suku ke-n
            System.out.println("Nilai suku ke-" + i + "adalah = " + Un); //menampilkan output suku ke-n menggunakan rumus tersebut
            
        }
        
        int Sn = (a + Un)* n / 2; //operator dengan rumus mencari jumlah ke-n suku
            System.out.println("Jumlah deret aritmatika dengan suku ke-" + n + "adalah = " + Sn); //menampilkan output jumlah ke-n
    }
}
