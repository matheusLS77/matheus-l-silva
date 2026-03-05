package ex4;

/**
 * 4)
 * 
 * Múltiplas responsabilidades na mesma classe.
 * 
 * A classe ex4.Pedido cuida de:
 * 
 * Dados do cliente (nome, email).
 * 
 * Dados do produto (nome, preço).
 * 
 * Lógica de cálculo (total do pedido).
 * 
 * Apresentação (impressão no console).
 * 
 * Isso viola o Princípio da Responsabilidade Única (SRP).
 * 
 * 
 * Os atributos não pertencem todos ao mesmo “conceito”:
 * 
 * ex4.Cliente ≠ ex4.Produto ≠ ex4.Pedido.
 * 
 * Alterações em cliente ou produto impactam diretamente o pedido.
 * 
 * 
 * Não é possível reutilizar ex4.Cliente ou ex4.Produto em outro contexto.
 * 
 * Se um cliente fizer vários pedidos, os dados ficam duplicados.
 * 
 * Um produto não pode ser compartilhado entre pedidos.
 * 
 */
public class Produto {
	private String nomeProduto;
	private double precoUnitario;

	public Produto(String nomeProduto, double precoUnitario) {
		this.nomeProduto = nomeProduto;
		this.precoUnitario = precoUnitario;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

}