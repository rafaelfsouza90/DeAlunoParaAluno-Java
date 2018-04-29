
package aulas;
import java.util.Scanner;

public class Aula_17 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o seu primeiro nome: ");
        String primeiroNome = input.next();
        
        System.out.println("Qual o seu ultimo nome: ");
        String ultimoNome = input.next();
        
        System.out.println("Qual a sua idade: ");
        int idade = input.nextInt();
        System.out.println("Nome completo: " + primeiroNome + " " + ultimoNome + "\nIdade: " + idade); 
    }
    
}
