package copa;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		int k = 0;
		int l = 0;
		String resultado = null;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o posi��o dos Mestres Kung e Lu: ");
  		System.out.print("\nKung est� na: ");
  		k = leitor.nextInt();
  		System.out.print("Lu est� na: ");
  		l = leitor.nextInt();
  		
  		if ((l-1) / 2 == (k-1) / 2) {
    		resultado = "nas oitavas de finais";
    	}else if ((l-1) / 4 == (k-1) / 4) {
    		resultado = "nas quartas de finais";
    	}else if ((l-1) / 8 == (k-1) / 8) {
    		resultado = "na semifinal";
    	}else {
    		resultado = "na final";
    	}
  		
  		System.out.println("#############################################");
		System.out.println("###############   RESULTADO   ###############");
		System.out.println("#############################################");
		System.out.println("Mestre \t\t Posi��o");
		System.out.println("Kung \t\t "+k);
		System.out.println("Lu \t\t "+l);
		System.out.println("---------------------------------------------");
		System.out.println("Ir�o se confrontar "+resultado);
	  	
	  	leitor.close();
	}
}
