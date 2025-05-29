package condicionais;

import javax.swing.*;

public class IdadePessoa {
    public static void main(String[] args) {

        // Declaração de Variável e Entrada de dados
        int idadePessoa = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade:"));

        // Condicional
        if (idadePessoa >= 18 && idadePessoa <= 64) {
            JOptionPane.showMessageDialog(null, "Maior de idade");
        } else if (idadePessoa >= 64) {
            JOptionPane.showMessageDialog(null, "Idoso");
        } else {
            JOptionPane.showMessageDialog(null, "Menor de idade");
        }
    }
}
