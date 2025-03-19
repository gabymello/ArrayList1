
package arrayexemplo08;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayExemplo08 {

   
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");
        lista.add("Elemento 5");
        lista.add("Elemento 6");

        // Exibindo a lista na ordem original
        System.out.println("Ordem Original:");
        for (String item : lista) {
            System.out.println(item);
        }

      
        Collections.reverse(lista);

        
        System.out.println("\nOrdem Inversa:");
        for (String item : lista) {
            System.out.println(item);
        }
    }
}

    
    

