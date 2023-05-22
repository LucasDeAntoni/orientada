package Exgpt;

public abstract class ItemBiblioteca {
	
	private String titulo;
	private int anoPublicacao;
	
	public ItemBiblioteca(String titulo, int anoPublicacao) {
		
		setTitulo(titulo);
		this.anoPublicacao = anoPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if (titulo.length()<2) {
			throw new IllegalArgumentException("titulo invalido");
		}
		this.titulo = titulo;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public abstract String exibir();
	
}
