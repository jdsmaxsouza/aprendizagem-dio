package recursivo;

import java.util.ArrayList;
import java.util.List;

public class exercicio3 {
	public static String SomarDigitos(String numero) {
		int soma = 0;
		for(char num : numero.toCharArray()) {
			soma += Integer.parseInt(""+num);
		}
		return ""+soma;
	}
	
	public static void main(String[] args) {
		int numero = 9667489;
		
		String resultado = ""+numero;
		List<String> etapas = new ArrayList<>();
		while(resultado.length() > 1) {
			etapas.add(resultado);
			resultado = SomarDigitos(resultado);
		}
		System.out.println("Digito Final, após soma recursiva: "+resultado);
		System.out.println("Etapas realizadas:");
		System.out.println(etapas);
	}
}
