public class Materia {
    private final String nome;
    private final double nota;

    public Materia(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}