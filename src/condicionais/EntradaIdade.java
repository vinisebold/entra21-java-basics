package condicionais;

import javax.swing.*;
import java.util.Scanner;

public class EntradaIdade {
    public static void main(String[] args) {

        // Scanner sc
        Scanner sc = new Scanner(System.in);

        // Declaração variável
        int idadePessoa;

        // Entrada de dados
        System.out.println("Informe a idade da pessoa");
        idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));

        // Condicional
        if (idadePessoa >= 18) {
            JOptionPane.showConfirmDialog(null, "Entrada Liberada!");
            System.out.println("Entrada liberada");
        } else {
            JOptionPane.showConfirmDialog(null, "Entrada não permitida!");
            System.out.println("Entrada não permitida!");
        }

    }
}
