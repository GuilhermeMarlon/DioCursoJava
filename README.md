# Curso Java - Dio

Este diretório contém as atividades desenvolvidas durante o curso de Java da Dio. O projeto abrange conceitos fundamentais de programação em Java, incluindo estruturas de repetição, manipulação de classes, tratamento de exceções e muito mais.

---

## Estrutura do Projeto

### 1. **SmartTv**
Neste módulo, exploramos a criação de uma classe `SmartTv` que simula o funcionamento de uma televisão. A classe possui atributos e métodos para ligar/desligar a TV, alterar o volume e trocar de canal.

#### Funcionalidades:
- **Atributos**:
  - `ligada`: Indica se a TV está ligada ou desligada.
  - `volume`: Representa o volume atual da TV.
  - `canal`: Representa o canal atual da TV.
- **Métodos**:
  - `ligar()`: Liga a TV.
  - `desligar()`: Desliga a TV.
  - `aumentarVolume()`: Aumenta o volume em uma unidade.
  - `diminuirVolume()`: Diminui o volume em uma unidade.
  - `trocarCanal(int novoCanal)`: Troca para o canal especificado.

#### Arquivos:
- `SmartTv.java`: Implementação da classe `SmartTv`.
- `Usuario.java`: Classe principal que interage com a `SmartTv`.

---

### 2. **Estrutura de Repetição**
Este módulo aborda as diferentes formas de trabalhar com estruturas de repetição em Java, como `for`, `while` e `do-while`.

#### Exemplos:
- **For**: Utilizado para iterar sobre um intervalo de valores ou elementos de um array.
- **While**: Executa um bloco de código enquanto a condição for verdadeira.
- **Do-While**: Garante que o bloco de código seja executado pelo menos uma vez antes de verificar a condição.

#### Arquivos:
- `EstruturaRepeticao.java`: Contém exemplos práticos de cada estrutura de repetição.

---

### 3. **Tratamento de Exceções**
Neste módulo, aprendemos a lidar com erros e exceções em Java. Criamos uma classe `Pessoa` com validações para garantir a integridade dos dados fornecidos pelo usuário.

#### Funcionalidades:
- **Classe `Pessoa`**:
  - Atributos: `nome`, `sobrenome`, `idade`, `altura`.
  - Validações:
    - `nome` e `sobrenome` devem conter apenas letras.
    - `idade` deve ser um número inteiro positivo.
    - `altura` deve ser um número decimal positivo.
  - Métodos:
    - Getters e setters com validações.
    - Método `toString()` para exibir os dados formatados.

- **Classe `Excecoes`**:
  - Interage com o usuário para capturar os dados e cria um objeto `Pessoa`.
  - Trata erros de entrada, como caracteres inválidos ou valores negativos.

#### Arquivos:
- `Pessoa.java`: Implementação da classe `Pessoa` com validações.
- `Excecoes.java`: Programa principal para testar a classe `Pessoa` e tratar exceções.

---

## Como Executar o Projeto

1. **Compilar os arquivos Java**:
   Navegue até o diretório raiz do projeto e execute:
   ```bash
   javac -d bin src/**/*.java