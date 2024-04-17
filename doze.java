import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(getTermo(i) + " ");
        }

        scanner.close();
    }

    private static int getTermo(int index) {
        if (index % 2 == 0) {
            return index / 2 + 3;
        } else {
            return index / 2 + 1;
        }
    }
}
