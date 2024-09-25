public class Principal {
    public static void main(String[] args) {
        //region Meu carro
        Pessoa levi = new Pessoa();
        levi.nome = "Levi Nicola";
        levi.cpf = "111.222.333-83";
        levi.anoNascimento = 2005;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 127000;
        meuCarro.proprietario = levi;
        int tempoDeUsoAnosMeuCarro = 2022 - meuCarro.anoFabricacao;
        double valorRevendaMeuCarro = meuCarro.calcularValorRevenda();
        //endregion

        //region Outro carro
        Pessoa fulano = new Pessoa();
        fulano.nome = "Fulano da Silva";
        fulano.cpf = "222.333.444-84";
        fulano.anoNascimento = 2000;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2019;
        seuCarro.cor = "Cinza";
        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "HB-20";
        seuCarro.precoCompra = 29000;
        seuCarro.proprietario = fulano;
        int tempoDeUsoAnosSeuCarro = 2022 - seuCarro.anoFabricacao;
        double valorRevendaSeuCarro = seuCarro.calcularValorRevenda();
        //endregion

//        meuCarro.proprietario.nome = "Levi Nicola";
//        meuCarro.proprietario.cpf = "111.222.333-83";
//        meuCarro.proprietario.anoNascimento = 2005;

        System.out.println("\n-------------- Características do Carro --------------");

        System.out.println("Meu carro ");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Nome do proprietário: %s%n", meuCarro.proprietario.nome);
        System.out.printf("Cpf do proprietário: %s%n", meuCarro.proprietario.cpf);
        System.out.printf("Ano de nascimento do proprietário: %s%n", meuCarro.proprietario.anoNascimento);

        System.out.println("\n--------------------------------------------------------");

        System.out.println("\nSeu carro ");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Nome do proprietário: %s%n", seuCarro.proprietario.nome);
        System.out.printf("Cpf do proprietário: %s%n", seuCarro.proprietario.cpf);
        System.out.printf("Ano de nascimento do proprietário: %s%n", seuCarro.proprietario.anoNascimento);
        System.out.println("\n--------------------------------------------------------");
        System.out.println("\n\n");

        System.out.println("------------------ Revenda do Carro ------------------\n");
        System.out.println("Meu carro:");
        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoAnosMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
        System.out.println("\nSeu carro:");
        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoAnosSeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaSeuCarro);
        System.out.println("--------------------------------------------------------");
    }
}