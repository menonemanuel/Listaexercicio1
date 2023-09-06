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
public class exemplo4 {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            
            String nome, senha;
            
            System.out.println("Informe o seu nome: ");
            nome = entrada.nextLine();
            
            System.out.println("Senha: ");
            senha = entrada.nextLine();
            
            if(nome.equals("Emanuel")&& senha.equals("12345")){
            
            System.out.println("Usuário autorizado");
            }else{
            System.out.println("Usuário NÃO autorizado!");
            }
        }
}
 
