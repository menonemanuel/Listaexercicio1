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
public class tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int tabuada, cont = 1, resultado;
        System.out.println("Qual tabuada você deseja? ");
        tabuada = scanner.nextInt();
        
        while(cont <= 10){
            resultado = tabuada * cont;
            System.out.println(tabuada + " x " + cont + " = " + resultado);
            cont++;
        }
    }
}

