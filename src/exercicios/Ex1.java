/*
1. Leia números do usuário até que a soma ultrapasse 1000 ou até que sejam digitados pelo menos 20
números. No final, mostre a quantidade de números digitados, a total e a média.
*/
package exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Declaração de variável
        double somaTotal = 0;
        int quantidadeNumeros = 0;

        // Entrada de dados e Processamento
        while (somaTotal < 1000 && quantidadeNumeros <= 10) {
            System.out.print("Digite um número: ");
            double numDigitado = sc.nextDouble();
            somaTotal += numDigitado;
            quantidadeNumeros++;
        }

        // Saida de dados
        System.out.println("Foi digitado: " + quantidadeNumeros + " de vezes");
        System.out.println("A soma total foi de: " + somaTotal);
        System.out.println("Média é de: " + (somaTotal / quantidadeNumeros));

        // Fecha Scanner
        sc.close();
    }
}