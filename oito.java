import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A (número real): ");
        double A = scanner.nextDouble();
        System.out.print("Digite o valor de B (número inteiro): ");
        int B = scanner.nextInt();

        double produto = 0;

        for (int i = 0; i < Math.abs(B); i++) {
            produto += A;
        }

        if (B < 0) {
            produto = -produto;
        }

        System.out.println("O produto de " + A + " por " + B + " é: " + produto);

        scanner.close();
    }
}
