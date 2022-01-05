package Q2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Login> logins = new ArrayList<>();

        logins.add(new Login("Danilo", "123"));
        logins.add(new Login("Daniela", "1234"));
        logins.add(new Login("Diana", "12345"));

        validaLogin(logins);

    }

    public static void validaLogin(List<Login> logins) {

        String login;
        String senha;

        System.out.println("Digite o login: ");
        login = sc.nextLine();

        System.out.println("Digite a senha: ");
        senha = sc.nextLine();

        for (Login login1 : logins) {
            if (login1.getUsuario().equals(login) && login1.getSenha().equals(senha)) {
                validaHorario();
                System.out.println("Login realizado com sucesso!");
                return;
            }
        }

        System.out.println("Login ou senha incorretos!");
    }

    public static void validaHorario() {

        LocalDateTime horario = LocalDateTime.now();

        int hora = horario.getHour();

        if (hora >= 6 && hora <= 11) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Bom dia!");
        }

    }
}
