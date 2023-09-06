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
public class média {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        float num1, num2, num3, resultado;
        
        System.out.println("MÉDIA");
        
        System.out.println("Informe o primeiro número");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número");
        num2 = scanner.nextFloat();
        
        System.out.println("Informe o terceiro número");
        num3 = scanner.nextFloat();
        
        resultado = (num1 + num2 + num3) /3;
                
        System.out.println("O seu resultado é: " + resultado);
        
        
}
}
