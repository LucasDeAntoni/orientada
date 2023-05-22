
public class Carta extends Folha {

	public Carta(String conteudo) {
		super(conteudo);
		// TODO Auto-generated constructor stub
	}
	
	public String escrever() {
		String restante = getConteudo();
		int i = 0;
		if (restante.length()<=8) {
			
			System.out.println(restante);
		} 
			while ( restante.length()>8 && i<10) {		
				System.out.println(restante.substring(0, 8));
				restante = restante.substring(8);
				i++;
		} System.out.println(restante);
			return "fim";
	}

}
