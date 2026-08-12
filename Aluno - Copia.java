public class Aluno {
    // Atributos
    private String nome;
    private int idade;
    private double nota;

    // Construtor
    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    // Método que exibe as informações do aluno na tela
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Última nota: " + nota);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        // Cadastro de pelo menos três alunos
        Aluno aluno1 = new Aluno("Ana Souza", 16, 8.5);
        Aluno aluno2 = new Aluno("Bruno Lima", 17, 7.0);
        Aluno aluno3 = new Aluno("Carla Mendes", 16, 9.2);

        // Exibição dos dados de cada aluno
        System.out.println("Lista de Presença - Turma do Professor Marcelo");
        System.out.println("=============================================");
        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
