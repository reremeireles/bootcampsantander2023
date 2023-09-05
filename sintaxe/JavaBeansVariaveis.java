package sintaxe;

public class JavaBeansVariaveis {
  public static void main(String[] args) {

  /* Exemplos NÃO recomendados */

  int numAlbuns = 10;
  // Não deve utilizar abreviações

  String emails = "taylor@swift.com";
  // Confuso! Só há um email (apenas um valor), então não precisa utilizar a palavra no plural

  String firstName = "TAYLOR";
  // As outras variáveis estão escritos em pt-br, então mantenha o padrão de idioma!

  /* Exemplos recomendados */

  int numeroAlbuns = 10;
  // Nome completo sem abreviações

  String email = "taylor@swift.com";
  // Nome da variável no singular e apenas um email

  String[] albuns = { "folklore", "reputation" };
  // Nome da variável no plural para se referir a um array de albuns

  String primeiroNome = "TAYLOR";
  // O nome da variável mantém o padrão de idioma
  }
}
