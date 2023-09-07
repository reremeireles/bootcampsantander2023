package sintaxe;

public class Variaveis {
  public static void main(String[] args) {

    /* Declaração de variáveis */

    String primeiroNome = "Taylor"; // tipo: String, valor: "Taylor"
    int anoNascimento = 1989; // tipo: int, valor: 1989
    int idade = 32; // tipo: int, valor: 32
    int peso; // tipo: int, valor: nenhum valor atribuído
    boolean industriaMusical = true; // tipo: boolean, valor: true

    /* Declaração com o tipo double */

    double salarioMinimo = 2500; // o valor lido é 2.500

    salarioMinimo = 2500.50; // o valor lido é 2.500,50

    /* Variáveis são modificáveis */

    int numero = 5; // atribuindo um valor para numero
    System.out.print(numero); // Saída: 5

    numero = 10; // reatribuindo um valor para numero
    System.out.print(numero); // Saída: 10
  }
}
