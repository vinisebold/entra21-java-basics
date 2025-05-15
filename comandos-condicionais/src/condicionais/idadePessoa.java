package condicionais;

import javax.swing.*;

public class idadePessoa {
    public static void main(String[] args) {

        int idadePessoa = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade:"));

        if (idadePessoa >= 18 && idadePessoa <= 64) {
            JOptionPane.showMessageDialog(null, "Maior de idade");
        } else if (idadePessoa >= 64) {
            JOptionPane.showMessageDialog(null, "Idoso");
        } else {
            JOptionPane.showMessageDialog(null, "Menor de idade");
        }

    }
}
