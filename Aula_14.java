package aulas;
import java.util.Scanner;
public class Aula_14{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite o valor em gramas: ");
    int gramas = input.nextInt();
    
    //Operação de converção 
    int kilo = gramas / 1000;
    gramas = gramas % 1000; //O resto da divisão no caso 500
    
    System.out.println("O total de kilos é: " + kilo);
    System.out.println("O totalde gramas é: " + gramas);
        
    }
}