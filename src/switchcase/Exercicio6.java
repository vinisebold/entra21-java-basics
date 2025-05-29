package switchcase;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Declaração de Variáveis e Entrada de Dados
        System.out.print("Informe a nota 1");
        double notaInf1 = sc.nextDouble();
        System.out.print("Informe a nota 2");
        double notaInf2 = sc.nextDouble();
        System.out.print("Informe a nota 3");
        double notaInf3 = sc.nextDouble();

        // Calculo Média
        double mediaCalculada = (notaInf1 + notaInf2 + notaInf3) / 3;

        // Processamento
        var conceitoAluno = 'A';
        if (mediaCalculada >= 8) {
            conceitoAluno = 'A';
        } else if (mediaCalculada >= 6 && mediaCalculada <= 7.99) {
            conceitoAluno = 'B';
        } else {
            conceitoAluno = 'C';
        }

        // Output
        switch (conceitoAluno) {
            case 'A':
                System.out.println("Aprovado");
                break;
            case 'B':
                System.out.println("Em exame");
                break;
            case 'C':
                System.out.println("Reprovado");
                break;

        }

        // Fecha Scanner
        sc.close();
    }
}
