package Lista3Ex2;

public class Obra {
	private String titulo;
	private String autor;
	private Parecer parecer = new Parecer(null, null, null);
	public Obra(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
