import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int killsTotal = 0;
        int deathsTotal = 0;
        int assistsTotal = 0;

        while (true) {
            System.out.println("Digite o número de kills, deaths e assists da rodada (ou digite -1 para sair):");
            System.out.print("Kills: ");
            int killsRodada = scanner.nextInt();
            if (killsRodada == -1) break;

            System.out.print("Deaths: ");
            int deathsRodada = scanner.nextInt();
            if (deathsRodada == -1) break;

            System.out.print("Assists: ");
            int assistsRodada = scanner.nextInt();
            if (assistsRodada == -1) break;

            killsTotal += killsRodada;
            deathsTotal += deathsRodada;
            assistsTotal += assistsRodada;

            System.out.println("Kills total: " + killsTotal);
            System.out.println("Deaths total: " + deathsTotal);
            System.out.println("Assists total: " + assistsTotal);

            if (killsTotal <= 5) {
                System.out.println("Noob");
            } else if (killsTotal >= 20) {
                System.out.println("Master");
            }

            if (deathsTotal >= 20) {
                System.out.println("Houston, we have a problem");
            }

            if (assistsTotal >= 20) {
                System.out.println("Team work");
            }
        }

        scanner.close();
    }
}
