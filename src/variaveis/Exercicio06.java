package variaveis;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos há na turma? ");
        int alunos = scanner.nextInt();
        System.out.println("Tem " + alunos + " alunos na turma.");

        System.out.println("Quantos alunos cabem por sala?");
        int alunosPorSala = scanner.nextInt();
        System.out.println("Cabem " + alunosPorSala + " por sala.");

        int alunosRestantes = alunos % alunosPorSala;
        boolean turmaCompleta = (alunosRestantes == 0);

        System.out.println("A turma está completa? " + turmaCompleta);

    }
}
