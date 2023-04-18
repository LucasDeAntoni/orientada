package Lista3Ex4;

import static org.junit.Assert.*;

import org.junit.Test;

public class teste {
	private Vendedor vendedor;
	@Test
	public void test() {
		vendedor = new Vendedor("Joao Silva");
		vendedor.addViagem(new Viagens(2, 400, 500));
		vendedor.addViagem(new Viagens (1, 255, 130));
		vendedor.addViagem(new Viagens(2, 255, 130));
		double delta = 1;
		//assertEquals(805, vendedor.gettotalKm(), delta);
		assertEquals(627.90, vendedor.receber(), delta);
		
	}

}
