package idade;

import java.util.Arrays;
import java.util.List;

public class exercicio4 {
	public static void main(String[] args) {
		List<Integer> idades = Arrays.asList(11,21,5);
		
		idades.sort((a,b) -> a.compareTo(b));
		
		System.out.println("#############################################");
		System.out.println("###############   RESULTADO   ###############");
		System.out.println("#############################################");
		System.out.println("Camila tem "+ idades.get(1)+" anos\n\n");
		System.out.println("Nome \t\tIdade");
		System.out.println("Cibele \t\t"+idades.get(0));
		System.out.println("Camila \t\t"+idades.get(1));
		System.out.println("Celeste \t"+idades.get(2));
	}
}
