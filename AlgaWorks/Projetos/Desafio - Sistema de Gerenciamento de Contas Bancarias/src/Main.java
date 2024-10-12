import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta1 = null;
        int acao = 0;

        while (true) {
            menu();
            System.out.println("Digite a ação: ");

            try {
                acao = sc.nextInt();
                sc.nextLine(); // Consumir a linha restante
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.nextLine(); // Limpar o buffer de entrada
                continue;
            }

            if (acao == 1) {
                System.out.println("Digite o nome do titular: ");
                String titular = sc.nextLine();
                System.out.println("Digite o saldo inicial: ");

                double saldoInicial;
                try {
                    saldoInicial = sc.nextDouble();
                    sc.nextLine(); // Consumir a linha restante
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um valor numérico para o saldo.");
                    sc.nextLine(); // Limpar o buffer de entrada
                    continue;
                }

                conta1 = new Conta(titular, saldoInicial);
            } else if (acao == 5) {
                System.out.println("Saindo do sistema...");
                break;
            } else if (conta1 == null) {
                System.out.println("\nConta inexistente. Crie uma nova conta.");
            } else {
                switch (acao) {
                    case 2 -> {
                        System.out.println("\nDigite o valor que deseja depositar: ");
                        double novoDeposito;
                        try {
                            novoDeposito = sc.nextDouble();
                            sc.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Por favor, digite um valor numérico para depósito.");
                            sc.nextLine(); // Limpar o buffer de entrada
                            continue;
                        }
                        conta1.depositar(novoDeposito);
                    }
                    case 3 -> {
                        System.out.println("\nDigite o valor que deseja sacar: ");
                        double novoSaque;
                        try {
                            novoSaque = sc.nextDouble();
                            sc.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Por favor, digite um valor numérico para saque.");
                            sc.nextLine(); // Limpar o buffer de entrada
                            continue;
                        }
                        conta1.sacar(novoSaque);
                    }
                    case 4 -> {
                        System.out.println(" ");
                        conta1.mostrarSaldo();
                    }
                    default -> System.out.println("Valor inválido. Tente novamente.\n");
                }
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
