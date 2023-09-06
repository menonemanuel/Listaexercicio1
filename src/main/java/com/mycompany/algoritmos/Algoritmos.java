/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmos;

import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class Algoritmos {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        int soma;
        
        Scanner scanner = new Scanner (System.in);
                
        System.out.println("Informe o primeiro número:");
        
        num1 = scanner.nextInt();
        
        System.out.println("Informe o segundo número:");
        num2 = scanner.nextInt();        
        soma = num1 + num2;
        System.out.println("A soma dos valuores és:" + soma);
                
    }
}
