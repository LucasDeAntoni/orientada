package lista4;

import java.time.LocalDate;

public class AlunoEM extends Aluno {
	private int ano;

	public AlunoEM(String nome, LocalDate dataNascimento, int ano) {
		super(nome, dataNascimento);
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String mostra() {
		return getNome() + " est� no " + getAno() +"o do ensino m�dio e tem "+ getIdade() +" anos";
	}
	
	
}
