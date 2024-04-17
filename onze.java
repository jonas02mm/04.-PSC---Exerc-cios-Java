public class Main {
    public static void main(String[] args) {
        double massaInicial = 1.0;
        double taxaPerda = 0.25;
        int intervaloTempo = 30;
        double massaLimite = 0.10;

        int tempo = 0;
        double massaAtual = massaInicial;

        while (massaAtual >= massaLimite) {
            massaAtual -= taxaPerda * massaAtual;
            tempo += intervaloTempo;
        }

        
        System.out.println("Tempo necessário: " + tempo + " segundos");
    }
}
