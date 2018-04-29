package aulas;

import java.util.Scanner;

public class Aula_20{
    
    
    public static void main(String[]args){
    
        Scanner input = new Scanner (System.in);
        
        System.out.println("Insira um número inteiro: ");
        int numero = input.nextInt();
        
        if((numero%2 == 0) && numero<=20){ //== // Comparativo de Igualdade.
            System.out.println("Par menor ou igual a 20");
        } else if((numero%2 == 0) && numero>=20){
            System.out.println("Par maior ou igual a 20");
            }else if((numero%2 != 0) && numero<=100){ // != // Comparativo de Diferença.
                System.out.println("ímpar menor ou igual a 100");
                }else
                    System.out.println("Ímpar e maior que 100");
                    }
    }
    
    
}