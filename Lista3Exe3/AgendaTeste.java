import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class AgendaTeste {

	@Test
	void test() {
		Agenda Agenda = new Agenda();
		DataAgenda data1 = new DataAgenda("em 1950 o o caça sovietico MiG-17 fez seu primeiro voo ", LocalDate.of(2023, 2, 1));
		DataAgenda data2 = new DataAgenda("nada ", LocalDate.of(2023, 2, 2));
		
		Compromisso c1 = new Compromisso(LocalTime.of(9, 10),"missa", 50, 'a');
		Compromisso c2 = new Compromisso(LocalTime.of(19, 30),"jogo do Flamengo", 90, 'm');
		Compromisso c3 = new Compromisso(LocalTime.of(12, 10),"almoco", 60, 'a');
		
		Agenda.addDataAgnda(data1);
		Agenda.addDataAgnda(data2);
		
		data1.addCompromisso(c1);
		data1.addCompromisso(c3);	
		data2.addCompromisso(c2);
		
		assertEquals(2, data1.getCompromissoprioridade('a'));
		assertEquals(3, data1.getTempoMedio());
	}

}
