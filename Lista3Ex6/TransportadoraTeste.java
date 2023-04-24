import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TransportadoraTeste {

	@Test
	void test() {
		Transportadora trans = new Transportadora();
		LocalDate dataV1 = LocalDate.of(2018, 01, 16);
		LocalDate dataV2 = LocalDate.of(2016, 7, 10);
		
		Veiculo V1 = new Veiculo("123-abc", "Volvo", dataV1);
		Veiculo V2 = new Veiculo("234-xyz", "Scania", dataV2);
		
		Manutencao M1V1 = new Manutencao(04, 2000.0f, 8, "Freio");
		Manutencao M2V1 = new Manutencao(10, 4560.37f, 15, "Suspencao");
		
		Manutencao M1V2 = new Manutencao(23, 1300.99f, 5, "Freio");
		
		trans.addVeiculo(V1);
		trans.addVeiculo(V2);
		
		V1.addManutencao(M1V1);
		V1.addManutencao(M2V1);
		
		V2.addManutencao(M1V2);
		
		assertEquals(2, trans.qtMesmo("Freio"));
		assertEquals(2, V1.manutencao.size());
		assertEquals(3280.185f, V1.custoMedioManutencao());
		assertEquals(1, V1.compara(V2));
		assertEquals(0.5, V1.getIndice());
		assertEquals(250, M1V1.mediaManutencao());
	}

}
