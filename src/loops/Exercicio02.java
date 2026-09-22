package loops;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i<= n; i++) {
            soma = soma + i;
        }
    
        System.out.println("A soma de 1 até " + n + " é " + soma);
    }
    
}
