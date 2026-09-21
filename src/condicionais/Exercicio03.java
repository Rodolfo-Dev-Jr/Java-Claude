package condicionais;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua nota? (de 0 a 10)");
        double nota = scanner.nextDouble();

        System.out.println("QUal a sua frequência? (de 0% a 100%)");
        double frequencia = scanner.nextDouble();

        if (nota == 10 || frequencia == 100) {
            System.out.println("Aprovado com honra!");
        } else if (frequencia < 75) {
            System.out.println("Reprovado!");
        } else if (nota >=7) {
            System.out.println("Aprovado direto!");
        } else if (nota >=5 && nota <= 6.9) {
            System.out.println("Aprovado, precisa fazer prova final!");
        } else if(nota <5) {
            System.out.println("Reprovado por nota!");
        }

    }
}
