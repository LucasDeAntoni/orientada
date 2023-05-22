package Exgpt;

public class Main {
	
	public Main() {
		
		try {
			Revista r = new Revista("juu", 2, 44);
			Livro l = new Livro ("leee", 2, "eaaa");
			
			System.out.println(r.exibir());
			System.out.println(l.exibir());
		} catch (Exception e) {
			System.out.println("erro: " + e);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Main();
	}

}
