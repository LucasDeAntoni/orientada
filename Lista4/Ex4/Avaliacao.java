package EX4;

public class Avaliacao {
	
	private String opiniao;
	private int qtdPagantes;
	
	public Avaliacao(String opiniao, int qtdPagantes) {
		super();
		this.opiniao = opiniao;
		this.qtdPagantes = qtdPagantes;
	}
	public String getOpiniao() {
		return opiniao;
	}
	public void setOpiniao(String opiniao) {
		this.opiniao = opiniao;
	}
	public int getQtdPagantes() {
		return qtdPagantes;
	}
	public void setQtdPagantes(int qtdPagantes) {
		this.qtdPagantes = qtdPagantes;
	}
	

}
