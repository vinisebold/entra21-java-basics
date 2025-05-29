/*3. Leia pares de números inteiros até que a soma do primeiro seja maior que 100 e o segundo seja menor
que −50, ou até que o número total de pares lidos seja 30. No final, imprima quantos pares foram lidos e
a média do primeiro número dos pares. */
package exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        // Declaração de variáveis
        int somaNumero1 = 0, somaNumero2 = 0, qntdVezes = 0;

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Processamento
        while (somaNumero1 <= 100 && somaNumero2 >= -50 && qntdVezes < 30){
            System.out.print("Informe o número do 1° par: ");
            int aux1 = sc.nextInt();
            somaNumero1 += aux1;

            System.out.println("Informe o número o 2° par: ");
            int aux2 = sc.nextInt();
            somaNumero2 += aux2;

            qntdVezes++;
        }

        // Saida de dados




    }
}