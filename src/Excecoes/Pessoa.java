package Excecoes;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, String sobrenome, int idade, double altura) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
        setAltura(altura);
    }

    // Getters e Setters com validações
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("O nome deve conter apenas letras.");
        }
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (!sobrenome.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("O sobrenome deve conter apenas letras.");
        }
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("A idade deve ser um número positivo.");
        }
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser um número positivo.");
        }
        this.altura = altura;
    }

    // Método para exibir informações da pessoa
    @Override
    public String toString() {
        return "Nome Completo: " + nome + " " + sobrenome + "\n" +
               "Idade: " + idade + "\n" +
               "Altura: " + altura;
    }
}