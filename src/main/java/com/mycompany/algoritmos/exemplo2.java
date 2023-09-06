
 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmos;
 
 import java.util.Scanner;
 
/**
 *
 * @author emanuel.4966
 */
public class exemplo2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    
    String nome;
    
        System.out.println("Diga a palavra mágica");
        
        nome = scanner.next();
        
        if (nome.equals("Alacadabra")){
            System.out.println("Usuário NÃO autorizado");
        }else{
            System.out.println("Usuário autorizado");
        }
    }
}