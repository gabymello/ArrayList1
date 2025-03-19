
package arrayexemplo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ArrayExemplo03 {

   
    public static void main(String[] args) {
       
        ArrayList<Integer> numeros = new ArrayList<>();
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++){
          int numeroAleatorio = random.nextInt(100) + 1; 
          numeros.add(numeroAleatorio);  
        }
        
         System.out.println("Numeros antes da ordenação: ");
         for (int numero : numeros){
             
         }
         System.out.println("");
         Collections.sort(numeros);
         
         System.out.println("Numeros apos a ordenação (crescente): ");
         for (int numero : numeros){
             System.out.println(numero + "");
  }
        System.out.println("");       
         
    }
    
}
