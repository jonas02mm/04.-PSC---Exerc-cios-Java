public class CrescimentoPopulacional {
    public static void main(String[] args) {
        int populacaoA = 5000000;
        double taxaCrescimentoA = 0.03;
        int populacaoB = 7000000;
        double taxaCrescimentoB = 0.02;

        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Após " + anos + " anos, a população de A ultrapassará a população de B.");
    }
}
