package compararListas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class exercício2 {
	public static void main(String[] args) {
		List<String> lista2 = Arrays.asList("a","b","c");
        List<String> lista1 = Arrays.asList("5", "a", "a", "c");
        
        Map<String, Integer> map = new TreeMap<String, Integer>();
        List<String> interseccao = lista1.stream().filter(item1 -> {
            return lista2.stream().filter(item2 -> new String(item2).equals(item1)).findAny().isPresent();
        }).collect(Collectors.toList());

        for (String nome : interseccao) {
        Integer count = map.get(nome);
        if (count == null)
        count = 0;
        map.put(nome, count+1);
        }
  
        //Agora, para exibir todos os nomes repetidos e quantas vezes se repetiram:
  
        for (String nome : map.keySet()) {
	        System.out.printf("O nome %s se repetiu %s vezes.", nome, map.get(nome));
	        System.out.println();
        }
	}
}
