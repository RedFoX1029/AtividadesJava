public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public void exibirInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade++;
    }
    public void removerEstoque(int quantidade) {
        this.quantidade--;
    }
}