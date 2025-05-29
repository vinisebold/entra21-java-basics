package switchcase;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        //Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Informe o código da condição de pagamento: ");
        int condicaoPagamento = sc.nextInt();
        System.out.print("Informe o valor da etiqueta: ");
        double valorEtiqueta = sc.nextDouble();

        //Processamento e Output
        switch (condicaoPagamento) {
            case 1:
                System.out.println("À vista em dinheiro ou cheque, recebe 10% de desconto");
                System.out.println("Total da compra: R$" + valorEtiqueta * 0.9);
                break;
            case 2:
                System.out.println("À vista no cartão de crédito, recebe 15% de desconto");
                System.out.println("Total da compra: R$" + valorEtiqueta * 0.85);
                break;
            case 3:
                System.out.println("Em duas vezes, preço normal de etiqueta sem juros");
                System.out.println("Total da compra: 2 parcelas de R$" + valorEtiqueta / 2);
                break;
            case 4:
                System.out.println("Em três vezes, preço normal de etiqueta mais juros de 10%");
                System.out.println("Total da compra: 3 parcelas de R$" + (valorEtiqueta * 1.1) / 3);
                break;
            default:
                System.out.println("Valor fora dos padrões! Programa cancelado!");
                System.exit(0);
        }
        // Fecha Scanner
        sc.close();
    }
}
