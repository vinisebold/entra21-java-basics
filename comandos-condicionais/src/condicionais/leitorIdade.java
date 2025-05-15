package condicionais;

import javax.swing.*;

public class leitorIdade {
    public static void main(String[] args) {

        int idadePessoa = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua idade:"));

        if (idadePessoa < 17) {
            JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
        } else if (idadePessoa >= 18 && idadePessoa <= 65) {
            JOptionPane.showMessageDialog(null, "Eleitor facultativo");
        } else {
            JOptionPane.showMessageDialog(null, "Não eleitor");
        }
    }
}
