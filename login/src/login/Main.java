package login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Usuário: ");
        String usuarioDigitado = sc.next();

        System.out.print("Senha: ");
        String senhaDigitada = sc.next();

        if (usuarioCorreto.equals(usuarioDigitado) && senhaCorreta.equals(senhaDigitada)) {
            System.out.println("Login efetuado com sucesso");
        } else {
            System.out.println("Credencias inválidas. Verifique");
        }

        System.out.println("Programa finalizado");
        sc.close();
    }
}
