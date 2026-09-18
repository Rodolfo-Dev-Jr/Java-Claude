package variaveis;

public class Exercicio05 {
    public static void main(String[] args) {

        int totalAlunos = 17;
        int alunosPorSala = 5;
        int alunosRestantes = totalAlunos % alunosPorSala;
        boolean turmaCompleta = (alunosRestantes == 0);
        
        System.out.println(turmaCompleta);

    }

}
