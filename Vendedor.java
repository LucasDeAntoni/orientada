package Lista3Ex4;

import java.util.ArrayList;

public class Vendedor {
private String nome;
private ArrayList<Viagens> viagem = new ArrayList<>();

public Vendedor(String nome) {
	super();
	this.nome = nome;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
	public void addViagem(Viagens via) {
		viagem.add(via);
	}
	 
	public ArrayList<Viagens> getViagem() {
        return viagem;
    }
	
	public double viagemMenor(){
		double menor=999999;
		int j=0;
		for (int i=0; i<viagem.size();i++) {
			if(viagem.get(i).getKm()<menor) {
				menor=viagem.get(i).getKm();
				j=i;
			}
			
		}
		return menor;
	}
	
	public double receber() {
		double valorReceber=0;
		for(int i=0; i<viagem.size();i++ ) {
			valorReceber += gettotalKm();
		}
		return valorReceber;
	}
	
	public double maiorVendas() {
		
		double totalVendas = 0;
		for(int i = 0;i<viagem.size(); i++) {
			totalVendas = totalVendas + viagem.get(i).getVendas();
		}
		return totalVendas;
	}
	
	public double gettotalKm() {
		double totalKm=0;
		for (int i = 0; i<viagem.size();i++) {
			totalKm += viagem.get(i).getKm();
		}
		return totalKm;
	}
	
	public double aReceber() {
		double valorKm;
		if (gettotalKm()<800) {
			valorKm = gettotalKm() * 0.8;
			System.out.println("valor por km: "+ valorKm);
			return valorKm;
			
		} else if (gettotalKm()>800 && gettotalKm()<1600) {
			valorKm = gettotalKm() * 0.78;
			System.out.println("valor por km: "+ valorKm);
			return valorKm;
		} else  {
			valorKm = gettotalKm() * 0.75;
			System.out.println("valor por km: "+ valorKm);
			return valorKm;
		}	
	}
}
