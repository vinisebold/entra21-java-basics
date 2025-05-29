package condicionais;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe sua Altura (m): ");
        double alturaPessoa = sc.nextDouble();
        System.out.print("Informe sua Massa Corporal (kg): ");
        double massaCorporal = sc.nextDouble();

        // Calculo IMC
        double IMC = massaCorporal / Math.pow(alturaPessoa, 2);

        // Determinar em qual segmento o IMC se encaixa
        if (IMC <= 16.9) {
            System.out.println("Muito abaixo do peso");
        } else if (IMC >= 17.0 && IMC <= 18.4) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Acima do peso");
        } else if (IMC >= 30.0 && IMC <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (IMC >= 35.0 && IMC <= 40.0) {
            System.out.println("Obesidade Grau II");
        } else if (IMC > 40.0) {
            System.out.println("Obesidade Grau III");
        } else {
            System.out.println("Valor do IMC fora dos padrões!");
        }

        // Fecha Scanner
        sc.close();
    }
}
