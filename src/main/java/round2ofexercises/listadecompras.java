/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package round2ofexercises;

import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class listadecompras {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        int codigodoproduto;
        float valortotal;
        
        float produto1 = (float) 100;
        float produto2 = (float) 200;
        float produto3 = (float) 150;
        float produto4 = (float) 50;
        float produto5 = ( float) 250;
        
        String prod1 = "Minecraft";
        String prod2 = "Red Dead Redemption";
        String prod3 = "Overwatch";
        String prod4 = "The Witcher";    
        String prod5 = "GTA 5";
        
        System.out.println("----PRODUTOS-----");
        System.out.println("1 - " + prod1 + " R$ 100");
        System.out.println("2 - " + prod2 + " R$ 200");
        System.out.println("3 - " + prod3 + " R$ 150");
        System.out.println("4 - " + prod4 + " R$ 50");
        System.out.println("5 - " + prod5 + " R$ 250");
        
        System.out.println ("Escolha o produto que desejar: ");
        codigodoproduto = scanner.nextInt();
        
        if (codigodoproduto == 1){
            
            System.out.println("Informe a quantidade desejada de Minecraft");
            codigodoproduto =  scanner.nextInt();
                    
        }else if (codigodoproduto == 1){
            System.out.println("Informe a quantidade desejada de Red Dead Redemption");
            codigodoproduto =  scanner.nextInt();
            
        }else if (codigodoproduto == 2){
            System.out.println("Informe a quantidade desejada de Red Dead Redemption");
            codigodoproduto =  scanner.nextInt();
        
        }else if (codigodoproduto == 3){
           System.out.println("Informe a quantidade desejada de Overwatch");
           codigodoproduto =  scanner.nextInt();
        
        }else if (codigodoproduto == 4){
           System.out.println("Informe a quantidade desejada de The Witcher");
           codigodoproduto =  scanner.nextInt();
           
        
                   
                   
           
        
                
                
            }
        
         
    }
}
