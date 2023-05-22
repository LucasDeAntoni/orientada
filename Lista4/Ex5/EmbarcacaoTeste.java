package Ex5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EmbarcacaoTeste {

	@Test
	void test() {
		
		Transatlantico t = new Transatlantico("n1234", 200, "carro", LocalDate.of(2020, 10, 10));
		
		BoteSalvaVidas b1 = new BoteSalvaVidas("b4", 100, true, 1000, 198) {
			
		};
		BoteSalvaVidas b2 = new BoteSalvaVidas("b3", 200,false,2,3200) {
			
		};
		t.addBote(b1);
		t.addBote(b2);
		
		System.out.println(t.VerificaSeguranca());
		System.out.println(b1.VerificaSeguranca());
		System.out.println(b2.VerificaSeguranca());
		
		
		assertEquals(t.VerificaSeguranca(), "a");
	}

}
