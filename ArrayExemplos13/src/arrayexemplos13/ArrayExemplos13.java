
package arrayexemplos13;

import java.util.ArrayList;

public class ArrayExemplos13 {

  
    public static void main(String[] args) {
  
        // Cria o primeiro ArrayList com cinco números inteiros
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(10);
        lista1.add(20);
        lista1.add(30);
        lista1.add(40);
        lista1.add(50);

       
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(60);
        lista2.add(70);
        lista2.add(80);
        lista2.add(90);
        lista2.add(100);

       
        ArrayList<Integer> listaFinal = new ArrayList<>(lista1);
        listaFinal.addAll(lista2);

        
        System.out.println("ArrayList com todos os elementos: " + listaFinal);
    }
}

    
    

