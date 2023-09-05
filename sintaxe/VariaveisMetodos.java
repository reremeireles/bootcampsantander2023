package sintaxe;

public class VariaveisMetodos {
  public static void main(String[] args) {
    String primeiroNome = "Taylor";
    String sobrenome = "Swift";

    String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);

    System.out.println(nomeCompleto);
    // Output: Nome completo: Taylor Swift
  }

  public static String nomeCompleto(String primeiroNome, String sobrenome) {
    return "Nome completo: " + primeiroNome.concat(" ").concat(sobrenome);
  }
}
