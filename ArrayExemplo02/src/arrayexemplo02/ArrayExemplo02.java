
package arrayexemplo02;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayExemplo02 {

    
    public static void main(String[] args) {
       
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add ("Ana");
        nomes.add ("Carlos");
        nomes.add ("Bruna");
        nomes.add ("Daniel");
        nomes.add ("Eduardo");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome que você quer remover");
        String nomeParaRemover = scanner.nextLine();
        
       if (nomes.contains(nomeParaRemover)) {
            nomes.remove(nomeParaRemover); 
            System.out.println("Nome removido com sucesso.");
        } else {
            System.out.println("Nome não encontrado na lista.");
        }
         
        System.out.println("Lista atualizada");
        for (String nome : nomes);
       
        
       scanner.close();
    }
}




