
package arrayexemplo15;

import java.util.ArrayList;

public class ArrayExemplo15 {

    public static void main(String[] args) {
     



        ArrayList<Aluno> alunos = new ArrayList<>();

       
        alunos.add(new Aluno("Gaby", 8.5));
        alunos.add(new Aluno("Bruno", 7.0));
        alunos.add(new Aluno("Lili", 9.2));
        alunos.add(new Aluno("alexandre", 6.3));

        
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            aluno.exibirAluno();
        }

     
        double somaNotas = 0;
        for (Aluno aluno : alunos) {
            somaNotas += aluno.getNota();
        }

        double media = somaNotas / alunos.size();

        
        System.out.println("Média das notas: " + media);
    }
}

    
    

