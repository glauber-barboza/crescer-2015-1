package apis;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class tests {
	
	
	@Test
	public void testIndexof() {
		String texto = "micro-ondas-micro-ondas-micro-ondas"; 
		
		int indice = texto.indexOf("-");
		

		
		assertEquals(5, indice);
	}
	
	@Test
	public void testReplace() {
		String texto = "micro-ondas-micro-ondas-micro-ondas"; 
		
		String indice = texto.replace("-", ".");
		

		
		assertEquals("micro.ondas.micro.ondas.micro.ondas", indice);
	}
	
	@Test
	public void testSplit() {
		
		String texto = "banana,maçã,laranja";  
		  
		String frutas[] = texto.split(",");  

		
		assertEquals("banana", frutas[0]);
		assertEquals("maçã", frutas[1]);
		assertEquals("laranja", frutas[2]);
		
	}

	@Test
	public void testArGet() {
		
		ArrayList<String> teste=new ArrayList<String>(); 
		  teste.add("teste");
		//teste.get(0);
		
		assertEquals("teste", teste.get(0));
		
	}
	
	@Test
	public void testArSet() {
		
		ArrayList<String> teste=new ArrayList<String>(); 
			teste.add("boca");
		  teste.set(0, "teste");
		//teste.get(0);
		
		assertEquals("teste", teste.get(0));
		
	}
	@Test
	public void testArIndexOf() {

	}


}
