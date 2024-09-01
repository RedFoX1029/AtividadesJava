import java.util.Scanner;

public class SwitchExpressions {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
    String diaSemana = entrada.nextLine();
    
    // Versao Switch melhorado
    String horarioFuncionamento = switch (diaSemana) {
      case "seg" -> "Fechado";
      case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
      case "sab", "dom" -> "08:00 às 12:00";
      default -> "Dia inválido";
    };

    // Versao Switch antiga
    switch (diaSemana) {
      case "seg":
        horarioFuncionamento = "Fechado";
        break;
      case "ter":
      case "qua":
      case "qui":
      case "sex":
        horarioFuncionamento = "08:00 às 18:00";
        break;
      case "sab":
      case "dom":
        horarioFuncionamento = "08:00 às 12:00";
        break;
      default:
        horarioFuncionamento = "Dia inválido";
    }

    // Versão a partir do Java 14
    switch (diaSemana) {
      case "seg" -> horarioFuncionamento = "Fechado";
      case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 às 18:00";
      case "sab", "dom" -> horarioFuncionamento = "08:00 às 12:00";
      default -> horarioFuncionamento = "Dia inválido";
    }
    
    System.out.printf("Horario de funcionamento: %s%n", horarioFuncionamento);
  }
}