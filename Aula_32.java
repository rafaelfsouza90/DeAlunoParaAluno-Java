package aulas;

public class Aula_32 {
    public static void main(String[]args){
        
        int i;
        int[] x = new int[5];
        //int[] x = {1,2,3,4,5,6,7,8,9} //Os valores podem ser expecifícados dessa maneira também.
        
        java.util.Arrays.fill(x, 2, 3, 20);
        //Permite especificar um valor qu eu quero jogar em todos os membros do vetor ou determinada banda.
        
        for(i=0; i<x.length; ++i){
            System.out.println(x[i]);
        }
    }
    
}
