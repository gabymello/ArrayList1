
package arrayexemplo01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExemplo01 {

    
    public static void main(String[] args) {
     // Cria um ArrayList para armazenar números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        
        
        // Cria um ArrayList para armazenar números inteiros
        Scanner scanner = new Scanner(System.in);
        
        
        // Solicita ao usuário que insira 5 números inteiros
        System.out.println("Digite 5 números inteiros:");
        
        
         // Loop para adicionar 5 números ao ArrayList
        for (int i = 0; i < 5; i++){
            System.out.println("Número " + (i + 1 ) + ":");
            int numero = scanner.nextInt();

            numeros.add(numero);
        }
         //chamar o array
        System.out.println(numeros);
        
        

    
        scanner.close();
    }
    
}
