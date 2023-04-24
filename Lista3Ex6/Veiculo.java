
import java.time.LocalDate;
import java.util.ArrayList;

public class Veiculo {

	private String placa;
	private String modelo;
	private LocalDate dataCompra;
    ArrayList<Manutencao> manutencao = new ArrayList<>();
	
	public Veiculo(String placa, String modelo, LocalDate dataCompra) {
		this.placa = placa;
		this.modelo = modelo;
		this.dataCompra = dataCompra;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public void addManutencao(Manutencao arrumar) {
		manutencao.add(arrumar);
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	public float getIndice() {
		int tempoTotal = 0; 
		float indice;
		for(Manutencao m : manutencao) {
			tempoTotal += m.getParado();
		}
		if (tempoTotal >= 0 && tempoTotal <= 20) {
			indice = 0;
		} else if (tempoTotal >= 21 && tempoTotal <= 50) {
			indice = 0.5f;
		} else if (tempoTotal >= 51 && tempoTotal <= 80) {
			indice = 1;
		} else if (tempoTotal >= 81 && tempoTotal <= 120) {
			indice = 1.5f;
		} else {
			indice = 2;
		}
		return indice;
		
	}
	public float custoMedioManutencao() {
		float custoTotal = 0; 
		float mediaCusto = 0;
		for(Manutencao m : manutencao) {
			custoTotal += m.getCusto();
		}
		mediaCusto = custoTotal/ manutencao.size();
		return mediaCusto;
	}
	
	public int compara(Veiculo v) {
		
	int i = 0; 
		if(this.getIndice() > v.getIndice()) {
		return i = 1; 
		}else {
		if(this.getIndice() == v.getIndice()) {
		return i = 0;
		}else{
		return i = -1;
		}
		}
	}
}