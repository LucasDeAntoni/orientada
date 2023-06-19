import java.util.Collections;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
	

	LinkedList<Veiculo> veiculo = new LinkedList<>();
	Veiculo v1 = new Veiculo("vab","ferrari", 10, "marco");
	Veiculo v2 = new Veiculo("bab","ford", 10, "Pedro");
	Veiculo v3 = new Veiculo("manb","cobra", 10, "Alexandre");
	Veiculo v4 = new Veiculo("cjab","asa", 10, "Pietro");
	Veiculo v5 = new Veiculo("oab","asa", 10, "Pablo");
	Veiculo v6 = new Veiculo("aab","asa", 10, "Lucas");
	Veiculo v7 = new Veiculo("qab","asa", 10, "Gabriel");
	Veiculo v8 = new Veiculo("y'ab","asa", 10, "Luiz");
	Veiculo v9 = new Veiculo("ab","asa", 10, "Rafa");
	Veiculo v10 = new Veiculo("zab","asa", 10, "Matheus");
	
	veiculo.add(v1);
	veiculo.add(v2);
	veiculo.add(v3);
	veiculo.add(v4);
	veiculo.add(v5);
	veiculo.add(v6);
	veiculo.add(v7);
	veiculo.add(v8);
	veiculo.add(v9);
	veiculo.add(v10);
	
//	System.out.println(veiculo.get(0).getProprietario());
//	System.out.println(veiculo.get(1).getProprietario());
//	System.out.println(veiculo.get(2).getProprietario());
//	System.out.println(veiculo.get(3).getProprietario());
//	System.out.println(veiculo.get(4).getProprietario());
//	System.out.println(veiculo.get(5).getProprietario());
//	System.out.println(veiculo.get(6).getProprietario());
//	System.out.println(veiculo.get(7).getProprietario());
//	System.out.println(veiculo.get(8).getProprietario());
//	System.out.println(veiculo.get(9).getProprietario());
//	

//	veiculo.remove(v2);
//	System.out.println(veiculo.get(6).getProprietario());

//	veiculo.remove(6);

//	System.out.println(veiculo.get(6).getProprietario());
/*
//	for(int i = 0 ; i < veiculo.size(); i++) {
//		
//		if(i == veiculo.size() - 3) {
//			System.out.println(veiculo.get(i).getProprietario());
//			 veiculo.remove(i);
//			System.out.println(veiculo.get(i).getProprietario());
//
//		}
		
		*/
		
		Collections.sort(veiculo);
		//veiculo.sort(null);
		
		System.out.println(veiculo.get(0).getProprietario());
		System.out.println(veiculo.get(1).getProprietario());
		System.out.println(veiculo.get(2).getProprietario());
		System.out.println(veiculo.get(3).getProprietario());
		System.out.println(veiculo.get(4).getProprietario());
		System.out.println(veiculo.get(5).getProprietario());
		System.out.println(veiculo.get(6).getProprietario());
		System.out.println(veiculo.get(7).getProprietario());
		System.out.println(veiculo.get(8).getProprietario());
		System.out.println(veiculo.get(9).getProprietario());
		
		  for (Veiculo v : veiculo) {
	            System.out.println(v);
	        }
		
	}
	
	}


