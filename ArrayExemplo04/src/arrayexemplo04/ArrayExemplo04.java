
package arrayexemplo04;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExemplo04 {

   
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        
        produtos.add ("Café");
        produtos.add ("Arroz");
        produtos.add ("Feijão");
        produtos.add ("Açúcar");
        produtos.add ("Macarrão");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o produto para pesquisar: ");
        String produtoPesquisado = scanner.nextLine();
     if (produtos.contains(produtoPesquisado)) {
            System.out.println("Produto encontrado: " + produtoPesquisado);
        } else {
            System.out.println("Produto não encontrado.");
        }

       
        scanner.close();
    }    
    }
    
