import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta1 = null;
        int acao;

        while (true) {
            menu();
            System.out.println("Digite a ação: ");
            acao = sc.nextInt();
            sc.nextLine();

            if (acao == 1) {
                System.out.println("Digite o nome do titular: ");
                String titular = sc.nextLine();
                System.out.println("Digite o saldo inicial: ");
                double saldoInicial = sc.nextDouble();
                sc.nextLine();
                conta1 = new Conta(titular, saldoInicial);
            }
            else if (conta1 != null && acao != 5) {
                if (acao == 2) {
                    System.out.println("\nDigite o valor que deseja depositar: ");
                    double novoDeposito = sc.nextDouble();
                    sc.nextLine();
                    conta1.depositar(novoDeposito);
                }
                else if (acao == 3) {
                    System.out.println("\nDigite o valor que deseja sacar: ");
                    double novoSaque = sc.nextDouble();
                    sc.nextLine();
                    conta1.sacar(novoSaque);
                }
                else if (acao == 4) {
                    System.out.println(" ");
                    conta1.mostrarSaldo();
                }
                else {
                    System.out.println("Valor inválido. Tente novamente.\n");
                }
            }
            else if (acao == 5) {
                break; // Sai do loop atual. Para encerrar o programa completamente, use "System.exit(0);"
            }
            else {
                System.out.println("\nConta inexistente. Crie uma nova conta.");
            }
        }
    }
    public static void menu() {
        System.out.println("""
                
                --------------- Sistema de Gerenciamento de Banco ---------------
                    Aqui você pode:
                        [1] criar conta
                        [2] depositar
                        [3] sacar
                        [4] mostrar saldo
                        [5] sair
                """);
    }
}