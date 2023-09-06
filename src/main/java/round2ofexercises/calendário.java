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
public class calendário {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        int jan = 31;
        int fev = 28;
        int mar = 31;
        int abril = 30;
        int maio =31;
        int jun = 30;
        int jul = 31;
        int agos = 31;
        int set = 30;
        int out = 31;
        int nov = 30;      
        int dez = 31;  
        int ano, mes;
        
        System.out.println("Insira o ano: ");
        ano = scanner.nextInt();
        
        
        System.out.println("Informe o mês");
        System.out.println("1- JANEIRO");
        System.out.println("2- FEVEREIRO");
        System.out.println("3- MARÇO");
        System.out.println("4- ABRIL");
        System.out.println("5- MAIO");
        System.out.println("6- JUNHO");
        System.out.println("7- JULHO");
        System.out.println("8- AGOSTO");
        System.out.println("9- SETEMBRO");
        System.out.println("10- OUTUBRO");
        System.out.println("11- NOVEMBRO");
        System.out.println("12- DEZEMBRO");
        
        
        float num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12;
        
        System.out.println("Insira o mes: ");
        mes = scanner.nextInt();
        
        if (mes == 1){
            mes = jan = 31;
            System.out.println("No ano de: " + ano + " o mês de Janeiro tem: " + mes + " dias");
        
        }else if (mes == 2){
            System.out.println("No ano de: " + ano + " o mês de Fevereiro tem: " + mes + " dias");
        fev = scanner.nextInt();
            
        }else if (mes == 3){  
            System.out.println("No ano de: " + ano + " o mês de Março tem: " + mes + " dias");
        mar = scanner.nextInt();
            
        }else if (mes == 4){  
            System.out.println("No ano de: " + ano + " o mês de Abril tem: " + mes + " dias");
        abril = scanner.nextInt();
        }else if (mes == 5){  
            System.out.println("No ano de: " + ano + " o mês de Maio tem: " + mes + " dias");
        maio = scanner.nextInt();
        }else if (mes == 6){  
            System.out.println("No ano de: " + ano + " o mês de Junho tem: " + mes + " dias");
        jun = scanner.nextInt();
            
        }else if (mes == 7){  
            System.out.println("No ano de: " + ano + " o mês de Julho tem: " + mes + " dias");
        jul = scanner.nextInt();
            
            }else if (mes == 8){  
            System.out.println("No ano de: " + ano + " o mês de Agosto tem: " + mes + " dias");
        agos = scanner.nextInt();
                
            }else if (mes == 9){  
            System.out.println("No ano de: " + ano + " o mês de Setembro tem: " + mes + " dias");
        set = scanner.nextInt();   
        
            }else if (mes == 10){  
            System.out.println("No ano de: " + ano + " o mês de Outubro tem: " + mes + " dias");
        out = scanner.nextInt();
        
            }else if (mes == 11){  
            System.out.println("No ano de: " + ano + " o mês de Novembro tem: " + mes + " dias");
            
        nov = scanner.nextInt();
            }else if (mes == 12){  
            System.out.println("No ano de: " + ano + " o mês de Dezembro tem: " + mes + " dias");
            
        dez = scanner.nextInt();  
        }
    }
}
