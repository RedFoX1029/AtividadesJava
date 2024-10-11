public class Main {

    public static void main(String[] args) {
        Produto novoProduto = new Produto();

        novoProduto.alterarPrecoCusto(100);
        Produto.custoEmbalagem = 10;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preco de custo: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preco da venda: %.2f%n", novoProduto.precoVenda);
    }
}