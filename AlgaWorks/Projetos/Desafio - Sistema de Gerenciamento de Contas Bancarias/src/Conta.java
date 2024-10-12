public class Conta {

    private int id;
    private String titular;
    private double saldo;
    public static final double TAXA_SAQUE = 5.00;

    public Conta(String titular, double saldoInicial) {
        this.id = Banco.geradorId();
        this.titular = titular;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            System.out.printf("\nDepósito de R$%.2f na conta %d feita com sucesso!\n",
                    valor, id);
        }
    }

    public void sacar(double valor) {
        if (saldo >= (valor + TAXA_SAQUE)) {
            saldo -= (valor + TAXA_SAQUE);
            System.out.printf("\nSaque de R$%.2f na conta %d feita com sucesso!%n\n",
                    valor, id);
        }
        else {
            System.out.println("\nSaldo insuficiente para saque.");
        }
    }

    public void mostrarSaldo() {
        System.out.printf("\nNome do Banco: %s\nNome do titular: %s\nID da conta: %s\nSaldo da conta: R$%.2f%n\n",
                Banco.NOME_BANCO, titular, id, saldo);
    }
}
