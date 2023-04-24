import java.util.ArrayList;

public class Vendedor {
	private String nome;
	
	ArrayList <Viagens> viagens = new ArrayList<>();

	public Vendedor(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addViagem(Viagens v) {
		viagens.add(v);
	}
	
	public double valorAPagar() {
		int gettotalKm =0;
		for(Viagens v : viagens) {
			gettotalKm += v.getKm();
			
		}
		
		double valorKm;
		if (gettotalKm<800) {
			valorKm = gettotalKm * 0.8;
			
			return valorKm;
			
		} else if (gettotalKm>800 && gettotalKm<1600) {
			valorKm = gettotalKm * 0.78;
			
			return valorKm;
		} else  {
			valorKm = gettotalKm * 0.75;
			
			return valorKm;
		}	
	}
	
	public double getTotalVendas() {
		double total = 0;
		for(Viagens vi : viagens) {
			total += vi.getVendas();
		}
		return total;
	}
		
	}
	

