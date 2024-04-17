import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            System.out.println("Estou pensando em um número entre 1 e 100...");
            int numeroSecreto = random.nextInt(100) + 1;
            int tentativas = 0;

            while (true) {
                tentativas++;
                System.out.print("Tente adivinhar qual é! Digite seu palpite: ");
                try {
                    int palpite = Integer.parseInt(scanner.nextLine());
                    if (palpite < 1 || palpite > 100) {
                        throw new IllegalArgumentException("Palpite fora do intervalo válido (1 a 100)");
                    }

                    if (palpite < numeroSecreto) {
                        System.out.println("Muito baixo. Tente novamente.");
                    } else if (palpite > numeroSecreto) {
                        System.out.println("Muito alto. Tente novamente.");
                    } else {
                        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite um número válido.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.print("Gostaria de jogar novamente? (s/n): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                System.out.println("Obrigado por jogar! Até a próxima.");
                break;
            }
        }

        scanner.close();
    }
}
