
package arrayexemplo06;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayExemplo06 {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas palavras você deseja inserir? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();  

      
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            String palavra = scanner.nextLine();
            palavras.add(palavra); 
        }

        
        System.out.print("Digite uma palavra para contar quantas vezes ela aparece: ");
        String palavraParaContar = scanner.nextLine();

      
        int contagem = 0;
        for (String palavra : palavras) {
            if (palavra.equals(palavraParaContar)) {
                contagem++;
            }
        }
        
        System.out.println("A palavra '" + palavraParaContar + "' aparece " + contagem + " vezes na lista.");

        scanner.close();
    }
}


