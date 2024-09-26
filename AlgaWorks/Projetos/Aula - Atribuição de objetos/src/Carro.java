public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularIpva() {
        int tempoDeUso = calcularTempoDeUsoEmAnos();

        if (tempoDeUso >= 10) {
            return 0;
        }

        return calcularValorRevenda() * 0.04;
    }

    double calcularValorRevenda() {
        int tempoDeUsoAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsoAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}