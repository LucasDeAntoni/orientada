package Lista3ex3;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataAgenda {
	private LocalDate data;
	private String efemeride;
	private ArrayList<Compromisso> compromisso= new ArrayList<>();
	
	public DataAgenda(LocalDate data, String efemeride) {
		super();
		this.data = data;
		this.efemeride = efemeride;
	}
	
	public int getTempoMedio(LocalDate data) {
		int tTotal=0;
		int tMedio=0;
		for(int i=0; i<compromisso.size();i++) {
			tTotal = tTotal+ compromisso.get(i).getTempo();
			tMedio= tTotal/compromisso.size();
		}
		return tMedio;
	}
	
	public ArrayList getcompromissosPrioridade(char prioridade) {
		
		compromisso.;
		
		return compromisso;
		
	}
	
	public  void addCompromisso(Compromisso com) {
		
		compromisso.add(com);		
	}
	
	
	
	public int getQtdCompromissosPrioridade(char prioridade) {
		
		return 0;
	}
	
	
}
