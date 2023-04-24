import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TesteCamara {
	private Camara camara;
	private Partido P1, P2;
	private Vereador V1, V2, V3, V4, V5;
	@Test
	void test() {
		
		camara = new Camara();
		P1 = new Partido("PT", 13);
		P2 = new Partido("Psdb", 45);
		
		V1 = new Vereador ("v1", 10, 7);
		V2 = new Vereador ("v2",5, 3);
		V3 = new Vereador ("v3", 12, 3);
		V4 = new Vereador ("v4", 13, 3);
		V5 = new Vereador ("v5", 15, 15);
		camara.addPartido(P1);
		camara.addPartido(P2);
		P1.addVereador(V1);
		P1.addVereador(V2);
		P1.addVereador(V3);
		P2.addVereador(V4);
		P2.addVereador(V5);
		
		
	//	assertEquals(2, V3.getDesempenho());
		//assertEquals(1.248, camara.getMediaDesempenho() );
		//assertEquals("pt", camara.acimaMedia());
		assertEquals(2, camara.getTotalApresentados());
		assertEquals(4.32, V2.getIndice());
		//assertEquals("a", camara.totalPartido());
	}

}
