public class ExA {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("João", 123, 8.5, 7.0);
        Aluno aluno2 = new Aluno("Maria", 456, 9.0, 8.0);

        System.out.println("Informações do Aluno 1:");
        System.out.println(aluno1);

        System.out.println("Informações do Aluno 2:");
        System.out.println(aluno2);

        int resultadoComparacao = aluno1.compareTo(aluno2);
        if (resultadoComparacao < 0) {
            System.out.println(
                    "O aluno " + aluno1.getNome() + " vem antes de " + aluno2.getNome() + " na ordem alfabética.");
        } else if (resultadoComparacao > 0) {
            System.out.println(
                    "O aluno " + aluno2.getNome() + " vem antes de " + aluno1.getNome() + " na ordem alfabética.");
        } else {
            System.out.println("Os alunos têm o mesmo nome.");
        }
    }
}
