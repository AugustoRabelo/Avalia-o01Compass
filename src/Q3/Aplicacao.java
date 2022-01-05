package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

    static Scanner sc = new Scanner(System.in);

    public static double calculaBonificacao(Funcionario funcionario) {
        double bonificacao = 0;

        if (funcionario.getSalario() > 0) {

            if (funcionario.getSalario() <= 1000) {
                bonificacao = funcionario.getSalario() * 1.2;

            } else if (funcionario.getSalario() > 1000 && funcionario.getSalario() <= 2000) {
                bonificacao = funcionario.getSalario() * 1.1;

            } else if (funcionario.getSalario() > 2000) {
                bonificacao = funcionario.getSalario() * 0.9;
            }
        }

        return bonificacao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salario);
        funcionarios.add(funcionario);

        System.out.println("O salario do funcionario " + funcionario.getNome() + " é de: " + funcionario.getSalario());
        System.out.println("A bonificacao do funcionario " + funcionario.getNome() + " é de: " + calculaBonificacao(funcionario));

        System.out.println("Lista de funcionarios: ");
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + " Salario: " + f.getSalario());
        }
    }
}