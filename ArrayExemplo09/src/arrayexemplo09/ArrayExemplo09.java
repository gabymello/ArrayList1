
package arrayexemplo09;

import java.util.ArrayList;


public class ArrayExemplo09 {

   
    public static void main(String[] args) {
          ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gaby");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Carlos");

        
        ArrayList<String> nomesCopia = new ArrayList<>(nomes);

       
        System.out.println("ArrayList original (nomes): " + nomes);

       
        System.out.println("ArrayList copiado (nomesCopia): " + nomesCopia);
    }
}
        
        
    
    

