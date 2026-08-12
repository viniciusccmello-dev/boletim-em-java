import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<aluno> alunos = new ArrayList<>();

            System.out.print("Quantos alunos deseja cadastrar? ");
            int quantidadeAlunos = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < quantidadeAlunos; i++) {
                System.out.println("\n--- Cadastro do aluno " + (i + 1) + " ---");

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Idade: ");
                int idade = Integer.parseInt(scanner.nextLine());

                System.out.print("Curso: ");
                String curso = scanner.nextLine();

                aluno a = new aluno(nome, idade, curso);

                String continuar = "s";
                while (continuar.equalsIgnoreCase("s")) {
                    System.out.print("Nome da matéria: ");
                    String nomeMateria = scanner.nextLine();

                    System.out.print("Nota em " + nomeMateria + ": ");
                    double nota = Double.parseDouble(scanner.nextLine());

                    a.adicionarMateria(nomeMateria, nota);

                    System.out.print("Deseja adicionar outra matéria? (s/n): ");
                    continuar = scanner.nextLine();
                }

                alunos.add(a);
            }

            System.out.println("\n\n########## LISTA DE ALUNOS ##########");
            for (aluno a : alunos) {
                a.exibirdados();
            }
        }
    }
}