
package Exgpt;

public class Livro extends ItemBiblioteca {
	
	private String autor;

	public Livro(String titulo, int anoPublicacao, String autor) {
		super(titulo, anoPublicacao);
		setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor.length()<2) {
			throw new IllegalArgumentException("Nome do autor inválido");
		}
		this.autor = autor;
	}
	
	@Override
	public String exibir() {
		return  "Autor: " + getAutor() + ", titulo: " + getTitulo() + ", ano de publicação: " + getAnoPublicacao();
	}

}
