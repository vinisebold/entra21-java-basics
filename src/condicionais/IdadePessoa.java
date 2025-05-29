package condicionais;

import javax.swing.*;

public class IdadePessoa {
    public static void main(String[] args) {

        // Declaração de Variável && Entrada de dados
        int idadePessoa = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade:"));

        // Processamento e Saida de dados
        if (idadePessoa >= 18 && idadePessoa <= 64) {
            JOptionPane.showMessageDialog(null, "Maior de idade");
        } else if (idadePessoa >= 64) {
            JOptionPane.showMessageDialog(null, "Idoso");
        } else {
            JOptionPane.showMessageDialog(null, "Menor de idade");
        }
    }
}
