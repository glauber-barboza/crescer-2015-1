

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoTest
{
    /**
     * Default constructor for test class ElfoTest
     */
    public ElfoTest()
    {
    
    }
    @Test
        public void elfoRecebeFlechas(){
            //Arrange - Montagem dos dados de testes
            Elfo umElfo=new Elfo();
            int esperado=42;
            int resultadoObtido = umElfo.quantidadeFlechas();
            
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
        }
    @Test
        public void elfoTemNome(){
            //Arrange - Montagem dos dados de testes
            Elfo umElfo=new Elfo();
            int esperado=42;
            int resultadoObtido = umElfo.quantidadeFlechas();
            
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
        }
     @Test
        public void verificaNome(){
            //Arrange - Montagem dos dados de testes
            Elfo umElfo=new Elfo();
            String esperado="Legolas";
            String resultadoObtido = umElfo.retornaNome();
            
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
            
    }
}
