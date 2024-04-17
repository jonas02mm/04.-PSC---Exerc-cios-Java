import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            System.out.println("Estou pensando em um número entre 1 e 100...");
            System.out.println("Tente adivinhar qual é!");

            int numeroSecreto = random.nextInt(100) + 1;
            int tentativas = 0;

            while (true) {
                System.out.print("Digite seu palpite: ");
                int palpite = scanner.nextInt();
                tentativas++;

                if (palpite < 1 || palpite > 100) {
                    System.out.println("Por favor, digite um número entre 1 e 100.");
                    continue;
                }

                if (palpite < numeroSecreto) {
                    System.out.println("Muito baixo. Tente novamente.");
                } else if (palpite > numeroSecreto) {
                    System.out.println("Muito alto. Tente novamente.");
                } else {
                    System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                    break;
                }
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            String jogarNovamente = scanner.next();
            if (!jogarNovamente.equalsIgnoreCase("s")) {
                scanner.close();
                break;
            }
            scanner.close();
        }
    }
}
