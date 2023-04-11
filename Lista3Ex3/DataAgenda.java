package Lista3Ex3;



import java.time.LocalDate;
import java.util.ArrayList;

public class DataAgenda {
	private LocalDate data;
	private String efemeride;
	private ArrayList<Compromisso> compromisso = new ArrayList<>();

	public DataAgenda(LocalDate data, String efemeride) {
		super();
		this.data = data;
		this.efemeride = efemeride;
		this.compromisso = new ArrayList<Compromisso>();
	}
	
	public ArrayList<Compromisso> getCompromisso() {
		return compromisso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getEfemeride() {
		return efemeride;
	}

	public void setEfemeride(String efemeride) {
		this.efemeride = efemeride;
	}

	public void setCompromisso(ArrayList<Compromisso> compromisso) {
		this.compromisso = compromisso;
	}

	public int getTempoMedio(LocalDate data) {
		int tTotal = 0;
		int tMedio = 0;
		for (int i = 0; i < compromisso.size(); i++) {
			tTotal = tTotal + compromisso.get(i).getTempo();
			tMedio = tTotal / compromisso.size();
		}
		return tMedio;
	}

	public ArrayList getcompromissosPrioridade(char prioridade) {
		for (Compromisso prio : compromisso) {
			if (prio.getPrioridade() == prioridade) {
				return compromisso;
			}
		}
		return null;
	}

	public void addCompromisso(Compromisso com) {
		compromisso.add(com);
	}

	public int getQtdCompromissosPrioridade(char prioridade) {
		int qtdPrio = 0;
		for (Compromisso prio : compromisso) {
			if (prio.getPrioridade() == prioridade) {
				qtdPrio++;
			}
		}
		return qtdPrio;
	}
	
	public Compromisso getTempoCompromisso(int tempo, Compromisso compromisso) {
		int menor;
		return null;
	}
}
