package EX4;

import java.time.LocalDate;

public class ShowMusical extends Evento{
	
	private String nomeBanad;
	private String estilo;
	
	public ShowMusical(String nome, double valor, LocalDate data, Avaliacao a, String nomeBanad, String estilo) {
		super(nome, valor, data, a);
		this.nomeBanad = nomeBanad;
		this.estilo = estilo;
	}
	public String getNomeBanad() {
		return nomeBanad;
	}
	public void setNomeBanad(String nomeBanad) {
		this.nomeBanad = nomeBanad;
	}
	
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	@Override
	public String exibir() {
		return "show musical: " + getNome() + " de " + getNomeBanad() + " de " +getEstilo()  +  ", no dia " + getData() + ", ingressos a R$ " + getValor() + " teve "+getA().getQtdPagantes() + " que acharam o evento " + getA().getOpiniao();
		
	}
	
	

}
