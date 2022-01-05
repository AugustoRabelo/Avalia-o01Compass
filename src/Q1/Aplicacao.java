package Q1;

import java.util.Scanner;

public class Aplicacao {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String questao1 = "Quanto é 2+2?\na)4\nb)6\nc)22\nd)10";
        String questao2 = "Qual a cor do céu?\na)Azul\nb)Verde\nc)Roxo\nd)Branco";
        String questao3 = "Qual animal não é um mamífero?\na)Cachorro\nb)Golfinho\nc)Macaco\nd)Cobra";

        Quiz[] perguntas = {

                new Quiz(questao1, "a"), new Quiz(questao2, "a"), new Quiz(questao3, "d")

        };

        realizaPergunta(perguntas);

    }

    public static void realizaPergunta(Quiz[] perguntas) {
        Quiz quiz = new Quiz();
        System.out.println("Por favor, digite seu nome: ");
        quiz.setNomeUsuario(sc.nextLine());
        int acerto = 0;
        int erro = 0;
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i].getPergunta());
            String resposta = sc.next();
            if (resposta.equals(perguntas[i].getResposta())) {
                acerto++;
                System.out.println("Você acertou!");
            } else {
                erro++;
                System.out.println("Você errou!");
            }

            System.out.println(quiz.getNomeUsuario() + "\nAcertos: " + acerto + "\nErros: " + erro);
        }


    }

}
