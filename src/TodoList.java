import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String title;
}

public class TodoList {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        int option = 0;

        while(option != 4){

            System.out.println("\n=== SISTEMA DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Sair");

            System.out.print("Escolha: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1){

                System.out.print("Digite a tarefa: ");
                String title = scanner.nextLine();

                Task task = new Task();
                task.title = title;

                tasks.add(task);

                System.out.println("Tarefa adicionada!");

            }

            else if(option == 2){

                System.out.println("\nTarefas:");

                for(int i = 0; i < tasks.size(); i++){
                    System.out.println(i + " - " + tasks.get(i).title);
                }

            }

            else if(option == 3){

                System.out.print("Digite o número da tarefa para remover: ");
                int index = scanner.nextInt();

                if(index >= 0 && index < tasks.size()){
                    tasks.remove(index);
                    System.out.println("Tarefa removida!");
                } else {
                    System.out.println("Tarefa inválida!");
                }

            }

        }

        System.out.println("Sistema encerrado.");
    }
}