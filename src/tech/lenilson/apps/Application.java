package tech.lenilson.apps;

import tech.lenilson.modelo.Produto;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("=== CADASTRO DE PRODUTO ===");
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço (R$): ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade inicial em estoque: ");
        int quantidadeInicial = scanner.nextInt();


        Produto produto = new Produto(nome, preco, quantidadeInicial);


        System.out.println("\n=== INFORMAÇÕES DO PRODUTO (ANTES DA VENDA) ===");
        produto.exibirInformacoes();


        System.out.print("\nQuantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();


        System.out.println("\n=== PROCESSANDO VENDA ===");
        if (produto.procesarVenda(quantidadeVendida)) {
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }


        System.out.println("\n=== INFORMAÇÕES DO PRODUTO (DEPOIS DA VENDA) ===");
        produto.exibirInformacoes();

        scanner.close();
    }
}
