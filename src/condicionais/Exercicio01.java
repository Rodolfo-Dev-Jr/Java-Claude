package condicionais;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor da compra?");
        double valorCompra = scanner.nextDouble();

        System.out.println("Qual o valor pago?");
        double valorPago = scanner.nextDouble();

        double troco = valorPago - valorCompra;

        if (valorPago < valorCompra) {
            System.out.println("O valor pago é insuficiente! Pague R$" + (valorCompra - valorPago));
        } else {
            System.out.println("O troco é R$" + troco);
        }

    }
    
}
