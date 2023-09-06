/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package round2ofexercises;

import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class percentual {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        int numero, numero2, resultado;
        
        System.out.println("Escolha um número que queira saber a portagem: ");
        numero = scanner.nextInt();
        
        System.out.println("Quantos porcento? ");
        numero2 = scanner.nextInt();
        
        resultado = (numero * numero2) / 100;
        
         System.out.println("O resultado é: " + resultado);
        
        
    }
}
