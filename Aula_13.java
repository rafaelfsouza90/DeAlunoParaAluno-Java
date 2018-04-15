package aulas;
//Calculando a área de um circulo
import java.util.Scanner;
public class Aula_13{
    
    public static void main(String[]args){
        //Variável constante é atribuido com a palavra chave final e o valor não se altera.
        final double PI = 3.1416; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor do raio: ");
        double raio = input.nextDouble();
        
        //Calculando a area
        double area = raio * raio * PI;
        
        
        System.out.println("O valor da área é:" + area);
        
    }
    
    
}
