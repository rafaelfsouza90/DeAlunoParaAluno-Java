package aulas;
import java.util.Scanner;
public class Aula_11 {
 
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        //variáveis
        double base;
        double altura;
        double areaRetangulo;
        
        System.out.println("Informe o valor da base:");
        base = input.nextDouble();
        
        System.out.println("Informe o valor da altura:");
        altura = input.nextDouble();
        
        //calculando a área do retângulo
        areaRetangulo = base * altura;
        
        System.out.print("A area do retangulo de base = " + base);
                System.out.print(" e altura = " + altura);
System.out.println(" é: " + areaRetangulo);
    }
    
}
