package Lista3Ex4;




public class Viagens {
	private double km;
	private double duracao;
	private double vendas;
	
	
	public Viagens(double km, int duracao, double vendas) {
		super();
		this.km = km;
		this.duracao = duracao;
		this.vendas = vendas;
	}

	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	public double gasto() {
		double valorKm;
		if (km<800) {
			valorKm = gettotalKm() * 0.8;
			System.out.println("valor por km: "+ valorKm);
			return valorKm;
			
		} else if (km>800 && km<1600) {
			valorKm = km * 0.78;
			System.out.println("valor por km: "+ valorKm);
			return valorKm;
		} else  {
			valorKm = km * 0.75;
			System.out.println("valor por km: "+ valorKm);
			return valorKm;
		}	
	}
	
	public void dados() {
		
	}
	
	
}