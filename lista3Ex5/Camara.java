import java.util.ArrayList;

public class Camara {

	ArrayList<Partido> partido = new ArrayList<>();

	public <partido> void addPartido(Partido par) {
		this.partido.add(par);
	}
	public int getTotalApresentados() {
		int totalApresentado = 0;
		for (Partido p : partido) {
			for (Vereador v : p.vereador) {
				totalApresentado += v.getQtdProjetos();
			}
		}
		return totalApresentado;
	}

	public int getTotalAprovados() {
		int totalAprovados = 0;
		for (Partido p : partido) {
			for (Vereador v : p.vereador) {
				totalAprovados += v.getQtdAprovados();
			}
		}
		return totalAprovados;
	}

	public String getMaisProjetosAprovados() {
		String melhorvereador = " ";
		double maior = 0;
		String pMaior = " ";
		double melhorDesempenho = 0;
		String nomeMaior = " ";
		for (Partido p : partido) {
			for (Vereador v : p.vereador) {
				if (v.getQtdAprovados() > maior) {
					maior = v.getQtdAprovados();
					pMaior = p.getNomePartido();
					melhorDesempenho = v.getDesempenho();
					nomeMaior = v.getNome();
				}
			}
		}
		melhorvereador = "Nome do vereador: " + nomeMaior + ", partido: " + pMaior + ", de desempenho: "
				+ melhorDesempenho;
		return melhorvereador;
	}

	public String getMenorDesempenho() {
		String menorVereador = " ";
		// double menor=0;
		String pMenor = " ";
		double menorDesempenho = 999999;
		String nomeMenor = " ";
		for (Partido p : partido) {
			for (Vereador v : p.vereador) {
				if (v.getDesempenho() < menorDesempenho) {
					menorDesempenho = v.getDesempenho();
					pMenor = p.getNomePartido();
					nomeMenor = v.getNome();
				}
			}
		}

		return menorVereador = "Nome do vereador com menor desempenho: " + nomeMenor + ", partido: " + pMenor
				+ ", de desempenho: " + menorDesempenho;
	}
	
	public double getMediaDesempenho() {
		double mediaDesempenho = 0;
		double desempenhoTotal = 0;
		double nVereadore =0;
		for (Partido p : partido) {
			for (Vereador v : p.vereador) {
				
					desempenhoTotal += v.getDesempenho();
					nVereadore ++;
				
			}
		}
		if (nVereadore>0) {
		mediaDesempenho = desempenhoTotal/ nVereadore;
		}
		return mediaDesempenho;
	}
	
	public String acimaMedia() {
		String VereadorAcima = " ";
		for (Partido p : partido) {
			for (Vereador v : p.vereador) {
				if( v.getDesempenho()> getMediaDesempenho()) {
					VereadorAcima += v.getNome() +" "+ p.getNomePartido() +" "+ v.getDesempenho()+"; ";
				}
			}
		}
		return VereadorAcima;
	}
	
	
	public String MediaPartido() {
		String mediaPartidos = " ";
		double totalPartido = 0;
		double medioPartido = 0;
		for (Partido p : partido) {
			for (Vereador v : p.vereador) {
				totalPartido += v.getDesempenho();
				medioPartido = totalPartido / p.vereador.size();
			}
			mediaPartidos += " "+ p.getNomePartido() + " media: " + medioPartido + "; ";
			totalPartido=0;
			medioPartido=0;
		}
		
		return mediaPartidos;
	}
	
	public String totalPartido() {
		String totalPartidos = " ";
		int projetosPartido = 0;
		int aprovadospartido = 0;
		for (Partido p : partido) {
			for (Vereador v : p.vereador) {
				projetosPartido += v.getQtdProjetos();
				aprovadospartido += v.getQtdAprovados();
			}
			totalPartidos +=" Partido: " + p.getNomePartido() + " apresentados: " + projetosPartido + ", aprovados: " + aprovadospartido + "; ";
			projetosPartido = 0;
			aprovadospartido = 0;
		}
		return totalPartidos;
	}
	
}