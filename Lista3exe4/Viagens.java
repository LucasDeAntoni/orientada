
public class Viagens {
	private int duracao;
	private int km;
	private double vendas;
	
	public Viagens(int duracao, int km, double vendas) {
		super();
		this.duracao = duracao;
		this.km = km;
		this.vendas = vendas;
	}
	
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	
}
