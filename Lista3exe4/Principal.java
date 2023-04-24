import java.util.ArrayList;

public class Principal {
	ArrayList<Vendedor> vendedor = new ArrayList<>();

	public void addVendedor(Vendedor ve) {
		vendedor.add(ve);
	}

	public String getViagemMenor() {
		int menorkm = 99999;
		String nomeMenorKm = " ";
		for (Vendedor v : vendedor) {
			for (Viagens vi : v.viagens) {
				if (vi.getKm() < menorkm) {
					menorkm = vi.getKm();
					nomeMenorKm = v.getNome();
				}

			}
		}
		return nomeMenorKm;
	}

	public String getComMaiorValor() {
		double maior = 0;
		String nomemaior = " ";
		for (Vendedor v : vendedor) {
			if (v.valorAPagar() > maior) {
				maior = v.valorAPagar();
				nomemaior = v.getNome();
			}
		}
		return nomemaior;
	}

	public String getMaiorTotalvendas() {
		double maior = 0;
		double total = 0;
		String nomemaior = " ";

		for (Vendedor v : vendedor) {
			if (v.getTotalVendas() > maior) {
				maior = v.getTotalVendas();
				nomemaior = v.getNome();
				
			}
		}
		return nomemaior;

	}
}
