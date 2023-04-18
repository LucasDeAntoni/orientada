package Lista3Ex4;

import java.util.ArrayList;

public class Principal {
	private ArrayList<Vendedor> vendedor = new ArrayList<>();

	public Principal() {

		this.vendedor = new ArrayList<Vendedor>();
	}

	public ArrayList<Vendedor> getVendedor() {
		return vendedor;
	}

	public void setVendedor(ArrayList<Vendedor> vendedor) {
		this.vendedor = vendedor;
	}
	
	public String getMenor(double menor){
		
		//int menor2 = 999999;
		int j = 0;
		for (int i = 0;i<vendedor.size(); i ++) {
			if(vendedor.get(i).viagemMenor()< menor) {
				menor = vendedor.get(i).viagemMenor();
				j=i;
			}
		}
		return vendedor.get(j).getNome();
	}
	
	public String maiorValor() {
		double maior = 0;
		int j =0;
		for(int i = 0;i<vendedor.size(); i ++) {
			if(vendedor.get(i).receber() > maior) {
				maior = vendedor.get(i).receber();
				j=i;
			}
		}
		return vendedor.get(j).getNome();
	}
	
	public String maiorVendedor() {
		int j = 0;
		double maiorVendedor = 0;
		for (int i=0; i< vendedor.size(); i++) {
			if(vendedor.get(i).maiorVendas()>maiorVendedor) {
				maiorVendedor= vendedor.get(i).maiorVendas();
				j=i;
			}
		}
		return vendedor.get(j).getNome();
	}

}
