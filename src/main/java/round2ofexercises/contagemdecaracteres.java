/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package round2ofexercises;

/**
 *
 * @author emanuel.4966
 */
public class contagemdecaracteres {
   public static void main (String[] args){
       
       System.out.println("Digite uma palavra: ");
       String texto = new Scanner (System.in).nextLine();
       
       int numCaracteres = 0;
       
       for(int i = 0; i < texto.length(); i++)
           if(texto.charAt(i) != ''){
       numCaracteres++;
       
   }
   }
   System.out.println("A palavra/frase " + texto + "possui " );
}
