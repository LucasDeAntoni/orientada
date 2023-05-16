import java.util.Scanner;
public class Impressora {
	
	public Impressora() {
		Scanner tec = new Scanner(System.in);
		
		String conteudo = tec.next();
		
		String tipoFolha = tec.next();
		
			if (tipoFolha.equals("A4")) {
				 A4 a1 = new A4(conteudo);
				 
				System.out.println(a1.escrever());
				
				
			} if (tipoFolha.equals("Carta")) {
				 Carta c1 = new Carta(conteudo);
				 			 
				 System.out.println(c1.escrever());
			}
		tec.close();
	}
	
	public static void main(String[]args) {
		new Impressora();
	}
	
	
}
