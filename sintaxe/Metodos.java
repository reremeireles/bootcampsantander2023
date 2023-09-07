package sintaxe;

public class Metodos {
  public double somar(int num1, int num2) {
    // inserir lógica (finalidade do método)
    // inserir retorno da execução
    return somar(num1, num2);
  }

  public void imprimir(String texto) {
    // inserir lógica (finalidade do método)
  }

  public double dividir(int dividendo, int divisor) throws Exception {
    // inserir lógica (finalidade do método)
    // inserir tratamento de exceção
    // inserir retorno da execução
    return dividir(dividendo, divisor);
  }

  private void metodoPrivado() {
  }

  /* Exemplos de métodos com equívocos estruturais */

  public void validar() {
    // validar o que?
  }

  public void calcularEnviar() {
    // escolher apenas uma finalidade -> calcular ou enviar
    // calcular o que? ou enviar o que?
  }

  public void gravarCliente(String nome, String cpf, String email) {
    // criar um objeto para guardar as informações
    // passar o objeto como parâmetro para o método
  }
}
