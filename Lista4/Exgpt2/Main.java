package Exgpt2;

public class Main {

	public static void main(String[] args) {
		try {
			
			Vaca v = new Vaca(false, false, false);
			Gato g = new Gato(false, false, false);
			Cachorro c = new Cachorro(false, false, false);
			
			System.out.println(v.Barulho());
			System.out.println(c.Barulho());
			System.out.println(g.Barulho());
			
			
		} catch (Exception e) {
			System.out.println("ERRO: "+ e.getMessage());
		}

	}

}
