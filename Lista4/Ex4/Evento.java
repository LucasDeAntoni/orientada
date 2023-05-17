package EX4;
import java.time.LocalDate;
public class Evento {
	private String nome;
	private double valor;
	private LocalDate data;
	
	private Avaliacao a;
	
	
	public Evento(String nome, double valor, LocalDate data, Avaliacao a) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.data = data;
		this.a = a;
	}
	
	
	public Avaliacao getA() {
		return a;
	}


	public void setA(Avaliacao a) {
		this.a = a;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
	public String exibir() {
		return "Evento: " + getNome() + ", no dia " + getData() + ", ingressos a R$ " + getValor() + " teve "+a.getQtdPagantes() + " que acharam o evento " + a.getOpiniao(); 
	}
	
	
	
}
