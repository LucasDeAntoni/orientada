import java.time.LocalDate;

public class Parecer {
	private String parecerista;
	private LocalDate data;
	private String conteudo;
	
	public String getParecerista() {
		return parecerista;
	}
	public void setParecerista(String parecerista) {
		this.parecerista = parecerista;
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
	
	public Parecer(LocalDate data, String conteudo, String parecerista) {
		super();
		this.data = data;
		this.conteudo = conteudo;
		this.parecerista = parecerista;
	}
	
}
