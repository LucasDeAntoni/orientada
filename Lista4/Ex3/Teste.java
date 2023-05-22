
public class Teste {
	
	public Teste() {
		String coisa = "123456789012345678901234567890";
		
		System.out.println(coisa.substring(0, 5));
		coisa = coisa.substring(5);
		System.out.println(coisa);
	}
	
	
	public static void main(String[] args) {
		new Teste();
	}
}
