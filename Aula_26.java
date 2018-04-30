package aulas;
import java.util.Scanner;

public class Aula_26{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 10: ");
        int numero = input.nextInt(); 
        
        int i=0;
        for(i=0;i<=10;++i){
             
            if(i == numero){
                System.out.println("O seu número é: " + i);
                //break; //Para a execução até encontrar o número digitado, terminando o ciclo. 
                       //Podemos utilizar no ciclo While, do while, for.
                
                
            }else{
                System.out.println("O seu número não é: " + i);
                //continue; Continuar a repetição do ciclo até encontrar o número digitado, e logo depois, executa as demais linhas
            }
            System.out.println("xxxxxxxxxxx");
        }
    }
}