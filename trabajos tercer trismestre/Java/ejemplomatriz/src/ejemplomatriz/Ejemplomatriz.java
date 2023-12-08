/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomatriz;
import java.util.Scanner;
/**
 *
 * @author SANTIAGO
 */
public class Ejemplomatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int[][] matriz=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j= 0; j < 4; j++) {
                System.out.println("ingrese el valor para "+(i + 1)+ ","+ (j + 1));
                matriz[i][j] = scan.nextInt();
                
            }
        }
        System.out.println("ingrese el numero que dese saber la ubicacion");
        int num=scan.nextInt();
        for (int i=0; i< 4; i++) {
           for (int j=0; j< 4; j++) {<
               if(matriz[i][j]==num) {
                   System.out.println("la ubicacion del numero es"+(i + 1)+ ","+(j + 1));
               }
           } 
        }
    }
     
}
