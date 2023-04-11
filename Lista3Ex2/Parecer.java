package Lista3Ex2;

import java.time.LocalDate;

public class Parecer {
	
	private String Parecerista;
	public String getParecerista() {
		return Parecerista;
	}
	public void setParecerista(String parecerista) {
		Parecerista = parecerista;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	private LocalDate data;
	private String conteudo;
	public Parecer(String parecerista, LocalDate data, String conteudo) {
		super();
		Parecerista = parecerista;
		this.data = data;
		this.conteudo = conteudo;
	}

