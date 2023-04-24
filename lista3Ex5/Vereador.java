

public class Vereador {
	private String nome;
	private double qtdProjetos;
	private double qtdAprovados;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getQtdProjetos() {
		return qtdProjetos;
	}
	public void setQtdProjetos(double qtdProjetos) {
		this.qtdProjetos = qtdProjetos;
	}
	public double getQtdAprovados() {
		return qtdAprovados;
	}
	public void setQtdAprovados(double qrdAprovados) {
		this.qtdAprovados = qrdAprovados;
	}
	public Vereador(String nome, double qtdProjetos, double qrdAprovados) {
		super();
		this.nome = nome;
		this.qtdProjetos = qtdProjetos;
		this.qtdAprovados = qrdAprovados;
	}
	
	
	public double getIndice() {
		double indice = 0;
		if(qtdProjetos>=1 && qtdProjetos<=5) {
			indice = 0.8;
			return indice;
		} else if(qtdProjetos>=6 && qtdProjetos<=10) {
			indice = 1;
			return indice;
		} else if(qtdProjetos>=11 && qtdProjetos<=17) {
			indice = 1.08;
			return indice;
		} else if(qtdProjetos>17) {
			indice = 1.22;
			return indice;
		}	
			return indice;
		
	}
	
	public double getDesempenho() {
		double desempenho = 0;
		desempenho = (qtdAprovados/qtdProjetos) * getIndice();
		return desempenho;
	}
}
