package tech.lenilson.modelo;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;


    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


    public boolean procesarVenda(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            return false; // Estoque insuficiente
        }
        quantidadeEstoque -= quantidade;
        return true; // Venda realizada com sucesso
    }


    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }
}