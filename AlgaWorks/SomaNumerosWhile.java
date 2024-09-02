import java.util.Scanner;

public class SomaNumerosWhile{

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int soma = 0;
    int numero;

    System.out.println("Digite um número para somar (ou 0 para sair): ");

    while (true) {
      System.out.print("Número: ");
      numero = entrada.nextInt();

      if (numero == 0) {
        break;
      }
      soma += numero;
    }

    System.out.println("A soma dos números é: " + soma);
  }
}