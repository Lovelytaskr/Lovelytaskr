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
public class LatihanSoal8 {
    public static void main(String[] args){
        int ma[][] = {{6,2,3}, {4,2,3}}; //ma = matrixA
        int mb[][] = {{1,2}, {2,3}, {3,1}}; //mb = matrixB
        int mc[][] = new int[ma.length][mb[0].length]; //mc = matrixC
        
        System.out.println("ma * mb");
        
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < mb[0].length; j++) {
                for (int k = 0; k < mb.length; k++) {
                    mc [i][j] += ma [i][k] * mb[k][j];
                }
                System.out.print(mc [i][j] +" ");
            }
            System.out.println(" ");
        }
    }
}
