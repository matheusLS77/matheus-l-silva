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
public class Boletim {

	public void imprimirBoletim(Aluno aluno, Professor professor) {
		System.out.println("ex3.Aluno: " + aluno.getNome());
		System.out.println("ex3.Professor: " + professor.getNome());
		System.out.println("Disciplina: " + professor.getDisciplina());
		System.out.println("Sala: " + aluno.getSala());
		System.out.println("Média: " + aluno.calcularMedia());
	}
}