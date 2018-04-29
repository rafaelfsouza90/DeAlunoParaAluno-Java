
package aulas;
import java.util.Scanner;
public class Aula_18 {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        //input.next() - Lê até encontrar um espaço.
        //input.nextLine() - Lê até encontrar uma quebra de linha
        
        System.out.println("Qual a sua idade: ");
        int idade = input.nextInt();
    
        if(idade<1){
            System.out.println("Idade informada não é válida!"); 
        } else if (idade<18){
            System.out.println(nome + " é menor de idade!");
        } else if(idade>=18 && idade<=120){
                System.out.println(nome + " é maior de idade!");
        } else if (idade>120){
            System.out.println("Idade acima do limite humano!");
        }
            
        
    }
    
}
