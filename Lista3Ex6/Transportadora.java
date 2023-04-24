
import java.time.LocalDate;
import java.util.ArrayList;

public class Transportadora {

	ArrayList<Veiculo> veiculo = new ArrayList<>();
	

public int qtMesmo(String descricao) {
	int total = 0; 
	for(Veiculo v : veiculo) {
		for(Manutencao m : v.manutencao) {
		if (m.getDescricao() == descricao)
			total++;
	}}
	
	return total;
	
}
public void addVeiculo(Veiculo carro) {
	veiculo.add(carro);
}

}