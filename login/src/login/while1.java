package login;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean fimPrograma = false;

        do {
            int contaVezes = 1, somaValor = 0;
            while (contaVezes <= 10) {
                somaValor++;
                contaVezes++;
            }
            System.out.println("O valor da soma é: " + somaValor);
            System.out.println("Deseja sair do programa(Sim/Nao)? ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("sim")){
                fimPrograma = true;
            }

        } while (!fimPrograma);

    }
}
