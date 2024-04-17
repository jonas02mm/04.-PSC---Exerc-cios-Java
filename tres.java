import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasMaisDe50Anos = 0;
        int quantidadePessoas = 10;
        int pessoasEntre10e20 = 0;
        double somaAlturas = 0;
        int pessoasComPesoInferior40 = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            System.out.print("Peso (em quilos): ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                pessoasMaisDe50Anos++;
            }

            if (idade >= 10 && idade <= 20) {
                pessoasEntre10e20++;
                somaAlturas += altura;
            }

            if (peso < 40) {
                pessoasComPesoInferior40++;
            }
        }

        double mediaAlturas = (pessoasEntre10e20 > 0) ? somaAlturas / pessoasEntre10e20 : 0;
        double porcentagemPesoInferior40 = (pessoasComPesoInferior40 * 100.0) / quantidadePessoas;

        System.out.println("a) Quantidade de pessoas com idade superior a 50 anos: " + pessoasMaisDe50Anos);
        System.out.println("b) Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas + " metros");
        System.out.println("c) Porcentagem de pessoas com peso inferior a 40 quilos: " + porcentagemPesoInferior40 + "%");

        scanner.close();
    }
}
