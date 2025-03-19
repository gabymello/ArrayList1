package arrayexemplo14;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExemplo14 {

    public static void main(String[] args) {

       
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            // Exibe o menu
            System.out.println("\n----- Menu -----");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("Digite a descrição da tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso.");
                    break;

                case 2:

                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para remover.");
                    } else {
                        System.out.println("Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + 1 + ". " + tarefas.get(i));
                        }
                        System.out.print("Escolha o número da tarefa a remover: ");
                        int tarefaRemover = scanner.nextInt();
                        if (tarefaRemover > 0 && tarefaRemover <= tarefas.size()) {
                            tarefas.remove(tarefaRemover - 1);
                            System.out.println("Tarefa removida com sucesso.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 3:
                    // Listar tarefas
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas cadastradas.");
                    } else {
                        System.out.println("Lista de Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + 1 + ". " + tarefas.get(i));
                        }
                    }
                    break;

                case 4:
                    // Sair do programa
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
