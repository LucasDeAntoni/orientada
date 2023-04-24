import java.util.ArrayList;


public class Obra {
	private String ttulo;
	private String autor;
	
	ArrayList <Parecer> parecer = new ArrayList<>(); 
	
	public String getTtulo() {
		return ttulo;
	}


	public void setTtulo(String ttulo) {
		this.ttulo = ttulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Obra(String ttulo, String autor) {
		super();
		this.ttulo = ttulo;
		this.autor = autor;
	}

	public void addParecer(Parecer par) {
		if (parecer.size()<3) {
		parecer.add(par);
	} else {
		System.out.println("limite de pareceres atingido");
	}
	}
	public int getQtdPareceres() {
	int qtd = 0;
	qtd = parecer.size();
	return qtd;
	}
}
