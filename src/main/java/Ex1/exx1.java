/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author emanuel.4966
 */
public class exx1 {
     int[] numeros = new int[5];
     
    public static void main(String args[]){
 
      int[] numeros = new int[5];
              
        numeros[0] = 10;
        numeros[1] = 10;
        numeros[2] = 10;
        numeros[3] = 10;
        numeros[4] = 10;

        int soma = 0;
        for(int i = 0; i < 5; i++){
        soma = soma + numeros[i]; 
    }
        System.out.println(soma);
      }
}
              
            
