import java.util.ArrayList;

public class aluno {
    private final String nome;
    private final int idade;
    private final String curso;
    private final ArrayList<Materia> materias;

    public aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.materias = new ArrayList<>();
    }

    public void adicionarMateria(String nomeMateria, double nota) {
        materias.add(new Materia(nomeMateria, nota));
    }

    public double calcularMedia() {
        double soma = 0;
        for (Materia m : materias) {
            soma += m.getNota();
        }
        return soma / materias.size();
    }

    public void exibirdados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("---------------------------------------------");
        System.out.printf("%-25s | %s%n", "Mat?ria", "Nota");
        System.out.println("---------------------------------------------");
        for (Materia m : materias) {
            System.out.printf("%-25s | %.2f%n", m.getNome(), m.getNota());
        }
        System.out.println("---------------------------------------------");
        System.out.printf("M?dia final: %.2f%n", calcularMedia());
        System.out.println("=============================================");
    }
}
