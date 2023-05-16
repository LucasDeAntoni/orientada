
public class A4 extends Folha {

	public A4(String conteudo) {
		super(conteudo);
		
	}
	
	public String escrever() {
		String restante = getConteudo();
		int i = 0;
		if (restante.length()<=20) {
			System.out.println(restante);
			
		} else {
			while ( restante.length() >20 && i<12) {		
				System.out.println(restante.substring(0, 20));
				restante = restante.substring(20);
				i++;
		} System.out.println(restante);
		}
			return "fim";
	}
	

}
