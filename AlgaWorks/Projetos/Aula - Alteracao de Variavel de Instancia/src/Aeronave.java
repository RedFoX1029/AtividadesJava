public class Aeronave {
    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void desativar() {
        ativo = false;
    }
    void ativar() {
        ativo = true;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo) {
            assentosReservados += numeroAssentos;
        } else {
            // Existe uma forma melhor de fazer isso (exceções), mas ainda não estudei sobre isso
            System.out.println("Aeronave inativa. Assentos não reservados.");
        }
    }
}
