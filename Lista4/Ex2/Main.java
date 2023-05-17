package lista4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Main() {
		AlunoUniversitario aluno1 =  new AlunoUniversitario("lucas", LocalDate.of(2004, 01, 14), 'E', new Curso("SIS", "Sistemas"));
		
		alunos.add(aluno1);
		
		AlunoUniversitario aluno2 =  new AlunoUniversitario("pablo", LocalDate.of(2003, 01, 14), 'v', new Curso("BCC", "Computação"));
		
		alunos.add(aluno2);
		
		
		
		alunos.sort(null);
		
		for(Aluno objeto : alunos) {
			System.out.println(objeto.getNome());
		}
	}
	
	public static void main(String[] args) {
	new Main();
			
		
	}

}
