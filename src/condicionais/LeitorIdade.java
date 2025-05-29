package condicionais;

import javax.swing.*;

public class LeitorIdade {
    public static void main(String[] args) {

        // Declaração de Variável e Entrada de dados
        int idadePessoa = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade:"));

        // Processamento e Saida
        if (idadePessoa < 17) {
            JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
        } else if (idadePessoa >= 18 && idadePessoa <= 65) {
            JOptionPane.showMessageDialog(null, "Eleitor facultativo");
        } else {
            JOptionPane.showMessageDialog(null, "Não eleitor");
        }
    }
}
