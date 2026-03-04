package ex3;

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
public class Professor {
	private String nome;
	private String disciplina;
	private int cargaHoraria;

	public Professor(String nome, String disciplina, String sala, int cargaHoraria) {
		this.nome = nome;
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}