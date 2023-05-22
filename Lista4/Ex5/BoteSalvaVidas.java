package Ex5;

public abstract class BoteSalvaVidas extends Embarcacao {
	
	private boolean inflavel;
	private int qtdRemos;
	private int qtdColetes;
	public BoteSalvaVidas(String nroRegistro, int qtdPessoas, boolean inflavel, int qtdRemos, int qtdColetes) {
		super(nroRegistro, qtdPessoas);
		this.inflavel = inflavel;
		this.qtdRemos = qtdRemos;
		this.qtdColetes = qtdColetes;
	}
	public boolean isInflavel() {
		return inflavel;
	}
	public void setInflavel(boolean inflavel) {
		this.inflavel = inflavel;
	}
	public int getQtdRemos() {
		return qtdRemos;
	}
	public void setQtdRemos(int qtdRemos) {
		this.qtdRemos = qtdRemos;
	}
	public int getQtdColetes() {
		return qtdColetes;
	}
	public void setQtdColetes(int qtdColetes) {
		this.qtdColetes = qtdColetes;
	}
	
	@Override
	public String VerificaSeguranca() {
		int n = getQtdPessoas() - getQtdColetes();
		
		if(getQtdColetes()>= getQtdPessoas()) {
			return "Bote OK!";
		} else {
		return "insuficiencia de " + n + " coletes salva-vidas";
		}
	}
	
}
