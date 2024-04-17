import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int produtoImpares = 1;
        int somaPares = 0;

        while (true) {
            System.out.print("Digite um número (ou 0 para sair): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                produtoImpares *= numero;
            }
        }

        System.out.println("Produto dos números ímpares: " + produtoImpares);
        System.out.println("Soma dos números pares: " + somaPares);

        scanner.close();
    }
}
