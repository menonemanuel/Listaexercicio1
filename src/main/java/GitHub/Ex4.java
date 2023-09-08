/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GitHub;

/**
 *
 * @author emanuel.4966
 */
public class Ex4 {
    public static void main(String args[]){
        String nome;
        
        nome = "Emanuel";
        int totalCaracteres = 0;
        
       for(int i = 0; i < nome.length(); i ++){
           if(nome.charAt(i) != ' '){
               totalCaracteres++;
           }
       }
//       System.out.println(nome.charAt(0));
        System.out.println(totalCaracteres);
        
    }
}
