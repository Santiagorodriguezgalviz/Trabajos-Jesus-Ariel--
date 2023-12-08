/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumamatriz;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO
 */
public class Sumamatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan=new Scanner(System.in);
    int[][] matriz1=new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j= 0; j < 3; j++) {
                System.out.println("ingrese el valor para la matriz 1: "+(i + 1)+ ","+ (j + 1));
                matriz1[i][j] = scan.nextInt();
            }
}
       int[][] matriz2=new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j= 0; j < 3; j++) {
                System.out.println("ingrese el valor para la matriz 2: "+(i + 1)+ ","+ (j + 1));
                matriz2[i][j] = scan.nextInt();
            }
}
        int[][] matriz3=new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j= 0; j < 3; j++) { 
                matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
                System.out.println("el valor de la suma de la matriz en las posiciones:"+ (i + 1)+ ","+ (j + 1));
                System.out.println(matriz3[i][j]);
            }
}
        
        
    }
}
