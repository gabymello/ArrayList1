
package arrayexemplos11;

import java.util.ArrayList;


public class ArrayExemplos11 {

   
    public static void main(String[] args) {
        
        ArrayList<Double> numerosDecimais = new ArrayList<>();
        numerosDecimais.add(10.5);
        numerosDecimais.add(20.3);
        numerosDecimais.add(5.75);
        numerosDecimais.add(3.2);
        numerosDecimais.add(7.8);

 
        double soma = 0;

       
        for (Double numero : numerosDecimais) {
            soma += numero;
        }

        
        System.out.println("Soma de todos os números decimais: " + soma);
    }
}
