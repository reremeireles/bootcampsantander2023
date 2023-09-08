public class ExemploForEach {
  public static void main(String[] args) {
    String albuns[] = { "Folklore", "Reputation", "Lover" };

    for (String album : albuns) {
      System.out.println("Nome do álbum: " + album);
    }
  }
}
