import java.time.LocalDate;
import java.util.ArrayList;

public class DataAgenda {
	
	private String efemeride;
	private LocalDate data;
	
	ArrayList <Compromisso> compromisso = new ArrayList<>();
	
	public DataAgenda(String efemeride, LocalDate data) {
		super();
		this.efemeride = efemeride;
		this.data = data;
	}

	public String getEfemeride() {
		return efemeride;
	}
	public void setEfemeride(String efemeride) {
		this.efemeride = efemeride;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void addCompromisso(Compromisso com) {
		compromisso.add(com);
		
	}
	
	public int getTempoMedio(){
		int tTotal=0;
		int i =0;
		for (Compromisso c : compromisso) {
			tTotal += c.getTempo();
			i++;
		}
		return tTotal/i;
	}
	
	public ArrayList getCompromissoprioridade(char prioridade) {
		ArrayList<Compromisso> comP = new ArrayList<>();
		
		for(Compromisso c: compromisso) {
			if(c.getPrioridade() == prioridade) {
				comP.add(c);
			}
		}
		
		return comP;
	}
	
	public int getQtdCompromissoPrioridade(char prioridade) {
		int total = 0;
		for(Compromisso c: compromisso) {
			if(c.getPrioridade() == prioridade) {
				total++;
			}
		}
		return total;
	}
	
}
