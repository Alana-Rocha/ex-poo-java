public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", media=" + calcularMedia() +
                '}';
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return this.nome.compareTo(outroAluno.getNome());
    }

}
