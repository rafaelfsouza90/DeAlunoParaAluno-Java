
package aulas;
import java.util.Scanner;
public class Aula_21 {
    
    //Ano bissexto:
    //O ano é múltiplo de 400 OU se o ano for divisível por 4 a ao mesmo tempo não for divisivel por 100.
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um ano: ");
        int ano = input.nextInt();
        
        boolean x = (ano % 400==0) ||(ano % 4==0 && ano%100 !=0);
            System.out.println(x);
        
        /*
        if ((ano % 400==0) ||(ano % 4==0 && ano%100 !=0)){
            System.out.println("BISSEXTO");
        }else
            System.out.println("Não é BISSEXTO");
                */
        
            
            
            
        }
    }
}
