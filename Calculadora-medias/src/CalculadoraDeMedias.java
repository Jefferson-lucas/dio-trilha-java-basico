import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) throws Exception {

        try {

            Scanner scan = new Scanner(System.in);
            String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

            double media = calculadoraMediaDaTurma(alunos, scan);

            System.out.printf("Média da turma %.1f", media);
        }catch (InputMismatchException e) {
            System.out.printf("A nota deve ser um numérico");
        }
    }

    public static double calculadoraMediaDaTurma(String[] alunos, Scanner scanner){

        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();

            soma += nota;
        }

        return soma/alunos.length;

    }
}
