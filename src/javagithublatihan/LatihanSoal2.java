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
public class LatihanSoal2 {
    public static void main(String[] args){
        for (int a = 0; a < 5; a++) { 
            for(int i=0; i<a; i++){ 
            System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
       
        for (int a = 0; a < 6; a++) {
            for(int i=5; i>a; i--){
            System.out.print("* ");
        }
            System.out.println();
    }
}
}
