/**
 * 3)
 * 
 * A classe concentra múltiplas responsabilidades:
 * 
 * Dados do aluno.
 * 
 * Dados do professor.
 * 
 * Cálculo de média.
 * 
 * Impressão de boletim.
 * 
 * Viola o Princípio da Responsabilidade Única (SRP).
 * 
 * Dificulta manutenção, testes e reutilização do código.
 */
public class Aluno {
	private String nome;
	private double[] notas;
	private String sala;

	public Aluno(String nome, double[] notas, String sala) {
		this.nome = nome;
		this.notas = notas;
		this.sala = sala;
	}

	public double calcularMedia() {
		double soma = 0;
		for (double n : notas) {
			soma += n;
		}
		return soma / notas.length;
	}

	public boolean alunoAprovado() {
		return calcularMedia() >= 7;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

}