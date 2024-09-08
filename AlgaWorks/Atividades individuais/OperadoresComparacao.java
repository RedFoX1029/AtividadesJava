public class OperadoresComparacao {

  public static void main(String[] args) {
    int pesoProdutos = 900;
    int limitePesoCaminhao = 1000;

    boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
    boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;

    System.out.println("Carga dos Produtos: " + pesoProdutos + "Kg");
    System.out.println("Limite de peso: " + limitePesoCaminhao + "Kg");
    System.out.printf("Carga excedida: %b%n", cargaExcedida);
    System.out.printf("Carga liberada: %b%n", cargaLiberada);
  }
}