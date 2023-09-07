import java.util.Locale;
import java.util.Scanner;

public class Usuario {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();

    /* Imprimir dados obtidos pelo usuário*/

    System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
    System.out.println("Eu tenho " + idade + " anos");
    System.out.println("A minha altura é " + altura + " m");
  }
}
