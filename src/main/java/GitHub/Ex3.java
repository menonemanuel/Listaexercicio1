/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GitHub;

/**
 *
 * @author emanuel.4966
 */
public class Ex3 {
    public static void main(String args[]){
        int quantidadedeposi = 5, maior;
        
        int[] vetor = new int[quantidadedeposi];
        
        vetor[0] = 12;
        vetor[1] = 53;
        vetor[2] = 100;
        vetor[3] = 87;
        vetor[4] = 15;
        
        maior = vetor[0];
        for(int i = 0; i < vetor.length; i++){
        if(vetor[i] > maior) {
        maior = vetor[i];
            }
        }
        System.out.println("O maior valor neste vetor é: " + maior);
            //System.out.println(vetor[i]);
    }
}
