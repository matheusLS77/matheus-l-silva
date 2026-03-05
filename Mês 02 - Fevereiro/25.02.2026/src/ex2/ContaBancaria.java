package ex2;

/**
 * 2)
 * Os atributos titular e saldo não estão encapsulados, violando o encapsulamento.
 * 
 * Qualquer classe pode alterar o saldo diretamente (conta.saldo = -1000).
 * 
 * Não há validação para valores negativos em depositar e sacar.
 * 
 * A classe não protege seus invariantes (ex: saldo não deveria ser negativo).
 */
public class ContaBancaria {
	private String titular;
	private double saldo;

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor para depósito inválido. ");
		}
		saldo += valor;
	}

	public void sacar(double valor) {
		if (valor <= 0 || valor > saldo) {
			throw new IllegalArgumentException("Valor para saque inválido. ");
		}
		saldo -= valor;
	}
}