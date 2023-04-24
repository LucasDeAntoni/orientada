import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendedorTeste {

	@Test
	void test() {
		Principal principal = new Principal();
		Vendedor v1 = new Vendedor("joao");
		Vendedor v2 = new Vendedor("maria");
		
		Viagens via1 = new Viagens(2, 400, 500);
		Viagens via2 = new Viagens(1, 150, 620);
		Viagens via3 = new Viagens(2, 255, 130);
		
		Viagens via4 = new Viagens(1, 145, 900);
		
		v1.addViagem(via1);
		v1.addViagem(via2);
		v1.addViagem(via3);
		v2.addViagem(via4);
		principal.addVendedor(v1);
		principal.addVendedor(v2);
		
		
		assertEquals("joao", principal.getComMaiorValor());
		assertEquals("joao", principal.getMaiorTotalvendas());
		assertEquals("maria", principal.getViagemMenor());
		assertEquals(627.9, v1.valorAPagar());
		}

}
