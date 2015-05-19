package apis;

import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.REUtil;

public class classDesafio {
	
	static String cwi="CWI Crescer";
	String maius;
	
	
	public ArrayList<String> desafio(String Palavra) {
		
		ArrayList<String> maiuscolas =new ArrayList<String>();
		ArrayList<String> retorno =new ArrayList<String>();
		String[] pedacos = Palavra.split("");
		
		
		maiuscolas.add("A");
		maiuscolas.add("B");
		maiuscolas.add("C");
		maiuscolas.add("D");
		maiuscolas.add("E");
		maiuscolas.add("F");
		maiuscolas.add("G");
		maiuscolas.add("H");
		maiuscolas.add("I");
		maiuscolas.add("J");
		maiuscolas.add("K");
		maiuscolas.add("L");
		maiuscolas.add("M");
		maiuscolas.add("N");
		maiuscolas.add("O");
		maiuscolas.add("P");
		maiuscolas.add("Q");
		maiuscolas.add("R");
		maiuscolas.add("S");
		maiuscolas.add("T");
		maiuscolas.add("U");
		maiuscolas.add("V");
		maiuscolas.add("X");
		maiuscolas.add("Y");
		maiuscolas.add("Z");
		maiuscolas.add("W");
		
		for (int i = 0; i < maiuscolas.size(); i++) {
			
			for (int j = 0; j < pedacos.length; j++) {
			
				if(maiuscolas.get(i).equals(pedacos[j])){
					retorno.add(pedacos[j]);
			  }
			}
			
		}
		for (int i = 0; i < retorno.size(); i++) {
			
			System.out.println(retorno.get(i));
			
		}
		
		return retorno;
		
	}

}
