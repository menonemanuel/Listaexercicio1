/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author emanuel.4966
 */
public class exx7 {
    public static void main (String[] args){
    int[] lista1 = {0,1,2,3,4};
    int[] lista2 = {6,7,8,9,10};

int tamanholista1 = 5;
int tamanholista2 = 5;
int listatotal = tamanholista1 + tamanholista2;

int[] listamesclada = new int [listatotal];

for(int i = 0; i < lista1.length; i++){
listamesclada[i] = lista1[i];
}
for(int i = 0; i < lista2.length; i++){
    listamesclada[lista1.length + i] = lista2[i];
}

System.out.println("Listamesclada");
for(int i = 0; i < listatotal; i++){
System.out.println(listamesclada[i]);

}
}
}

            

            
