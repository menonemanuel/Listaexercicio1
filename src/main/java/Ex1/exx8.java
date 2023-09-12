/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author emanuel.4966
 */
public class exx8 {
    public static void main (String[] args){
        
    int [] elementos = {20, 40, 10, 5, 60, 90, 70};
    int indicem;
    
    for(int indice = 0; indice < elementos.length; indice++){
        
        indicem = indice;
        for(int j = indice; j < elementos.length; j++){
            if (elementos[j] < elementos[indicem]){
                indicem = j;
            }     
        }
        
        int segura = elementos[indice];
        elementos[indice] = elementos[indicem];
        elementos[indicem] = segura;
        
    }
    
    for(int indice = 0; indice < elementos.length; indice++){
        System.out.println(elementos[indice]);
    }
}
}
