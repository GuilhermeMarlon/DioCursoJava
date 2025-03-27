package Excecoes;

import java.util.Scanner;
import java.util.Locale;

public class Excecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            // Solicitando os dados do cliente
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();

            // Criando o objeto Pessoa (validações são feitas na classe Pessoa)
            Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura);

            // Exibindo os dados da pessoa
            System.out.println("\nDados da pessoa cadastrada:");
            System.out.println(pessoa);

        } catch (IllegalArgumentException e) {
            // Capturando erros de validação da classe Pessoa
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            // Capturando qualquer outra exceção inesperada
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            // Fechando o scanner
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }
}