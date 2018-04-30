
package aulas;

public class Aula_23 {
    public static void main(String[]args){
        
        int i = 1;
        int j = 1;
        //O ciclo "do while" garante ao menos uma vez a execução do ciclo.
        
        do{
            System.out.println(i);
            ++i;
        }while(i<1);
        
        //O cliclo "while" pode ser que de início o ciclo não ocorra.
        while(j<1){
            System.out.println(j);
            ++i;
        }
    }
}
