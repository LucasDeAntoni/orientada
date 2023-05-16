package lista4;

import java.time.LocalDate;

public class AlunoUniversitario extends Aluno {
	
	private char formaIngresso;
	private Curso curso;
	
	public AlunoUniversitario(String nome, LocalDate dataNascimento, char formaIngresso, Curso curso) {
		super(nome, dataNascimento);
		this.formaIngresso = formaIngresso;
		this.curso = curso;
	}
	
	public char getFormaIngresso() {
		return formaIngresso;
	}
	
	public void setFormaIngresso(char formaIngresso) {
		this.formaIngresso = formaIngresso;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		if (curso == null) {
			throw new IllegalArgumentException("Curso n�o poed ser nulo");
		}
		this.curso = curso;
	}
	
	@Override
	public String mostra() {
		if (getFormaIngresso() != 'E' && getFormaIngresso() != 'V' && getFormaIngresso() != 'S' && getFormaIngresso() != 'T' && getFormaIngresso() != 'I') {
			throw new IllegalArgumentException();
		}
		if (getFormaIngresso() == 'E') {
		return getNome() + " � aluno universit�rio do curso de "+ curso.getSigla() + "-" + curso.getNome() + ", ingressado por ENEM";
	} else if (getFormaIngresso() == 'V') {
		return getNome() + " � aluno universit�rio do curso de "+ curso.getSigla() + "-" + curso.getNome() + ", ingressado por vestibular";
	} else if (getFormaIngresso() == 'S') {
		return getNome() + " � aluno universit�rio do curso de "+ curso.getSigla() + "-" + curso.getNome() + ", ingressado por seletivo especial";
	} else if ( getFormaIngresso() == 'T') {
		return getNome() + " � aluno universit�rio do curso de "+ curso.getSigla() + "-" + curso.getNome() + ", ingressado por transfer�ncia externa";
	} else if (getFormaIngresso() == 'I') {
		return getNome() + " � aluno universit�rio do curso de "+ curso.getSigla() + "-" + curso.getNome() + ", ingressado por transfer�ncia interna";
	}
		
		
		
		
		return null;
	}
	

}
