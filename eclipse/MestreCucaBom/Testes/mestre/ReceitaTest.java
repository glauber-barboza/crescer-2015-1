package mestre;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Model.Ingrediente;
import Model.Receita;
import Model.UnidadeMedida;


public class ReceitaTest {

	@Test
	public void valorTotalReceitaDeveSerSomaDoValorDosIngredientes() throws Exception {
		Receita receita = new Receita("Feijoada");
		receita.adicionarIngrediente(new Ingrediente("Feijão", UnidadeMedida.KG, 0.5, 5));
		receita.adicionarIngrediente(new Ingrediente("Sal", UnidadeMedida.COLHER_SOPA, 1, 1));
		
		double resultado = receita.calcularValorTotal();
		assertEquals(6, resultado, 0.0005);
	}
	

}
