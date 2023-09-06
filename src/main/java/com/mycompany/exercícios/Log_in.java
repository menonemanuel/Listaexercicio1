/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercícios;

import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class Log_in {
    
    public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            
            String nome, número, CPF, endereço, resultado1,resultado2,resultado3,resultado4;
            
             System.out.println("Olá, para fazer o seu cadastro, informe o seu nome  ");
             nome = entrada.nextLine();
             
             System.out.println("Informe o número de telefone: ");
             número = entrada.nextLine();
             
             System.out.println("Informe o seu CPF: ");
             CPF = entrada.nextLine();
             
             System.out.println("Informe o seu endereço: ");
             endereço = entrada.nextLine();
             
             resultado1 = nome;
             resultado2 = número;
             resultado3 = CPF;
             resultado4 = endereço;
             
             System.out.println("Os seus dados são: " + resultado1 + resultado2 + resultado3 +resultado4);
             
             
             
           
            
    }
}
