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

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salario);
        funcionarios.add(funcionario);

        System.out.println("O salário do funcionário " + funcionario.getNome() + " é de: " + funcionario.getSalario());
        System.out.println("O salário atualizado do funcionário " + funcionario.getNome() + " é de: " + calculaBonificacao(funcionario));

        System.out.println("Lista de funcionários: ");
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + " Salário: " + calculaBonificacao(funcionario));
        }
    }
}
