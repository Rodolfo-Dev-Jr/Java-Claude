package variaveis;

public class Exercicio04 {
    public static void main(String[] args) {

        int totalAlunos = 17;
        int alunosPorSala = 5;
        int salasNecessarias = totalAlunos / alunosPorSala;
        double salasComDecimal = (double) totalAlunos / alunosPorSala;

        System.out.println(salasComDecimal);

    }
}
