import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto tv = new Produto("TV Philco 54 polegadas", 1430, 2);
        Produto geladeira = new Produto("Geladeira Eletrolux 2 portas", 2300, 1);
        Produto pc = new Produto("PC Ryzen 7", 5340, 5);

        Scanner input = new Scanner(System.in);

        while (true) {
            menu();
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1 -> alterarProduto(tv, input);
                case 2 -> alterarProduto(geladeira, input);
                case 3 -> alterarProduto(pc, input);
                case 4 -> System.exit(0);
                default -> System.out.print("Valor inválido!");
            }
        }
    }
    public static void menu() {
        System.out.print("""
                  \nTabela de Produtos
                [1] TV Philco 54 polegadas
                [2] Geladeira Eletrolux 2 portas
                [3] PC Ryzen 7
                [4] Sair
                """);
    }
    public static void alterarProduto(Produto produto, Scanner input) {
        System.out.println("Deseja mudar a quantidade do produto " + produto.nome + "? [sim/nao]");
        String qtdProduto = input.nextLine();

        if (qtdProduto.equals("sim")) {
            System.out.println("Quer adicionar ou remover item? [add/remove]");
            String mudanca = input.nextLine();

            if (mudanca.equals("add")) {
                produto.adicionarEstoque(produto.quantidade);
                System.out.println("Quantidade adicionada com sucesso!");
            }
            else if (mudanca.equals("remove")) {
                if (produto.quantidade > 0){
                    produto.removerEstoque(produto.quantidade);
                    System.out.println("Quantidade removida com sucesso!");
                }
                else {
                    System.out.println("Quantidade esgotada");
                }
            }
            else {
                System.out.printf("Valor invalido!");
            }
        }
        System.out.println("");
        produto.exibirInfo();
    }
}