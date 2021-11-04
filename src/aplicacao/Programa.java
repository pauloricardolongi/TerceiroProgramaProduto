package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Name: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no Estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a serem adicionados no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizado Produtos: " + produto);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizado Produtos: " + produto);
		sc.close();
		

	}

}
