import java.time.LocalDate;

public class Manutencao {

	private int numeroManu;
	private float custo;
	private int parado;
	private String descricao;
	
	
	public Manutencao(int numeroManu, float custo, int parado, String descricao) {
		this.numeroManu = numeroManu;
		this.custo = custo;
		this.parado = parado;
		this.descricao = descricao;
	}

	public int getNumeroManu() {
		return numeroManu;
	}

	public void setNumeroManu(int numeroManu) {
		this.numeroManu = numeroManu;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public int getParado() {
		return parado;
	}

	public void setParado(int parado) {
		this.parado = parado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float mediaManutencao() {
		float custoMedio = 0;
		custoMedio = (float) (getCusto()/ getParado());
		
		return custoMedio;
		
	} 
	
}