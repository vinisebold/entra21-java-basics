package Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaração de variáveis
        String nomePessoa;
        int idadePessoa;
        float horasTrabalhadas, valorHora;
        double salarioTotal;
        boolean demitido = false;

        // Entrada de dados utilizando scanner pela primeira vez
        Scanner sc = new Scanner(System.in);

        // Entrada de Dados
        System.out.print("Informe o seu nome....... :");
        nomePessoa = sc.nextLine();
        System.out.print("Informe a sua idade.......: ");
        idadePessoa = sc.nextInt();
        System.out.print("Informe horas trabalhadas.: ");
        horasTrabalhadas = sc.nextFloat();
        System.out.print("Informe o valor hora......: ");


        // Processamento de dados

        // Saída de dados
        System.out.println("Nome.....: " + nomePessoa);
        System.out.println("Idade....: " + idadePessoa);
        System.out.println("Horas trabalhadas: ");
        sc.close();
    }

}


