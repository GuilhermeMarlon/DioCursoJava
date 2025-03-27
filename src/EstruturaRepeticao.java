import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class EstruturaRepeticao {
    public static void main(String[] args) throws Exception {
        // Repetição com para (for) estrutura (inicialização; condição; incremento)
        for (int carneiro = 1; carneiro <= 10; carneiro++) {
            System.out.println("Contando Carneirinhos " + carneiro);
        }

        // Repetição com manipulação de vetores
        String alunos[] = {"João", "Maria", "José", "Pedro", "Ana"};
        for (int i = 0; i < alunos.length; i++) { // length é um método que retorna o tamanho do vetor
            System.out.println("Aluno: " + alunos[i] + " na posição " + i);
        }

        // Repetição com para cada, forma alternativa de percorrer vetores
        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }

        // Repetição com while (enquanto), enquanto a condição for verdadeira o bloco de código será executado
       double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {// Se o valor do doce for maior que a mesada, o valor do doce será o valor da mesada
                valorDoce = mesada;
            }
            System.out.printf("Comprando doce no valor de: R$ %.2f%n" ,valorDoce);
            mesada = mesada - valorDoce;
            
        }
        System.out.printf("Saldo atual: R$ %.2f%n" , mesada);


        // Repetição com do while, a diferença do while é que o bloco de código é executado pelo menos uma vez
        System.out.println("Discando...");
        do {
            System.out.println("Tocando...");
         
        } while (tocando());
        System.out.println("Atendido");
    }

    // Método para gerar um valor aleatório, para funcionar precisa fazer o import da classe ThreadLocalRandom
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    // Método para simular uma ligação telefônica, para funcionar precisa fazer o import da classe Random
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ?"+ atendeu);
        
        //negando o ato de continuar tocando
        return! atendeu;
    }
}