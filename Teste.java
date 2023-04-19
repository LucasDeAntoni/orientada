package Lista3Ex4;


import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {
	private Vendedor vendedor;
	@Test
	public void test() {
		vendedor = new Vendedor("Joao Silva");
		vendedor.addViagem(new Viagens(400, 2, 500));
		vendedor.addViagem(new Viagens (150, 1, 6200));
		vendedor.addViagem(new Viagens(255, 2, 130));
		double delta = 1;
		assertEquals(805, vendedor.gettotalKm(), delta);
		assertEquals(627.90, vendedor.aReceber(), delta);
		
	}

}
