package sintaxe;

public class Operadores {
  public static void main(String[] args) {

    /* OPERADORES DE ATRIBUIÇÃO */

    String nome = "RERE";
    int idade = 30;
    double peso = 52.5;
    char sexo = 'F';
    boolean matriculaAtiva = true;

    /* OPERADORES ARIMÉTICOS */

    double soma = 10.5 + 2.5;
    int subtracao = 10 - 2;
    int multiplicacao = 12 * 4;
    int divisao = 25 / 4;
    int modulo = 10 % 2;
    double resultado = (5 * 2) + (10 * 4);

    /* Peculiaridades do operador de adição */

    String nomeCompleto = "TAYLOR" + "SWIFT";
    System.out.print(nomeCompleto);
    // Saída: TAYLORSWIFT

    String concatenacao = 1 + 1 + 1 + "1";
    System.out.print(concatenacao);
    // Saída: 31

    concatenacao = 1 + "1" + 1 + 1;
    System.out.print(concatenacao);
    // Saída: 1111

    concatenacao = 1 + "1" + "1" + 1;
    System.out.print(concatenacao);
    // Saída: 1111

    concatenacao = "1" + 1 + 1 + 1;
    System.out.print(concatenacao);
    // Saída: 1111

    concatenacao = "1" + (1 + 1 + 1);
    System.out.print(concatenacao);
    // Saída: 13

    /* OPERADORES UNÁRIOS */

    int numero = 5;
    numero = -numero;
    System.out.print(numero);
    // Saída: 5

    System.out.print(-numero);
    // Saída: -5

    int numero2 = 10;
    numero2 = -numero2;
    System.out.print(numero2);
    // Saída: -10

    System.out.print(-numero2);
    // Saída: 10

    /* OPERADORES TERNÁRIOS */

    int a, b, c, d;

    a = 1;
    b = 2;
    c = 3;
    d = 3;

    String resultado2 = a==b ? "Verdadeiro" : "Falso";
    int resultado3 = c==d ? 0 : 1;

    System.out.println(resultado2);
    // Saída: Falso
    System.out.println(resultado3);
    // Saída: 0 (true)


    /* OPERADORES RELACIONAIS */

    int numeroUm = 1;
    int numeroDois = 2;

    boolean simNao = numeroUm == numeroDois;

    System.out.print("numeroUm é igual a numeroDois? " + simNao);
    // Saída: False

    simNao = numeroUm != numeroDois;

    System.out.print("numeroUm é diferente de numeroDois? " + simNao);
    // Saída: True

    simNao = numeroUm > numeroDois;

    System.out.print("numeroUm é maior que numeroDois? " + simNao);
    // Saída: False

    simNao = numeroUm < numeroDois;

    System.out.print("numeroUm é menor que numeroDois? " + simNao);
    // Saída: True

    simNao = numeroUm >= numeroDois;

    System.out.print("numeroUm é maior ou igual a numeroDois? " + simNao);
    // Saída: False

    simNao = numeroUm <= numeroDois;

    System.out.print("numeroUm é menor ou igual a numeroDois? " + simNao);
    // Saída: True

    /* OPERADORES LÓGICOS */

    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2) {
      System.out.print("As condição são verdadeiras");
    } else if (condicao1 || condicao2) {System.out.print("Uma das condições é verdadeira");}
    else System.out.print("Fim");

    // Saída: "Uma das condições é verdadeira"
  }
}
