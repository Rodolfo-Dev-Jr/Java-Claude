package arrays;

public class Exercicio03 {
    public static void main(String[] args) {

        double soma = 0;
        double media = 0;

        double notas[] = {2.75, 4.5, 6.75, 8.5, 10.75};

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        media = (double) soma / notas.length;

        System.out.println(soma);
        System.out.println(media);

    }
    
}
