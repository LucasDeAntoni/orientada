package Exgpt;

public class Revista extends ItemBiblioteca {
	
	private int volume;

	public Revista(String titulo, int anoPublicacao, int volume) {
		super(titulo, anoPublicacao);
		setVolume(volume);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume<0) {
			throw new IllegalArgumentException("número do volume invalido");
		}
		this.volume = volume;
	}
	
	@Override
	public String exibir() {
		return "titulo: " + getTitulo() + ", ano: " + getAnoPublicacao() + ", volume: " + getVolume();
	}
	
	

}
