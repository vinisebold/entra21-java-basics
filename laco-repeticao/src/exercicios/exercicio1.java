package exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double[][] notasAlunos = new Double[1][3];
        String[] nomesAlunos = new String[2];

        for (int i = 0; i <= 3; i++) {
            System.out.print("Qual o nome do Aluno? ");
            nomesAlunos[i] = sc.nextLine();
            for (int j = 0; j <= 2; j++){
                System.out.print("Informe a nota" + j + ": " );
                notasAlunos[i][j] = sc.nextDouble();
            }
        }

    }
}
