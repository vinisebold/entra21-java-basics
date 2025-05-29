/* 2. Leia números inteiros positivos do usuário até que ele digite um número que já tenha sido informado
antes (sem usar estruturas prontas para verificação). Calcule e imprima a média dos números únicos
digitados. */
package exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // Declaração variável
        int[] listaNumeros = new int[100];
        int somaNumeros = 0;
        int quantidadeNumeros = 0;
        boolean numeroRepetido = false;

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados e processamento
        while (!numeroRepetido) {
            System.out.print("Informe o número: ");
            int numeroInformado = sc.nextInt();
            boolean numeroConflito = false;

            for (int listaNumero : listaNumeros) {
                if (listaNumero == numeroInformado) {
                    numeroConflito = true;
                    break;
                }
            }
            if (numeroConflito) {
                numeroRepetido = true;
                System.out.println("Numero repetido!\n");
            } else {
                listaNumeros[quantidadeNumeros] = numeroInformado;
                somaNumeros += listaNumeros[quantidadeNumeros];
                quantidadeNumeros++;
            }
        }

        // Saida de dados
        System.out.println("Média dos números únicos: " + ((double)somaNumeros / (quantidadeNumeros)));

        // Fecha Scanner
        sc.close();
    }
}