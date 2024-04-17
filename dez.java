import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int melhorNota = Integer.MIN_VALUE;
        int segundaMelhorNota = Integer.MIN_VALUE;
        int matriculaMelhorNota = 0;
        int matriculaSegundaMelhorNota = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Ficha " + i);
            System.out.print("Matrícula do aluno: ");
            int matricula = scanner.nextInt();
            System.out.print("Nota do aluno: ");
            int nota = scanner.nextInt();

            if (nota > melhorNota) {
                segundaMelhorNota = melhorNota;
                matriculaSegundaMelhorNota = matriculaMelhorNota;
                melhorNota = nota;
                matriculaMelhorNota = matricula;
            } else if (nota > segundaMelhorNota) {
                segundaMelhorNota = nota;
                matriculaSegundaMelhorNota = matricula;
            }
        }

        System.out.println("As duas melhores notas são:");
        System.out.println("1ª Melhor nota: " + melhorNota + " - Matrícula: " + matriculaMelhorNota);
        System.out.println("2ª Melhor nota: " + segundaMelhorNota + " - Matrícula: " + matriculaSegundaMelhorNota);

        scanner.close();
    }
}
