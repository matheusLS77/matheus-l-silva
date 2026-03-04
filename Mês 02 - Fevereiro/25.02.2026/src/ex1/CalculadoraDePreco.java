package ex1;

/**
 * 1)
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.
 * 
 * Não há forma de incluir novos cálculos (ex: desconto) sem alterar o método.
 * 
 * Violação do princípio aberto/fechado.
 * 
 * Método com responsabilidade rígida e pouco extensível.
 */

public class CalculadoraDePreco {

	public static double calcular(Calculo calculos) {
		return calculos.calcular(100, 20);
	}

	public static void main(String[] args) {
		CalcularImposto ci = new CalcularImposto();
		CalcularDesconto cd = new CalcularDesconto();

		System.out.println(calcular(ci));
		System.out.println(calcular(cd));

	}
}
