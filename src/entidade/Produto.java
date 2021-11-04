package entidade;
/* Fazer um programa para ler os dados de um produto em estoque(nome,preço, e quantidade no estoque)
 -Mostrar os dados do produto(nome, preço, quantidade no estoque, valor total no estoque)
 -realizar uma entrada no estoque
 realizar uma saída no estoque */
/* Entrada do produto data:
 Nome: TV,  Preço: 900.00,  Quantidade no estoque: 10
 Produto data: TV, $ 900.00, 10 unidades, Total: 900.00
 Entada de produtos no estoque: 5
 Updated dados: TV, $ 900.00, 15 unidades, Total: 13500.00
 Entrada de produtos removidos do estoque: 3
 Updated dados: TV, $ 900.00, 12 unidades, Total: 10800.00*/


public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEstoque() {
		return preco * quantidade;
	}
    public void addProduto(int quantidade) {
    	this.quantidade += quantidade;
    }
    public void removerProduto(int quantidade) {
    	this.quantidade -= quantidade;
    }
    public String toString() {
    	return nome
    			+ ", $ "
    			+ String.format("%.2f", preco)
    			+ ", "
    			+ quantidade
    			+ " unidades, Total: $ "
    			+  String.format("%.2f", totalValorEstoque());
    			
    }

}
