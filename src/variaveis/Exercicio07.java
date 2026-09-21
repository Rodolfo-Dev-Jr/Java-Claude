package variaveis;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor da compra?");
        double valorCompra = scanner.nextDouble();
        
        System.out.println("Quanto o cliente pagou?");
        double valorPago = scanner.nextDouble();

        double troco = valorPago - valorCompra;

        System.out.println("O Troco é: R$" + troco);

    }
    
}
