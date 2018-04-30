package aulas;
import java.util.Scanner;
import java.util.Random; //Classe permite a criação de um número inteiro aleatório.

public class Aula_25 {
    public static void main(String[]args){
    
        Scanner input = new Scanner (System.in);    
        Random random = new Random();
        
        boolean acertou = false; 
        int tentativas = 10; //Numero de tentativas do usuário
        int numeroSecreto = random.nextInt(); //Gerar o número aleatório através do objeto Random
        long chute = 0; //Variável vai conter o valor que o usuário estiver chutando.
        
        System.out.println(numeroSecreto);
        while(tentativas>0 && acertou == false){
            System.out.println("Qual o seu chute?");
            chute = input.nextLong();
            
            if(numeroSecreto == chute){
                System.out.println("Você acertou!");
                acertou = true;
            }else if(chute<numeroSecreto){
                --tentativas;
                    System.out.println("Número muito pequeno!\n" + tentativas + " Tentativas restantes");
                
            } else{
                --tentativas;
                    System.out.println("Número muito grande\n" + tentativas + " Tentativas restantes");
            
        }
        
        
    }
    
}
