package Lista3Ex3;

import java.time.LocalTime;

public class Compromisso {
	private String descricao;
	private LocalTime hora;
	private int tempo;
	private char prioridade;
	
	public Compromisso(String descricao, LocalTime hora, int tempo, char prioridade) {
		super();
		this.descricao = descricao;
		this.hora = hora;
		this.tempo = tempo;
		this.prioridade = prioridade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public char getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(char prioridade) {
		this.prioridade = prioridade;
	}
}
