import java.util.Scanner;

public class ExB {
    private static final int MAX_ALUNOS = 5;
    private static final Aluno[] alunos = new Aluno[MAX_ALUNOS];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Imprimir um aluno");
            System.out.println("3 - Imprimir todos os alunos");
            System.out.println("4 - Alterar nota1");
            System.out.println("5 - Alterar nota2");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    imprimirAluno();
                    break;
                case 3:
                    imprimirTodosAlunos();
                    break;
                case 4:
                    alterarNota1();
                    break;
                case 5:
                    alterarNota2();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 6);
    }

    private static void cadastrarAluno() {
        for (int i = 0; i < MAX_ALUNOS; i++) {
            if (alunos[i] == null) {
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();
                alunos[i] = new Aluno(nome, i, i, i);
                System.out.print("Digite a nota1 do aluno: ");
                double nota1 = scanner.nextDouble();
                System.out.print("Digite a nota2 do aluno: ");
                double nota2 = scanner.nextDouble();
                alunos[i].setNota1(nota1);
                alunos[i].setNota2(nota2);
                System.out.println("Aluno cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível cadastrar o aluno. Vetor cheio.");
    }

    private static void imprimirAluno() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Média: " + aluno.calcularMedia());
                System.out.println();
            }
        }
    }

    private static void imprimirTodosAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Nota1: " + aluno.getNota1());
                System.out.println("Nota2: " + aluno.getNota2());
                System.out.println("Média: " + aluno.calcularMedia());
                System.out.println();
            }
        }
    }

    private static void alterarNota1() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Digite a nova nota1: ");
                double novaNota1 = scanner.nextDouble();
                aluno.setNota1(novaNota1);
                System.out.println(
                        "Nota1 alterada com sucesso para o aluno " + aluno.getNome() + ": " + aluno.getNota1());
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    private static void alterarNota2() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Digite a nova nota2: ");
                double novaNota2 = scanner.nextDouble();
                aluno.setNota2(novaNota2);
                System.out.println(
                        "Nota2 alterada com sucesso para o aluno " + aluno.getNome() + ": " + aluno.getNota2());
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

}
