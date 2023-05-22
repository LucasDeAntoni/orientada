package Ex5;

import java.time.LocalDate;
import java.util.ArrayList;
public class Transatlantico extends Embarcacao {
	private String nome;
	private LocalDate dataInauguracao;
	
	ArrayList <BoteSalvaVidas> botes = new ArrayList<>();
	
	
	public Transatlantico(String nroRegistro, int qtdPessoas, String nome, LocalDate dataInauguracao) {
		super(nroRegistro, qtdPessoas);
		this.nome = nome;
		this.dataInauguracao = dataInauguracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataInauguracao() {
		return dataInauguracao;
	}
	public void setDataInauguracao(LocalDate dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}
	
	public void addBote(BoteSalvaVidas b) {
		botes.add(b);
	}
	
	@Override
	public String VerificaSeguranca() {
		int soma = 0;
		for (int i = 0; i<botes.size(); i++) {
			soma += botes.get(i).getQtdPessoas();
		}
		if(soma>=getQtdPessoas()) {
			return "Está em condições adequadas de segurança";
		} else if (getDataInauguracao().isBefore(LocalDate.now())) {
			return "CUIDADO: Navio em perigo";
		} else if (getDataInauguracao().isAfter(LocalDate.now())) {
			return "ALERTA: Navio precisando de mais botes!";
		} else {
			return null;
		}
		
	}
	
	
	
}
