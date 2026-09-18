package variaveis;

public class Exercicio03 {
    public static void main(String[] args) {

        int totalMinutos = 130;
        int minutosRestantes = totalMinutos % 60;
        int horas = totalMinutos / 60;

        System.out.println(totalMinutos + " minutos equivalem a " + horas + " horas e " + minutosRestantes + " minutos.");


    }
}
