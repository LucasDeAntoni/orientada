package lista4;

import java.time.LocalDate;
import java.time.Period;


public abstract class Aluno implements Comparable<Aluno> {
	
	private String nome;
	private LocalDate dataNascimento;
	
	public Aluno(String nome, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() <2) {
			throw new IllegalArgumentException();
		} else {
		this.nome = nome;
		}
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public int getIdade() {
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}
	
	 abstract String mostra();
	
	@Override
	public int compareTo(Aluno o) {
		return this.getNome().compareTo(o.getNome());
		
	}
	


}
