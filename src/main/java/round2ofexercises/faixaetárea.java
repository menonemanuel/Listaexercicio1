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
public class faixaetárea {
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        int ano;
        
        System.out.println("Quantos anos você tem?");
        ano = scanner.nextInt();
        
        if (ano >= 5 && ano <= 7) {
            System.out.println("Você está no infantil A");
        
        }else if (ano >= 8 && ano <= 10){
        System.out.println("Você está no infantil B");
    
        }else if (ano >=11 && ano <= 13){
        System.out.println("Você está no juvenil A");
    
        }else if (ano >= 14 && ano <= 17){
        System.out.println("Você está no juvenil B");
    
        }else if (ano >= 18 && ano >18){
        System.out.println("Você está no adulto");
    
        } 
}
    }
