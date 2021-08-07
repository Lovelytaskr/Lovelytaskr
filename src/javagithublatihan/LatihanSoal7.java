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
public class LatihanSoal7 {
    public static void main(String[] args){
        int ma[][] = {{6,3},{4,8}};
        int mb[][] = {{1}, {2}};
        
        //baris x -> x.length
        //kolom x -> x[0].length (pastikan bahwa index 0 itu ada isinya)
        
        int mc[][] = new int[ma.length][mb[0].length];
        
        for (int i=0; i<ma.length; i++) {
            for (int j=0; j<mb[0].length; j++) {
                for (int k=0;k<mb.length; k++) {
                    mc[i][j] += ma[i][k] * mb[k][j];
                }
                System.out.print(mc[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
