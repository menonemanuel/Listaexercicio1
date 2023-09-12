/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class exx9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        int procurar;
        
        int[] elementos = {20,40, 60, 61, 62, 63, 64};
        
        boolean encontrado = false;
        
        System.out.println("Qual valor você deseja encontrar? ");
        procurar = scanner.nextInt();
        
        for(int i = 0; i < elementos.length; i++) {
            if (elementos[i] == procurar) {
            encontrado = true;
            System.out.println("O elemento " + procurar + "foi encontrado na posicao" + posicao);
             break;
            }
        }
            if(!encontrado){
                System.out.println("O elemento " + procurar + " não foi encontrado na lista");
            }
  }
}

