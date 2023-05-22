package Exgpt2;

public class Cachorro extends Animal {
	
	

	public Cachorro(boolean doenca, boolean sono, boolean fome) {
		super(doenca, sono, fome);
	}

	@Override
	public String Barulho() throws AnimalException {
		if(isDoenca() == true || isSono() == true || isFome() == true) {
			throw new IllegalArgumentException("nao esta em condicoes de latir");
		}
		return "au au";
	}
	

}
