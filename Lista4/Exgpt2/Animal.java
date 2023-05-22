package Exgpt2;

public abstract class Animal {

	private final int  qtdPatas = 4;
	private boolean doenca;
	private boolean sono;
	private boolean fome;
	
	
	public Animal(boolean doenca, boolean sono, boolean fome) {
		super();
		this.doenca = doenca;
		this.sono = sono;
		this.fome = fome;
	}


	public boolean isDoenca() {
		return doenca;
	}


	public void setDoenca(boolean doenca) {
		this.doenca = doenca;
	}


	public boolean isSono() {
		return sono;
	}


	public void setSono(boolean sono) {
		this.sono = sono;
	}


	public boolean isFome() {
		return fome;
	}


	public void setFome(boolean fome) {
		this.fome = fome;
	}


	public abstract String Barulho() throws AnimalException;
}
