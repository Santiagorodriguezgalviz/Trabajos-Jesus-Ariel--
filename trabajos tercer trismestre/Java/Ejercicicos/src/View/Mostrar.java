/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Utils.FuncionNumerica;
import Utils.FuncionString;

/**
 *
 * @author SANTIAGO
 */
public class Mostrar {
    public static void main(String[] args) {
        FuncionString fs = new FuncionString();
        FuncionNumerica fn = new FuncionNumerica();

        fn.InputNumericRangeScanner("Digite la nota: ",90.0,100.0);
}
}