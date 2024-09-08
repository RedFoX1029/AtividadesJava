public class OperadoresIgualdadeNegacao {

  public static void main(String[] args) {
    boolean numerosIguais = 10 == 10;
    boolean numerosNaoIguais = (4 + 6) == (5 * 2);
    int numero1 = 10;
    int numero2 = 11;

    boolean numerosDiferentes = !numerosIguais;
    // boolean numerosDiferentes = !(10 == 10);
    // O melhor jeito >>>> boolean numerosDiferentes = 10 != 10;
    
    System.out.printf("Números iguais: %b%n", numerosIguais);
    System.out.printf("Números NÃO iguais: %b%n", numerosNaoIguais);
    System.out.printf("Estou vivo? %b%n", numero1 == numero2);
    System.out.print("Eles são diferentes? " + numerosDiferentes); 
  }
}