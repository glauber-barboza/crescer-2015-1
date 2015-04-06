

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfoTest.
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
            int resultadoObtido = umElfo.getFlechas();
            
            assertEquals(resultadoObtido, esperado);
            //Act - Execução da ação de testes
            //Assert - Verifica se o resultado é o esperado
            
        }
    @Test
        public void elfoTemNome(){
            //Arrange - Montagem dos dados de testes
            Elfo umElfo=new Elfo();
            int esperado=42;
            int resultadoObtido = umElfo.getFlechas();
            
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
    @Test
    public void elfoAtiraFlechaEmUmOrc(){
        Elfo elfo=new Elfo();
        
        Orc orc=new Orc();
       elfo.atirarFlecha(orc);
       
       int experienciaEsperada=1;
       int flechasEsperadas=41;
       assertEquals(experienciaEsperada, elfo.getExperiencia());
       assertEquals(flechasEsperadas, elfo.getFlechas());

    }
     @Test
    public void elfoAtiraDuasFlechaEmUmOrc(){
        Elfo elfo=new Elfo();
        int experienciaEsperada=2;
       int flechasEsperadas=40;
        Orc orc=new Orc();
       elfo.atirarFlecha(orc);
       elfo.atirarFlecha(orc);
       
       
       assertEquals(experienciaEsperada, elfo.getExperiencia());
       assertEquals(flechasEsperadas, elfo.getFlechas());

    }
    @Test
    public void elfoRetornaToString(){
        Elfo elfo=new Elfo();
       String resultadoObtido=elfo.toString();
       String resultadoEsperado="Legolas Possui 42 flechas e 0 níveis de experiência";
       assertEquals(resultadoObtido, resultadoEsperado);

    }
}
