package sintaxe;

public class TiposDeDados {
  public static void main(String[] args) {

    /* Todos os tipos */

    byte posicao = 100;
    short ano = 2023;
    int cep = 86000000;
    long cpf = 40000000000L; // deve terminar com a letra L
    float pi = 3.14F; // deve terminar com a letra F
    double salario = 1250.50;


    /* Tipos mais utilizados */

    String primeiroNome = "Taylor";
    int anoNascimento = 1989;
    double peso = 50.5;
    boolean industriaMusical = true;

    /* Problemas com tipagem no Java */

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;
    // Lembre-se: não é coerente fazer esse tipo de correção sempre!
  }
}
