package Lista3Ex3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
	
	DataAgenda data = new DataAgenda(LocalDate.now(),  null);
	
	public Agenda(DataAgenda data) {
		super();
		this.data = data;
	}
	public DataAgenda getData() {
		return data;
	}
	public void setData(DataAgenda data) {
		this.data = data;
	}
	public Compromisso getMenorCompromisso() {
		Compromisso menorCompromisso = new Compromisso(null, null, 9999, ' ');
		for(Compromisso c : data.getCompromisso()) {
			if(c.getTempo() < menorCompromisso.getTempo()) {
				menorCompromisso = c;
			}
		}
		return menorCompromisso;
	}
	


	public void addDataAgenda() {
		DataAgenda novaData = new DataAgenda(null, null);
	}
	
		
	}
}