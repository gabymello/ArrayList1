
package arrayexemplo07;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayExemplo07 {

    
    public static void main(String[] args) {
      ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add (10);     
        numeros.add (20);      
        numeros.add (30);      
        numeros.add (10);
        numeros.add (50);
        numeros.add (20);
       
        System.out.println("Lista original com duplicadas: ");
        for (int numero : numeros){
            System.out.println(numero  + "");
        }
        System.out.println();
        
        HashSet<Integer> numerosSemDuplicatas = new HashSet<>(numeros);
         ArrayList<Integer> listaSemDuplicatas = new ArrayList<>(numerosSemDuplicatas);
         
         System.out.println("Lista sem duplicatas:");
        for (int numero : listaSemDuplicatas) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
        
    
    

