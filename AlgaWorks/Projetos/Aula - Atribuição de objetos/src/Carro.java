public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    double calcularValorRevenda() {
        int tempoDeUsoAnos = 2022 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsoAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}