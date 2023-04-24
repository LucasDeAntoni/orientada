import java.util.ArrayList;

public class Partido {
	private String nomePartido;
	private int numeroPartido;
	
	
	public Partido(String nomePartido, int numeroPartido) {
		super();
		this.nomePartido = nomePartido;
		this.numeroPartido = numeroPartido;
		//this.vereador = vereador;
	}

	public <vereador> void addVereador (Vereador ve) {
		this.vereador.add(ve);
	}
	
	
	public String getNomePartido() {
		return nomePartido;
	}


	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}


	public int getNumeroPartido() {
		return numeroPartido;
	}


	public void setNumeroPartido(int numeroPartido) {
		this.numeroPartido = numeroPartido;
	}


	public ArrayList<Vereador> getVereador() {
		return vereador;
	}


	public void setVereador(ArrayList<Vereador> vereador) {
		this.vereador = vereador;
	}


	ArrayList<Vereador> vereador = new ArrayList<>();
}
