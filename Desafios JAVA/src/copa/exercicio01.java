package copa;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o posição dos Mestres Kung e Lu: ");
  		System.out.print("\nKung está na: ");
  		int k = leitor.nextInt();
  		System.out.print("Lu está na: ");
  		int l = leitor.nextInt();
  		
  		String resultado = null;
  		
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
		System.out.println("Mestre \t\t Posição");
		System.out.println("Kung \t\t "+k);
		System.out.println("Lu \t\t "+l);
		System.out.println("---------------------------------------------");
		System.out.println("Irão se confrontar "+resultado);
	  	
	  	leitor.close();
	}
}
