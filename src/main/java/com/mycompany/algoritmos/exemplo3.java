/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;

import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class exemplo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
    
        int opcao;
        float num1, num2, resultado;
            
        System.out.println("Informe a operação");
        System.out.println("1- SOMA");
        System.out.println("2- SUBTRAÇÃO");
        System.out.println("3- MULTIPLICAÇÃO");
        System.out.println("4- DIVISÃO");
        opcao = scanner.nextInt();
            
        if (opcao == 1){ //Soma
            System.out.println("------SOMA------");
            System.out.println("Informe o primeiro número");
            num1 = scanner.nextFloat();

            System.out.println("Informe o segundo número");
            num2 = scanner.nextFloat();

            resultado = num1 + num2;

            System.out.println("Resultado da soma " + resultado);
        }else if(opcao == 2){ //Subtração
            System.out.println("------SUBTRAÇÃO------");
            System.out.println("Informe o primeiro número");
            num1 = scanner.nextFloat();
                    
            System.out.println("Informe o segundo número");
            num2 = scanner.nextFloat();
            
            resultado = num1 - num2;
            
            System.out.println("Resultado da soma " + resultado);
            
        }else if(opcao == 3){ //Multiplicação
            System.out.println("------MULTIPLICAÇÃO------");
            System.out.println("Informe o primeiro número");
            num1 = scanner.nextFloat();
                    
            System.out.println("Informe o segundo número");
            num2 = scanner.nextFloat();
            
            resultado = num1 * num2;
            
            System.out.println("Resultado da soma " + resultado);
        
        }else if(opcao == 4){ //Divisão
            System.out.println("------DIVISÃO------");
            System.out.println("Informe o primeiro número");
            num1 = scanner.nextFloat();
                    
            System.out.println("Informe o segundo número");
            num2 = scanner.nextFloat();
            
            resultado = num1 / num2;
            
            System.out.println("Resultado da soma " + resultado);
        
        }else{
        
        }
    }
}