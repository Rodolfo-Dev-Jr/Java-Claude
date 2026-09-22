package loops;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = -1;
         int soma = 0;

        while (numero != 0) {
            System.out.println("Digite um numero (0 encerra):");
            numero = scanner.nextInt();
            System.out.println("O numero digitado é : " + numero);

           soma = soma + numero;

        }
        
        System.out.println("A soma total foi: " + soma);

    }
    
}
