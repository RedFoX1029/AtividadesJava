import java.util.Scanner;

public class CalculadoraIMC {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso: ");
    int peso = entrada.nextInt();

    System.out.print("Altura: ");
    double altura = entrada.nextDouble();

    double imc = peso / (altura * altura);

    if (imc < 18.5) {
      System.out.println("Abaixo do peso ideal.");
      System.out.println("Procure um nutricionista.");
    }

    System.out.print("Fim do Programa.");
  }
}