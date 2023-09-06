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
public class calculadora {
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
        
        if (opcao == 1){
        System.out.println("----SOMA-----");
        
        System.out.println("Informe o primeiro número");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número");
        num2 = scanner.nextFloat();
        resultado = num1 + num2;
        
        System.out.println("O resultado é: " + resultado);
        
        }else if (opcao == 2){
            System.out.println("----SUBTRAÇÃO-----");
        
        System.out.println("Informe o primeiro número");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número");
        num2 = scanner.nextFloat();
        resultado = num1 - num2;
        
        System.out.println("O resultado é: " + resultado);
            
        }else if (opcao == 3){
            System.out.println("----MULTIPLICAÇÃO-----");
        
        System.out.println("Informe o primeiro número");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número");
        num2 = scanner.nextFloat();
        resultado = num1 * num2;
        
        System.out.println("O resultado é: " + resultado);
        }
    else if (opcao == 4){
            System.out.println("----MULTIPLICAÇÃO-----");
        
        System.out.println("Informe o primeiro número");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número");
        num2 = scanner.nextFloat();
        resultado = num1 / num2;
        
        System.out.println("O resultado é: " + resultado);
        }
    }
    }
