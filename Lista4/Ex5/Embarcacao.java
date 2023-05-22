package Ex5;

public abstract class Embarcacao implements AtivoEmRisco {

	private String NroRegistro;
	private int qtdPessoas;
	
	public Embarcacao(String nroRegistro, int qtdPessoas) {
		super();
		NroRegistro = nroRegistro;
		this.qtdPessoas = qtdPessoas;
	}
	public String getNroRegistro() {
		return NroRegistro;
	}
	public void setNroRegistro(String nroRegistro) {
		NroRegistro = nroRegistro;
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
	
	
}
