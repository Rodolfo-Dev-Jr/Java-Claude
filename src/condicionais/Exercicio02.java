package condicionais;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu peso?");
        double peso = scanner.nextDouble();

        System.out.println("Qual a sua altua?");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso ideal!");
        } else if (imc >=18.5 && imc <=24.9) {
            System.out.println("Peso normal!");
        } else if (imc >=25.0 && imc <=29.9) {
            System.out.println("Sobrepeso!");
        }else if (imc >=30) {
            System.out.println("Obesidade!");
        }

    }
    
}
