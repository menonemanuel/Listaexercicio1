/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author emanuel.4966
 */
public class exx3 {
    public static void main(String args[]){
    int quantidadedeposi = 5, maior, menor;
        
    int[] vetor = new int[quantidadedeposi];
        
    vetor[0] = 30;
    vetor[1] = 50;
    vetor[2] = 11;
    vetor[3] = 90;
    vetor[4] = 40;
        
    maior = vetor[0];
    for(int i = 0; i < vetor.length; i++){
    if(vetor[i] > maior) {
    maior = vetor[i];
}
    }
    
    menor = vetor[0];
    for(int i = 0; i > vetor.length; i++){
    if(vetor[i] < menor) {
    menor = vetor[i];
    
    }
}
    System.out.println("O maior valor neste vetor é: " + maior);
    
    System.out.println ("O menor valor neste vetor é: " + menor);
    
    }
}
