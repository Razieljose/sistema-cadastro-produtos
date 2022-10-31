package Program;

import Entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        System.out.println("Quantos produtos você deseja cadastrar?  ");
        int qttProdutosCadastrados = sc.nextInt();
        for (int i = 1; i <= qttProdutosCadastrados; i++) {
            sc.nextLine();
            System.out.println("Produto #" + i + ": ");
            System.out.println("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.println("Descrição do produto: ");
            String descricaoProduto = sc.nextLine();
            System.out.println("Quantidade de Produtos: ");
            int quantidadeProdutos = sc.nextInt();
            list.add(new Produto(nomeProduto, descricaoProduto, quantidadeProdutos));
        }
        System.out.println();
        System.out.println("Lista de produtos:");
        for (Produto produto : list) {
            System.out.println(produto);
        }
        System.out.println("Caso deseje cadastrar mais algum produto, digite 1." +
                " Para listar novos produtos, digite 2. " +
                "Para finalizar o programa, digite 3: ");
        int pergunta = sc.nextInt();
        if (pergunta == 1){
            System.out.println("Quantos produtos você deseja cadastrar?  ");
            int quantidadeProdutosCadastrados = sc.nextInt();
            for (int i = 1; i <= quantidadeProdutosCadastrados; i++) {
                sc.nextLine();
                System.out.println("Produto #" + i + ": ");
                System.out.println("Nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.println("Descrição do produto: ");
                String descricaoProduto = sc.nextLine();
                System.out.println("Quantidade de Produtos: ");
                int quantidadeProdutos = sc.nextInt();
                list.add(new Produto(nomeProduto, descricaoProduto, quantidadeProdutosCadastrados));
            }
            System.out.println();
            System.out.println("Lista de produtos:");
            for (Produto produto : list) {
                System.out.println(produto);
            }

        } else if (pergunta == 2) {
            System.out.println("Produtos cadastrados: " + list);

        } else {
            System.out.println("Programa Finalizado!");
        }
        sc.close();
    }
}


