package SwitchCase;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        //Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Cargos: ");
        System.out.println("1 - Serviços Gerais   2 - Vigia");
        System.out.println("3 - Recepcionista     4 - Vendedor\n");

        int cargoPessoa = sc.nextInt();
        System.out.print("Informe seu salário: ");
        double vlrSalarioPessoa = sc.nextDouble();
        double vlrAbono = 0;

        //Processamento e Output
        switch (cargoPessoa) {
            case 1:
                vlrAbono = vlrSalarioPessoa * 0.50;
                System.out.println("Cargo: Serviços Gerais\nAumento: 50%\nSalário novo: R$" + (vlrSalarioPessoa + vlrAbono));
                break;
            case 2:
                vlrAbono = vlrSalarioPessoa * 0.30;
                System.out.println("Cargo: Vigia\nAumento: 30%\nSalário novo: R$" + (vlrSalarioPessoa + vlrAbono));
                break;
            case 3:
                vlrAbono = vlrSalarioPessoa * 0.25;
                System.out.println("Cargo: Recepcionista\nAumento: 25%\nSalário novo: R$" + (vlrSalarioPessoa + vlrAbono));
                break;
            case 4:
                vlrAbono = vlrSalarioPessoa * 0.15;
                System.out.println("Cargo: Vendedor\nAumento: 15%\nAbono: R$:" + vlrAbono + "\nSalário novo: R$" + (vlrSalarioPessoa + vlrAbono));
                break;
        }
        sc.close();
    }
}
