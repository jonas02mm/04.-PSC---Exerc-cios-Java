import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número (ou zero/negativo para sair): ");
            double numero = scanner.nextDouble();

            if (numero <= 0) {
                break;
            }

            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);

            System.out.println("Número: " + numero);
            System.out.println("Quadrado: " + quadrado);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz quadrada: " + raizQuadrada);
        }

        scanner.close();
    }
}
