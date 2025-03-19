
package arrayexemplo05;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayExemplo05 {

    
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");
        cidades.add("Porto Alegre");

        
        System.out.println("Lista de cidades:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("\nDigite o nome da cidade que você deseja substituir: ");
        String cidadeAntiga = scanner.nextLine();

        
        if (cidades.contains(cidadeAntiga)) {
            
            System.out.print("Digite o nome da nova cidade para substituir: ");
            String cidadeNova = scanner.nextLine();

            int index = cidades.indexOf(cidadeAntiga);
            cidades.set(index, cidadeNova);

           
            System.out.println("\nLista de cidades atualizada:");
            for (String cidade : cidades) {
                System.out.println(cidade);
            }
        } else {
            System.out.println("\nA cidade informada não está na lista.");
        }

       
        scanner.close();
    }
}



    

