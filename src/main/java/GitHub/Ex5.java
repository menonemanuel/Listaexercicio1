/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GitHub;

import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class Ex5 {
   public static void main(String args[]){
     Scanner scanner = new Scanner (System.in);
     
     String[] nomes = new String[6];
     
     nomes[0] = "Emanuel";
     nomes[2] = "Pedro";
     nomes[3] = "João";
     nomes[4] = "Carlos";
     nomes[5] = "Gabriel";
     
     System.out.println("Informe o nome: ");
     String nome = scanner.next();
     boolean nalista = false;
     
       for (String nome1 : nomes) {
           if (nome1.equals(nome)) {
               nalista = true;
               System.out.println("O nome " + nome + " está na lista!  ");
               break;
           }
       }
     if(nalista == false)
             System.out.println(nome + " não está na lista!");
    }
}
