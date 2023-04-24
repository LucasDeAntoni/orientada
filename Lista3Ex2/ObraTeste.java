import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ObraTeste {

	@Test
	void test() {
		List obra = new ArrayList<Obra>();
		
		Obra obra1 = new Obra("evangelion", "Anno");
		
		Parecer parecer1 = new Parecer(LocalDate.of(2022, 3, 10), "Lucas", "mid");
		
		obra1.addParecer(parecer1);
		
		Obra obra2 = new Obra("necronomicon", "Evil Wizard");
		Parecer parecer2 = new Parecer(LocalDate.of(1012, 06, 01), "Pope", "evil magic");
		Parecer parecer3 = new Parecer(LocalDate.of(704, 06, 01), "Nabo o mago", "10/10 contem os segredos da vida");
		Parecer parecer4 = new Parecer(LocalDate.of(2020, 3, 27), "ButtFucker3000", "vou virar um necromante e criar catgirls");
		Parecer parecer5 = new Parecer(LocalDate.of(704, 06, 01), "pyromante69", "necromancia e cringe");
		obra2.addParecer(parecer2);
		obra2.addParecer(parecer3);
		obra2.addParecer(parecer4);
		obra2.addParecer(parecer5);
		
		obra.add(obra1);
		obra.add(obra2);
		
		
		assertEquals("necronomicon", obra2.getTtulo());
		assertEquals(3, obra2.getQtdPareceres());
		assertEquals(3, parecer3.getData());
		
	}

}
