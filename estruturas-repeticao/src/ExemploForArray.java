/* Estrutura de repetição `for` aplicada a arrays */

public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = { "Betty", "Augustine", "James" };

    for (int x = 0; x < alunos.length; x++) {
      System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
    }
  }
}
